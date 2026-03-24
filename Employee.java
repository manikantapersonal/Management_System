import java.util.HashMap;

class Employee {

   public  HashMap<String, Integer> employee = new HashMap<>();
    HashMap<String, Integer> employeeStatus = new HashMap<>();

    void NewJoinee(String name, Integer id) {
        employee.put(name, id);
        System.out.println("Employee added: " + name + " (ID: " + id + ")");
    }

    void EmployeeStatus(String name) {
        if (employee.containsKey(name)) {
            System.out.println(name + " is an employee with ID: " + employee.get(name));
        } else {
            System.out.println(name + " is not an employee.");
        }
    }

    void WorkStatus(String name, Integer time) {
        if (employee.containsKey(name)) {
            if (time < 8) {
                employeeStatus.put(name, time);
                System.out.println(name + " worked " + time + " hours.");
            } else {
                System.out.println(name + " is working for more than 8 hours.");
            }
        } else {
            System.out.println(name + " is not an employee.");
        }
    }
}