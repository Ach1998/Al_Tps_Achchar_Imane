package ma.ensa.SmartHome.beans.commands;

import ma.ensa.SmartHome.beans.devices.Device;

public abstract class Commande {
    protected Device device;

    public Commande(Device device) {
        this.device = device;
    }

    public abstract void execute() ;
    public abstract void undo();
    public abstract String info();
}
