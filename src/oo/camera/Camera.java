package oo.camera;

public class Camera {

    private int pixel;
    private int weigth;
    private String color;
    private int settings;

    public Camera(int pixel, int weigth, String color){
        this.pixel = pixel;
        this.weigth = weigth;
        this.color = color;
    }

    public void setSetting(String setting){

        if(setting == "klein"){
            this.settings = 0;
        }
        else if(setting == "mittel"){
            this.settings = 1;
        }
        else if(setting == "groß"){
            this.settings = 2;
        }else
        {
            System.out.println("bitte geben sie klein, mittel oder groß ein");
        }

    }
}
