import java.util.Arrays;
import java.util.Scanner;
public class Twins{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        int total=0;

        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
            total+=arr[i];
        }
        
        Arrays.sort(arr);
        int count=0;
        int cur=0;

        for(int i=n-1;i>=0;i--){
            cur+=arr[i];
            total-=arr[i];
            count++;

            if(cur>total){
                System.out.println(count);
                break;
            }
        }

        scn.close();
    } 
}