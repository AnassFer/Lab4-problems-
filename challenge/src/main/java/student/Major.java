package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount=0;

    static public Major CompSci = new Major("23","Computer Science");

    public Major(){
        this.id = nextId++;
        this.students = new Student[50];
    }

    public Major(String code, String name) {
        this.id = nextId;
        this.code = code;
        this.name = name;
        this.students = new Student[50];
        nextId++;
    }

    // Method to add a student
    public void addStudent(Student s) {
        students[studentCount] = s;
        studentCount++;
    }

    // Getters and Setters


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentCount() {
        return studentCount;
    }

    // Display all students in the major
    public void displayStudents() {
        System.out.println("The list of students in the " + name + " major is:");
        for (int i = 0; i < studentCount; i++) {
            if (students[i] != null) {
                System.out.println(students[i].toString());
            }
        }
    }

    public Student findStudentByCNE(String cne){
        for (int i = 0; i < studentCount; i++) {
            if (students[i] != null && students[i].getCne().equals(cne)) {
                return students[i];
            }
        }
        return null;
    }

    public boolean removeStudent(String cne){
        for (int i = 0; i < studentCount; i++) {
            if (students[i] != null && students[i].getCne().equals(cne)) {
                for (int j = i+1; j < studentCount; j++) {
                    students[j-1] = students[j];
                }
                students[studentCount] = null;
                studentCount--;
                return true;
            }
        }
        return false;
    }

    public String getOccupancyRate(){return (studentCount/50) + "%";}

    @Override
    public String toString() {
        return "Major : id=" + id + ", code=" + code + ", name=" + name + ".";
    }

    public String getStudentListAsString(){
        StringBuilder sb = new StringBuilder("Students enrolled in the ").append(this.getName()).append( " major:\n");
        for (int i = 0; i < studentCount; i++) {
            if (students[i] != null) {
                sb.append(students[i].toString()).append("\n");
            }
        }
        return sb.toString();
    }

}
