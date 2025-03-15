import javax.swing.*;
import java.awt.*;

public class AdminDashboard extends JFrame {
    public AdminDashboard() {
        setTitle("Admin Dashboard");
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null); // Allows manual positioning of components

        // Title Label
        JLabel titleLabel = new JLabel("Admin Dashboard", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 40));
        titleLabel.setBounds(400, 50, 400, 50);
        add(titleLabel);

        // Buttons
        JButton manageUsersButton = new JButton("Manage Users");
        JButton viewReportsButton = new JButton("View Reports");
        JButton logoutButton = new JButton("Logout");

        // Set button properties
        Font buttonFont = new Font("Arial", Font.BOLD, 24);
        manageUsersButton.setFont(buttonFont);
        viewReportsButton.setFont(buttonFont);
        logoutButton.setFont(buttonFont);

        // Set button positions
        manageUsersButton.setBounds(450, 200, 300, 60);
        viewReportsButton.setBounds(450, 300, 300, 60);
        logoutButton.setBounds(450, 450, 300, 60);

        // Add buttons
        add(manageUsersButton);
        add(viewReportsButton);
        add(logoutButton);

        // Open Manage Users Window
        manageUsersButton.addActionListener(e -> new ManageUsers());

        // Open View Reports Window
        viewReportsButton.addActionListener(e -> new ViewReports());

        // Logout Action
        logoutButton.addActionListener(e -> {
            new LoginPage();
            dispose();
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new AdminDashboard();
    }
}
