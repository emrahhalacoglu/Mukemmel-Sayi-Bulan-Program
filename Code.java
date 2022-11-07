import java.util.Scanner;
public class Code {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int j=0;
        while(j!=1){
            System.out.print("Input N to Find Perfect Number : ");
            int n=input.nextInt();
            int sumN=0;
            for(int i=n-1;i>0;i--){
                if(n%i==0){
                    sumN+=i;
                }
            }
            if(sumN==n){
                System.out.println("N is a perfect number.");
            }else{
                System.out.println("N is not a perfect number.");
            }
            System.out.print("1 - Check out!\n2 - Continue\nPlease Select : ");
            j=input.nextInt();
        }

    }
    
}
