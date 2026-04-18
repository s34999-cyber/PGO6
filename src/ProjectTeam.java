import java.util.ArrayList;

public class ProjectTeam {
    private String projectName;
    ArrayList<Employee> employees = new ArrayList<>();

    public ProjectTeam(String projectName) {
        this.projectName = projectName;

    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public void printTeamMembers() {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
    public double calculateTotalCost() {
        double total = 0;
        for (Employee employee : employees) {
            total =+ employee.getBaseSalary();
        }
        return total;
    }
    public Employee findByID(String employeeID) {
        for (Employee employee : employees) {
            if (employee.getEmployeeID().equals(employeeID)) {
                return employee;
            }
        }
        System.out.println("Employee with ID " + employeeID + " not found");
        return null;
    }
    public void printDevelopers() {
        for (Employee employee : employees) {
            if(employee instanceof Developer) {
                System.out.println(employee.toString());
            }
        }
    }
}
