import java.io.FileNotFoundException;
import java.io.IOException;
public class SuperClass {
    public void start() throws IOException{
        throw new IOException("Not able to open file");
    }
}
class SubClass extends SuperClass{
    public void start() throws FileNotFoundException{
        throw new FileNotFoundException("Not able to start");
    }
}
