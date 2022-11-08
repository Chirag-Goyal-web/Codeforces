import java.util.Scanner;

public class Kevin_and_Permutation{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();

        for(int i=0;i<t;i++){
            int n=scn.nextInt();
            function(n);
            System.out.println();
        }

        scn.close();
    }

    public static void function(int n){
        int cur=0;
        int diff=n/2+1;

        for(int i=0;i<n;i++){
            if(i%2==0){
                cur+=diff;
                System.out.print(cur+" ");
            }
            else{
                cur-=(diff-1);
                System.out.print(cur+" ");
            }
        }
    }

}