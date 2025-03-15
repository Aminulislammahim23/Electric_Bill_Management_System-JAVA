import javax.swing.*;
import java.awt.*;

public class PaymentHistory extends JFrame {
    public PaymentHistory() {
        setTitle("Payment History");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Your Payment History", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(titleLabel, BorderLayout.NORTH);

        JTextArea historyArea = new JTextArea("March 2025: $100 - Paid\nFebruary 2025: $95 - Paid\nJanuary 2025: $90 - Paid");
        historyArea.setFont(new Font("Arial", Font.PLAIN, 18));
        historyArea.setEditable(false);
        add(historyArea, BorderLayout.CENTER);

        setVisible(true);
    }
}
