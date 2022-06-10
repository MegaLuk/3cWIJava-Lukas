package schoolcheck.coffeeMachine;

public class CoffeeMachine {
    private int CoffeeSize;
    private int CoffeeStrength;



    public int getCoffeeSize() {
        if (CoffeeSize >= 40 && CoffeeSize <= 200) {
            this.CoffeeSize = CoffeeStrength;
        } else {
            System.out.println("Gebe einen Wert im richtigen Bereich an");
            return CoffeeSize;
        }

        public void setCoffeeSize(int coffeeSize){
            CoffeeSize = coffeeSize;
        }

        public int getCoffeeStrength() {
            return CoffeeStrength;
        }

        public void setCoffeeStrength( int coffeeStrength){
            if (CoffeeStrength >= 1 && CoffeeStrength <= 10) {
                this.CoffeeStrength = CoffeeStrength;
            } else {
                System.out.println("Gebe einen Wert im richtigen Bereich an");
            }

        }
    }
}