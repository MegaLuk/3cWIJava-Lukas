package oo.Test;

public class Main {
    public static void main(String[] args) {

        Lamp e1 = new Lamp();
        e1.name = "Element1";
        e1.color = "red";
        e1.powerConsumtion = 5;
        e1.status = "off";

        Lamp e2 = new Lamp();
        e2.name = "Element1";
        e2.color = "red";
        e2.powerConsumtion = 5;
        e2.status = "off";


        e1.turnOn();
        e1.turnOn();



    }
}