import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Management System!\n How can i help you today?\n press 1 for adding the details of new employee\n press 2 for checking the status of employee\n press 3 for checking the work status of employee\n press 4 for adding project details\n press 5 for checking the project status of employee");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        Employee emp = new Employee();
        Project proj=new Project();
        switch(choice){
            case 1:
            System.out.println("Enter the name and id of employee");
            String name=sc.next();
            int id=sc.nextInt();
            emp.NewJoinee(name, id);
            break;
            case 2:
            System.out.println("Enter the name of employee");
            String name1=sc.next();
            emp.EmployeeStatus(name1);
            break;
            case 3:
            System.out.println("Enter the name of employee and hours worked");
            String name2=sc.next();
            int time=sc.nextInt();
            emp.WorkStatus(name2, time);
            break;
            case 4:
            System.out.println("Enter the name of employee and project name");
            String name3=sc.next();
            String projectName=sc.next();
            proj.addProject(name3, projectName);
            break;
             case 5:
             System.out.println("Enter the name of employee");
             String name4=sc.next();
             proj.projectStatus(name4);
             break;
             default:
             System.out.println("Invalid choice. Please try again.");
        }
    }    
}
