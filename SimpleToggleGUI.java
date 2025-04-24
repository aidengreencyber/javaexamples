import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleToggleGUI {

    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JButton button;
    private boolean isInitialMessage = true;

    public SimpleToggleGUI() {
        initGUI();
    }

    private void initGUI() {
        frame = new JFrame("Simple Toggle GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);

        panel = new JPanel(new BorderLayout());

        label = new JLabel("Initial Message", SwingConstants.CENTER);
        panel.add(label, BorderLayout.CENTER);

        button = new JButton("Change Message");
        panel.add(button, BorderLayout.SOUTH);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isInitialMessage) {
                    label.setText("Alternate Message");
                } else {
                    label.setText("Initial Message");
                }
                isInitialMessage = !isInitialMessage;
            }
        });

        frame.add(panel);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SimpleToggleGUI();
            }
        });
    }
}