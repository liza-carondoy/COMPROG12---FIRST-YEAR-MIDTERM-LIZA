import java.util.Scanner;

public class TestJobApplicantsCarondoy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println('\n' + "Applicant 1:" + '\n');
        System.out.print("Name: ");
        String name1 = scanner.nextLine();
        
        System.out.print("Phone number: ");
        String phoneNumber1 = scanner.nextLine();
        
        System.out.print("Skilled in word processing: ");
        boolean skilledInWordProcessing1 = scanner.nextBoolean();
        
        System.out.print("Skilled in spreadsheets: ");
        boolean skilledInSpreadsheets1 = scanner.nextBoolean();
        
        System.out.print("Skilled in databases: ");
        boolean skilledInDatabases1 = scanner.nextBoolean();
        
        System.out.print("Skilled in graphics: ");
        boolean skilledInGraphics1 = scanner.nextBoolean();
        scanner.nextLine();

        JobApplicantCarondoy applicant1 = new JobApplicantCarondoy(name1, phoneNumber1, skilledInWordProcessing1,
                skilledInSpreadsheets1, skilledInDatabases1, skilledInGraphics1);

        System.out.println('\n' + "Applicant 2:" + '\n');
        System.out.print("Name: ");
        String name2 = scanner.nextLine();
        
        System.out.print("Phone number: ");
        String phoneNumber2 = scanner.nextLine();
        
        System.out.print("Skilled in word processing: ");
        boolean skilledInWordProcessing2 = scanner.nextBoolean();
        
        System.out.print("Skilled in spreadsheets: ");
        boolean skilledInSpreadsheets2 = scanner.nextBoolean();
        
        System.out.print("Skilled in databases: ");
        boolean skilledInDatabases2 = scanner.nextBoolean();
        
        System.out.print("Skilled in graphics: ");
        boolean skilledInGraphics2 = scanner.nextBoolean();
        scanner.nextLine();

        JobApplicantCarondoy applicant2 = new JobApplicantCarondoy(name2, phoneNumber2, skilledInWordProcessing2,
                skilledInSpreadsheets2, skilledInDatabases2, skilledInGraphics2);

        if (isQualified(applicant1)) {
            System.out.println(applicant1.getName() + " is qualified for an interview.");
        } else {
            System.out.println(applicant1.getName() + " is not qualified for an interview.");
        }

        if (isQualified(applicant2)) {
            System.out.println(applicant2.getName() + " is qualified for an interview.");
        } else {
            System.out.println(applicant2.getName() + " is not qualified for an interview.");
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
