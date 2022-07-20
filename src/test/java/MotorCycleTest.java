import Vehicle.MotorCycle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MotorCycleTest {

    @Test
    void motorIsMoving() {
        MotorCycle bravo = new MotorCycle ();

        bravo.isSafe();
        bravo.isTurnedOn();

        boolean bravoMoving = bravo.motorCycleIsMoving();

        Assertions.assertTrue(bravoMoving);


    }
}
