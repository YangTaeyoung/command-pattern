package receiver;

public class GarageDoor extends Device {

    public GarageDoor(String location) {
        super(location);
    }

    public void up() {
        System.out.printf("%s 차고 문이 올라갑니다.\n", getLocation());
    }

    public void down() {
        System.out.printf("%s 차고 문이 내려갑니다.\n", getLocation());
    }

    public void stop() {
        System.out.printf("%s 차고 문이 멈춥니다.\n", getLocation());
    }

    public void lightOn() {
        System.out.printf("%s 차고 조명이 켜집니다.\n", getLocation());
    }

    public void lightOff() {
        System.out.printf("%s 차고 조명이 꺼집니다.\n", getLocation());
    }
}
