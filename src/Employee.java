import java.util.Objects;

public class Employee {

    private final String fullName;
    private int department;
    private int salary;
    private static int counter;
    private int id;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
    }
    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {

        return this.department;
    }

    public int getId() {
        return this.id;

    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
@Override
    public String toString() {
        return "Номер: " + id + " ФИО работника: " + fullName + " Отдел: " + department + " Зарплата: " + salary;
    }
@Override
    public boolean equals(Object a) {
        if (this == a) return true;
        if (a == null || getClass() != a.getClass()) return false;
        Employee employee = (Employee) a;
    return id == employee.id && salary == employee.salary && department == employee.department && fullName == employee.fullName;
    }
@Override
    public int hashCode(){return Objects.hash (fullName, id, salary, department);}

}

