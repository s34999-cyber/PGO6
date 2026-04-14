import java.util.Objects;

public class Employee {
    private String employeeID;
    private String firstName;
    private String lastName;
    private double baseSalary;

    public Employee(String employeeID, String firstName, String lastName, double baseSalary){
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
    }

    public final String getEmployeeID() {
        return employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double calculateMonthlyCost(){
        return baseSalary/12;
    }
    public String introduceYourself(){
        return "Hello! I'm " + firstName + ".";
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID='" + employeeID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeID, employee.employeeID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(employeeID);
    }
}
