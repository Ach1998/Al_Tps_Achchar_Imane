package ma.ensa.SmartHome.beans.devices;

import lombok.Data;

@Data
public  abstract class ImplDevice implements Device {
    public String deviceName;

    public ImplDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void turnOFF() {
        System.out.println(deviceName+" Turned OFF");
    }

    @Override
    public void turnON() {
        System.out.println(deviceName+" Turned ON");
    }

    @Override
    public String info() {
        return deviceName;
    }
}