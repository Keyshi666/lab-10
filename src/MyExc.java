import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyExc extends Exception {

        public MyExc(String msg, String lvl) {
            DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss:SS");
            System.out.format("    [%s]: %s\n", dateFormat.format(new Date()),msg + ", " + lvl);
        }
    }
