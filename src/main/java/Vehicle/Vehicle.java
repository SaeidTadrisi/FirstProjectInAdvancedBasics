package Vehicle;

import static java.lang.System.out;

public class Vehicle {

    boolean start;
    boolean safety;

    public void isTurnedOn(){
        out.println("Is Turned On");
        start = true;
    }

    public void isTurnedOff(){
        out.println("Is Turned Off");
        start = false;
    }

    public void isSafe(){
        out.println("Is Safe");
        safety = true;
    }

    public void isNotSafe(){
        out.println("Is Not Safe");
        safety = false;
    }
}
