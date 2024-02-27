/* Name: Liza Carondoy
   Date: February 27, 2024
   Activity #1 (MIDTERM) */
   
import java.util.Scanner;

public class TestJobApplicantsCarondoy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JobApplicantCarondoy[] applicants = new JobApplicantCarondoy[3];

        for (int i = 0; i < applicants.length; i++) {
        
            System.out.println('\n'+ "Applicant " + (i + 1) + ":" + '\n');
            System.out.print("Name: ");
            
            String name = scanner.nextLine();
            System.out.print("Phone number: ");
            
            String phoneNumber = scanner.nextLine();
            System.out.print("Skilled in word processing: ");
            
            boolean skilledInWordProcessing = scanner.nextBoolean();
            System.out.print("Skilled in spreadsheets: ");
            
            boolean skilledInSpreadsheets = scanner.nextBoolean();
            System.out.print("Skilled in databases: ");
            
            boolean skilledInDatabases = scanner.nextBoolean();
            System.out.print("Skilled in graphics: ");
            
            boolean skilledInGraphics = scanner.nextBoolean();
            scanner.nextLine();

            applicants[i] = new JobApplicantCarondoy(name, phoneNumber, skilledInWordProcessing,
                    skilledInSpreadsheets, skilledInDatabases, skilledInGraphics);
        }

        for (JobApplicantCarondoy applicant : applicants) {
            if (isQualified(applicant)) {
                System.out.println(applicant.getName() + " is qualified for an interview.");
            } else {
                System.out.println(applicant.getName() + " is not qualified for an interview.");
            }
        }
    }

    public static boolean isQualified(JobApplicantCarondoy applicant) {
        int threeSkills = 0;
        if (applicant.skilledInWordProcessing()) {
            threeSkills++;
        }
        if (applicant.skilledInSpreadsheets()) {
            threeSkills++;
        }
        if (applicant.skilledInDatabases()) {
            threeSkills++;
        }
        if (applicant.skilledInGraphics()) {
            threeSkills++;
        }
    return threeSkills >= 3;
        }
}