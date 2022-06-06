package oo.camera;
import java.time.LocalDate;


public class Picture {

   private String name;
   private LocalDate date;
   private int size;

   public Picture(int size){
      this.name = LocalDate.now().toString();
      this.date = LocalDate.now();
      this.size = size;


   }

   public int getSize() {
      return size;
   }

   public void setSize(int size) {
      this.size = size;
   }
}
