package Vehicle;

public class MotorCycle extends Vehicle {

    public boolean motorCycleIsMoving (){
        if (start && safety){
            System.out.println("MotorCycle Is Moving");
            return true;
        }else {
            System.out.println("MotorCycle Is Parked");
            return false;
        }
    }
}
