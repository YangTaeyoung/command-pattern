package receiver;

public abstract class Device {

    private final String location;

    public Device(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}
