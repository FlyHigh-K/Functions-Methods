import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Please enter a number:");
    Scanner s=new Scanner(System.in);
    int r=s.nextInt();
//    func_reverse(r);
    boolean result=func_checkPalindrome(r);
    System.out.println(result);
  }
  public static void func_reverse(int r){
    int reverse=0;
    while(r>0){
      int remainder=r%10;
      reverse=reverse*10+remainder;
      r=r/10;   
    }
    System.out.println(reverse);
  }
  public static int func_returnReverse(int r){
    int reverse=0;
        while(r>0){
      int remainder=r%10;
      reverse=reverse*10+remainder;
      r=r/10;   
    }
    return(reverse);
  }
  public static boolean func_checkPalindrome(int original){
    boolean t=true;
    int reversed=func_returnReverse(original);
    if(reversed==original){
      t=true;
    }
    else{
      t=false;
    }
    return(t);
  }
}