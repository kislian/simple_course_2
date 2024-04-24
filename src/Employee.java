import java.util.Objects;

public class Employee {
    private int numberOfOtdel;
    private String fullName;
    private int salary;
    private static int counter;
    private int id;


    public Employee(String fullNameOfEmployee, int salaryOfEmployee, int numberOfOtdel) {
        this.numberOfOtdel = numberOfOtdel;
        this.fullName = fullNameOfEmployee;
        this.salary = salaryOfEmployee;
        id = ++counter;
    }

    public int getNumberOfOtdel() {
        return numberOfOtdel;
    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public void setNumberOfOtdel(byte numberOfOtdel) {
        this.numberOfOtdel = numberOfOtdel;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return numberOfOtdel == employee.numberOfOtdel && salary == employee.salary &&
                id == employee.id && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfOtdel, fullName, salary, id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "numberOfOtdel=" + numberOfOtdel +
                ", fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}