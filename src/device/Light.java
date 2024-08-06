package device;

public class Light extends Device{

    public Light(String location) {
        super(location);
    }

    public void on(){
        System.out.println(getLocation() + " 조명이 켜졌습니다.");
    }

    public void off(){
        System.out.println(getLocation() + " 조명이 꺼졌습니다.");
    }
}
