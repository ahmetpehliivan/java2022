package kodlama.io.kodlamaioDev.entities.concretes;

public class ProgrammingLanguages {
    private int id;
    private String name;

    public ProgrammingLanguages() {
    }

    public ProgrammingLanguages(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //Getter and Setter Methods
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
