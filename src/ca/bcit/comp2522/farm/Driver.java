package ca.bcit.comp2522.farm;

/**
 * Drives the program.
 *
 * @author BCIT
 * @version 202230
 */
public final class Driver {

    private Driver() { }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(final String[] args) {
        System.out.println("Making an apple farm with 10 orchards of 10 trees each!");
        Farm myFarm = new AppleFarm("My farm!");
        myFarm.plantSomeOrchards(10, 10);
        final int totalHarvest = myFarm.gatherHarvest();
        System.out.println("We gathered " + totalHarvest + " apples!");
    }
}
