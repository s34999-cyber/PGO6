import java.util.ArrayList;

public class ProjectTeam {
    private String projectName;
    private ArrayList<Employee> employees;

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
}
