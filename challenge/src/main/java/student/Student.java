package student;

public class Student extends Person {
    private String cne;
    private Major major;

    public Student(){
        super();
        cne = "";
        major = Major.CompSci;
        this.major.addStudent(this);
    }

    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(nom, prenom, telephone, email);
        this.cne = cne;
        this.major = major;
        this.major.addStudent(this);

    }
    public Student(String nom, String prenom, String telephone, String email, String cne) {
        super(nom, prenom, telephone, email);
        this.cne = cne;
        this.major =  Major.CompSci;
        this.major.addStudent(this);
    }



    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public String getFullNameFormatted(){
        return String.format("%s, %s", secondName.toUpperCase(), firstName);
    }

    @Override
    public String toString() {
        return "Student :" + super.toString() + ", studentID=" + cne + ", major=" + major + ".";
    }


}

