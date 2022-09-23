import java.util.HashMap;
import Tasks.*;


public class TaskManager {

    private int id = 0;
    private HashMap<Integer, Task> taskMap = new HashMap<>();
    private HashMap<Integer, EpicTask> epicMap = new HashMap<>();
    private HashMap<Integer, Subtask> subtaskMap = new HashMap<>();


    public Task createTask(Task task) {
        if (task != null) {
            id += 1;
            task.setId(id);
            taskMap.put(id, task);
        }
        return task;
    }

    public EpicTask createEpicTask(EpicTask epictask) {
        if (epictask != null) {
            id += 1;
            epictask.setId(id);
            epicMap.put(epictask.getId(), epictask);
        }
        return epictask;
    }

}
