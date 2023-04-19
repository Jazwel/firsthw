
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BonusServiceTest {

    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;


        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);

    }
    @Test
    void shouldCalculateForUnregisteredOverLimit () {

        BonusService service = new BonusService();
        long amount = 1000;
        boolean registered = false;
        long expected = 10;
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForUnregisteredUnderLimit (){
        BonusService service = new BonusService();
        long amount = 1000000;
        boolean registered = false;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);

    }

}


