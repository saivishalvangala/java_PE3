import java.io.*;
import java.util.Scanner;

public class Q10_FindFile {
    public static void main(String [] args)throws IOException
    {
        Scanner scan=new Scanner(System.in);
        File folder=new File("./");
        File s[]=folder.listFiles();
        for (File tmp:s) {
            if(tmp.isFile())
            System.out.println(tmp);
        }
        System.out.println("enter the file you want");
        String str=scan.nextLine();

        BufferedInputStream b=new BufferedInputStream(new FileInputStream(str));
        int i;
        while((i=b.read())!=-1)
        {
            System.out.print((char)i);
        }
        System.out.println();
        b.close();

    }
}
