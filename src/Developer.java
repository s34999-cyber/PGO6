public class Developer extends Employee {
    private String mainLanguage;
    private int repositoryCount;
    public Developer(String employeeID, String firstName, String lastName, double baseSalary, String mainLanguage, int repositoryCount) {
        super(employeeID, firstName, lastName, baseSalary);
        this.mainLanguage = mainLanguage;
        this.repositoryCount = repositoryCount;
    }

    @Override
    public double calculateMonthlyCost() {
        return super.calculateMonthlyCost();
    }

    @Override
    public String introduceYourself() {
        return "Hello! I'm " + getFirstName() + ", a "+ mainLanguage+" developer!";
    }

    public void printTechnologies(){
        System.out.println("I work mainly with " + mainLanguage + ", and have made " + repositoryCount + "Repositories so far.");
    }
}
