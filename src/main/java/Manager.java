import java.util.ArrayList;
import java.util.HashMap;

public class Manager {

    private int id = 0;
    private HashMap<Integer, Task> taskMap = new HashMap<>();
    private HashMap<Integer, Epic> epicMap = new HashMap<>();
    private HashMap<Integer, Subtask> subtaskMap = new HashMap<>();

    public Task createTask(Task task) {
        if (task != null) {
            id += 1;
            task.setId(id);
            taskMap.put(id, task);
        }
        return task;
    }

    public Epic createEpic(Epic epic) {
        if (epic != null) {
            id += 1;
            epic.setId(id);
            epicMap.put(epic.getId(), epic);
        }
        return epic;
    }

}