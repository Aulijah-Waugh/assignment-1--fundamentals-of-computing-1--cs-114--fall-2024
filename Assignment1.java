import java.util.Scanner; 
import java.util.Random;

public class Assignment1 {
  public static void main(String[] args) {
    // Using println to print out my initial 

    System.out.println("     AAAAA       WW     W     WW ");
    System.out.println("    AAAAAAA      WWW   WWW   WWW ");
    System.out.println("   AA     AA     WWW   WWW   WWW ");
    System.out.println("  AAA     AAA    WWW   WWW   WWW ");
    System.out.println(" AAAAAAAAAAAAA    WW   WWW   WW  ");
    System.out.println(" AAAA     AAAA      WWW   WWW    "); 
    System.out.println(" AAAA     AAAA       WW   WW     ");  
    System.out.println("                                 ");

  
   
      //Converting Fahrenheit to Celsius
    
      
      //Setting sc As A Private Static
      Scanner scan; {
        scan= new Scanner(System.in);
      //Setting Output And Receiving Input
        System.out.println(" Type in a Temperature in Farenheit:  ");
        double Farenheit = scan.nextDouble(); 

      //Math For Conversion
        double Celsius = (Farenheit - 32) * 5 / 9;
      //Outputing Celsius
        System.out.println("The Farenheit You Gave Was: " + Farenheit    );
        System.out.println( "Your Temperature In Celsius Is: " + Celsius );
        System.out.println("                                          ");
      
          //Generate Random Number 
        class Randomnum {
          //Setting Minimum and Maximum
          int min = 32 - 16;

          int max = 384;

          Random random = new Random();
          
          //Setting up Random Number Generation
          int randomnumber = random.nextInt(max - min + 1) + min; 

          //Outputing Random Number
          
        }
     }
  }
}
