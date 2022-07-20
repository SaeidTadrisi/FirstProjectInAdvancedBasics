package Vehicle;

import static java.lang.System.out;

public class Car extends Vehicle {

    boolean doors;
    String brand;

    public Car (){
        out.println("New Car Created");
    }

    public Car (String brand){
        this.brand = brand;
        out.println("New Car With "+ brand +" Brand Created");
    }

    public void doorsAreOpen(){
        out.println("Doors Are Open");
        doors = true;
    }

    public void doorAreClose(){
        out.println("Doors Are Close");
        doors = false;
    }

    public boolean carIsMoving() {
        if (start && !doors && safety) {
            out.println("Is Moving");
            return true;
        } else {
            out.println("Is Parked");
            return false;
        }
    }
}
