import javax.swing.*;
import java.awt.*;

public class ViewReports extends JFrame {
    public ViewReports() {
        setTitle("View Reports");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Billing Reports", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(titleLabel, BorderLayout.NORTH);

        JTextArea reportArea = new JTextArea(
                "January 2025 - Total Revenue: $500\n" +
                "February 2025 - Total Revenue: $600\n" +
                "March 2025 - Total Revenue: $550"
        );

        reportArea.setFont(new Font("Arial", Font.PLAIN, 18));
        reportArea.setEditable(false);
        add(new JScrollPane(reportArea), BorderLayout.CENTER);

        setVisible(true);
    }
}
