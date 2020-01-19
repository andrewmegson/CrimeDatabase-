
/**
 * class Incident,holds all info of a given crime incident.
 * 
 * @author Andrew Megson 
 * @version 08/11/18
 */
public class Incident
{
    // instance variables
    private int value;
    private String postcode;
    private String month;
    private int year;
    private String district;
    
    
  
    /**
     * Constructor for objects of class Incident without any parameters
     * 
     *
     */
    
     public Incident()
    {
      
    }
    
    /**
     * Constructor for objects of class Incident without any parameters
     * 
     * @param creates an incident with parameters of; value, postocde, month (in words), year and district.
     */
    public Incident(int value, String postcode, String month, int year, String district)
    {
        this.value = value;
        this.postcode = postcode;
        this.month = month;
        this.year = year;
        this.district = district;
  
    }

    /**
     * method to return Incident Value
     * 
     * 
     * @return returns the incident value 
     *
     */
    public int getValue()
    {
       
        return value;
    }
    
     
   
    /** method to return Incident Postcode
      * 
      * 
      * @returns the incident postcode
      */
     public String getPostcode()
    {
     
        return postcode;
    }
    
     /** method to return Incident Month
      * 
      * 
      * @returns the incident month
      */
     public String getMonth()
    {
      
        return month;
    }
    
     /** method to return Incident Year
      * 
      * 
      * @returns the incident year
      */
     public int getYear()
    {
        
        return year;
    }
    
    
     /** method to return Incidents District
      * 
      * 
      * @returns the incident gistrict
      */
     public String getDistrict()
    {
      
        return district;
    }
}
