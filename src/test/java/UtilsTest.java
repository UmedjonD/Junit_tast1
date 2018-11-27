import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    static private String name1;
    static private String name2;
    static private String expected;

    static Utils utils = new Utils();

    @BeforeAll
    static void variableNames(){

        name1 = "Umedjon";
        name2 = "Davlatov";
        expected = "UmedjonDavlatov";
    }

    @Test
    void checkoutNotNull(){
        assertNotNull(utils.concatenateWords(name1,name2) , "Проверка на null");
    }
    @Test
    void checkoutEmptyString(){
        assertNotEquals(utils.concatenateWords("",""),"Пустые имена");
    }
    @Test
    void checkoutNotLatinSymbol(){
        String latin = "^[a-zA-Z]+$";
        String string = utils.concatenateWords(name1,name2);
        assertTrue(string.matches(latin),"Проверка на латинские буквы");
    }

    @Test
    void expectedResult(){
        assertEquals(expected, utils.concatenateWords(name1,name2));
    }

    @AfterAll
    static void theEnd(){
        name1 = "";
        name2 = "";
        expected = "";
    }
    @Test
    void ckeckNotNull(){
        assertNotNull(utils.computeFactorial(Integer.valueOf(4)),"Значение нуль");
    }

    @Ignore
    @Test
    void computeFactorial() {
        int actual = utils.computeFactorial(4);
        int expexted = 24;
        assertEquals(expexted,actual);
    }
}