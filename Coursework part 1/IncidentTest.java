

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class IncidentTest.
 *
 * @author  Andrew Megson
 * @version 08/11/18
 */
public class IncidentTest
{
    private Incident incident1;

    /**
     * Default constructor for test class IncidentTest
     */
    public IncidentTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        incident1 = new Incident(200, "ne30 4rg", "january", 2015, "newcastle");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void getValue()
    {
        assertEquals(200, incident1.getValue());
    }

    @Test
    public void getPostcode()
    {
        assertEquals("ne30 4rg", incident1.getPostcode());
    }

    @Test
    public void getMonth()
    {
        assertEquals("january", incident1.getMonth());
    }

    @Test
    public void getYear()
    {
        assertEquals(2015, incident1.getYear());
    }

    @Test
    public void getDistrict()
    {
        assertEquals("newcastle", incident1.getDistrict());
    }
}





