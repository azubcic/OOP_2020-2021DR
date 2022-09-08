package A_Z_zad_2;

public class Robot implements Service {
    private String name;
    private int yr;

    public Robot(int yr, String name) {
        this.name = name;
        this.yr = yr;
    }

    @Override
    public void repair() {
        System.out.println("Send me to the nearest university laboratory ...");
    }

    public void charge() {
        System.out.println("Please charge my bateries ...");
    }

    public String getRobotName() {
        return name;
    }
}
