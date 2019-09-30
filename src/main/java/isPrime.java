public class isPrime {
    
    public static boolean isPrime( int userNumber ) {
        int evenDivisions = 0;
        if( userNumber < 1 ) {
            return false;
        }
    for(int currentDivision = 1; currentDivision <= userNumber; currentDivision++) {
       if ( userNumber % currentDivision == 0 ) {
           evenDivisions = evenDivisions + 1;
           if (( evenDivisions > 2)||( userNumber == 1)) {
               return false;
           }
    }
    }
    return true;
    }

public static void main(String [] args) {
        System.out.println( isPrime( 1 ));
}
}
