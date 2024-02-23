import Lesson_12.Factorial;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FactorialTest {
    Factorial factorial = new Factorial();

    @Test(description = "Тест на проверку валидного значения")
    public void checkValidNumber() {
        int actual = factorial.factorialNumber(5);
        Assert.assertEquals(actual, 120);
    }

    @Test(description = "Тест на проверку отрицательного значения",
            expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "IllegalArgumentException")
    void testExpectedException() {
        factorial.factorialNumber(-1);
    }

    @Test(description = "Тест на проверку нуля")
    public void checkZeroNumber() {
        int actual = factorial.factorialNumber(0);
        Assert.assertEquals(actual, 1);
    }
}
