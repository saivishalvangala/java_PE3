public class Q7_ThrowException {
    public static void main(String []args)
    {
        try{
            throw new Exception("Error");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("I am there");
        }
    }
}
