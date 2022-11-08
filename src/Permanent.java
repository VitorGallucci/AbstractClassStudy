public class Permanent extends Employee{
    private int yearsWorked;

    public Permanent(double baseWage, int yearsWorked) {
        super(baseWage);
        this.yearsWorked = yearsWorked;
    }
    @Override
    protected double getBonus() {
        return 0.2 * (yearsWorked / 5) * baseWage;
    }

}
