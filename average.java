import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Please enter 5 numbers:");
    Scanner s=new Scanner(System.in);
    double a=s.nextDouble();
    double b=s.nextDouble();
    double c=s.nextDouble();
    double d=s.nextDouble();
    double e=s.nextDouble();
    double average=func_average(a,b,c,d,e);
    System.out.println("Average of the numbers is:"+average);
  }
  public static double func_average(double a, double b, double c, double d, double e){
    double average=(a+b+c+d+e)/5;
    return average;
  }
}