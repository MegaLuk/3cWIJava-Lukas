package oo.camera;

public class Main {
    public static void main(String[] args) {

        Camera kamera1 = new Camera(16,2, "black");



        Producer sony = new Producer("sony", "Japan");
        Producer red = new Producer("red", "USA");
        Producer canon = new Producer("canon", "Japan");

        Objektiv o1 = new Objektiv(sony, 30);

        SDCard klein = new SDCard("klein", 16);
        SDCard mittel = new SDCard("mittel", 32);
        SDCard groß = new SDCard("groß", 64);




        kamera1.setProducer(canon);

        kamera1.setObjektiv(o1);

        kamera1.setSdCard(mittel);



        System.out.println(kamera1.getSettings());
        kamera1.setSetting("groß");
        System.out.println(kamera1.getSettings());
        System.out.println(kamera1.getProducer());
        System.out.println(kamera1.getObjektiv());


    }
}
