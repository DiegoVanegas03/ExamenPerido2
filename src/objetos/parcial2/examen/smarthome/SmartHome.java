package objetos.parcial2.examen.smarthome;

import java.util.LinkedList;
import java.util.List;

public class SmartHome {
    private List <String> comandos = new LinkedList<String>();
    private List <Device> devices = new LinkedList<Device>();
    private int index;
    public void addDevice(Device device){
        this.devices.add(device);
    }
    public void configure(String deviceName, String command, String standardCommand){
        for (index = 0; index < devices.size();index++){

        }
    }
    public void processCommand(String command){

    }
}
