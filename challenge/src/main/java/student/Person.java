package student;

public class Person {
    private static int nextId = 1;
    protected int id;
    protected String firstName;
    protected String secondName;
    protected String phone;
    protected String email;

    public Person() {
        this.id = nextId++;
    }

    public Person(String firstName, String secondName, String telephone, String email) {
        this.id = nextId++;
        this.secondName = secondName;
        this.firstName = firstName;
        this.phone = telephone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String lastName) {
        this.secondName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void display() {
        System.out.println(this.toString());
    }

    // toString method
    @Override
    public String toString() {
        return "Person: id=" + id + ", lastName=" + secondName + ", firstName=" + firstName +
                ", phone=" + phone + ", email=" + email + ".";
    }
}

