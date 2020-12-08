package model;

import java.util.ArrayList;
import java.util.Arrays;

public class ProjectManagementModelManager implements ProjectManagementModel
    {

    // maybe not finished

    private ProjectList projectList;
    private TeamMemberList teamMemberList;

    public ProjectManagementModelManager()
    {
        this.projectList = new ProjectList();
        this.teamMemberList = new TeamMemberList();
    }

    @Override
    public void addProject(String name, String description)
    {
        projectList.addProject(name, description);
    }

    @Override
    public Project[] getProjectsByName(String projectName)
    {
        return projectList.getProjectsByName(projectName);
    }

    @Override
    public Project[] getAllProjects()
    {
        return projectList.getAllProjects();
    }

    @Override
    public void deleteProject(int projectID)
    {
        projectList.deleteProject(projectID);
    }

    @Override
    public Project[] getProjectsByScrumMaster(TeamMember teamMember)
    {
        return projectList.getProjectsByScrumMaster(teamMember);
    }

    @Override
    public Project[] getProjectsByProductOwner(TeamMember teamMember)
    {
        return projectList.getProjectsByProductOwner(teamMember);
    }

    @Override
    public Project[] getProjectsByTeamMember(TeamMember teamMember)
    {
        return projectList.getProjectsByTeamMember(teamMember);
    }

    @Override
    public int getProjectID(Project project)
    {
        return project.getProjectID();
    }

    @Override
    public String getProjectName(Project project)
    {
        return project.getProjectName();
    }

    @Override
    public String getProjectDescription(Project project)
    {
        return project.getProjectDescription();
    }

    @Override
    public TeamMember[] getTeamMembers(Project project)
    {
        return project.getTeamMembers();
    }

    @Override
    public TeamMember getScrumMaster(Project project)
    {
        return project.getScrumMaster();
    }

    @Override
    public TeamMember getProductOwner(Project project)
    {
        return project.getProductOwner();
    }

    @Override
    public void addTeamMember(Project project, TeamMember teamMember)
    {
        project.addTeamMember(teamMember);
    }

    @Override
    public void removeTeamMember(Project project, TeamMember teamMember)
    {
        project.removeTeamMember(teamMember);
    }

    @Override
    public void setName(Project project, String name)
    {
        project.setName(name);
    }

    @Override
    public void setScrumMaster(Project project, TeamMember teamMember)
    {
        project.setScrumMaster(teamMember);
    }

    @Override
    public void setProductOwner(Project project, TeamMember teamMember)
    {
        project.setProductOwner(teamMember);
    }

    @Override
    public float getProductivityOfMember(Project project, TeamMember teamMember)
    {
        // not sure about the whole exception thing
        // maybe not finished
        // TODO
        try {
            return project.getProductivityOfMember(teamMember);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public void setDescription(Project project, String description)
    {
        project.setDescription(description);
    }

    @Override
    public Requirement[] getRequirementsByStatus(Project project, Status status)
    {
        return project.getRequirements().getRequirementsByStatus(status);
    }

    @Override
    public void deleteRequirement(Project project, Requirement requirement)
    {
        project.getRequirements().deleteRequirement(requirement);
    }

    @Override
    public void reorderRequirements(Project project, int[] orderedRequirementsIDs)
    {
        project.getRequirements().reorderRequirements(orderedRequirementsIDs);
    }

    @Override
    public void addRequirement(Project project, String name, String nonFunctionalDescription,
                               int deadline, TeamMember responsibleTeamMember)
    {
        project.getRequirements().addRequirement(name, nonFunctionalDescription, deadline, responsibleTeamMember);
    }

    @Override
    public void addRequirement(Project project, String name, String[] FunctionalDescription,
                               int deadline, TeamMember responsibleTeamMember)
    {
        project.getRequirements().addRequirement(name, FunctionalDescription, deadline, responsibleTeamMember);
    }

    @Override
    public Requirement[] getAllRequirements(Project project)
    {
        return project.getRequirements().getAllRequirements();
    }

    @Override
    public Requirement[] getRequirementsBeforeDeadline(Project project, int days)
    {
        return project.getRequirements().getRequirementsBeforeDeadline(days);
    }

    @Override
    public Requirement[] getRequirementsByResponsibleTeamMember(Project project, TeamMember responsible)
    {
        return new Requirement[0];
    }

    @Override
    public Requirement getRequirementByID(Project project, int requirementID)
    {
        return project.getRequirements().getRequirementByID(requirementID);
    }

    @Override
    public Requirement[] getRequirementsByName(Project project, String name)
    {
        return project.getRequirements().getRequirementByName(name);
    }

    @Override
    public int getRequirementID(Requirement requirement)
    {
        return requirement.getRequirementId();
    }

    @Override
    public int getUsedTime(Requirement requirement)
    {
        return requirement.getUsedTime();
    }

    @Override
    public String getName(Requirement requirement)
    {
        return requirement.getName();
    }

    @Override
    public boolean isFunctional(Requirement requirement)
    {
        return requirement.isFunctional();
    }

    @Override
    public String[] getDescription(Requirement requirement)
    {
        return requirement.getDescription();
    }

    @Override
    public TaskList getTasks(Requirement requirement)
    {
        return requirement.getTasks();
    }

    @Override
    public int getEstimatedTime(Requirement requirement)
    {
        return requirement.getEstimatedTime();
    }

    @Override
    public TeamMember getResponsibleTeamMember(Requirement requirement)
    {
        return requirement.getResponsibleTeamMember();
    }

    @Override
    public Status getStatus(Requirement requirement)
    {
        return requirement.getStatus();
    }

    @Override
    public int getDeadlineTime(Requirement requirement)
    {
        return requirement.getDeadlineTime();
    }

    @Override
    public void setName(Requirement requirement, String name)
    {
        requirement.setName(name);
    }

    @Override
    public void setDescription(Requirement requirement, String description)
    {
        requirement.setDescription(description);
    }

    @Override
    public void setDescription(Requirement requirement, String who, String what, String why)
    {
        String[] description = new String[2];
        description[0] = who;
        description[1] = what;
        description[2] = why;
        requirement.setDescription(description);
    }

    @Override
    public void setDeadlineTime(Requirement requirement, int newTime) {
        requirement.setDeadlineTime(newTime);
    }

    @Override
    public void setResponsibleTeamMember(Requirement requirement, TeamMember teamMember)
    {
        requirement.setResponsibleTeamMember(teamMember);
    }

    @Override
    public void setStatus(Requirement requirement, Status status)
    {
        requirement.setStatus(status);
    }

    @Override
    public void addTask(Requirement requirement, String name, int id, int estimatedTime,
                        String description, int deadlineTime, TeamMember responsibleTeamMember)
    {
        requirement.getTasks().addTask(name, estimatedTime, description, deadlineTime, responsibleTeamMember);
    }

    @Override
    public void addTask(Requirement requirement, String name, int id, int estimatedTime, String description, int deadlineTime)
    {
        requirement.getTasks().addTask(name, estimatedTime, description, deadlineTime);
    }

    @Override
    public void ChangeTaskTrackTime(Task task, TeamMember teamMember, int newTime)
    {
        task.setTimeWorked(teamMember, newTime);
    }

    @Override
    public Task[] getAllTasks(Requirement requirement)
    {
        return requirement.getTasks().getAllTasks();
    }

    @Override
    public Task[] getTasksByName(Requirement requirement, String name)
    {
        return requirement.getTasks().getTasksByName(name);
    }

    @Override
    public void deleteTask(Requirement requirement, Task task)
    {
        requirement.getTasks().deleteTask(task);
    }

    @Override
    public void changeTask(Task task, String name,
                           int estimatedTime, String description, int deadlineTime, TeamMember responsibleTeamMember)
    {
        task.setName(name);
        task.setEstimatedTime(estimatedTime);
        task.setDescription(description);
        task.setDeadlineTime(deadlineTime);
        task.setResponsibleTeamMember(responsibleTeamMember);
    }

    @Override
    public Task[] getTasksByStatus(Requirement requirement, Status status)
    {
        return requirement.getTasks().getTasksByStatus(status);
    }

    @Override
    public Task[] getTasksDaysBeforeDeadline(Requirement requirement, int days)
    {
        return requirement.getTasks().getTasksDaysBeforeDeadline(days);
    }

    @Override
    public int getTaskID(Task task)
    {
        return task.getTaskID();
    }

    @Override
    public String getName(Task task)
    {
        return task.getName();
    }

    @Override
    public int getRequirementID(Task task)
    {
        return 0;
    }

    @Override
    public String getDescription(Task task)
    {
        return task.getDescription();
    }

    @Override
    public int getEstimatedTime(Task task)
    {
        return task.getEstimatedTime();
    }

    @Override
    public int getDeadlineTime(Task task)
    {
        return task.getDeadlineTime();
    }

    @Override
    public int getTimeSpend(Task task)
    {
        return task.getTimeSpent();
    }

    @Override
    public int getTimeSpendOfMember(Task task, TeamMember teamMember)
    {
        return task.getTimeSpentOfMember(teamMember);
    }

    @Override
    public TeamMember[] getTeamMember(Task task)
    {
        return new TeamMember[0];
    }

    @Override
    public TeamMember getResponsibleTeamMember(Task task)
    {
        return null;
    }

    @Override
    public Status getStatus(Task task)
    {
        return null;
    }

    @Override
    public void setName(Task task, String name)
    {
        task.setName(name);
    }

    @Override
    public void setDescription(Task task, String description)
    {
        task.setDescription(description);
    }

    @Override
    public void setEstimatedTime(Task task, int estimatedTime)
    {
        task.setEstimatedTime(estimatedTime);
    }

    @Override
    public void setDeadlineTIme(Task task, int time)
    {
        task.setDeadlineTime(time);
    }

    @Override
    public void setResponsibleTeamMember(Task task, TeamMember teamMember)
    {
        task.setResponsibleTeamMember(teamMember);
    }

    @Override
    public void setStatus(Task task, Status status)
    {
        task.setStatus(status);
    }

    @Override
    public void setTimeWorked(Task task, TeamMember teamMember, int time)
    {
        task.setTimeWorked(teamMember, time);
    }

    @Override
    public void addTeamMember(Task task, TeamMember teamMember)
    {
        task.addTeamMember(teamMember);
    }

    @Override
    public void addTeamMember(String name, String email)
    {
        teamMemberList.addTeamMember(name, email);
    }

    @Override
    public void deleteTeamMember(TeamMember teamMember) 
    {
        teamMemberList.deleteTeamMember(teamMember);
    }

    @Override
    public TrackTime[] getTrackTime(Task task)
    {
        return task.getTrackTime();
    }

    @Override
    public int getTotalTime(Task task) 
    {
        return task.getTimeSpent();
    }

    @Override
    public TeamMember[] getAllTeamMembers() 
    {
        return teamMemberList.getAllTeamMembers();
    }

    @Override
    public String getEmail(TeamMember teamMember) 
    {
        return teamMember.getEmail();
    }

    @Override
    public String getName(TeamMember teamMember) 
    {
        return teamMember.getName();
    }

    @Override
    public void setEmail(TeamMember teamMember, String email) 
    {
        teamMember.setEmail(email);
    }

    @Override
    public void setName(TeamMember teamMember, String name) 
    {
        teamMember.setName(name);
    }

    @Override
    public Project[] getProjectsWorkedOn(TeamMember teamMember)
    {
        return projectList.getProjectsByTeamMember(teamMember);
    }
}
