package ma.ensa.SmartHome.beans;





import lombok.Data;
import ma.ensa.SmartHome.beans.commands.Commande;
import ma.ensa.SmartHome.beans.commands.TurnOFF;
import ma.ensa.SmartHome.beans.commands.TurnON;
import ma.ensa.SmartHome.beans.devices.Device;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@Data
public class RemoteControl {
    Integer nbrSlot;
    Commande[] ONCommands;
    Commande [] OFFCommands;

    Stack<Commande> executedCommands;
    public RemoteControl(Integer nbrSlot) {
        ONCommands=new Commande[nbrSlot];
        OFFCommands=new Commande[nbrSlot];
        this.nbrSlot = nbrSlot;
        executedCommands=new Stack<>();
    }

    public void init(Device...devices){
        for(int i=0;i<devices.length;i++){
            this.ONCommands[i]=new TurnON(devices[i]);
            this.OFFCommands[i]=new TurnOFF(devices[i]);
        }

    }

    public void ONPressed(int id) {
        this.ONCommands[id].execute();
        executedCommands.push(this.ONCommands[id]);
    }

    public void OFFPressed(int id) {
        this.OFFCommands[id].execute();
        executedCommands.push(this.OFFCommands[id]);
    }

    public void undo(){

        executedCommands.pop().undo();
    }

    public String getReport() {
        StringBuilder builder=new StringBuilder();
        for(Commande command:executedCommands ){
            builder.append(command.info()+"-");
        }
        return builder.toString();
    }
}
