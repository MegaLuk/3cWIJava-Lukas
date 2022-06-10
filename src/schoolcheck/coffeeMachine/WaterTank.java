package schoolcheck.coffeeMachine;

public class WaterTank {
    int wCurrentCapacity = 800;
    int wFullCapacity = 1000;


    public int getwCurrentCapacity() {
        return wCurrentCapacity;
    }

    public void setwCurrentCapacity(int wCurrentCapacity) {
        this.wCurrentCapacity = wCurrentCapacity;
    }

    public int getwFullCapacity() {
        return wFullCapacity;
    }

    public void setwFullCapacity(int wFullCapacity) {
        this.wFullCapacity = wFullCapacity;
    }
}
