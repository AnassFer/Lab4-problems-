package student.instructor;



public class Subject {
    private int id;
    private String code;
    private String title;

    // No-arguments constructor
    public Subject() {
    }

    // Initialization constructor
    public Subject(int id, String code, String title) {
        this.id = id;
        this.code = code;
        this.title = title;
    }

    // Accessor methods (Getters and Setters)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String normalizedCode(){
        return this.code.toUpperCase().trim();
    }

    public String properTitle(){
        String[] words = title.split(" ");
        StringBuilder res = new StringBuilder();
        for(String word : words){
            res.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase())
                    .append(" ");
        }
        return res.toString().trim();
    }

    public boolean isIntroCourse(){
        return (title.toLowerCase().contains("intro") || code.startsWith("INTRO-"));
    }

    public String syllabusLine(Instructor s){
        StringBuilder sb = new StringBuilder(code);
        sb.append(" - ")
                .append(title)
                .append("(Instructor: ")
                .append(s.getSecondName())
                .append(" ")
                .append(s.getFirstName())
                .append(")");
        return sb.toString();
    }


    // toString method
    @Override
    public String toString() {
        return "Subject [id=" + id + ", code=" + code + ", title=" + title + "]";
    }
}

