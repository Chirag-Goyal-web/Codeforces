import java.util.Scanner;
public class Way_Too_Long_words{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();

        for(int i=0;i<t;i++){
            String str=scn.next();
            function(str);
        }

        scn.close();
    }

    public static void function(String str){
        if(str.length()<=10){
            System.out.println(str);
        }
        else{
            System.out.println(str.charAt(0)+((str.length()-2)+"")+str.charAt(str.length()-1));
        }
    }
}