public class Tester extends Employee{
    private boolean automationTester;
    private int scenarioCount;
    public Tester(String employeeID, String firstName, String lastName, double baseSalary,boolean automationTester, int scenarioCount) {
        super(employeeID, firstName, lastName, baseSalary);
        this.automationTester = automationTester;
        this.scenarioCount = scenarioCount;
    }

    @Override
    public double calculateMonthlyCost() {
        return super.calculateMonthlyCost();
    }

    @Override
    public String introduceYourself() {
        return "Hello! I'm " + getFirstName() + ", a tester!";
    }

    public void runTestingReport(){
        System.out.println("Running a new scenario!");
        scenarioCount++;
    }

    public boolean isAutomationTester() {
        return automationTester;
    }

    public int getScenarioCount() {
        return scenarioCount;
    }
}
