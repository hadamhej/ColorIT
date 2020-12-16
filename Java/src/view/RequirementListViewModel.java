package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Project;
import model.ProjectManagementModel;
import model.Requirement;

public class RequirementListViewModel
{
  private ObservableList<RequirementViewModel> reqList;
  private ProjectManagementModel model;
  private Project project;

  public RequirementListViewModel(ProjectManagementModel model,Project project){
    this.model = model;
    this.project = project;
    this.reqList = FXCollections.observableArrayList();

    update();
  }

  public void update()
  {
    if (project == null){
      return;
    }
    this.reqList.clear();
    Requirement[] requirements = model.getAllRequirements(project);
    for (Requirement requirement:requirements){
      reqList.add(new RequirementViewModel(requirement,model));
    }
  }

  public ObservableList<RequirementViewModel> getReqList()
  {
    return reqList;
  }

  public void remove(Requirement requirement){
    int size = reqList.size();
    for (int i = 0;i < size;i++){
      if (reqList.get(i).getNameProperty().get().equals(requirement.getName())){
        reqList.remove(i);
        break;
      }
    }
  }
}
