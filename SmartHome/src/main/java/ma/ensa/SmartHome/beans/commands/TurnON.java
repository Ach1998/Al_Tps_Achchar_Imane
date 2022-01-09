package ma.ensa.SmartHome.beans.commands;

import ma.ensa.SmartHome.beans.devices.Device;

public class TurnON extends Commande {
    public TurnON(Device device) {
        super(device);
    }

    @Override
    public void undo() {
        System.out.print("UNDO");
        device.turnOFF();

    }

    @Override
    public String info() {
        return device.info()+" On";
    }

    @Override
    public void execute() {
        System.out.print("EXECUTE ");
        device.turnON() ;
    }
}
