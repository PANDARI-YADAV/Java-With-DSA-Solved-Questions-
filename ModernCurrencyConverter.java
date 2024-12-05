import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ModernCurrencyConverter {
    private JTextField amountField;
    private JComboBox<String> fromCurrency;
    private JComboBox<String> toCurrency;
    private JLabel resultLabel;

    public ModernCurrencyConverter() {
        JFrame frame = new JFrame("Currency Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Gradient Background Panel
        JPanel gradientPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                GradientPaint gradient = new GradientPaint(0, 0, new Color(173, 216, 230), getWidth(), getHeight(), new Color(255, 182, 193));
                g2d.setPaint(gradient);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        gradientPanel.setLayout(new GridBagLayout());
        frame.add(gradientPanel);

        // Main Panel for Components
        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setOpaque(false); // Transparent to show the gradient
        GridBagConstraints gbc = new GridBagConstraints();

        // Title Label
        JLabel titleLabel = new JLabel("Currency Converter");
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 28));
        titleLabel.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(10, 10, 30, 10);
        mainPanel.add(titleLabel, gbc);

        // Amount Input Field
        amountField = new JTextField(15);
        amountField.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        amountField.setBorder(new EmptyBorder(10, 10, 10, 10));
        amountField.setBackground(Color.WHITE);
        amountField.setForeground(Color.DARK_GRAY);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(10, 10, 10, 10);
        mainPanel.add(amountField, gbc);

        // From Currency Dropdown
        fromCurrency = new JComboBox<>(new String[]{"USD", "EUR", "GBP", "INR", "JPY", "KRW"});
        fromCurrency.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        fromCurrency.setBackground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        mainPanel.add(fromCurrency, gbc);

        // To Currency Dropdown
        toCurrency = new JComboBox<>(new String[]{"USD", "EUR", "GBP", "INR", "JPY", "KRW"});
        toCurrency.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        toCurrency.setBackground(Color.WHITE);
        gbc.gridx = 1;
        gbc.gridy = 2;
        mainPanel.add(toCurrency, gbc);

        // Convert Button
        JButton convertButton = new JButton("Convert");
        convertButton.setFont(new Font("Segoe UI", Font.BOLD, 16));
        convertButton.setForeground(Color.WHITE);
        convertButton.setBackground(new Color(72, 61, 139));
        convertButton.setFocusPainted(false);
        convertButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(20, 10, 10, 10);
        mainPanel.add(convertButton, gbc);

        // Result Label
        resultLabel = new JLabel("Output: ");
        resultLabel.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        resultLabel.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(10, 10, 10, 10);
        mainPanel.add(resultLabel, gbc);

        // Add Action Listener for Conversion
        convertButton.addActionListener(e -> convertCurrency());

        // Add mainPanel to gradientPanel
        gradientPanel.add(mainPanel);

        // Frame Settings
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void convertCurrency() {
        try {
            double amount = Double.parseDouble(amountField.getText());
            String from = (String) fromCurrency.getSelectedItem();
            String to = (String) toCurrency.getSelectedItem();

            // Simplified Conversion Logic
            double rate = getConversionRate(from, to);
            double result = amount * rate;
            resultLabel.setText("Output: " + String.format("%.2f %s", result, to));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter a valid amount!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private double getConversionRate(String from, String to) {
        // Hardcoded example rates for simplicity
        if (from.equals("USD") && to.equals("EUR")) return 0.95;
        if (from.equals("EUR") && to.equals("USD")) return 1.05;
        if (from.equals("USD") && to.equals("INR")) return 84.5;
        if (from.equals("INR") && to.equals("USD")) return 0.012;
        return 1; // Default (same currency)
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ModernCurrencyConverter::new);
    }
}