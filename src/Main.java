public class Main {
    private static final Employee[] EMPLOYEES = new Employee[10];
    public static void main(String[] args) {
        EMPLOYEES[0] = new Employee("Иванов Иван Иванович",1,50_000);
        EMPLOYEES[1] = new Employee("Иванов Петр Алексеевич",1,47_000);
        EMPLOYEES[2] = new Employee("Петров Иван Алексеевич",2,36_000);
        EMPLOYEES[3] = new Employee("Смирнов Михаил Алексеевич",3, 42_000);
        EMPLOYEES[4] = new Employee("Алексеев Иван Федорович",4,51_000);
        EMPLOYEES[5] = new Employee("Васильев Сергей Андреевич",5,53_000);
        EMPLOYEES[6] = new Employee("Андреев Николай Петрович",4,48_000);
        printFullInfo();
        int totalSalary = getTotalSalary();
        System.out.println("Сумма затрат на зарплаты: "+ totalSalary);
        Employee employeeWithMinSalary = findEmployeeWithMinSalary();
        System.out.println("Сотрудник с минимальной зарплатой: " + employeeWithMinSalary);
        Employee employeeWithMaxSalary = findEmployeeWithMaxSalary();
        System.out.println("Сотрудник с максимальной зарплатой: " + employeeWithMaxSalary);
        double averageSalary = findAverageSalary();
        System.out.printf("Средняя зарплата: %.2f", averageSalary);
        System.out.println();
        printFullNameInfo();


    }
    private static void printFullInfo () {
        for (Employee employee : EMPLOYEES){
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }
    private static int getTotalSalary () {
        int sum = 0;
        for (Employee employee : EMPLOYEES){
            if (employee != null) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }
    private static Employee findEmployeeWithMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee employeeWithMinSalary = null;
        for (Employee employee : EMPLOYEES){
            if (employee != null && employee.getSalary()< min) {
                min = employee.getSalary();
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }
    private static Employee findEmployeeWithMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee employeeWithMaxSalary = null;
        for (Employee employee : EMPLOYEES){
            if (employee != null && employee.getSalary()> max) {
                max = employee.getSalary();
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }
    private static double findAverageSalary() {
        int count = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                count++;
            }
        }
        if (count != 0) {
            return (double) getTotalSalary() / count;
        }
        return 0;
    }
    private static void printFullNameInfo () {
        for (Employee employee : EMPLOYEES){
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

}