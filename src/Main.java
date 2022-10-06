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
        final double STORAGE_POWER = 35.8; // kWh (this actually is just the battery capacity)
        final int[] CURRENT = new int[] { 10, 16, 10, 16, 32 }; // Ampere array of elements in the table
        final int[] VOLTAGE = new int[] { 230, 230, 400, 400, 400 }; // Volt array of elements in the table
        final double[] CHARGE_POWER = new double[] { 2.3, 3.68, 6.93, 11.09, 22.17 }; // kW array of elements
        final String SHORT_SPACE = "        ";
        final String LONG_SPACE = "                ";
        final int NO_OF_DECIMALS = 2;

        double singlePhaseChargingPower;

        // Print the table header
        System.out.print("Battery capacity (kWh): " + STORAGE_POWER + "\n");
        System.out.print("\n");
        System.out.print(
                "Current(A)" + SHORT_SPACE + "Tension(V)" + SHORT_SPACE + "Power(kW)" + SHORT_SPACE + "Charge Time(h)"
                        + SHORT_SPACE + "\n");
        System.out.print("===================================================================\n");

        // Print the table body
        for (int i = 0; i < CHARGE_POWER.length; i++) {
            // Print the Amperage
            System.out.print(CURRENT[i] + LONG_SPACE);
            // Print the Tension
            System.out.print(VOLTAGE[i] + LONG_SPACE);
            // Print the Power
            System.out.print(CHARGE_POWER[i] + LONG_SPACE);
            // calculate full battery time
            singlePhaseChargingPower = (STORAGE_POWER / CHARGE_POWER[i]);
            // round to 2 decimals
            singlePhaseChargingPower = Math.round(singlePhaseChargingPower * Math.pow(10, NO_OF_DECIMALS))
                    / Math.pow(10, NO_OF_DECIMALS);
            // Print the Charge Time
            System.out.print(singlePhaseChargingPower + "\n");
        }
    }
}