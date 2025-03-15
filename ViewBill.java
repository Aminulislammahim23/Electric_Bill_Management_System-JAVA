import javax.swing.*;
import java.awt.*;

public class ViewBill extends JFrame {
    public ViewBill() {
        setTitle("View Bill");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Your Bill Details", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(titleLabel, BorderLayout.NORTH);

        JTextArea billDetails = new JTextArea("Bill Amount: $100\nDue Date: 25th March 2025\nStatus: Unpaid");
        billDetails.setFont(new Font("Arial", Font.PLAIN, 18));
        billDetails.setEditable(false);
        add(billDetails, BorderLayout.CENTER);

        setVisible(true);
    }
}
