import java.util.Scanner;

public class Temperature {
   
   public static void main (String[] args){
	   
	   Scanner in = new Scanner(System.in);
	   
	   double celsius = 10.0;
	   double fahrenheit;
	   
	   final double CELSTU_PER_FAHRENHEIT = 1.8;
	   fahrenheit = celsius * CELSTU_PER_FAHRENHEIT + 30;
	   
	   //System.out.print(fahrenheit);
	   
	   System.out.printf("%.2f celsius = %f fahrenheit\n" ,celsius, fahrenheit);
	   
    }
    
    
}
