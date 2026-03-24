public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.NewJoinee("Alice", 101);
        emp.NewJoinee("Bob", 102);

        emp.EmployeeStatus("Alice");
        emp.EmployeeStatus("Charlie");

        emp.WorkStatus("Alice", 6);
        emp.WorkStatus("Bob", 9);
        emp.WorkStatus("Charlie", 5);
    }    
}
