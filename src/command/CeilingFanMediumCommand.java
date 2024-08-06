package command;

import receiver.CeilingFan;
import receiver.CeilingFan.Speed;

public class CeilingFanMediumCommand implements Command {

    CeilingFan ceilingFan;
    Speed prevSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }

    @Override
    public void undo() {
        switch (prevSpeed) {
            case LOW -> ceilingFan.low();
            case MEDIUM -> ceilingFan.medium();
            case HIGH -> ceilingFan.high();
            case OFF -> ceilingFan.off();
        }
    }
}
