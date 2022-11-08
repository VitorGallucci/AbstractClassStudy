import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        var Employees = new ArrayList<Employee>();
        Employees.add(new Permanent(4000, 5)); //João
        Employees.add(new Temporary(2000, 12)); //José
        Employees.add(new Permanent(2400, 34)); //Maria
        Employees.add(new Temporary(1200, 10)); //Pedro

        for (Employee employee : Employees) {
            System.out.println("Wage: " + employee.getWage());
        }
    }
}