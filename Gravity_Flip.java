import java.util.Scanner;
public class Gravity_Flip{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            int temp=scn.nextInt();
            arr[i]=temp;
        }

        for(int i=n-1;i>=0;i--){
            for(int j=i-1;j>=0;j--){
                if(arr[j]>arr[i]){
                    int diff=arr[j]-arr[i];
                    arr[i]+=diff;
                    arr[j]-=diff;
                }
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        scn.close();
    }
}