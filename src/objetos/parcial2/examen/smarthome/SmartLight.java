package objetos.parcial2.examen.smarthome;

public class SmartLight extends Device{
    @Override
    public void turnOn(){
        System.out.println("Encendiendo foco");
    }

    @Override
    public void turnOff(){
        System.out.println("Apagando foco");
    }
    public SmartLight(String name) {
        super(name);
    }
}
