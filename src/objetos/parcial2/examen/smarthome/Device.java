package objetos.parcial2.examen.smarthome;

abstract class Device {
    private String name;

    public Device(String name) {
        this.name = name;
    }

    abstract void turnOn();
    abstract void turnOff();
    String getName(){
        return name;
    }
}

