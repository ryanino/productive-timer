import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {

    private JTextField howMuch;
    private JPanel panel;
    private JButton prod;
    private boolean areProd = false;

    public MainFrame() {

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

        Timer t = new Timer();

        if(!areProd) {

            t.start();
            prod.setBackground(Color.red);
            prod.setText("I'm Not Productive Anymore");
            howMuch.setText("Go! Go! Go!");
            areProd = true;
        }

        else if(areProd) {

            t.stop();
            prod.setBackground(Color.green);
            prod.setText("I'm Productive Again");
            howMuch.setText("You were productive for: \n" + t.getHours() + " hours " + t.getMinutes() + " minutes and "
                            + t.getSeconds() + " seconds! ");
            t.clear();
            areProd = false;
        }
    }


    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {

                MainFrame mainFrame = new MainFrame();
                mainFrame.setBounds(420,420,420,420);
                mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                mainFrame.setResizable(true);
                mainFrame.setVisible(true);

            }
        });
    }
}

