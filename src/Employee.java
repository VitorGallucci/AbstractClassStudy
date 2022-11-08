public abstract class Employee {
    protected double baseWage;

    public Employee(double baseWage) {
        this.baseWage = baseWage;
    }

    public double getWage() {
        return baseWage + getBonus();
    }

    protected abstract double getBonus();
}
