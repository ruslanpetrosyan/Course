public class Employee {

    private static int idGenerator = 1;

    private final int id;
    private final String fullName;
    private int department;
    private int salary;

    public Employee(String fullName, int department, int salary){
       this.id = idGenerator++;
       this.fullName = fullName;
       this.department = department;
       this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "id: " + id + ", ФИО: " + fullName + ", отдел: " + department + ", ЗП: " + salary;
    }
}
