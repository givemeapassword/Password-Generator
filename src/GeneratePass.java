import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class GeneratePass {

    private static final String Lower_case = "qwertyuiopasdfghjklzxcvbnm~!#$%^+[]{}:;";
    private static final String Upper_case = "QWERTYUIOPASDFGHJKLZXCVBNM~!#$%^+[]{}:;";
    static Logger logger = Logger.getLogger(GeneratePass.class.getName());

    public static String Random(int digit) {

        logger.addHandler(Main.fileHandler);
        logger.info(String.format("Entered length: %s",digit));
        String password = "";

        for(int i = 0; i < digit; i++){
            int rand = (int)(3 * Math.random());
            logger.info(String.format("Random Finder: %d",rand));

            switch (rand){
                case 0:
                case 1:
                    rand = (int)(Lower_case.length() * Math.random());
                    password += String.valueOf(Lower_case.charAt(rand));
                    logger.info(String.format("Cycle of Creation. Password: %s      Iteration: %d ",password,i));
                    break;
                case 2:
                    rand = (int)(Upper_case.length() * Math.random());
                    password += String.valueOf(Upper_case.charAt(rand));
                    logger.info(String.format("Cycle of Creation. Password: %s      Iteration: %d ",password,i));
                    break;

            }
        }
        logger.info(String.format("Consequence: %s",password));
        return password;
    }
}
