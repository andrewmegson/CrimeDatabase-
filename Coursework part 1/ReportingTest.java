

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ReportingTest.
 *
 * @author  Andrew megson
 * @version 08/11/18
 */
public class ReportingTest
{
    private Incident incident1;
    private Incident incident2;
    private Incident incident3;
    private Incident incident4;
    private Incident incident5;
    private District district1;
    private Incident incident6;
    private Incident incident7;
    private Incident incident8;
    private Incident incident9;
    private Incident incident10;
    private District district2;
    private Incident incident11;
    private Incident incident12;
    private Incident incident13;
    private Incident incident14;
    private Incident incident15;
    private District district3;
    private Reporting reportin1;

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    

    
    
    
    
    
    

    /**
     * Default constructor for test class ReportingTest
     */
    public ReportingTest()
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
        incident6 = new Incident(50, "ge5 5ed", "june", 2015, "sunderland");
        incident7 = new Incident(150, "rd4 7th", "april", 2018, "sunderland");
        incident8 = new Incident(400, "sr5 6tg", "july", 2012, "sunderland");
        incident9 = new Incident(210, "sr6 5th", "january", 2015, "sunderland");
        incident10 = new Incident(330, "sr3 4ed", "october", 2017, "sunderland");
        district2 = new District("sunderland");
        district2.addIncident(incident6);
        district2.addIncident(incident7);
        district2.addIncident(incident8);
        district2.addIncident(incident9);
        district2.addIncident(incident10);
        incident11 = new Incident(160, "sr4 5ed", "june", 2015, "south shields");
        incident12 = new Incident(200, "ey3 4yg", "december", 2017, "south shields");
        incident13 = new Incident(350, "se3 4rd", "january", 2011, "south shields");
        incident14 = new Incident(240, "de5 4rg", "april", 2011, "south shields");
        incident15 = new Incident(300, "rd4 3th", "march", 2017, "south shields");
        district3 = new District("south shields");
        district3.addIncident(incident11);
        district3.addIncident(incident12);
        district3.addIncident(incident13);
        district3.addIncident(incident14);
        district3.addIncident(incident15);
 
        reportin1 = new Reporting();
        reportin1.addDistrict(district1);
        reportin1.addDistrict(district2);
        reportin1.addDistrict(district3);
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
    public void getListOfDistricts()
    {
        assertEquals(3, reportin1.getListOfDistricts().size());
    }

    @Test
    public void addDistrict()
    {
        Incident incident16 = new Incident(50, "re5 6th", "June", 2009, "durham");
        Incident incident17 = new Incident(200, "du4 5rf", "april", 2011, "durham");
        District district4 = new District("durham");
        district4.addIncident(incident16);
        district4.addIncident(incident17);
        reportin1.addDistrict(district4);
        assertEquals(4, reportin1.getListOfDistricts().size());
    }

    @Test
    public void districtLargestAverageValueYear2015()
    {
        assertEquals("newcastle", reportin1.largestAverageValueYear(2015).getDistrictName());
    }

    @Test
    public void districtLargestAverageValueYear2017()
    {
        assertEquals("sunderland", reportin1.largestAverageValueYear(2017).getDistrictName());
    }

    @Test
    public void districtLargestAverageValueYear2014()
    {
        assertEquals(null, reportin1.largestAverageValueYear(2014).getDistrictName());
    }

    @Test
    public void largestEverValueIncident()
    {
        assertEquals(incident8, reportin1.largestEverValueIncident());
    }

    @Test
    public void allIncidentsValueGreaterThan250()
    {
        assertEquals(5, reportin1.allIncidentValueGreaterThan(250).size());
    }

    @Test
    public void allIncidentsValueGreaterThan450()
    {
        assertEquals(0, reportin1.allIncidentValueGreaterThan(450).size());
    }

    @Test
    public void allIncidentsValueGreaterThan180()
    {
        assertEquals(10, reportin1.allIncidentValueGreaterThan(180).size());
    }

    @Test
    public void addIncidentNewcastleDistrict()
    {
        reportin1.addIncident(130, "ne40 5tf", "January", 2013, "newcastle");
        assertEquals(3, reportin1.getListOfDistricts().size());
    }

    @Test
    public void addIncidentDurham()
    {
        reportin1.addIncident(300, "dr4 5th", "march", 2011, "durham");
        assertEquals(4, reportin1.getListOfDistricts().size());
    }
}











