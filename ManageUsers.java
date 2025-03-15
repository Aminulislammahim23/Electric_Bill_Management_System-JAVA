import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class ManageUsers extends JFrame {
    private DefaultListModel<String> userModel;
    private JList<String> userList;
    private Map<String, String> users;

    public ManageUsers() {
        setTitle("Manage Users");
        setSize(600, 500);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel titleLabel = new JLabel("Manage Users", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBounds(200, 20, 200, 40);
        add(titleLabel);

        users = new HashMap<>();
        users.put("user1", "pass1");
        users.put("user2", "pass2");
        users.put("user3", "pass3");
        users.put("user4", "pass4");
        users.put("user5", "pass5");

        userModel = new DefaultListModel<>();
        for (String user : users.keySet()) {
            userModel.addElement(user);
        }

        userList = new JList<>(userModel);
        JScrollPane scrollPane = new JScrollPane(userList);
        scrollPane.setBounds(50, 80, 200, 300);
        add(scrollPane);

        JTextField newUserField = new JTextField();
        newUserField.setBounds(300, 80, 200, 30);
        add(newUserField);

        JButton addUserButton = new JButton("Add User");
        addUserButton.setBounds(300, 120, 200, 30);
        add(addUserButton);

        JButton deleteUserButton = new JButton("Delete User");
        deleteUserButton.setBounds(300, 160, 200, 30);
        add(deleteUserButton);

        // Add User Logic
        addUserButton.addActionListener(e -> {
            String newUser = newUserField.getText().trim();
            if (!newUser.isEmpty() && !users.containsKey(newUser)) {
                users.put(newUser, "default123"); // Default password
                userModel.addElement(newUser);
                JOptionPane.showMessageDialog(this, "User Added!");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid or Existing User!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Delete User Logic
        deleteUserButton.addActionListener(e -> {
            String selectedUser = userList.getSelectedValue();
            if (selectedUser != null) {
                users.remove(selectedUser);
                userModel.removeElement(selectedUser);
                JOptionPane.showMessageDialog(this, "User Deleted!");
            } else {
                JOptionPane.showMessageDialog(this, "Select a User to Delete!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        setVisible(true);
    }
}
