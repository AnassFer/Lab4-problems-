package student;

public class Test {
    public static void main(String[] args) {
        // Display computer science students
        Major csMajor = Major.CompSci; // Default Computer Science (code: 23)
        Major aiMajor = new Major("42", "Artificial Intelligence");
        Major cyberMajor = new Major("15", "Cybersecurity");
        Student student1 = new Student( "Fertat", "Anass", "+212600000001", "anass@um6p.ma", "S202601");

        Student student2 = new Student("Rahmouni", "Ilyas", "+212600000002", "ilyas@um6p.ma", "S202602", aiMajor);

        Student student3 = new Student("Sabir", "Alae", "+212600000003", "alae@um6p.ma", "S202603", csMajor);

        Student student4 = new Student("Latif", "Youness", "+212600000004", "youness@um6p.ma", "S202604", cyberMajor);

        csMajor.displayStudents();
    }
}

