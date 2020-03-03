package ac.za.cput;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DriverTest {

    Driver driver;
    @Before
    public void setUp() throws Exception {
        this.driver = new Driver("matthew", "pearce", 50, "b");
    }

    //Check toString is displaying correct data
    @Test
    public void toStringTest() {
        String toString = driver.toString();
        assertEquals(true, toString.contains("Driver: name= matthew, surname= pearce, age= 50, licenseCode= b"));
    }
}
