import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   System.out.println("Please enter a number:");
    Scanner s=new Scanner(System.in);
    int num=s.nextInt();
    int factorial=func_returnFactorial(num);
    System.out.println(factorial);
  }
  public static int func_returnFactorial(int num){
    int result=1;
    for(int i=1;i<=num;i++){
      result=result*i;
    }
    return(result);
  }
}