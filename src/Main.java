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
        final double STORAGEPOWER = 35.8; // kWh (this actually is just the battery capacity)
        final int[] CURRENT = new int[] { 10, 16, 10, 16, 32 }; // Ampere array of elements in the table
        final int[] VOLTAGE = new int[] { 230, 230, 400, 400, 400 }; // Volt array of elements in the table
        final double[] CHARGEPOWER = new double[] { 2.3, 3.68, 6.93, 11.09, 22.17 }; // kW array of elements
        final String SHORTSPACE = "        ";
        final String LONGSPACE = "                ";
        final int NOOFDECIMALS = 2;

        double singlePhaseChargingPower;

        // Print the table header
        System.out.print("Battery capacity (kWh): " + STORAGEPOWER + "\n");
        System.out.print("\n");
        System.out.print(
                "Current(A)" + SHORTSPACE + "Tension(V)" + SHORTSPACE + "Power(kW)" + SHORTSPACE + "Charge Time(h)"
                        + SHORTSPACE + "\n");
        System.out.print("===================================================================\n");

        // Print the table body
        for (int i = 0; i < CHARGEPOWER.length; i++) {
            // Print the Amperage
            System.out.print(CURRENT[i] + LONGSPACE);
            // Print the Tension
            System.out.print(VOLTAGE[i] + LONGSPACE);
            // Print the Power
            System.out.print(CHARGEPOWER[i] + LONGSPACE);
            // calculate full battery time
            singlePhaseChargingPower = (STORAGEPOWER / CHARGEPOWER[i]);
            // round to 2 decimals
            singlePhaseChargingPower = Math.round(singlePhaseChargingPower * Math.pow(10, NOOFDECIMALS))
                    / Math.pow(10, NOOFDECIMALS);
            // Print the Charge Time
            System.out.print(singlePhaseChargingPower + "\n");
        }
    }
}