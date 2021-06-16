public class Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;

     public Employee() {
        this.firstName = "";
        this.lastName = "";
        this.monthlySalary = 0.0;
    }

    public void raiseSalaryByPercentage(double raisePercentage) {
        this.setMonthlySalary(this.getMonthlySalary() + (this.getMonthlySalary() * raisePercentage/100));
    }

    public double yearlySalary () {
        return this.monthlySalary * 12;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return this.monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
         if (monthlySalary > 0.0)
             this.monthlySalary = monthlySalary;
     }




}


