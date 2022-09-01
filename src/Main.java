/**
 * ===============================================================
 * What does the program do:
 * The program calculates the charging time for an electric car
 * then prints on screen a table with
 * ===============================================================
 * Pseudocode steps:
 * 1. Defining all the variables with the numbers provided
 * 2. Do the various rounding and conversions
 * 3. Print a table with the values previously converted
 * ===============================================================
 * Alessandro Suha
 * alesuh-1
 */

class Main {
    public static void main(String[] args) {
        // Define all the constants
        final double storagePower = 35.8; // kWh (this actually is just the battery capacity)
        final int[] current = new int[] { 10, 16, 10, 16, 32 }; // Ampere array of elements in the table
        final int[] voltage = new int[] { 230, 230, 400, 400, 400 }; // Volt array of elements in the table
        final double[] chargePower = new double[] { 2.3, 3.68, 6.93, 11.09, 22.17 }; // kW array of elements
        final String shortSpace = "        ";
        final String longSpace = "                ";
        final int noOfDecimals = 2;

        // Print the table header
        System.out.print("Battery capacity (kWh): " + storagePower + "\n");
        System.out.print("\n");
        System.out.print(
                "Current(A)" + shortSpace + "Tension(V)" + shortSpace + "Power(kW)" + shortSpace + "Charge Time(h)"
                        + shortSpace + "\n");
        System.out.print("===================================================================\n");

        // Print the table body
        for (int i = 0; i < chargePower.length; i++) {
            // Print the Amperage
            System.out.print(current[i] + longSpace);
            // Print the Tension
            System.out.print(voltage[i] + longSpace);
            // Print the Power
            System.out.print(chargePower[i] + longSpace);
            // calculate full battery time
            double singlePhaseChargingPower = (storagePower / chargePower[i]);
            // round to 2 decimals
            singlePhaseChargingPower = Math.round(singlePhaseChargingPower * Math.pow(10, noOfDecimals))
                    / Math.pow(10, noOfDecimals);
            // Print the Charge Time
            System.out.print(singlePhaseChargingPower + "\n");
        }
    }
}