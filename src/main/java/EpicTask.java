import java.util.ArrayList;

public class EpicTask extends Task {

    private static String status = "NEW";
    private final ArrayList<Subtask> subtaskArrayList;

    public EpicTask(String name, String description) {
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

    @Override
    public String toString() {
        return "Epic{" +
                "subtaskArrayList=" + subtaskArrayList +
                "} " + super.toString();
    }
}
