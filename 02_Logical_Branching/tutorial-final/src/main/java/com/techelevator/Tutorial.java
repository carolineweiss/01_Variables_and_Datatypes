package com.techelevator;

public class Tutorial {
    public static void main(String[] args) {
        /* *********** Logical Branching Tutorial ***********
         * In this tutorial, you will write some boolean expressions and use them to
         * control the flow of your program using if / else statements.
         * This program tells the user how to prepare for their day based on weather conditions.
         * *************************************************/

        // Step 1: Greet the user
        System.out.println("**************************************");
        System.out.println("*** Welcome to the Weather Station ***");
        System.out.println("**************************************");

        // Step 2: Declare and initialize Weather Station variables
        int highTemperatureF = 55;
        boolean precipitationExpected = true;
        final int FREEZING_TEMPERATURE_F = 32;

        // Step 3: Report today's expected conditions to the user.
        System.out.println("Expected high temperature: " + highTemperatureF + " degrees F.");
        if (precipitationExpected) {
            System.out.println("The chance of precipitation is high.");
        } else {
            System.out.println("The chance of precipitation is low.");
        }

        // Step 4: Determine if the user should bring a coat. (when the temperature < 65F)
        if (highTemperatureF < 65) {
            System.out.println("* Don't forget to bring a coat today.");
        }

        // Step 5: Determine if the user should bring an umbrella
        boolean isAboveFreezing = highTemperatureF > FREEZING_TEMPERATURE_F;
        if (precipitationExpected && isAboveFreezing) {
            System.out.println("* Be sure to pack an umbrella!");
        }

        // Step 6: Advise the user on the type of jacket they should be wearing. (<= 0, <= freezing, < 65)
        if (highTemperatureF <= 0) {
            System.out.println("* Bundle up! Wear everything you have!");
        } else if (!isAboveFreezing) {
            System.out.println("* Please wear a warm winter coat!");
        } else if (highTemperatureF < 65) {
            System.out.println("* Take along a light jacket.");
        }

        // Step 7: If the temperature delta for the day is more than 20 degrees, advise the user to dress in layers.
        int lowTemperatureF = 34;
        if (highTemperatureF - lowTemperatureF > 20){
            System.out.println("* Dress in layers today, as the temperature may swing dramatically.");
        }
    }
}
