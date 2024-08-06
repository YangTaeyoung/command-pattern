package client;

import command.CeilingFanHighCommand;
import command.CeilingFanOffCommand;
import command.Command;
import command.LightOffCommand;
import command.LightOnCommand;
import command.MacroCommand;
import command.StereoOffCommand;
import command.StereoOnWithCDCommand;
import invoker.RemoteControlWithUndo;
import receiver.CeilingFan;
import receiver.Light;
import receiver.Stereo;

public class MacroRemoteLoader {

    public static void main(String[] args) {
        Light livingRoomLight = new Light("Living Room");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        Stereo stereo = new Stereo("Living Room");

        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        Command[] partyOn = {livingRoomLightOn, ceilingFanHigh, stereoOnWithCD};
        Command[] partyOff = {livingRoomLightOff, ceilingFanOff, stereoOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
    }
}
