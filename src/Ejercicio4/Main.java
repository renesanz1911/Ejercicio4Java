package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("xiaomi","Poco x4 pro", 6.64,
                "azul",256,"android 12",'c',5000d,
                108,3);
        SmartWatch smartWatch = new SmartWatch("Apple","AppleWatch Serie 7",
                1143,"gris",32,"watchOS7",20);
        System.out.println(smartPhone);
        System.out.println(smartWatch);

    }

}