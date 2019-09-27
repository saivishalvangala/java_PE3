import java.io.*;

public class Q9_ContentToUCase {
    public static void main(String[]args)throws IOException {
        File path=new File("mydata.txt");
        BufferedWriter br=new BufferedWriter( new FileWriter(path));
        br.write("welcome to my first file");
        br.flush();
        br.close();
        BufferedReader brin=new BufferedReader(new FileReader("mydata.txt"));
        String s="";
        int i,count=0;
        while((i=brin.read())!=-1){
         s=s+(char)i;
         count++;
//            s=brin.readLine();
        }
        s=s.toUpperCase();
        brin.close();
        System.out.println(s);
        System.out.println("length if the file is "+count);


    }
}
