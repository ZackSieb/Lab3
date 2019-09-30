/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Siebu
 */
import javax.swing.JOptionPane;

public class PaintJob {
    
    public static int getNumberOfRooms() {
       String userInputString;
       int userNumberOfRooms;
       userInputString = JOptionPane.showInputDialog( " Please enter the number of rooms that are going to be painted: " );
       userNumberOfRooms = Integer.parseInt( userInputString );
       return userNumberOfRooms ;
     }
    
     public static double getPaintPricePerGallon() {
         String userInputString;
         double priceOfPaint;
         userInputString = JOptionPane.showInputDialog(" Please enter the price of the paint ");
         priceOfPaint = Double.parseDouble( userInputString );
         return priceOfPaint;
     }  
     
     public static double getTotalWallSpace( int numberOfRooms) {
         String userInputString;
         double wallSpace;
         double totalWallSpace = 0;
         for( int currentRoom = 1; currentRoom <= numberOfRooms; currentRoom++);
            userInputString = JOptionPane.showInputDialog (" Please enter the sqaure feet of wall space in room" + currentRoom);
            wallSpace = Double.parseDouble( userInputString);
            totalWallSpace += wallSpace;
        
        return totalWallSpace;
     }

    public static double calculateHoursOfLaborReuired( double totalWallSpace) {
    
    double gallonsOfPaintRequired;
    gallonsOfPaintRequired = ( totalWallSpace / 115) * 1;
    return gallonsOfPaintRequired;  
}
    public static double calculateHoursofLaborRequired( double totalWallSpace) {
        double hoursOfLaborRequired;
        hoursOfLaborRequired = ( totalWallSpace / 115) * 8;
        return hoursOfLaborRequired;
    }
    public static double calculateCostOfPaint( double priceOfPaint, double gallonsOfPaintRequired) {
        double costOfPaint;
        costOfPaint = gallonsOfPaintRequired * priceOfPaint;
        return costOfPaint;
    }
    public static double calculateLaborCharges( double hoursOfLaborRequired, double chargePerHour) {
        double laborCharges;
        laborCharges = hoursOfLaborRequired * chargePerHour;
        return laborCharges;
    }
    public static double calculateTotalCost ( double laborCharges, double costOfPaint) {
    double totalCost;
    totalCost = laborCharges + costOfPaint;
    return totalCost;
}
   public static void displayDataOnScreen ( int userNumberRooms, double totalWallSpace, double priceOfPaintPerGallon, double gallonsOfPaintRequired, double hoursOfLaborRequired, double costOfPaint, double laborCharges, double totalCost) {
       String outputString;
       outputString = String.format( "User number of rooms: %d\nTotal wall space: %.2f\nPrice of paint per gallon:" + " $%, .2f\nGallons of paint required: %.1f\nHours of labor required: %.1f\nCost of paint:" + "$%, .2f\nLabor Charges: $%,.2f\nTotal Cost: $%,.2f" , userNumberRooms, totalWallSpace, priceOfPaintPerGallon, gallonsOfPaintRequired, hoursOfLaborRequired, costOfPaint, laborCharges, totalCost);
       JOptionPane.showMessageDialog( null, outputString);
   }
   public static void main( String [ ] args ) {
       final double CHARGE_PER_HOUR = 18.00;
       int userNumberOfRooms = getNumberOfRooms();
       double totalWallSpace = getTotalWallSpace( userNumberOfRooms);
       double priceOfPaintPerGallon = getPaintPricePerGallon();
       double gallonsOfPaintRequired = calculateGallonsOfPaintRequired( totalWallSpace);
       double hoursOfLaborRequired = calculateHoursOfLaborRequired( totalWallSpace);
       double costofPaint = calculateCostOfPaint( priceOfPaintPerGallon, gallonsOfPaintRequired);
       double laborCharges = calculateLaborCharges ( hoursOfLaborRequired, CHARGE_PER_HOUR);
       double totalCost = calculateTotalCost( laborCharges, costOfPaint);
       displayDataOnScreen( userNumberOfRooms, totalWallSpace, priceOfPaintPerGallon, gallonsOfPaintRequired, hoursOfLaborRequired, costOfPaint, laborCharges, totalCost);
       system.exit(0);
   }
} 

