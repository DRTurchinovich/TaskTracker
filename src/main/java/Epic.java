import java.util.ArrayList;

public class Epic extends Task {

    private static String status = "NEW";
    private final ArrayList<Subtask> subtaskArrayList;

    public Epic(String name, String description) {
        super(name, description, status);
        this.status = "NEW";
        this.subtaskArrayList = new ArrayList<>();
    }

    public ArrayList<Subtask> getSubtaskArrayList() {
        return subtaskArrayList;
    }

    public void addSubTask (Subtask subtask) {
        subtaskArrayList.add(subtask);
    }
    public void removeSubTask (Subtask subtask) {
        subtaskArrayList.remove(subtask);
    }
}
