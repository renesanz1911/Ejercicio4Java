package Ejercicio4;

public class SmartPhone extends SmartDevices{
    char tipoUSB;
    double capacidadBateriaMAh;
    double calidadCamara;
    int numeroCamaras;

    public SmartPhone() {
    }

    public SmartPhone(String marca, String modelo, double tamañoPantalla, String color, int memoria, String OS,
                      char tipoUSB, double capacidadBateriaMAh, double calidadCamara, int numeroCamaras) {
        super(marca, modelo, tamañoPantalla, color, memoria, OS);
        this.tipoUSB = tipoUSB;
        this.capacidadBateriaMAh = capacidadBateriaMAh;
        this.calidadCamara = calidadCamara;
        this.numeroCamaras = numeroCamaras;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tamañoPantalla=" + tamañoPantalla +
                ", color='" + color + '\'' +
                ", memoria=" + memoria +
                ", OS='" + OS + '\'' + "tipoUSB='" + tipoUSB + '\'' +
                ", capacidadBateriaMAh=" + capacidadBateriaMAh +
                ", calidadCamara=" + calidadCamara +
                ", numeroCamaras=" + numeroCamaras +
                '}';
    }
}
