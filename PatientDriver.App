/*
 * Class: CMSC203 
 * Instructor: Ashique Tanveer
 * Description: This project ask the user for their information including their name, address, phone number, etc.
 * Then it ask for their procedure information like the name of the procedure name, practitioner, and the charges. 
 * It then adds all the charges together. Then it displays all the information back to the user. 
 * Due: 03/04/2025
 * Platform/compiler: Java Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Unna Lat
*/

package assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//This class asks the user for their inout to the questions asked and sends the answer to their corresponding classes.
public class PatientDriver {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asks user for the patient information
        System.out.println("Enter patient's first name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter patient's middle name:");
        String middleName = scanner.nextLine();

        System.out.println("Enter patient's last name:");
        String lastName = scanner.nextLine();

        System.out.println("Enter street address:");
        String streetAddress = scanner.nextLine();

        System.out.println("Enter city:");
        String city = scanner.nextLine();

        System.out.println("Enter state:");
        String state = scanner.nextLine();

        System.out.println("Enter ZIP code:");
        String zipCode = scanner.nextLine();

        System.out.println("Enter phone number (e.g., 123-456-7890):");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter emergency contact name:");
        String emergencyName = scanner.nextLine();

        System.out.println("Enter emergency contact phone number:");
        String emergencyPhone = scanner.nextLine();

        // Create patient 
        Patient patient = new Patient(firstName, middleName, lastName, streetAddress, city, state, zipCode, phoneNumber, emergencyName, emergencyPhone);

        // Ask for the number of procedures
        System.out.println("How many procedures would you like to enter?");
        int numProcedures = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        List<Procedure> procedures = new ArrayList<>();
//loop to keep asking these questions until all the procedures have been established
        for (int i = 0; i < numProcedures; i++) {
            System.out.println("Enter details for procedure #" + (i + 1));

            System.out.println("Procedure Name:");
            String procedureName = scanner.nextLine();

            System.out.println("Procedure Date (MM/DD/YYYY):");
            String date = scanner.nextLine();

            System.out.println("Practitioner Name:");
            String practitioner = scanner.nextLine();

            System.out.println("Procedure Charges:");
            double charges = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            // Create and add the procedure to the list
            procedures.add(new Procedure(procedureName, date, practitioner, charges));
        }

        // Display patient details
        displayPatient(patient);

        // Display all procedures
        for (Procedure procedure : procedures) {
            displayProcedure(procedure);
        }

        // Calculate and display total charges
        double totalCharges = calculateTotalCharges(procedures);
        System.out.printf("Total charges: $%.2f\n", totalCharges);

        System.out.println("The program was developed by a Student: Unna Lat <03/04/25>");
        System.out.println("M#21163102")
        scanner.close();
    }

    public static void displayPatient(Patient patient) {
        System.out.println(patient);
    }

    public static void displayProcedure(Procedure procedure) {
        System.out.println(procedure);
    }

    public static double calculateTotalCharges(List<Procedure> procedures) {
        double total = 0;
        for (Procedure procedure : procedures) {
            total += procedure.getCharges();
        }
        return total;
    }
}

    
