import javax.swing.*;
import java.awt.*;

public class PayBill extends JFrame {
    public PayBill() {
        setTitle("Pay Bill");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2, 10, 10));

        JLabel amountLabel = new JLabel("Enter Amount:");
        JTextField amountField = new JTextField();

        JLabel cardLabel = new JLabel("Card Number:");
        JTextField cardField = new JTextField();

        JButton payButton = new JButton("Pay Now");

        payButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Payment Successful!", "Success", JOptionPane.INFORMATION_MESSAGE));

        add(amountLabel);
        add(amountField);
        add(cardLabel);
        add(cardField);
        add(new JLabel());  // Empty placeholder
        add(payButton);

        setVisible(true);
    }
}
