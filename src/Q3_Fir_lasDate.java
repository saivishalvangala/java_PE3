import java.text.SimpleDateFormat;
import java.util.*;

public class Q3_Fir_lasDate {
    public static void main(String[] args) {
        String pattern = "dd/mm/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Calendar calendar = new GregorianCalendar();
        Date now = new Date();
        calendar.add(Calendar.DAY_OF_WEEK, -now.getDay()+1);
        Date mondayThisWeek = calendar.getTime();
        System.out.println("First day of the week: Mon " + simpleDateFormat.format(mondayThisWeek));
        calendar = new GregorianCalendar();
        calendar.add(Calendar.DAY_OF_WEEK, (-now.getDay()+7));
        Date sundayThisWeek = calendar.getTime();
        System.out.println("Last day of the week: Sun " +simpleDateFormat.format(sundayThisWeek));
    }
}
