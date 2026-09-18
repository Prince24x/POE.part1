import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class LoginTest {
    Login login = new Login();

    @Test
    public void testCheckUserNameCorrect() {
        assertTrue(login.checkUserName("Kyl_1"));
}

@Test
public void testCheckUserNameIncorrect() {
    assertFalse(login.checkUserName("Kyle!!!!!!!"));
}

    @Test
    public void testPasswordComplexitycorrect() {
        assertTrue(login.checkPasswordCompllexity("ch&&sec@ke99"));
    }

    @Test
    public void testPasswordComplexityIncorrect() {
        assertFalse(login.checkPasswordComplexity("Password123!"));
    }


}
