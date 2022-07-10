import java.util.Scanner;
import java.lang.Math;
class Main {
  public static void main(String[] args) {
    System.out.println("Please enter a number:");
    Scanner s=new Scanner(System.in);
    int num=s.nextInt();
    boolean prime=func_prime(num);
  }
  public static boolean func_prime(int num){
   boolean prime=true;
   for(int i=2;i<Math.sqrt(num);i++){
    if(num%i==0){
      prime=false;
    if (prime==true){
      System.out.println("It's a prime number.");
      }
      else{
       System.out.println("It isn't a prime number.");
    }  
   }
  }
    return prime; 
 }
}