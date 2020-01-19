

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DistrictTest.
 *
 * @author  Andrew Megson
 * @version 08/11/18
 */
public class DistrictTest
{
    private Incident incident1;
    private Incident incident2;
    private Incident incident3;
    private Incident incident4;
    private Incident incident5;
    private District district1;

    /**
     * Default constructor for test class DistrictTest
     */
    public DistrictTest()
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
        incident1 = new Incident(100, "ne30 4rg", "january", 2015, "newcastle");
        incident2 = new Incident(150, "sr1 7rg", "june", 2015, "newcastle");
        incident3 = new Incident(200, "ne35 7de", "july", 2017, "newcastle");
        incident4 = new Incident(350, "dr4 5KW", "april", 2015, "newcastle");
        incident5 = new Incident(230, "ne4 6fr", "july", 2018, "newcastle");
        district1 = new District("newcastle");
        district1.addIncident(incident1);
        district1.addIncident(incident2);
        district1.addIncident(incident3);
        district1.addIncident(incident4);
        district1.addIncident(incident5);
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
    public void getDistrictName()
    {
        assertEquals("newcastle", district1.getDistrictName());
    }

    @Test
    public void getDistrictIncidents()
    {
        assertEquals(5, district1.getDistrictsIncidents().size());
    }

    @Test
    public void addIncident()
    {
        Incident incident6 = new Incident(70, "ne49 3th", "February", 2009, "newcastle");
        district1.addIncident(incident6);
        assertEquals(6,district1.getDistrictsIncidents().size());
    }

    @Test
    public void highestValueIncident()
    {
        assertEquals(incident4, district1.highestValueIncident());
    }

    @Test
    public void AverageDistrictValueYear2015()
    {
        assertEquals(200, district1.averageDistValueInYear(2015));
    }

    @Test
    public void averageDistrictValueYear2014()
    {
        assertEquals(0, district1.averageDistValueInYear(2014));
    }

    @Test
    public void allIncidentsValueGreaterThan210()
    {
        assertEquals(2, district1.allIncidentsDistValuesGreaterThan(210).size());
    }

    @Test
    public void allIncidentsValueGreaterThan80()
    {
        assertEquals(5, district1.allIncidentsDistValuesGreaterThan(80).size());
    }

    @Test
    public void allIncidentsValueGreaterThan350()
    {
        assertEquals(0,district1.allIncidentsDistValuesGreaterThan(350).size());
    }
}













