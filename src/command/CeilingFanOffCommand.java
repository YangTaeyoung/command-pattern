package command;

import receiver.CeilingFan;
import receiver.CeilingFan.Speed;

public class CeilingFanOffCommand implements Command {

    CeilingFan ceilingFan;
    Speed prevSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    public void undo() {
        switch (prevSpeed) {
            case LOW -> ceilingFan.low();
            case MEDIUM -> ceilingFan.medium();
            case HIGH -> ceilingFan.high();
            case OFF -> ceilingFan.off();
        }
    }
}
