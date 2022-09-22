public class Subtask extends Task {

    private int epicID;
    public Subtask(String name, String description, String status) {
        super(name, description, status);
        this.epicID = epicID;
    }

    public int getEpicID() {
        return epicID;
    }
    public void setEpicID(int epicID) {
        this.epicID = epicID;
    }
}
