package ma.ensa.SmartHome.beans;

import java.security.cert.CertPathBuilder;

public class ConcreteSmartHomeBuilder {
    String name;
    Integer id;
    Adresse adresse;
    RemoteControl remoteControl;
    public ConcreteSmartHomeBuilder(String name, int id) {
        this.name=name;
        this.id=id;
    }

    public ConcreteSmartHomeBuilder withAdresse(Adresse adresse) {
        this.adresse=adresse;
        return this;
    }

    public ConcreteSmartHomeBuilder withRemoteControl(RemoteControl remoteControl) {
        this.remoteControl=remoteControl;
        return this;
    }

    public SmartHome build() {
        return new SmartHome(name,id,adresse,remoteControl);
    }
}

