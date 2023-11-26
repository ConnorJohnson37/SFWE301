import java.awt.*; import javax.swing.*; // Create a simple GUI window 
public class Login extends JFrame{    
    private static void createWindow() {       
        //Create and set up the window.       
        JFrame frame = new JFrame("Login");       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //top text       
        JLabel textLabel = new JLabel("Login into account here:", SwingConstants.CENTER);       
        textLabel.setPreferredSize(new Dimension(300, 100));       
        frame.getContentPane().add(textLabel, BorderLayout.NORTH);
        //Login
        JTextField loginBox = new JTextField("Hello");
        frame.getContentPane().add(loginBox, BorderLayout.CENTER);
        //Display the window.       
        frame.setLocationRelativeTo(null);       
        frame.pack();       
        frame.setVisible(true);    
    }    
    public static void main(String[] args) {       
        createWindow();    
    } 
}