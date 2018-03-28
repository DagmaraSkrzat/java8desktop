package pl.dominisz.java8desktop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParseUtilTest {

    @Test
    void toDouble() {
        String testowanyString = "123,6";
        assertEquals(123.6, ParseUtil.toDouble(testowanyString));
    }
}