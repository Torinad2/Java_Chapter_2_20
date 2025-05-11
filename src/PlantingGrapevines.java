/******************************************************************
 * Planting Grapevines                                            *
 * This program calculates the number of grapevines that will     *
 * fit in a specified row length, accounting for end-post space   *
 * and spacing between the vines.                                 *
 ******************************************************************/

import java.util.Scanner;

public class PlantingGrapevines {

    /**************************************************************
     * Main Method                                                *
     * Prompts the user for row length, end-post space, and vine  *
     * spacing, then calculates the number of vines that fit.     *
     **************************************************************/
    public static void main(String[] args) {

        //*********************************************************
        // Variable Declarations                                  *
        // To store user input and calculated values              *
        //*********************************************************
        double rowLength;                      // Length of the row in feet
        double endPostSpace;                   // Space taken by each end-post
        double vineSpace;                      // Space between each vine
        double numberOfVines;                  // Calculated number of vines

        //*********************************************************
        // Input Section                                          *
        // Prompting the user to enter the dimensions             *
        //*********************************************************
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the length of the row (in feet): ");
        rowLength = keyboardInput.nextDouble();

        System.out.print("Enter the space used by an end-post assembly (in feet): ");
        endPostSpace = keyboardInput.nextDouble();

        System.out.print("Enter the space between the vines (in feet): ");
        vineSpace = keyboardInput.nextDouble();

        //*********************************************************
        // Calculation Section                                    *
        // Apply the formula V = (R - 2E) / S                     *
        //*********************************************************
        numberOfVines = (rowLength - 2 * endPostSpace) / vineSpace;

        //*********************************************************
        // Output Section                                         *
        // Display the calculated number of vines                 *
        //*********************************************************
        System.out.println();
        System.out.printf("%-40s %.2f\n", "Number of grapevines that will fit:", numberOfVines);

        //*********************************************************
        // Developer Credit                                       *
        //*********************************************************
        System.out.println();
        System.out.println("Developed by: Nikita Baiborodov");

        //*********************************************************
        // Resource Cleanup                                       *
        // Close the scanner to prevent resource leaks            *
        //*********************************************************
        keyboardInput.close();
        System.exit(0);
    }
}

