package Tasks;

import java.util.Objects;

public class Task {
    private final String name;
    private final String description;
    private String status;
    private int id;

    public Task (String name, String description, String status) {
        this.name = name;
        this.description = description;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId () {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Tasks.Task{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", id=" + id +
                ", status='" + status + '\'' +
                '}';
    }
}
