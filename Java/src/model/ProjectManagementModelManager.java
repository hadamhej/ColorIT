package model;

import persistence.*;

/**
 *
 * @author Group 6 - 1Y ICT A2020
 * @version 1.0 - December 2020 - December 2020
 * @since 1.0
 */
public class ProjectManagementModelManager implements ProjectManagementModel
{

    private ProjectList projectList;
    private TeamMemberList teamMemberList;

    private ProjectManagementPersistenceManager persistenceManager = new ProjectManagementPersistenceManager();

    public ProjectManagementModelManager()
    {

        this.projectList = new ProjectList();
        this.teamMemberList = new TeamMemberList();

        this.teamMemberList = persistenceManager.loadTeamMembersFromFile();
        this.projectList = persistenceManager.loadProjectsFromFile();

        /*this.projectList.addProject("project number 1", "this is very good project");
        this.projectList.addProject("project number 2", "this is very good project");
        this.projectList.addProject("project number 3", "this is very good project");
        this.projectList.addProject("project number 4", "this is very good project");
        this.projectList.addProject("project number 5", "this is very good project");*/

        /*this.teamMemberList.addTeamMember("jan michal","tu@play.33games.com");
        this.teamMemberList.addTeamMember("michal jan","tam@play.33games.com");
        this.teamMemberList.addTeamMember("martin kuklo","nikde@play.33games.com");
        this.teamMemberList.addTeamMember("michaela lazova","vsade@play.33games.com");*/



        /*String[] desc = new String[3];
        desc[0] = "I ";
        desc[1] = " need to";
        desc[2] = " shit";

        this.projectList.getAllProjects()[0].getRequirements().addRequirement("Test Requirement 1", desc,
                1000000000, teamMemberList.getAllTeamMembers()[0]);
        this.projectList.getAllProjects()[0].getRequirements().addRequirement("Test Requirement 2", desc,
                1000000000, teamMemberList.getAllTeamMembers()[1]);
        this.projectList.getAllProjects()[0].getRequirements().addRequirement("Test Requirement 3", "this is a non functional desc",
                1000000000, teamMemberList.getAllTeamMembers()[2]);
        this.projectList.getAllProjects()[0].getRequirements().addRequirement("Test Requirement 4", "another non functional desc",
                1000000001, teamMemberList.getAllTeamMembers()[3]);

        this.projectList.getAllProjects()[0].getRequirements().getAllRequirements()[0].setStatus(Status.NOT_STARTED);
        this.projectList.getAllProjects()[0].getRequirements().getAllRequirements()[1].setStatus(Status.STARTED);
        this.projectList.getAllProjects()[0].getRequirements().getAllRequirements()[2].setStatus(Status.APPROVED);
        this.projectList.getAllProjects()[0].getRequirements().getAllRequirements()[3].setStatus(Status.ENDED);

        long longAsFuck = 1000000000000000000L;
        Requirement requirement1 = this.projectList.getAllProjects()[0].getRequirements().getAllRequirements()[0];
       requirement1.getTasks().addTask("Task1", 3600, "very descriptive description", 1000000);
        addTask(requirement1 ,"Task1", 1, 3600,
                "very descriptive description", longAsFuck);


        Task[] gettingAllTasks = getAllTasks(requirement1);
        for (Task tasks : gettingAllTasks)
        {
            System.out.println(tasks);
        }*/




       /*persistenceManager.saveProjectListToFile(projectList, teamMemberList);
       persistenceManager.saveTeamMemberListToFile(teamMemberList, projectList);*/



    }

    /**
     * Adds a project to the list of projects.
     * Saves the project file.
     * @param name A String containing the name.
     * @param description A String containing the description.
     */
    @Override
    public void addProject(String name, String description)
    {
        projectList.addProject(name, description);
        persistenceManager.saveProjectListToFile(projectList, teamMemberList);
    }

    /**
     * Gets the projects filtered by name.
     * @param projectName A String containing the name of projects we want to filter.
     * @return An array of project objects with specified name.
     */
    @Override
    public Project[] getProjectsByName(String projectName)
    {
        return projectList.getProjectsByName(projectName);
    }

    /**
     * Gets all projects from project list.
     * @return An array of project objects.
     */
    @Override
    public Project[] getAllProjects()
    {
        return projectList.getAllProjects();
    }

    /**
     * Deletes a specified project.
     * Saves the project file.
     * @param projectID An integer containing the id of the project we want to delete.
     */
    @Override
    public void deleteProject(int projectID)
    {
        projectList.deleteProject(projectID);
        persistenceManager.saveProjectListToFile(projectList, teamMemberList);
    }

