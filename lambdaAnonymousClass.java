package Java8;

interface Employee {
    String getSalary();

    String getDesignation();
}

public class lambdaAnonymousClass {
    public static void main(String[] args) {
        Employee employee = new Employee() {

            @Override
            public String getSalary() {
                return "10000";
            }

            @Override
            public String getDesignation() {
                return "SDE";
            }
        };
        System.out.println(employee.getDesignation());
        System.out.println(employee.getSalary());

    }
}
