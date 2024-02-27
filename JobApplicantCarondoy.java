/* Name: Liza Carondoy
   Date: February 27, 2024
   Activity #1 (MIDTERM) */
   
public class JobApplicantCarondoy {
    private String name;
    private String phoneNumber;
    private boolean skilledInWordProcessing;
    private boolean skilledInSpreadsheets;
    private boolean skilledInDatabases;
    private boolean skilledInGraphics;
    
    //Constructor ni here

    public JobApplicantCarondoy(String name, String phoneNumber, boolean skilledInWordProcessing,
                        boolean skilledInSpreadsheets, boolean skilledInDatabases, boolean skilledInGraphics) {
       
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.skilledInWordProcessing = skilledInWordProcessing;
        this.skilledInSpreadsheets = skilledInSpreadsheets;
        this.skilledInDatabases = skilledInDatabases;
        this.skilledInGraphics = skilledInGraphics;
    }
    
    // Getters ni kaning mga public chuchu 

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean skilledInWordProcessing() {
        return skilledInWordProcessing;
    }

    public boolean skilledInSpreadsheets() {
        return skilledInSpreadsheets;
    }

    public boolean skilledInDatabases() {
        return skilledInDatabases;
    }

    public boolean skilledInGraphics() {
        return skilledInGraphics;
    }
}