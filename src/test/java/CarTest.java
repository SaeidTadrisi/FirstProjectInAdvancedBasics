import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void carTest() {
        Car car = new Car();
        car.doorsAreOpen();
        car.carIsTurnedOn();
        car.carIsSafe();
        car.carIsMoving();
        System.out.println(car.carIsMoving());

        Car bmw = new Car("BMW");
        bmw.doorAreClose();
        bmw.carIsTurnedOn();
        bmw.carIsSafe();
        bmw.carIsMoving();
    }

    @Test
    void moving() {
        Car benz = new Car("Benz");

        benz.carIsTurnedOn();
        benz.carIsSafe();
        boolean benzMoving = benz.carIsMoving();
        Assertions.assertTrue(benzMoving);

        Car fiat = new Car("Fiat");
        fiat.carIsSafe();
        boolean volvoMoving = fiat.carIsMoving();
        Assertions.assertFalse(fiat.carIsMoving());
    }


    class Car {

        boolean doors;
        boolean start;
        boolean safety;
        String brand;

        Car (){
            System.out.println("New Car Created");
        }

        Car (String brand){
            this.brand = brand;
            System.out.println("New Car With "+ brand +" Brand Created");
        }

        void doorsAreOpen(){
            System.out.println("Doors Of The Car Are Open");
            doors = true;
        }

        void doorAreClose(){
            System.out.println("Doors Of The Car Are Close");
            doors = false;
        }

        void carIsTurnedOn(){
            System.out.println("Car Is Turned On");
            start = true;
        }

        void carIsTurnedOff(){
            System.out.println("Car Is Turned Off");
            start = false;
        }

        void carIsSafe(){
            System.out.println("Car Is Safe");
            safety = true;
        }

        void carsIsNotSafe(){
            System.out.println("Car Is Not Safe");
            safety = false;
        }

        boolean carIsMoving(){
            if (start && !doors && safety){
                System.out.println("Car Is Moving");
                return true;
            }else {
                System.out.println("Car Is Parked");
                return false;
            }
        }
    }

}
