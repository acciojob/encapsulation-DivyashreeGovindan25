package encapsulation;

public class Main {

    public static void main(String[] args) {
        RWOnly objr= new RWOnly();

        objr.setName("Arjun");
        System.out.println(objr.getName());
    }

}