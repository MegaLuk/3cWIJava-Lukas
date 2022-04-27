package oo.ISaHASa;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private String name;
    private String street;
    private List<Animal> animals;


    public Zoo(String name, String street) {
        this.name = name;
        this.street = street;
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal){
            this.animals.add(animal);
    }

    public void printAnimals(){
        for (Animal animal:this.animals){
            System.out.println("Aniaml weight: " + animal.getWeigth());
        }
    }

    public void makeShow(){
        System.out.println("The Show has started");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}
