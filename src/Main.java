import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        int res = 0;
        try{
            res = getAreaValue(-1, 10);
        }catch(IllegalArgumentException e){
            Logger.getLogger(Main.class.getName()).log(new LogRecord(Level.WARNING, "Один из аргументов явдяется негативным числом!"));
            throw e;
        }
        System.out.println("Result : "+res);
    }
    public static int getAreaValue(int x, int y){
        if(x < 0 || y < 0) throw new IllegalArgumentException("value of 'x' or 'y' is negative: x="+x+", y="+y);
        return x*y;
    }
}

