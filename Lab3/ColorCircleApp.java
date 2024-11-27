package Lab3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorCircleApp {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Color Circle App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Create the dropdown menu for color selection
        String[] colors = {"Red", "Blue", "Green"};
        JComboBox<String> colorDropdown = new JComboBox<>(colors);

        // Create a panel to draw the circle
        CirclePanel circlePanel = new CirclePanel();

        // Create a label to display the selected color
        JLabel colorLabel = new JLabel("Selected Color: None", SwingConstants.CENTER);

        // Add an action listener to the dropdown menu
        colorDropdown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedColor = (String) colorDropdown.getSelectedItem();
                colorLabel.setText("Selected Color: " + selectedColor);

                // Update the circle's color based on the selection
                switch (selectedColor) {
                    case "Red":
                        circlePanel.setCircleColor(Color.RED);
                        break;
                    case "Blue":
                        circlePanel.setCircleColor(Color.BLUE);
                        break;
                    case "Green":
                        circlePanel.setCircleColor(Color.GREEN);
                        break;
                }
            }
        });

        // Add components to the frame
        frame.add(colorDropdown, BorderLayout.NORTH);
        frame.add(circlePanel, BorderLayout.CENTER);
        frame.add(colorLabel, BorderLayout.SOUTH);

        // Make the frame visible
        frame.setVisible(true);
    }
}

// A custom JPanel to draw the circle
class CirclePanel extends JPanel {
    private Color circleColor = null; // Initially no color

    // Set the color of the circle and repaint the panel
    public void setCircleColor(Color color) {
        this.circleColor = color;
        repaint(); // Trigger a repaint to update the circle's color
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Draw the circle
        int diameter = Math.min(getWidth(), getHeight()) / 2;
        int x = (getWidth() - diameter) / 2;
        int y = (getHeight() - diameter) / 2;

        if (circleColor != null) {
            g2d.setColor(circleColor);
            g2d.fillOval(x, y, diameter, diameter); // Fill the circle with the selected color
        } else {
            g2d.setColor(Color.BLACK);
            g2d.drawOval(x, y, diameter, diameter); // Just draw the outline if no color is selected
        }
    }
}

