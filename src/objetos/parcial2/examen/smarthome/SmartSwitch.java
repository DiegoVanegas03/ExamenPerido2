package objetos.parcial2.examen.smarthome;

public class SmartSwitch extends Device{
    @Override
    public void turnOn(){
        System.out.println("Encendiendo switch");
    }

    @Override
    public void turnOff(){
        System.out.println("Apagando switch");
    }

    public SmartSwitch(String name) {
        super(name);
    }
}
