import java.util.Scanner;
public class Football{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();

        if(str.length()<7){
            System.out.println("NO");
        }
        else{
            int count=1;
            int cur=str.charAt(0)-'0';
            boolean flag=true;

            for(int i=1;i<str.length();i++){
                if(str.charAt(i)-'0'==cur){
                    count++;
                }
                else{
                    count=1;
                    cur=str.charAt(i)-'0';
                }

                if(count>6){
                    System.out.println("YES");
                    flag=false;
                    break;
                }
            }

            if(flag)
                System.out.println("NO");
        }

        scn.close();
    }
}