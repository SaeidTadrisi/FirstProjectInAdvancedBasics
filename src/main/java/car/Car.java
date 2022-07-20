package car;

public class Car {

    boolean doors;
    boolean start;
    boolean safety;
    String brand;

    public Car (){
        System.out.println("New Car Created");
    }

    public Car (String brand){
        this.brand = brand;
        System.out.println("New Car With "+ brand +" Brand Created");
    }

    public void doorsAreOpen(){
        System.out.println("Doors Of The Car Are Open");
        doors = true;
    }

    public void doorAreClose(){
        System.out.println("Doors Of The Car Are Close");
        doors = false;
    }

    public void carIsTurnedOn(){
        System.out.println("Car Is Turned On");
        start = true;
    }

    public void carIsTurnedOff(){
        System.out.println("Car Is Turned Off");
        start = false;
    }

    public void carIsSafe(){
        System.out.println("Car Is Safe");
        safety = true;
    }

    public void carsIsNotSafe(){
        System.out.println("Car Is Not Safe");
        safety = false;
    }

    public boolean carIsMoving() {
        if (start && !doors && safety) {
            System.out.println("Car Is Moving");
            return true;
        } else {
            System.out.println("Car Is Parked");
            return false;
        }
    }
}