    /**
     * Gets all projects with a specified scrum master.
     * @param teamMember A TeamMember object containing the team member we want to filter by.
     * @return An array of Project objects.
     */
    @Override
    public Project[] getProjectsByScrumMaster(TeamMember teamMember)
    {
        return projectList.getProjectsByScrumMaster(teamMember);
    }

    /**
     * Gets all projects with a specified product owner.
     * @param teamMember A TeamMember object containing the team member we want to filter by.
     * @return An array of Project objects.
     */
    @Override
    public Project[] getProjectsByProductOwner(TeamMember teamMember)
    {
        return projectList.getProjectsByProductOwner(teamMember);
    }

    /**
     * Gets all projects with a specified team member.
     * @param teamMember A TeamMember object containing the team member we want to filter by.
     * @return An array of Project objects.
     */
    @Override
    public Project[] getProjectsByTeamMember(TeamMember teamMember)
    {
        return projectList.getProjectsByTeamMember(teamMember);
    }

    /**
     * Gets the project ID.
     * @param project A project containing the project we want to get ID for.
     * @return An integer representing the ID.
     */
    @Override
    public int getProjectID(Project project)
    {
        return project.getProjectID();
    }

    /**
     * Gets the name of the project.
     * @param project A project containing the project we want to get name for.
     * @return A string representing name of the project.
     */
    @Override
    public String getProjectName(Project project)
    {
        return project.getProjectName();
    }

    /**
     * Gets the project description.
     * @param project A project containing the project we want to get name for.
     * @return A string representing description of the project.
     */
    @Override
    public String getProjectDescription(Project project)
    {
        return project.getProjectDescription();
    }

    /**
     * Gets the team members of the project.
     * @param project A project containing the project we want to get team members for.
     * @return An array of team members.
     */
    @Override
    public TeamMember[] getTeamMembers(Project project)
    {
        return project.getTeamMembers();
    }

    /**
     * Gets the scrum master of the project.
     * @param project A project containing the project from which we want to get scrum master.
     * @return A team member object representing the scrum master.
     */
    @Override
    public TeamMember getScrumMaster(Project project)
    {
        return project.getScrumMaster();
    }

    /**
     * Gets the product owner of the project.
     * @param project A project containing the project from which we want to get scrum master.
     * @return A team member object representing the product owner.
     */
    @Override
    public TeamMember getProductOwner(Project project)
    {
        return project.getProductOwner();
    }

    /**
     * Adds a team member to the project.
     * @param project Specifies to which project will the team member be added.
     * @param teamMember Contains the team member that will be added.
     */
    @Override
    public void addTeamMember(Project project, TeamMember teamMember)
    {
        project.addTeamMember(teamMember);
        persistenceManager.saveTeamMemberListToFile(teamMemberList, projectList);
        persistenceManager.saveProjectListToFile(projectList, teamMemberList);
    }

    /**
     * Removes the team member from a project.
     * @param project Specifies from which project will the team member be removed.
     * @param teamMember Contains the team member that will be removed.
     */
    @Override
    public void removeTeamMember(Project project, TeamMember teamMember)
    {
        project.removeTeamMember(teamMember);
        persistenceManager.saveTeamMemberListToFile(teamMemberList, projectList);
    }

    /**
     * Sets the name of the project.
     * @param project Specifies which project will have the name changed.
     * @param name Contains the name.
     */
    @Override
    public void setName(Project project, String name)
    {
        projectList.setProjectName(project, name);
        persistenceManager.saveProjectListToFile(projectList, teamMemberList);
    }

    /**
     * Sets the scrum master of the project.
     * @param project Specifies which project will have the scrum master changed.
     * @param teamMember Contains the Scrum master.
     */
    @Override
    public void setScrumMaster(Project project, TeamMember teamMember)
    {
        project.setScrumMaster(teamMember);
        persistenceManager.saveProjectListToFile(projectList, teamMemberList);
    }

    /**
     * Sets the product owner of the project.
     * @param project Specifies which project will have the product owner changed.
     * @param teamMember Contains the product owner.
     */
    @Override
    public void setProductOwner(Project project, TeamMember teamMember)
    {
        project.setProductOwner(teamMember);
        persistenceManager.saveProjectListToFile(projectList, teamMemberList);
    }

    /**
     * Gets the productivity of a team member.
     * @param teamMember Specifies for which team member will the productivity be for.
     * @return An float representing the productivity.
     * @throws Exception If the team member hasn't done any work.
     */
    @Override
    public float getProductivityOfMember(TeamMember teamMember) throws Exception {
        try
        {
            return projectList.getProductivityOfMember(teamMember);
        }
        catch (Exception e)
        {
            throw new Exception(e.getMessage());
        }
    }

