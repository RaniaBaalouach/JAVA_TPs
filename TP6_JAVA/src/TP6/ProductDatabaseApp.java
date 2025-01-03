// File: src/main/java/com/example/ProductDatabaseApp.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.SwingUtilities;

public class ProductDatabaseApp extends JFrame {
    private JTextField txtID, txtName, txtPrice;
    private JButton btnPrev, btnNext, btnRefresh, btnSearch;
    private JLabel lblStatus;
    private Connection conn;
    private ResultSet rs;

    public ProductDatabaseApp() {
        setTitle("Product Database");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
        connectDatabase();
        loadFirstRecord();
    }

    private void initComponents() {
        setLayout(new GridLayout(6, 2));

        // Labels and Text Fields
        add(new JLabel("ID:"));
        txtID = new JTextField();
        txtID.setEditable(false);
        add(txtID);

        add(new JLabel("Name:"));
        txtName = new JTextField();
        add(txtName);

        add(new JLabel("Price:"));
        txtPrice = new JTextField();
        add(txtPrice);

        // Buttons
        btnPrev = new JButton("<<");
        btnPrev.addActionListener(e -> navigateRecords(false));
        add(btnPrev);

        btnNext = new JButton(">>");
        btnNext.addActionListener(e -> navigateRecords(true));
        add(btnNext);

        btnSearch = new JButton("Search");
        btnSearch.addActionListener(e -> searchRecord());
        add(btnSearch);

        btnRefresh = new JButton("Refresh");
        btnRefresh.addActionListener(e -> loadFirstRecord());
        add(btnRefresh);

        lblStatus = new JLabel("Status: Ready");
        add(lblStatus);
    }

    private void connectDatabase() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProductDB", "root", "password");
            lblStatus.setText("Connected to database");
        } catch (SQLException e) {
            lblStatus.setText("Database connection failed");
            e.printStackTrace();
        }
    }

    private void loadFirstRecord() {
        try {
            if (conn != null) {
                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                rs = stmt.executeQuery("SELECT * FROM PRODUIT");
                if (rs.next()) {
                    displayCurrentRecord();
                } else {
                    lblStatus.setText("No records found");
                }
            }
        } catch (SQLException e) {
            lblStatus.setText("Error loading records");
            e.printStackTrace();
        }
    }

    private void navigateRecords(boolean next) {
        try {
            if (rs != null) {
                if (next ? rs.next() : rs.previous()) {
                    displayCurrentRecord();
                } else {
                    lblStatus.setText("No more records");
                    if (next) rs.previous(); else rs.next();
                }
            }
        } catch (SQLException e) {
            lblStatus.setText("Navigation error");
            e.printStackTrace();
        }
    }

    private void displayCurrentRecord() throws SQLException {
        txtID.setText(String.valueOf(rs.getInt("ID")));
        txtName.setText(rs.getString("NAME"));
        txtPrice.setText(String.valueOf(rs.getDouble("PRICE")));
        lblStatus.setText("Record loaded");
    }

    private void searchRecord() {
        try {
            String searchText = txtName.getText();
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM PRODUIT WHERE NAME = ? OR ID = ?");
            pstmt.setString(1, searchText);
            pstmt.setString(2, searchText);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                displayCurrentRecord();
            } else {
                lblStatus.setText("Record not found");
            }
        } catch (SQLException e) {
            lblStatus.setText("Search error");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ProductDatabaseApp app = new ProductDatabaseApp();
            app.setVisible(true);
        });
    }
}
