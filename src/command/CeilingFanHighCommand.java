package command;

import receiver.CeilingFan;
import receiver.CeilingFan.Speed;

public class CeilingFanHighCommand implements Command {

    CeilingFan ceilingFan;
    Speed prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
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
