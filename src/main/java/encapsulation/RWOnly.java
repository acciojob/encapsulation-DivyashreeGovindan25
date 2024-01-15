package encapsulation;

public class RWOnly {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RWOnly [name=" + name + "]";
    }

}