    /**
     * Sets the project description.
     * @param project Contains the project in which the description will be changed.
     * @param description Contains the description.
     */
    @Override
    public void setDescription(Project project, String description)
    {
        project.setDescription(description);
        persistenceManager.saveProjectListToFile(projectList, teamMemberList);
    }

    /**
     * Gets requirements with a specified status.
     * @param project Contains the project which we want statuses of requirements for.
     * @param status Specifies the status we want to filter by.
     * @return An array of requirements with a specified status.
     */
    @Override
    public Requirement[] getRequirementsByStatus(Project project, String status)
    {
        return project.getRequirements().getRequirementsByStatus(status);
    }

    /**
     * Deletes a requirement.
     * @param project Specifies which project is the requirement.
     * @param requirement Specifies which requirement is gonna be deleted.
     */
    @Override
    public void deleteRequirement(Project project, Requirement requirement)
    {
        project.getRequirements().deleteRequirement(requirement);
        persistenceManager.saveProjectListToFile(projectList, teamMemberList);
    }

    /**
     * Reorders two requirements, swaps their places in the ArrayList.
     * @param project Specifies which project are the requirements in.
     * @param index1 An integer representing a position of the first requirement.
     * @param index2 An integer representing a position of the second requirement.
     */
    @Override
    public void reorderRequirements(Project project, int index1, int index2)
    {
        project.getRequirements().reorderRequirements(index1, index2);
        persistenceManager.saveProjectListToFile(projectList, teamMemberList);
    }

    /**
     * Creates a new Requirement in the ArrayList of Requirement class, requirements.
     * The requirement gets an auto assigned Project-wide unique ID, based on the number of requirements created.
     * @param project Specifies which project we want to add requirement to.
     * @param name A string representing the name of the requirement, trimmed of any spaces.
     * @param nonFunctionalDescription A string representing a non functional description.
     * @param deadline A long representing the time of the deadline with a UNIX timestamp.
     * @param responsibleTeamMember A TeamMember object representing the responsible team member.
     */
    @Override
    public void addRequirement(Project project, String name, String nonFunctionalDescription,
                               long deadline, TeamMember responsibleTeamMember)
    {
        project.getRequirements().addRequirement(name, nonFunctionalDescription, deadline, responsibleTeamMember);
        persistenceManager.saveProjectListToFile(projectList, teamMemberList);
    }

    /**
     * Creates a new Requirement in the ArrayList of Requirement class, requirements.
     * The requirement gets an auto assigned Project-wide unique ID, based on the number of requirements created.
     * @param project Specifies which project we want to add requirement to.
     * @param name A string representing the name of the requirement, trimmed of any spaces.
     * @param FunctionalDescription A string representing a functional description.
     * @param deadline A long representing the time of the deadline with a UNIX timestamp.
     * @param responsibleTeamMember A TeamMember object representing the responsible team member.
     */
    @Override
    public void addRequirement(Project project, String name, String[] FunctionalDescription,
                               long deadline, TeamMember responsibleTeamMember)
    {
        project.getRequirements().addRequirement(name, FunctionalDescription, deadline, responsibleTeamMember);
        persistenceManager.saveProjectListToFile(projectList, teamMemberList);
    }

    /**
     * Gets all requirements of this RequirementList
     * @param project Specifies for which project do we want to get requirements for.
     * @return An array of Requirement objects representing all the requirements <br> of this RequirementList(of Project the RequirementList belongs to)
     */
    @Override
    public Requirement[] getAllRequirements(Project project)
    {
        return project.getRequirements().getAllRequirements();
    }

    /**
     * Gets requirements that are closer to the deadline than a specified time.
     * @param project Specifies for which project do we want to get requirements for.
     * @param days An integer representing the number of days,<br> specifies how close the to the deadline we want the requirements.
     * @return An array of Requirement objects that are closer to the deadline <br> than the specified number of days.
     */
    @Override
    public Requirement[] getRequirementsBeforeDeadline(Project project, int days)
    {
        return project.getRequirements().getRequirementsBeforeDeadline(days);
    }

    /**
     * Gets requirements with a specified responsible member.
     * @param project Specifies for which project do we want to get requirements for.
     * @param responsible A TeamMember object representing the responsible team member we want to filter by.
     * @return An array of Requirement objects representing requirements with a specified team member.
     */
    @Override
    public Requirement[] getRequirementsByResponsibleTeamMember(Project project, TeamMember responsible)
    {
        return project.getRequirements().getRequirementByResponsibleTeamMember(responsible);
    }

