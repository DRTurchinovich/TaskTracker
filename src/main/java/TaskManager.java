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

    public void updateTask(Task task) {
        if (task != null) {
            taskMap.put(task.getId(), task);
        }
    }

    public Subtask createSubtask(Subtask subtask) {
        if (subtask != null) {
            id += 1;
            subtask.setId(id);
            subtaskMap.put(id, subtask);
            epicMap.get(subtask.getEpicID()).addSubTask(subtask);
        }
        return subtask;
    }

}
