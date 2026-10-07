package student.instructor;

public class Instructor extends student.Person {
    private String employeeNumber;

    // No-arguments constructor
    public Instructor() {
        super();
        this.employeeNumber = "";
    }

    // Initialization constructor
    public Instructor(String firstName, String lastName, String phone, String email, String employeeNumber) {
        super(firstName, lastName, phone, email);
        this.employeeNumber = employeeNumber;
    }




    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public  String cleanEmployeeNumber(){
        this.employeeNumber = this.employeeNumber.trim().replaceAll(" ", "");
        return this.employeeNumber;
    }

    public String summaryLine(){
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]", employeeNumber, secondName, firstName);
    }

    public String toCard(){
        StringBuilder sb = new StringBuilder("Instructor\n-----------------\nEmployee #:");
        sb.append(employeeNumber)
                .append("\nName\t: ")
                .append(secondName)
                .append(", ")
                .append(firstName)
                .append("\nEmail\t: ")
                .append(email)
                .append("\nPhone\t: ")
                .append(phone);
        return sb.toString();
    }

    public String displayName(){
        StringBuilder sb = new StringBuilder();
        sb.append(secondName==null?"":secondName)
                .append(firstName==null?"":(" "+secondName));

        return sb.toString();
    }

    @Override
    public String toString() {
        return "Instructor: " + super.toString() + ", employeeNumber=" + employeeNumber + ".";
    }
}
