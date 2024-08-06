package device;

public class CeilingFan extends Device{
    private Speed speed;

    public CeilingFan(String location) {
        super(location);
        speed = Speed.OFF;
    }

    private void printSpeed() {
        System.out.printf("%s 선풍기가 %s로 설정되었습니다.\n", getLocation(), speed.name());
    }

    public void high() {
        speed = Speed.HIGH;
        printSpeed();
    }

    public void medium() {
        speed = Speed.MEDIUM;
        printSpeed();
    }

    public void low() {
        speed = Speed.LOW;
        printSpeed();
    }

    public void off() {
        speed = Speed.OFF;
        System.out.println(getLocation() + " 선풍기가 꺼졌습니다.");
    }


    private enum Speed {
        HIGH, MEDIUM, LOW, OFF
    }
}
