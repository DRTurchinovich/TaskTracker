package AlishevJDBCAPI.models;

public class Hero {
    private int id;
    private String name;
    private String role;
    private String attributes;

    public Hero(int id, String name, String role, String attributes) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.attributes = attributes;
    }

    public Hero() {
    }

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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", attributes='" + attributes + '\'' +
                '}';
    }
}
