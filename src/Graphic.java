import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;

public class Graphic extends JFrame implements ActionListener {
    private static final Logger logger = Logger.getLogger(Graphic.class.getName());
    private static JTextField TextField;

    private static boolean isNumber(String str){
        try{
            Double.parseDouble(str);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }

    public static void createGraph() {
        logger.addHandler(Main.fileHandler);
        JFrame frame = new JFrame("Password Generator");
        TextField = new JTextField(16);
        JButton button = new JButton("Generate");
        JPanel panel = new JPanel();

        panel.add(TextField);
        panel.add(button);

        TextField.setToolTipText("Input Password Length");
        Graphic te = new Graphic();


        button.addActionListener(te);
        frame.setLayout(new GridBagLayout());
        frame.add(panel, new GridBagConstraints());
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        logger.info("Pressing the Button");
        String s = e.getActionCommand();
        if (s.equals("Generate")) {
            if (isNumber(TextField.getText())) {
                int textint = Integer.parseInt(TextField.getText());
                String textstr = GeneratePass.Random(textint);
                TextField.setText(textstr);
            }
            else {
                logger.warning("Wrong text format!");
                TextField.setText("Не тот формат данных!");
            }

        }
    }

}
