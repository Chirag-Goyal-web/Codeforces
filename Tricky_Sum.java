import java.util.Scanner;
public  class Tricky_Sum{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();

        while(t-->0){
            int n=scn.nextInt();
            function(n);
        }

        scn.close();
    }

    public static void function(int n){
        int lastOn=0;

        for(int i=0;i<=30;i++){
            if((n&(1<<i))>0)
                lastOn=i;
        }

        int temp=0;
        for(int i=0;i<=lastOn;i++){
            temp+=(int)Math.pow(2, i);
        }

        long ans=((long)n*(long)(n+1))/2;
        System.out.println(ans-(long)(2)*(long)(temp));
    }

}