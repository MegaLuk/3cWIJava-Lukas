package oo.camera;

import java.util.ArrayList;

public class SDCard {

    private int capacity;
    private String name;
    private ArrayList<Picture> pictures = new ArrayList();

    public SDCard(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }

    public void addpicture(Picture picture){
        this.pictures.add(picture);
    }

    public int usedcapacity(){
        int loadedGigabyte = 0;
        for (int i = 0; i < pictures.size(); i++){
            loadedGigabyte = loadedGigabyte + pictures.get(i).getSize();
        }
        return loadedGigabyte;
    }

}
