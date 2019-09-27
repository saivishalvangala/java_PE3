import java.util.Scanner;

public class Q6_IsConsecutiveNum {
    public static void main(String[] args) {
        System.out.println("enter 7 digits");
        String str;
        Scanner sc = new Scanner(System.in);
        str=sc.nextLine();
        String s[] = str.split(",");
        int num[] = new int[7];
        for (int i = 0; i < 7; i++) {
            num[i]=Integer.parseInt(s[i]);
        }
        int flag=1;
        for (int i = 0; i < 6; i++) {
            if(num[i]!=(num[i+1]-1))
                flag=0;
        }
        if(flag==1)
            System.out.println("consecutive");
        else
            System.out.println("non-consequetive");
    }
}
