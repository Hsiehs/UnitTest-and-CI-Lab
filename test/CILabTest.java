import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void detectCapitalUseTest1() {
        myString.setString("this is a test");
        boolean caps = myString.detectCapitalUse();
        int x = 0;
        if(caps == true){
            x = 1;
        }
        assertEquals(0,x);

    }
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("This is a Test");
        boolean caps = myString.detectCapitalUse();
        int x = 0; //0 = false
        if(caps == true){
            x = 1; //1 = true
        }
        assertEquals(1,x);
    }


}
