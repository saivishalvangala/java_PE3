import com.sun.source.util.SourcePositions;

import java.util.*;

public class Q1_StudentMarks {

    public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter number of Stundents");
        int numOfStudents=scan.nextInt();
        int[] stuGrades=new int[numOfStudents];

        for(int i=0;i<numOfStudents;i++)
        {
            System.out.println("enter mark of Student "+i);
            stuGrades[i]=scan.nextInt();
        }

        for(int i=0;i<numOfStudents;i++)
        {
            try{
                if(stuGrades[i]<0||stuGrades[i]>100)
                {
                    throw new ArithmeticException();
                }
            }
            catch(ArithmeticException e){

                System.out.println("mark of student "+i+" is invalid");

        }
        }
    }
}
