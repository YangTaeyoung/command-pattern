package receiver;

public class Stereo extends Device {

    public Stereo(String location) {
        super(location);
    }

    public void on() {
        System.out.printf("%s 스테레오가 켜졌습니다.\n", getLocation());
    }

    public void off() {
        System.out.printf("%s 스테레오가 꺼졌습니다.\n", getLocation());
    }

    public void setCD() {
        System.out.printf("%s CD가 설정되었습니다.\n", getLocation());
    }

    public void setDvd() {
        System.out.printf("%s DVD가 설정되었습니다.\n", getLocation());
    }

    public void setRadio() {
        System.out.printf("%s 라디오가 설정되었습니다.\n", getLocation());
    }

    public void setVolume(int volume) {
        System.out.printf("%s 볼륨이 %d로 설정되었습니다.\n", getLocation(), volume);
    }
}
