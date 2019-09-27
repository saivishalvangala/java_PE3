import java.util.*;
public class Q8_DiffExceptions {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n;
        try {
            System.out.println("enter array length");
            n = scan.nextInt();

            int[] a = new int[n];
            System.out.println("enter the length to be iterated");
            int l = scan.nextInt();
            System.out.println("enter array elements");
            for (int i = 0; i < l; i++) {
                a[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                System.out.println("element "+i+" is"+ a[i]);
            }
            Q8_DiffExceptions obj=null;
            obj.method();

        }
        catch(NegativeArraySizeException e){
            System.out.println("ERROR:Entered size of array is negative");
        }
        catch(NullPointerException e){
            System.out.println("ERROR:object is not assigned to the reference ");
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("ERROR:trying to accessing length more than that of array");
        }
        catch(Exception e)
        {
            System.out.println("unknown exception");
        }

    }

    public int method()
    {
        return 0;
    }
}
