import java.util.Arrays;
import java.util.Scanner;
public class Dragons{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int s=scn.nextInt();
        int n=scn.nextInt();
        int[][] arr=new int[n][2];

        for(int i=0;i<n;i++){
            arr[i][0]=scn.nextInt();
            arr[i][1]=scn.nextInt();
        }

        helper(s,arr);
        scn.close();
    }

    public static void helper(int s,int[][] arr){
        Arrays.sort(arr,(a,b)->{
            return a[0]-b[0];
        });

        boolean flag=true;
        for(int i=0;i<arr.length;i++){
            if(s<=arr[i][0]){
                System.out.println("NO");
                flag=false;
                break;
            }
            else{
                s+=arr[i][1];
            }
        }

        if(flag)
            System.out.println("YES");
    }
}