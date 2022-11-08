public class Temporary extends Employee{
    private int contractMonths;

    public Temporary(double baseWage, int contractMonths) {
        super(baseWage);
        this.contractMonths = contractMonths;
    }
    @Override
    protected double getBonus() {
        return 100.0 * contractMonths;
    }

}
