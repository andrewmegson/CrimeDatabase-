import java.util.ArrayList;
/**
 * Class Reporting hold info about all districts (and their incidents).
 * 
 * @author Andrew Megson 
 * @version 08/11/18
 */
public class Reporting
{
    // instance variables - replace the example below with your own
    private ArrayList<District> listOfDistricts;
    

    /**
     * Constructor for objects of class Reporting (no parameters)
     */
    public Reporting()
    {
        // initialise instance variables
        listOfDistricts = new ArrayList<District>();
     
    }

    /**
     * 
     * 
     *  method to add districts to Reporting (ArrayList)
     *  
     *  @param takes a single paramter of a district to be added
     */
    public void addDistrict(District Dist)
    {
        listOfDistricts.add(Dist);
       
  
    }
    
    /**
     * 
     * 
     *  method to get arraylist of districts
     *  
     *  @returns returns an arraylist of all districts
     */
    public  ArrayList<District> getListOfDistricts()
    {
        return listOfDistricts;
       
  
    }
   
    
    /**
     * method to return district with largest average value incident for a given year
     */
    public District largestAverageValueYear(int year)
    {
        District largestAverageDist = new District();
        int largestAverageValue = 0;
        
        for (District Dist : listOfDistricts)
        {
            if (Dist.averageDistValueInYear(year) > largestAverageValue)
            {largestAverageValue = Dist.averageDistValueInYear(year);
                largestAverageDist = Dist;
            }
        }
        
        return largestAverageDist;
        
        
        
}
     /**
      * method to return largest value incident ever recorded
      * 
      * @return returns an incident which has the largest value ever recorded
      * 
      * 
      */
      public Incident largestEverValueIncident()
      {
          //create new local incident and value
          Incident largestEverValueIncident = new Incident();
          int Value = 0;
          for (District Dist : listOfDistricts)
          {
              if (Dist.highestValueIncident().getValue() > Value)
              {
                  Value = Dist.highestValueIncident().getValue();
                  largestEverValueIncident = Dist.highestValueIncident();
                }
                
         
            }
           
            return largestEverValueIncident;
        }
        /**
         * method lists all incidents recorded with value greater than given amount
         * 
         * @param takes a single int parameter of the amount in question
         * 
         * @return returns an arraylist of all incidents with a value greater than the given amount
         * 
         * 
         */
        public ArrayList<Incident> allIncidentValueGreaterThan(int amount)
        {
            ArrayList<Incident> allIncidentsValuesGreaterThan = new ArrayList<>();
            
            for (District Dist : listOfDistricts)
            {
                allIncidentsValuesGreaterThan.addAll(Dist.allIncidentsDistValuesGreaterThan(amount));
            }
            
            return allIncidentsValuesGreaterThan ;
            
        }
        /**
         * method to add an Incident to the reporting arraylist of districts, by adding the incident to corresponding district 
         * or if necessary creating the new district and adding the incident to it.
         * 
         * @param takes 5 parameters that are need to create a new incident (int value, String postcode, String month, int year, String district)
         * 
         * 
         * 
         */
        
        public void addIncident(int value1, String postcode1, String month1, int year1, String district1)
        {
            Incident newIncid = new Incident(value1, postcode1, month1, year1, district1); // creates new Incident from input parameters
            
            boolean foundDistrict = false;
            
            for (District Dist : listOfDistricts){
                if (Dist.getDistrictName() == newIncid.getDistrict())
                {
                    Dist.addIncident(newIncid);
                    foundDistrict = true;
                }
            }
                if (!foundDistrict)             // create a new district and add incident if needed
                { District newDistrict = new District(newIncid.getDistrict());
                  newDistrict.addIncident(newIncid);
                  listOfDistricts.add(newDistrict);
                }

            }

        
    }
            
            
