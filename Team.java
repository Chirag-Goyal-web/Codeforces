import java.util.Scanner;
public class Team{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int ans=0;

        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<3;j++){
                int temp=scn.nextInt();
                if(temp==1)
                    count++;
            }
            if(count>1)
                ans++;
        }

        System.out.println(ans);
        scn.close();
    }
}