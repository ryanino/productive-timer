import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI extends JFrame implements ActionListener {

    private JTextField howMuch;
    private JButton prod;
    private boolean areProd = false;

    public MainGUI() {

        super("Productivity Machine");
        setLayout(new BorderLayout());

        prod = new JButton("Start of Productivity");
        prod.setBackground(Color.green);
        prod.setOpaque(true);
        prod.addActionListener(this);

        howMuch = new JTextField();
        howMuch.setEditable(false);

        add(prod, BorderLayout.SOUTH);
        add(howMuch, BorderLayout.CENTER);


    }

    public void actionPerformed(ActionEvent e)
    {

        Timer tim = new Timer();

        if(!areProd) {

            tim.start();
            prod.setBackground(Color.red);
            prod.setText("I'm Not Productive Anymore");
            howMuch.setText("Go! Go! Go!");
            areProd = true;
        }

        else if(areProd) {

            tim.stop();
            prod.setBackground(Color.green);
            prod.setText("I'm Productive Again");
            howMuch.setText("You were productive for: \n" + tim.getHours() + " hours " + tim.getMinutes() +
                    " minutes " + tim.getSeconds() + " seconds!");
            areProd = false;
        }
    }


    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {

                MainGUI MainGUI = new MainGUI();
                MainGUI.setBounds(420,69,690,420);
                MainGUI.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                MainGUI.setResizable(true);
                MainGUI.setVisible(true);

            }
        });
    }
}
