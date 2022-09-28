import java.util.HashMap;


public class TaskManager {

    private int id = 0;
    private HashMap<Integer, Task> taskMap = new HashMap<>();
    private HashMap<Integer, EpicTask> epicMap = new HashMap<>();
    private HashMap<Integer, Subtask> subtaskMap = new HashMap<>();

    public TaskManager() {
    }

    public TaskManager(int id, HashMap<Integer, Task> taskMap, HashMap<Integer, EpicTask> epicMap, HashMap<Integer, Subtask> subtaskMap) {
        this.id = id;
        this.taskMap = taskMap;
        this.epicMap = epicMap;
        this.subtaskMap = subtaskMap;
    }

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashMap<Integer, Task> getTaskMap() {
        return taskMap;
    }

    public void setTaskMap(HashMap<Integer, Task> taskMap) {
        this.taskMap = taskMap;
    }

    public HashMap<Integer, EpicTask> getEpicMap() {
        return epicMap;
    }

    public void setEpicMap(HashMap<Integer, EpicTask> epicMap) {
        this.epicMap = epicMap;
    }

    public HashMap<Integer, Subtask> getSubtaskMap() {
        return subtaskMap;
    }

    public void setSubtaskMap(HashMap<Integer, Subtask> subtaskMap) {
        this.subtaskMap = subtaskMap;
    }
}
