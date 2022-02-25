package oo.Test;

import java.util.ArrayList;

public class Lamp {
    public String name;
    public String color;
    public int powerConsumtion;
    public String status;


    //Methoden


    public void turnOn() {
        if (this.status == "on") {
            System.out.println("Mein Name ist " + this.name + " Ich bin bereits eingeschaltet");
        } else {
            this.status = "on";
            System.out.println(this.status);
            this.powerConsumtion = this.powerConsumtion + 5;
            System.out.println(this.powerConsumtion);
        }
    }


}
