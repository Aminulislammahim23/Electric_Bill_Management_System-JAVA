import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class LoginPage extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    // Storing Users and Admin
    private Map<String, String> userCredentials = new HashMap<>();

    public LoginPage() {
        setTitle("Login Page");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2));

        // Predefined Users
        userCredentials.put("admin", "552299"); // Admin
        userCredentials.put("mahim", "123123");
        userCredentials.put("user2", "pass2");
        userCredentials.put("user3", "pass3");
        userCredentials.put("user4", "pass4");
        userCredentials.put("user5", "pass5");

        // UI Elements
        JLabel userLabel = new JLabel("Username:");
        usernameField = new JTextField();
        JLabel passLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Authentication
                if (userCredentials.containsKey(username) && userCredentials.get(username).equals(password)) {
                    JOptionPane.showMessageDialog(null, "Login Successful!");

                    if (username.equals("admin")) {
                        new AdminDashboard();  // Open Admin Dashboard
                    } else {
                        new HomePage(username);  // Open User Home Page
                    }
                    dispose();  // Close Login Page
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Add Components
        add(userLabel);
        add(usernameField);
        add(passLabel);
        add(passwordField);
        add(new JLabel());  // Empty space
        add(loginButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}
