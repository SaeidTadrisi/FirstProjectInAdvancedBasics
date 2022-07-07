import static java.lang.System.*;

public class CarTest {



    class car {

        boolean doorsAreOpen;
        boolean carIsStarted;

        void doorsAreOpen (){
            out.println("Doors Are Open");
            doorsAreOpen = true;
        }
        void doorsIsClose(){
            out.println("Doors Are Close");
            doorsAreOpen = false;
        }
        void carIsStarted (){
            out.println("Car Is Started");
            carIsStarted = true;
        }
        void carIsTurnedOff(){
            out.println("Car Is Turned Off");
            carIsStarted = false;
        }

        void carIsMoving(){
            if (!doorsAreOpen && carIsStarted){
                out.println ("Car Is Moving");
            }else {
                out.println("Car Is Parked");
            }
        }



    }
}
