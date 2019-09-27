import java.io.*;
import java.util.*;

public class Q11_FreqOfWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BufferedWriter bout = null;
        String s = "";
        File f=null;
        try {
            f = new File("./FileDemo.txt");
            bout = new BufferedWriter(new FileWriter(f));
            System.out.println("how many lines are you going to write in file?");
            int l = Integer.parseInt(scan.nextLine());
            for (int i = 0; i < l; i++) {
                s =scan.nextLine()+"\n";
                bout.write(s);
            }


        } catch (FileNotFoundException e) {
            System.out.println("Error writing to file");
        } catch (IOException e) {
            System.out.println("cannot write into file");
        } finally {
//        finally{
//            bout.close();
//        }
            // iam getting error when i tried to close bout in finally. why>?

            try {
                bout.flush();
                bout.close();
            }
            catch(IOException e)
            {
                System.out.println("io-exception");
            }
        }
        f=new File("./FileDemo.txt");
        BufferedReader bin=null;
        String[] a = null;
         try{
            bin=new BufferedReader(new FileReader(f));
             String str=null;
             StringBuilder s1 = new StringBuilder();
             while((str=bin.readLine()) != null){
                 s1.append(str + " ");
             }
             str = s1.toString();
             a = str.split(" ");

         }
         catch(IOException e)
         {
             System.out.println("io excecption");
         }
        System.out.println(Arrays.toString(a));
            int temp;
            HashMap<String, Integer> hm = new HashMap<String, Integer>();
            for (String str1 : a) {
                if (!(hm.containsKey(str1))) {
                    hm.put(str1, 1);
                } else {
                    temp = hm.get(str1);
                    temp++;
                    hm.put(str1, temp);
                }
            }
            for (Map.Entry m : hm.entrySet()) {
                System.out.println(m.getKey() + " " + m.getValue());
            }


    }

}