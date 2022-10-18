package objetos.parcial2.examen.smarthome;

public class SmartPlug extends Device{
    @Override
    public void turnOn(){
        System.out.println("Energizando Contacto");
    }

    @Override
    public void turnOff(){
        System.out.println("Apagando Contacto");
    }

    public SmartPlug(String name) {
        super(name);
    }
}
