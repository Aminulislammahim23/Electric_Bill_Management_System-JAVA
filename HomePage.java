import javax.swing.*;
import java.awt.*;

public class HomePage extends JFrame {
    public HomePage(String username) {
        setTitle("User Home Page");
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Welcome Label
        JLabel welcomeLabel = new JLabel("Welcome, " + username + "!", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 32));
        welcomeLabel.setBounds(350, 50, 500, 50);
        add(welcomeLabel);

        // Buttons
        JButton viewBillButton = new JButton("View Bill");
        JButton payBillButton = new JButton("Pay Bill");
        JButton historyButton = new JButton("Payment History");
        JButton logoutButton = new JButton("Logout");

        // Button Styling
        Font buttonFont = new Font("Arial", Font.BOLD, 22);
        viewBillButton.setFont(buttonFont);
        payBillButton.setFont(buttonFont);
        historyButton.setFont(buttonFont);
        logoutButton.setFont(new Font("Arial", Font.BOLD, 20));

        // Button Positions
        viewBillButton.setBounds(200, 250, 300, 70);
        payBillButton.setBounds(500, 250, 300, 70);
        historyButton.setBounds(800, 250, 300, 70);
        logoutButton.setBounds(500, 450, 200, 60);
		
		//Custom border
		logoutButton.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));

        // Add Buttons to Frame
        add(viewBillButton);
        add(payBillButton);
        add(historyButton);
        add(logoutButton);

        // Button Actions - Open New Windows
        viewBillButton.addActionListener(e -> new ViewBill());
        payBillButton.addActionListener(e -> new PayBill());
        historyButton.addActionListener(e -> new PaymentHistory());

        // Logout Action - Return to Login Page
        logoutButton.addActionListener(e -> {
            new LoginPage();
            dispose();
        });

        setVisible(true);
    }
}
