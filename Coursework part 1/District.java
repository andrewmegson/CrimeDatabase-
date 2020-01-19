

import java.util.ArrayList;
/**
 * class District, stores fields of district name and an array of a list of all Incidents in that given district.
 *
 * @author Andrew Megson 
 * @version 08/11/18
 */
public class District
{   
    // instance variables - Distric name, List of incidents
    private String districtName;
    private ArrayList<Incident> districtsIncidents;
    

    /**
     * Constructor for objects of class District (without parameters)
     * 
     * 
     */
    
    
    public District()
    {
        districtsIncidents = new ArrayList<>();
    }
    
    
    /**
     * Constructor for objects of class District
     * 
     * @param takes a single String parameter of the district name
     */
    public District(String districtName)
    {
        // initialise instance variables
        this.districtName = districtName ;
        
        districtsIncidents = new ArrayList<>();
        
        
    }

    /**
     * method to return district name
     * 
     * @return returns the district name
     * 
     */
    public String getDistrictName()
    {
        return districtName;
    }
    
    /**
     * method to return ArrayList of Incidents in district
     * 
     * @return return an arraylist of all incidents in the district
     */
    public ArrayList<Incident> getDistrictsIncidents()
    {
        return districtsIncidents;
    }
    
    /**
     * method to add an Incident to districtsIncidents ArrayList
     * 
     * @param takes a single parameter of an incident
     *
     */
    public void addIncident(Incident Incid)
    {
        districtsIncidents.add(Incid);
    }
    
    /**
     * method to return Incident with highest value recorded in the district
     * 
     * @return returns an incident which contains the highest value recorded in district
     *
     */
    public Incident highestValueIncident()
    {
        Incident highestValueIncident = new Incident();
        int highestValue = 0;
        
        
        for(Incident Incid : districtsIncidents)
        {
            if (Incid.getValue() > highestValue)
            { highestValue = Incid.getValue();
              highestValueIncident = Incid;
            }
        }
        
        return highestValueIncident;
    }
    /**
     * method to return average incident value in a district in a given year
     * 
     * @param takes a single parameter of the year in question
     * 
     * @returns an int of the averge incident value for the district
     */
    public int averageDistValueInYear(int year)
    {
        ArrayList<Incident> incidentsDistrictYear = new ArrayList<Incident>();
        // adds all incidents of given year to a new arraylist
        for (Incident Incid : districtsIncidents)
        {
            if (Incid.getYear() == year)
            { incidentsDistrictYear.add(Incid);
            }
        }
        // finds average of value for all incidents in new list
        int sum = 0;
        for (Incident Incid : incidentsDistrictYear)
        {
            sum = sum + Incid.getValue();
        }
        int average;
        
        if(incidentsDistrictYear.size() == 0)
        {
            average = 0;
        }
        else {
        average = (sum / incidentsDistrictYear.size());
        }
        return average;
    }
    /**
     * method to return all incidents with a value greater than a given amount
     * 
     * @param takes a single int parameter of the amount in question
     * 
     * @return returns an arraylist of all incidents in district with a value higher than the amount specified
     * 
     */
    public ArrayList<Incident> allIncidentsDistValuesGreaterThan( int amount)
    {
         ArrayList<Incident> allIncidentsValuesGreaterThan = new ArrayList<Incident>();
         
         for (Incident Incid : districtsIncidents)
         {
             if (Incid.getValue() > amount)
             {allIncidentsValuesGreaterThan.add(Incid);
             }
            }
             return allIncidentsValuesGreaterThan;
             
         }
         
         
   
  

       }
