package ma.ensa.SmartHome.beans.commands;

import ma.ensa.SmartHome.beans.devices.Device;

public class TurnOFF extends Commande {
    public TurnOFF(Device device) {

        super(device);
    }

    @Override
    public void execute() {
        System.out.print("EXECUTE ");

        device.turnOFF();
    }

    @Override
    public void  undo() {
        System.out.print("UNDO  " );
        device.turnON();
    }

    @Override
    public String info() {
        return device.info()+" Off";
    }
}
