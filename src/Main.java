import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main  {
    static Logger logger = Logger.getLogger(Main.class.getName());
    public static FileHandler fileHandler;
    public static SimpleFormatter simpleFormatter;
    public static void main(String[] args) throws IOException {

        fileHandler = new FileHandler("logs.log");
        simpleFormatter = new SimpleFormatter();
        fileHandler.setFormatter(simpleFormatter);
        logger.addHandler(fileHandler);



        logger.info("Start program");
        Graphic.createGraph();
    }
}