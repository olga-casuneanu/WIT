public class EmployeeTest {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.setMonthlySalary(15000);
        System.out.println(e1.getMonthlySalary());

        e2.setMonthlySalary(10000);
        e2.raiseSalaryByPercentage(10);
        System.out.println(e2.getMonthlySalary());
        e2.setMonthlySalary(100);
        System.out.println(e2.yearlySalary());
    }
}
