package A_Z_zad_2;

public abstract class Device {

    protected String deviceDescription;
    protected int device_id = 0;

    public Device() {
        device_id = device_id++;

    }

    public abstract void powerSupply();
    public abstract void operate();
    public abstract void stopOperate();
}
