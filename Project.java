import java.util.HashMap;
class Project {
    HashMap<String, String> projectDetails;
    Employee employ=new Employee();

     

    void addProject(String name, String projectName) {
        if(employ.employee.containsKey(name)) {
            projectDetails.put(name, projectName);
            System.out.println("Project " + projectName + " assigned to " + name);
        } else {
            System.out.println(name + " is not an employee.");
        }
    }

    void projectStatus(String name) {
        if (projectDetails.containsKey(name)) {
            System.out.println(name + " is working on project: " + projectDetails.get(name));
        } else {
            System.out.println(name + " has no assigned project.");
        }
    }
}