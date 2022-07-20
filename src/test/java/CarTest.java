import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Vehicle.Car;

public class CarTest {

    @Test
    void carTest() {
        Car car = new Car();
        car.doorsAreOpen();
        car.isTurnedOn();
        car.isSafe();
        car.carIsMoving();
        System.out.println(car.carIsMoving());

        Car bmw = new Car("BMW");
        bmw.doorAreClose();
        bmw.isTurnedOn();
        bmw.isSafe();
        bmw.carIsMoving();
    }

    @Test
    void moving() {
        Car benz = new Car("Benz");

        benz.isTurnedOn();
        benz.isSafe();
        boolean benzMoving = benz.carIsMoving();
        Assertions.assertTrue(benzMoving);

        Car fiat = new Car("Fiat");
        fiat.isSafe();
        boolean volvoMoving = fiat.carIsMoving();
        Assertions.assertFalse(fiat.carIsMoving());
    }
}
