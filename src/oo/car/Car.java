package oo.car;


public class Car {
//Gedächtnisvariablen
    public float fuelConsumption;
    public float fuelAmount;
    public int fulltank;
    public String brand;
    public String serialNumber;



    //Methode
    public void drive(){
        System.out.println("I'm driving");
        this.fuelAmount= this.fuelAmount - this.fuelConsumption;
        System.out.println(this.fuelAmount);


    }

    public void turboboost(){

        if (this.fuelAmount <= this.fulltank * 0.1){
            System.out.println("Not enough fuel to go to Superboost");
        }else{
            System.out.println("SuperBoostMode");
        }

    }

    public void honk(){
        System.out.println("tuuut");

    }

    public void getRemainingRange(){
        float Range = (fuelAmount / fuelConsumption) * 100;

        System.out.println(fuelAmount + " / " + fuelConsumption + " * 100");
        System.out.println(Range+" km");
    }

    public void break1(){

        System.out.println("I'm braking");
    }





}
