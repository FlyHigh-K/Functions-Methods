import java.util.Scanner;
class methods {
  public static void main(String[] args) {
    System.out.println("Enter 3 different numbers.");
    Scanner s=new Scanner(System.in);
    double a=s.nextDouble();
    double b=s.nextDouble();
    double c=s.nextDouble();
    double max=func_max(a,b,c);
    double min=func_min(a,b,c);
    double diff=func_diff(max,min);
    System.out.println("Difference is:"+diff);
  }
  public static double func_max(double a, double b, double c){
    double max=0;
    if(a > b && a > c){
     System.out.println("Largest number is:"+a);
      max=a;
    }
    else if(b > a && b > c){
     System.out.println("Largest number is:"+b);
      max=b;
        }
    else{
     System.out.println("Largest number is:"+c);
      max=c;
        }
    return max;
  }
  public static double func_min(double a, double b, double c){
    double min=0;
    if(a < b && a < c){
     System.out.println("Smallest number is:"+a); 
      min=a;
    }
    else if(b < a && b < c){
      System.out.println("Smallest number is:"+b);
      min=b;
    }
    else{
      System.out.println("Smallest number is:"+c);
      min=c;
    }
    return min;
  }
  public static double func_diff(double max, double min){
    double diff=max-min;
    return diff;
  }
}