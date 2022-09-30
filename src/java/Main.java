import Tasks.EpicTask;
import Tasks.Subtask;
import Tasks.Task;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        Task task1 = new Task("Апнуть 5к", "Играя только на 3 4 5", "NEW");
        manager.createTask(task1);
        System.out.println(task1);
        System.out.println(manager.getTaskMap());


        EpicTask epictask1 = new EpicTask("Сделать рампагу", "На чене");
        manager.createEpicTask(epictask1);
        Subtask subtask1 = new Subtask("Арты", "Собрать 2 рапиры", "IN_PROGRESS",
                epictask1.getId());
        manager.createSubtask(subtask1);
        System.out.println(subtask1);
    }
}
