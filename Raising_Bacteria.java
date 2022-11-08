import java.util.Scanner;

public class Raising_Bacteria{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        helper(n);
        scn.close();
    }

    public static void helper(int n){
        int count=0;
        
        while(n>0){
            if((n&1)>0){
                n^=1;
                count++;
            }
            n>>=1;
        }

        System.out.println(count);
    }
}