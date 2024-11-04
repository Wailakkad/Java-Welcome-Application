import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Mainframe extends JFrame {
    final private Font maunFont = new Font("Segoe Print", Font.BOLD, 18);
    JTextField Firstname, lastname;
    JLabel labelWelcome; // Use JLabel instead of JPanel

    public void initialize() {
        JLabel labelFirstname = new JLabel("Firstname");
        labelFirstname.setFont(maunFont);

        Firstname = new JTextField();
        Firstname.setFont(maunFont);

        JLabel labaelLastname = new JLabel("Lastname");
        labaelLastname.setFont(maunFont);

        lastname = new JTextField();
        lastname.setFont(maunFont);

        JPanel FormPannel = new JPanel();
        FormPannel.setLayout(new GridLayout(4, 1, 5, 5));
        FormPannel.add(labelFirstname);
        FormPannel.add(Firstname);
        FormPannel.add(labaelLastname);
        FormPannel.add(lastname);

        /******* WELCOME Label ******/
        labelWelcome = new JLabel(); // Changed to JLabel
        labelWelcome.setFont(maunFont);

        /******* Buttons Panel ******/


        /************ ok btn for set the welcomt text     ************/
        JButton btnOK = new JButton("OK");
        btnOK.setFont(maunFont);
        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String FIRSTNAME = Firstname.getText();
                String LASTNAME = lastname.getText();
                labelWelcome.setText("Hello " + FIRSTNAME + " " + LASTNAME); // Set text on JLabel
            }
        });

        /************ clear btn for clear the ionformation (Firstnamr / lastname )   ************/

        JButton CleatBtn = new JButton("Clear");
        CleatBtn.setFont(maunFont);
        CleatBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Firstname.setText("");
                lastname.setText("");
                labelWelcome.setText(""); // Clear the text
            }
        });

        JPanel buttonPannel = new JPanel();
        buttonPannel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonPannel.add(btnOK);
        buttonPannel.add(CleatBtn);

        JPanel PANNEL = new JPanel();
        PANNEL.setLayout(new BorderLayout());
        PANNEL.setBackground(new Color(128, 128, 255));
        PANNEL.add(FormPannel, BorderLayout.NORTH);
        PANNEL.add(labelWelcome, BorderLayout.CENTER);
        PANNEL.add(buttonPannel, BorderLayout.SOUTH);

        setTitle("Welcome");
        setSize(500, 600);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(PANNEL);// Add the main panel to the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        Mainframe frame = new Mainframe();
        frame.initialize();
    }
}
