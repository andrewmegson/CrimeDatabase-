

/**
 * This class implements a crime incident database. It is the top level class 
 * in this project. The incident database communicates via text input/output 
 * in the text terminal.
 * 
 * This class uses an object of class InputReader to read input from the user.
 * It contains a loop that repeatedly reads input and then adds that input data 
 * to the database or displays data from database to the console as requested, until the users wants to 
 * leave.
 * 
 * @author     Andrew Megson
 * @version    08/11/18
 */
public class ReportingIO  
{
    private InputReader reader;
    private Reporting crimeDatabase;
    
    /**
     * Creates an input/output user interface so the crime incident database can be used.
     */
    public ReportingIO()
    {
        reader = new InputReader();
        crimeDatabase = new Reporting();
    }

    
    
    public static void main(String[] args)  {
        ReportingIO myReportingSystem = new ReportingIO();
        
        myReportingSystem.start();
    }
    
    
    
    /**
    * This is the main method of the program it operates a loop that carries out the different function available in the program 
    * (using the data input and the data stored in the crimeDatabase reporting object), 
    * until the user ends the program by entering 'exit'.
    *
    *
    */
    
    public void start()
    {
        boolean finished = false;

        printWelcome();

        while(!finished) {
            String input = reader.getInput();

            if(input.contains("exit")) {
                finished = true;
            }
            else if (input.equals("1")) {
                enterIncidentDetails();
                printMenuOption();
            }
            else if (input.equals("2")) {
                enterDistrictDetails();
                printMenuOption();
            }
            else if (input.equals("3")) {
                 requestDistrictlargestAverageValueIncidentInYear();
                 printMenuOption();
            }
            
            else if (input.equals("4")) {
                 requestLargestValueIncidentEver();
                 printMenuOption();
            }
            else if (input.equals("5")) {
                 requestListAllIncidentsHigherThanAmount();
                 printMenuOption();
            }    
            else if (input.equals("6")) {
                 repeatedMenu();
            }     
           else
           {
                System.out.println("You must enter a valid option from the menu above.");
            }
        
        
       }
       
        printGoodbye();
   }

    /**
     * Prints a welcome message and menu of function options to the screen.
     */
    private void printWelcome()
    {
        System.out.println("Welcome to the Thin Blue Line crime reporting system.");
        System.out.println();
        System.out.println("Below is a Menu of available processes.");
        System.out.println("To enter data for a new Incident, type '1', then (enter)");
        System.out.println("To enter data for a new District, type '2', then (enter).");
        System.out.println();
        System.out.println("To get the district with the largest average value incident for a given year, type '3', then (enter)");
        System.out.println("To get the largest value incident ever recorded, type '4', then (enter)");
        System.out.println("To get a list of all incidents recorded with value greater than a given amount of money, type '5', then (enter).");
        System.out.println();
        System.out.println("Please type 'exit' to leave our system.");
    }
    
    /**
     * Prints the menu of options to the screen.
     */
    private void repeatedMenu()
    {
        System.out.println("Menu of available processes");
        System.out.println("To enter data for a new Incident, type '1', then (enter).");
        System.out.println("To enter data for a new District, type '2', then (enter).");
        System.out.println();
        System.out.println("To get the district with the largest average value incident for a given year, type '3', then (enter)");
        System.out.println("To get the largest value incident ever recorded, type '4', then (enter)");
        System.out.println("To get a list of all incidents recorded with value greater than a given amount of money, type '5', then (enter).");
        System.out.println();
        System.out.println("Please type 'exit' to leave our system.");
    }
    
    /**
     * Prints a message to the screen to press '6' for menu of options.
     */
    private void printMenuOption()
    {
        System.out.println();
        System.out.println("(Press '6' to return to menu of available processes.)");
    }

    /**
     * Prints a good-bye message to the screen.
     */
    private void printGoodbye()
    {
        System.out.println("Thank you for using Thin Blue Line systems. Bye...");
    }
    
    /**
     * method to enter an incidents details via the console
     */
   private void enterIncidentDetails()
   {
       int value1; 
       String postcode1; 
       String month1; 
       int year1; 
       String district1;
       
       System.out.println("Enter the district in which the incident occurred.");
       district1 = reader.getInput();
       
       
       System.out.println("Enter the year in which the incident occurred.");    //need to convert string in to int
       year1 = Integer.parseInt(reader.getInput()); 
       
       System.out.println("Enter the Month (in words) in which the incident occurred i.e. January, February, etc.");
       month1 = reader.getInput();
       
       System.out.println("Enter the postcode in which the incident occurred.");
       postcode1 = reader.getInput();
       
       System.out.println("Enter the value (to the nearest pound) of the goods stolen.");  // need to convert string in to int
       value1 = Integer.parseInt(reader.getInput());
       
       
       crimeDatabase.addIncident(value1, postcode1, month1, year1, district1);
       
       
       
       System.out.println("Thank You, the incident has been added to our database.");
    
    
    }
    
