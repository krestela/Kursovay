public class Main {
    private static Employee[] employees = new Employee[10];

    public static void printAllInformation() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int totalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }

    public static Employee minSalary() {
        Employee result = employees[0];
        int min = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                result = employee;
            }

        }
        return result;
    }

    public static Employee maxSalary() {
        Employee result = employees[0];
        int max = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > max) {
                max = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }


    public static int averengeSalary() {
        return totalSalary() / (int) employees.length;
    }

    public static void printAllFullname() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    public static void indexingSalary(int percent) {
        for (Employee employee : employees) {
            int currentSalary = employee.getSalary();
            employee.setSalary((int) (currentSalary + (percent / 100f + 1)));
        }
    }

    public static Employee findMinEmployeeinDepartament(int department) {
        int minSalary = Integer.MAX_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee findMaxEmployeeinDepartament(int department) {
        int maxSalary = Integer.MIN_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }
            if (employee.getSalary() < maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static int calculateTotalOfTeam(int departament) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == departament) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static float calculateAverengeSumOfTeam(int departament) {
        int membersCount = 0;
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == departament) {
                sum += employee.getSalary();
                membersCount++;
            }
        }
        return sum / (float) membersCount;
    }

    public static void increaseSalaryOfTeam(int department, int percent) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                int currentSalary = employee.getSalary();
                employee.setSalary((int) (currentSalary * (percent / 100f + 1)));
            }
        }

    }

    public static void printTeam() {
        int teamNumber = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == teamNumber) {
                System.out.println(employee.getId() + " " + employee.getFullName() + " " + employee.getSalary());
            }
        }
    }

    public static void printEmployeeWithSalaryLessThanNumber(int salary) {
        for (Employee employee : employees){
            if (employee.getSalary() < salary){
                System.out.println(employee.getId() + " " + employee.getFullName()+ " " + employee.getSalary());
            }
        }
    }

    public static void printEmployeeWithSalaryMoreThanNumber(int salary){
        for (Employee employee : employees){
            if (employee.getSalary() >= salary){
                System.out.println(employee.getId() + " " + employee.getFullName()+ " " + employee.getSalary());
            }
        }
    }

    public static void main(String[] args) {
        employees = new Employee[]{
                new Employee("Раковна Раиса Ивановна", 1, 46900),
                new Employee("Самосонов Григорий Олегович", 4, 25054),
                new Employee("Андронов Аркадий Васильевич", 4, 38725),
                new Employee("Ласка Мария Александровна", 3, 76890),
                new Employee("Олежко Дмитрий Олегович", 2, 85260),
                new Employee("Мармадюк Максим Николаевич", 1, 35000),
                new Employee("Лимбо Александра Аркадьевна", 3, 98540),
                new Employee("Трубов Леонид Максимович", 2, 55555),
                new Employee("Шаров Геннадий Анатольевич", 5, 21000),
                new Employee("Норкова Фаисия Артуровна", 5, 69015),

        };
        printAllFullname();
        printAllInformation();
        System.out.println("avrg = " + averengeSalary());
        System.out.println("maxSalary() = " + maxSalary());
        System.out.println("minSalary() = " + minSalary());

    }

}
