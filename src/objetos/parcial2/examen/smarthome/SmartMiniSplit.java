package objetos.parcial2.examen.smarthome;

public class SmartMiniSplit extends Device{
    @Override
    public void turnOn(){
        System.out.println("Encendiendo split");
    }

    @Override
    public void turnOff(){
        System.out.println("Apagando split");
    }

    public SmartMiniSplit(String name) {
        super(name);
    }
}