    /**
     * Gets a requirement with a specific ID.
     * project Specifies for which project do we want to get requirements for.
     * @param requirementID An integer representing the ID of the requirement.
     * @return A Requirement object that has the id fitting the parameter.
     */
    @Override
    public Requirement getRequirementByID(Project project, int requirementID)
    {
        return project.getRequirements().getRequirementByID(requirementID);
    }

    /**
     * Gets all requirements with a specified name.
     * @param project Specifies for which project do we want to get requirements for.
     * @param name A String representing the name of the wanted requirements.
     * @return An array of Requirement objects representing requirements with the same name as the input.
     */
    @Override
    public Requirement[] getRequirementsByName(Project project, String name)
    {
        return project.getRequirements().getRequirementByName(name);
    }

    /**
     * Gets the ID of the requirement.
     * @param requirement Specifies for which requirement do we want to get ID for.
     * @return An integer representing the ID of the requirement.
     */
    @Override
    public int getRequirementID(Requirement requirement)
    {
        return requirement.getRequirementId();
    }

    /**
     * Gets the total time spend on the requirement.
     * @param requirement Specifies the requirement we want to get time spend for.
     * @return An integer representing the total time spend on the requirement.
     */
    @Override
    public int getUsedTime(Requirement requirement)
    {
        return requirement.getUsedTime();
    }

    /**
     * Gets the name of the requirement.
     * @param requirement Specifies which requirement.
     * @return A String representing the name of the requirement.
     */
    @Override
    public String getName(Requirement requirement)
    {
        return requirement.getName();
    }

    /**
     * Gets a boolean statement saying if the requirement is functional.
     * @param requirement Specifies which requirement.
     * @return A boolean representing statement if the requirement is functional, true if it is, false if isn't.
     */
    @Override
    public boolean isFunctional(Requirement requirement)
    {
        return requirement.isFunctional();
    }

    /**
     * Gets the description of the requirement.
     * @param requirement Specifies which requirement.
     * @return A String array representing the description of the requirement, either functional 3 string, or non functional, 1 string.
     */
    @Override
    public String[] getDescription(Requirement requirement)
    {
        return requirement.getDescription();
    }

    /**
     * Gets all tasks, belonging to a requirement.
     * @param requirement Specifies which requirement.
     * @return A TaskList object representing the tasks of this requirement.
     */
    @Override
    public TaskList getTasks(Requirement requirement)
    {
        return requirement.getTasks();
    }

    /**
     * Gets the estimated time to complete a requirement.
     * @param requirement Specifies which requirement.
     * @return An integer representing the sum of all estimated times of the requirement.
     */
    @Override
    public int getEstimatedTime(Requirement requirement)
    {
        return requirement.getEstimatedTime();
    }

    /**
     * Gets the responsible team member.
     * @param requirement Specifies which requirement.
     * @return An TeamMember object representing the responsible team member.
     */
    @Override
    public TeamMember getResponsibleTeamMember(Requirement requirement)
    {
        return requirement.getResponsibleTeamMember();
    }

    /**
     * Gets the status of the requirement.
     * @param requirement Specifies which requirement.
     * @return An String representing the status.
     */
    @Override
    public String getStatus(Requirement requirement)
    {
        return requirement.getStatus();
    }

    @Override
    public long getDeadlineTime(Requirement requirement)
    {
        return requirement.getDeadlineTime();
    }

    @Override
    public void setName(Requirement requirement, String name)
    {
        requirement.setName(name);
        persistenceManager.saveProjectListToFile(projectList, teamMemberList);
    }

    @Override
    public void setDescription(Requirement requirement, String description)
    {
        requirement.setDescription(description);
        persistenceManager.saveProjectListToFile(projectList, teamMemberList);
    }

    @Override
    public void setDescription(Requirement requirement, String who, String what, String why)
    {
        String[] description = new String[3];
        description[0] = who;
        description[1] = what;
        description[2] = why;
        requirement.setDescription(description);
        persistenceManager.saveProjectListToFile(projectList, teamMemberList);
    }

    @Override
    public void setDeadlineTime(Requirement requirement, long newTime) {
        requirement.setDeadlineTime(newTime);
        persistenceManager.saveProjectListToFile(projectList, teamMemberList);
    }

    @Override
    public void setResponsibleTeamMember(Requirement requirement, TeamMember teamMember)
    {
        requirement.setResponsibleTeamMember(teamMember);
        persistenceManager.saveProjectListToFile(projectList, teamMemberList);
    }

