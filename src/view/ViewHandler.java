package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import model.Project;
import model.ProjectManagementModel;
import model.Requirement;
import model.Task;

import java.io.IOException;

public class ViewHandler
{
    // this is just a backbone of the view handler just so there is at least something
    private final Scene currentScene;
    private Stage primaryStage;
    private final ProjectManagementModel model;
    private Project currentProject;
    private Requirement currentRequirement;
    private Task currentTask;

    private TabViewController tabViewController;
    private ManageProjectViewController manageProjectViewController;

    public ViewHandler(ProjectManagementModel model)
    {
        this.model = model;
        this.currentScene = new Scene(new Region());
        //copied form the GradeListGUI example
    }

    public void start(Stage primaryStage)
    {
        this.primaryStage = primaryStage;
        /*
         also from the GL GUI example
         but "openView("mainMenu");" is missing
          or "openView("projectTab");"
         */
        openView("TeamMemberView");
    }

    public void openView(String id){
        Region root = null;
        switch (id){
            case "TabView":
            case "ProjectTabView":
            case "TeamMemberView":
            case "ProjectView":
            case "RequirementView":
            case "TaskView": root = loadTabView("TabView.fxml"); break;
            case "ManageProject" : root = loadManageProject("ManageProjectView.fxml",true); break;
            case "AddProject" : root = loadManageProject("ManageProjectView.fxml",false); break;
        }
        currentScene.setRoot(root);
        String title = "";
        if (root.getUserData() != null)
        {
            title += root.getUserData();
        }
        primaryStage.setTitle(title);
        primaryStage.setScene(currentScene);
        primaryStage.setWidth(root.getPrefWidth());
        primaryStage.setHeight(root.getPrefHeight());
        primaryStage.show();

        switch (id){
            case "TeamMemberView":
            case "TabView": tabViewController.openTab(0);break;
            case "ProjectTabView": tabViewController.openTab(1); break;
            case "ProjectView":
            case "TaskView":
            case "RequirementView":
                tabViewController.openTab(1); tabViewController.openProjectWindow(id);break;
        }
    }

    public void closeView(){
        primaryStage.close();
    }

    private Region loadTabView(String fxmlS){
        Region root = null;
        if (tabViewController == null){
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource(fxmlS));
                root = loader.load();
                tabViewController = loader.getController();
                tabViewController.init(this,model, root);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        } else {
            tabViewController.reset();
        }
        return tabViewController.getRoot();
    }

    private Region loadManageProject(String fxmlS,boolean edit){
        Region root = null;
        if (manageProjectViewController == null){
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource(fxmlS));
                root = loader.load();
                manageProjectViewController = loader.getController();
                manageProjectViewController.init(this,model, root, edit);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        } else {
            manageProjectViewController.reset(edit);
        }
        return manageProjectViewController.getRoot();
    }

    public void setCurrentProject(Project currentProject)
    {
        this.currentProject = currentProject;
    }

    public Project getCurrentProject()
    {
        return currentProject;
    }

    public void setCurrentRequirement(Requirement currentRequirement)
    {
        this.currentRequirement = currentRequirement;
    }

    public Requirement getCurrentRequirement()
    {
        return currentRequirement;
    }

    public void setCurrentTask(Task currentTask)
    {
        this.currentTask = currentTask;
    }

    public Task getCurrentTask()
    {
        return currentTask;
    }
}