    /**
     * method to enter a districts details via the console
     */
   private void enterDistrictDetails()
   {
       String distName;
 
       System.out.println("Enter the name of the district you which to add.");
       distName = reader.getInput();
       
       District districtadd = new District(distName);
       
       boolean alreadyexsists = false;
       
       for (District Dist : crimeDatabase.getListOfDistricts())
       {
           if(distName.equals(districtadd.getDistrictName()))
           {
               alreadyexsists = true;
    
            }
        }
            if (alreadyexsists)
            {
                  System.out.println("That district is already in our database.");
                }
                
          else
           {
               crimeDatabase.addDistrict(districtadd);
       
               System.out.println("Thank You, the district has been added to our database.");
       
           }
        }
        
    /**
     * method to print out details of the district with the largest average value incident in a given year to the console.
     */
   private void requestDistrictlargestAverageValueIncidentInYear()
   {
       int year1;
       
       System.out.println("Please enter the year for which you would like to find the district with the largest average value incident.");
       year1 = Integer.parseInt(reader.getInput()); 
       
       
       if(crimeDatabase.largestAverageValueYear(year1).averageDistValueInYear(year1) == 0)
       {
           
         System.out.println("There were no incidents in that year.");
    
       
       } 
       
      else {  
       System.out.print("In ");
       System.out.print(year1);
       System.out.println(" the district with the largest average value incident was");
       System.out.println(crimeDatabase.largestAverageValueYear(year1).getDistrictName());
       System.out.println("with a largest average value incident of;");
       System.out.print("£");
       System.out.print(crimeDatabase.largestAverageValueYear(year1).averageDistValueInYear(year1));
       System.out.println(".");
       }
    }
    
    /**
     * method to print out details of the largest value incident ever recorded to the console.
     */
   private void requestLargestValueIncidentEver()
   {
       System.out.println("The largest value incident ever has the following details;");
       
       System.out.print("Value - £");
       System.out.println(crimeDatabase.largestEverValueIncident().getValue());
       System.out.print("District - ");
       System.out.println(crimeDatabase.largestEverValueIncident().getDistrict());
       System.out.print("Postcode - ");
       System.out.println(crimeDatabase.largestEverValueIncident().getPostcode());
       System.out.print("Month - ");
       System.out.println(crimeDatabase.largestEverValueIncident().getMonth());
       System.out.print("Year - ");
       System.out.println(crimeDatabase.largestEverValueIncident().getYear());
     

    } 
    
    /**
     * method to print out details of all incidents with a value greater than an entered amount to the console
     */
   private void requestListAllIncidentsHigherThanAmount()
   {
       int amount1;
       int count = 1;
      
       System.out.println("Please enter the amount (to the nearest pound) for which you would like to see all incidents with a value greater than.");
       
       amount1 = Integer.parseInt(reader.getInput()); 
       
      if ( crimeDatabase.allIncidentValueGreaterThan(amount1).size() == 0)
      {
           System.out.print("There are no incidents in our database with a value greater than £" + amount1 + ".");
      }
       
     else {  
       
       System.out.print("The following are all incidents with a value greater than £");
       System.out.print(amount1);
       System.out.println(";");
       for (Incident Incid : crimeDatabase.allIncidentValueGreaterThan(amount1))
         {
           // loop through and print out info on each incident , and add a count to print out (all on same line)
       System.out.print(count + ".  ");    
       System.out.print("Value - £");
       System.out.print(Incid.getValue());
       System.out.print(", District - ");
       System.out.print(Incid.getDistrict());
       System.out.print(", Postcode - ");
       System.out.print(Incid.getPostcode());
       System.out.print(", Month - ");
       System.out.print(Incid.getMonth());
       System.out.print(", Year - ");
       System.out.print(Incid.getYear());
       System.out.println(".");
       
       count = count + 1;
       
       //allIncidentValueGreaterThan(int amount) - arraylist of all incidents with value greater than amount
       
     
        } 
      }

    }
}

