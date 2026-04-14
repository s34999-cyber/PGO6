public class Developer extends Employee {
    private String mainLanguage;
    private int repositoryCount;
    public Developer(String employeeID, String firstName, String lastName, double baseSalary, String mainLanguage, int repositoryCount) {
        super(employeeID, firstName, lastName, baseSalary);
        this.mainLanguage = mainLanguage;
        this.repositoryCount = repositoryCount;
    }
}
