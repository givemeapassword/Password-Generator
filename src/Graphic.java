import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Graphic extends JFrame implements ActionListener {
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
        JFrame frame = new JFrame("Password Generator");
        TextField = new JTextField(16);
        JButton button = new JButton("Generate");
        JPanel panel = new JPanel();

        panel.add(TextField);
        panel.add(button);

        TextField.setToolTipText("Введите длину пароля");
        Graphic te = new Graphic();


        button.addActionListener(te);
        frame.setLayout(new GridBagLayout());
        frame.add(panel, new GridBagConstraints());
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        int text;
        if (s.equals("Generate")) {
            if (isNumber(TextField.getText())) {
                text = Integer.parseInt(TextField.getText());
                TextField.setText(GeneratePass.Random(text));
            }
            else {
                TextField.setText("Не тот формат данных!");
            }

        }
    }

}
