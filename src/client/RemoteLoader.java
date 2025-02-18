package client;

import command.CeilingFanHighCommand;
import command.CeilingFanOffCommand;
import command.GarageDoorDownCommand;
import command.GarageDoorUpCommand;
import command.LightOffCommand;
import command.LightOnCommand;
import command.StereoOffCommand;
import command.StereoOnWithCDCommand;
import invoker.RemoteControl;
import receiver.CeilingFan;
import receiver.GarageDoor;
import receiver.Light;
import receiver.Stereo;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanHighCommand ceilingFanOn = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
        remoteControl.setCommand(4, garageDoorUp, garageDoorDown);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPressed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPressed(3);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPressed(4);
    }
}