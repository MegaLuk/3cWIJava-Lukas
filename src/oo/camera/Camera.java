package oo.camera;

public class Camera {

    private int pixel;
    private int weigth;
    private String color;
    private int settings;
    private Producer producer;
    private Objektiv objektiv;
    private SDCard sdCard;


    public Camera(int pixel, int weigth, String color) {
        this.pixel = pixel;
        this.weigth = weigth;
        this.color = color;
        this.settings = 1;
    }


    public void setSetting(String setting) {

        if (setting == "klein") {
            this.settings = 0;
        } else if (setting == "mittel") {
            this.settings = 1;
        } else if (setting == "groß") {
            this.settings = 2;
        } else {
            System.out.println("bitte geben sie klein, mittel oder groß ein");
        }

    }

    public String getSettings() {
        String getsetting = null;
        switch (this.settings) {
            case 0:
                getsetting = "klein";
                break;

            case 1:
                getsetting = "mittel";
                break;

            case 2:
                getsetting = "groß";
                break;

        }
        return getsetting;

    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public Objektiv getObjektiv() {
        return objektiv;
    }

    public void setObjektiv(Objektiv objektiv) {
        this.objektiv = objektiv;
    }

    public SDCard getSdCard() {
        return sdCard;
    }

    public void setSdCard(SDCard sdCard) {
        this.sdCard = sdCard;
    }


    public void takepicture(){



        Picture picture = new Picture(this.getGigabyte());


        sdCard.addpicture(picture);


    }

    public int getGigabyte(){
        int getsetting = 0;
        switch (this.settings) {
            case 0:
                getsetting = 2;
                break;

            case 1:
                getsetting = 4;
                break;

            case 2:
                getsetting = 6;
                break;

        }
        return getsetting;

    }

}
