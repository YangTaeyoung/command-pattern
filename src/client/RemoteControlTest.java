package client;

import command.LightOnCommand;
import command.StereoOnWithCDCommand;
import invoker.SimpleRemoteControl;
import receiver.Light;
import receiver.Stereo;

public class RemoteControlTest {


    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("거실");
        Stereo stereo = new Stereo("거실");

        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(stereoOn);
        remote.buttonWasPressed();
    }
}
