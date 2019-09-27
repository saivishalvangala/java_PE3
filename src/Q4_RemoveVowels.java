import java.util.Scanner;

public class Q4_RemoveVowels {
    public static void main(String[] args) {
        System.out.println("enter no of places");
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        String place[] =new String[n];
        System.out.println("enter places");
        for (int i=0;i<n;i++)
            place[i]=sc.next();
        for (int i=0;i<n;i++)
        {
            String str="";
            String st=place[i];
            for(int j=0;j<place[i].length();j++)
            {
                char ch=st.charAt(j);
                if(!(ch=='a' || ch=='A' || ch=='e' || ch=='E' ||
                        ch=='i' || ch=='I' || ch=='o' || ch=='O' ||
                        ch=='u' || ch=='U'))
                    str=str+ch;
            }
            place[i]=str;
            System.out.println(place[i]);
        }
    }
}
