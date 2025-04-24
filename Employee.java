public class Employee {
    private String lastname;
    private String firstName;
    private int employeeNumber;
    private String employeeEmail;
    private String cellNumber;
    private String salesRegion;
    private double commissionRate;

    public Employee(String lastname, String firstName, int employeeNumber, String employeeEmail, String cellNumber, String salesRegion, double commissionRate) {
        this.lastname = lastname;
        this.firstName = firstName;
        this.employeeNumber = employeeNumber;
        this.employeeEmail = employeeEmail;
        this.cellNumber = cellNumber;
        this.salesRegion = salesRegion;
        this.commissionRate = commissionRate;
    }

    public String getLastName() {
        return lastname;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public String getSalesRegion() {
        return salesRegion;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void displayInformation() {
        System.out.println("Employee Information:");
        System.out.println("Last Name: " + lastname);
        System.out.println("First Name: " + firstName);
        System.out.println("Employee Number: " + employeeNumber);
        System.out.println("Employee Email: " + employeeEmail);
        System.out.println("Cell Number: " + cellNumber);
        System.out.println("Sales Region: " + salesRegion);
        System.out.println("Commission Rate: " + commissionRate + "%");
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Doe", "John", 12345, "john.doe@example.com", "555-1234", "West Coast", 10.5);

        employee.displayInformation();
}
}
