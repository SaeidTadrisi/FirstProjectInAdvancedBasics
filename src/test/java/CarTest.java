import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import car.Car;

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
}
