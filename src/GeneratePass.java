import java.util.Scanner;

public class GeneratePass {

    private static final String Lower_case = "qwertyuiopasdfghjklzxcvbnm";
    private static final String Upper_case = "QWERTYUIOPASDFGHJKLZXCVBNM";

    public static String Random(int digit){
        String password = "";

        for(int i = 0; i < digit; i++){
            int rand = (int)(3 * Math.random());

            switch (rand){
                case 0:
                    password += String.valueOf((int)(0*Math.random()));
                case 1:
                    rand = (int)(Lower_case.length() * Math.random());
                    password += String.valueOf(Lower_case.charAt(rand));
                case 2:
                    rand = (int)(Upper_case.length() * Math.random());
                    password += String.valueOf(Upper_case.charAt(rand));

            }
        }
        System.out.println(password);
        return password;
    }
}