    @Override
    public void setStatus(Requirement requirement, String status)
    {
        requirement.setStatus(status);
        persistenceManager.saveProjectListToFile(projectList, teamMemberList);
    }

    @Override
    public void addTask(Requirement requirement, String name, int id, int estimatedTime,
                        String description, long deadlineTime, TeamMember responsibleTeamMember)
    {
        requirement.getTasks().addTask(name, id, estimatedTime, description, deadlineTime, responsibleTeamMember);
        persistenceManager.saveProjectListToFile(projectList, teamMemberList);
    }

    @Override
    public void addTask(Requirement requirement, String name, int id, int estimatedTime,
                        String description, long deadlineTime)
    {
        requirement.getTasks().addTask(name, id, estimatedTime, description, deadlineTime);
        persistenceManager.saveProjectListToFile(projectList, teamMemberList);
    }

    @Override
    public void ChangeTaskTrackTime(Task task, TeamMember teamMember, int newTime)
    {
        task.setTimeWorked(teamMember, newTime);
        persistenceManager.saveProjectListToFile(projectList, teamMemberList);
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
        persistenceManager.saveProjectListToFile(projectList, teamMemberList);
    }

    @Override
    public void changeTask(Task task, String name,
                           int estimatedTime, String description, long deadlineTime, TeamMember responsibleTeamMember)
    {
        task.setName(name);
        task.setEstimatedTime(estimatedTime);
        task.setDescription(description);
        task.setDeadlineTime(deadlineTime);
        task.setResponsibleTeamMember(responsibleTeamMember);
        persistenceManager.saveProjectListToFile(projectList, teamMemberList);
    }

    @Override
    public Task[] getTasksByStatus(Requirement requirement, String status)
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
        return task.getRequirementID();
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
    public long getDeadlineTime(Task task)
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
    public TeamMember[] getTeamMembers(Task task)
    {
        return task.getTeamMembers();
    }

    @Override
    public TeamMember getResponsibleTeamMember(Task task)
    {
        return task.getResponsibleTeamMember();
    }

    @Override
    public String getStatus(Task task)
    {
        return task.getStatus();
    }

    @Override
    public void setName(Task task, String name)
    {
        task.setName(name);
        persistenceManager.saveProjectListToFile(projectList, teamMemberList);
    }

    @Override
    public void setDescription(Task task, String description)
    {
        task.setDescription(description);
        persistenceManager.saveProjectListToFile(projectList, teamMemberList);
    }

    @Override
    public void setEstimatedTime(Task task, int estimatedTime)
    {
        task.setEstimatedTime(estimatedTime);
        persistenceManager.saveProjectListToFile(projectList, teamMemberList);
    }

    @Override
    public void setDeadlineTIme(Task task, long time)
    {
        task.setDeadlineTime(time);
        persistenceManager.saveProjectListToFile(projectList, teamMemberList);
    }

    @Override
    public void setResponsibleTeamMember(Task task, TeamMember teamMember)
    {
        task.setResponsibleTeamMember(teamMember);
        persistenceManager.saveProjectListToFile(projectList, teamMemberList);
    }

    @Override
    public void setStatus(Task task, String status)
    {
        task.setStatus(status);
        persistenceManager.saveProjectListToFile(projectList, teamMemberList);
    }

    @Override
    public void setTimeWorked(Task task, TeamMember teamMember, int time)
    {
        task.setTimeWorked(teamMember, time);
        persistenceManager.saveProjectListToFile(projectList, teamMemberList);
    }

    @Override
    public void addTeamMember(Task task, TeamMember teamMember)
    {
        task.addTeamMember(teamMember);
        persistenceManager.saveProjectListToFile(projectList, teamMemberList);
    }

    @Override
    public void addTeamMember(String name, String email)
    {
        teamMemberList.addTeamMember(name, email);
        persistenceManager.saveTeamMemberListToFile(teamMemberList, projectList);
    }

    @Override
    public void deleteTeamMember(TeamMember teamMember) 
    {
        teamMemberList.deleteTeamMember(teamMember);
        persistenceManager.saveTeamMemberListToFile(teamMemberList, projectList);
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
        teamMemberList.setTeamMemberEmail(teamMember, email);
        persistenceManager.saveTeamMemberListToFile(teamMemberList, projectList);
    }

    @Override
    public void setName(TeamMember teamMember, String name) 
    {
        teamMember.setName(name);
        persistenceManager.saveTeamMemberListToFile(teamMemberList, projectList);
    }

    @Override
    public Project[] getProjectsWorkedOn(TeamMember teamMember)
    {
        return projectList.getProjectsByTeamMember(teamMember);
    }
}
