/**
   Team NBJ: Nada, Brian K., Jun Hong
   APCS PD6
   HW21 -- STAtisTically Speaking...
   2021-10-20
   
   xtra: harmonic mean is the reciprocal of the
   arithmetic mean of the reciprocals
   
   No TypeCasting
 **/

public class Stats {

  public static int mean(int a, int b) {
	  int output = (a + b) / 2;
	  return output;
  }
  
  public static double mean(double a, double b) {
	  double output = (a + b) / 2;
  }
	
/**
  public static int max(int a, int b) {

  }

  public static double max(double a, double b) {

  }

  public static int geoMean(int a, int b) {

  }

  public static double geoMean(double a, double b) {

  }

  public static int max(int a, int b, int c) {

  }

  public static double max(double a, double b, double c) {

  }

  public static int geoMean(int a, int b, int c) {

  }

  public static double geoMean(double a, double b, double c) {

  }
**/

  //main method for testing functionality
  public static void main( String[] args ) {
    // should output 1.5, but it seems like it rounds down?
    System.out.println(Stats.mean(1,2));
		
		// should output 1.5
		System.out.println(Stats.mean(1,2));
		
		
  }
}//end class