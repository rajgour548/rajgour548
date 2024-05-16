import java.util.Scanner;
public class armstrong {
    public static void main (String [] args){
       /* int n;
        System.out.print("enter a number:");
        Scanner Sc = new Scanner(System.in);
        n = Sc.nextInt();*/
       
        //System.out.print(ifArmstrong(n));
        for(int n=100; n<1000;n++){
            if (ifArmstrong(n)==true){
                System.out.print(n+" ");
            }
        }
    }
    
    static boolean ifArmstrong(int n){
        int original = n;
        int sum=0;
    while(n>0){
      int rem= n%10;
      sum=sum+rem*rem*rem; 
      n=n/10;
       }
       return sum==original;
    }
}
