package Ejercicio4;

public class SmartWatch extends SmartDevices{
    int tamañoMallaMm;

    public SmartWatch() {
    }

    public SmartWatch(String marca, String modelo, double tamañoPantalla, String color, int memoria,
                      String OS, int tamañoMallaMm) {
        super(marca, modelo, tamañoPantalla, color, memoria, OS);
        this.tamañoMallaMm = tamañoMallaMm;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tamañoPantalla=" + tamañoPantalla +
                ", color='" + color + '\'' +
                ", memoria=" + memoria +
                ", OS='" + OS + '\'' +
                "tamañoMallaMm=" + tamañoMallaMm +
                '}';
    }
}
