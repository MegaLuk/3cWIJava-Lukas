package oo.camera;

public class Objektiv {

    private Producer producer;
    private int focalLength;

    public Objektiv(Producer producer, int focalLength){
        this.producer = producer;
        this.focalLength = focalLength;
    }
}
