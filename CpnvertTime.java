import java.util.Scanner;
publiuc class Temperature{
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("How many Seconds?");
    double s = in.nextInt();
    int hours = s/60;
    int minutes = (s%60)/60;
    int seconds = s - hour*3600 - minutes * 60;
    System.out.print(s);
    System.out.print(" seconds = ");
    System.out.print(hours);
    System.out.print(" hours ");
    System.out.print( minutes );
    System.out.print(" minutes ");
    
