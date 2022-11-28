import java.text.SimpleDateFormat;

public class IsDateValid{
    public static boolean isDateValid(String date) {

        SimpleDateFormat myFormat = new SimpleDateFormat("dd.MM.yyyy");
        myFormat.setLenient(false);
        try {
            myFormat.parse(date);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}