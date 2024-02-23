import Lesson_12.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FactorialTest {
    Factorial factorial = new Factorial();

    @Test
    @DisplayName("Проверка метода валидным значением")
    public void checkValidNumber(){
        int actual = factorial.factorialNumber(5);
        Assertions.assertEquals(120, actual);
    }

    @Test
    @DisplayName("Проверка метода отрицательным значением")
    void testExpectedException() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            factorial.factorialNumber(-1);
        }, "IllegalArgumentException");
        Assertions.assertEquals("IllegalArgumentException", thrown.getMessage());
    }

    @Test
    @DisplayName("Проверка метода значением ноль")
    public void checkZeroNumber(){
        int actual = factorial.factorialNumber(0);
        Assertions.assertEquals(1, actual);
    }
}
