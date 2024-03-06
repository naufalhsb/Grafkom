import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jantung extends JPanel implements ActionListener {

    private int xPosition = 50;
    private int yPosition = 250;
    private int heartSize = 50;
    private int deltaX = 3;
    private int deltaY = 3;
    private Timer timer;

    public jantung() {
        timer = new Timer(50, this);
        timer.start();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Draw the line
        g2d.setColor(Color.BLACK);
        g2d.drawLine(50, 250, 350, 250);

        // Draw the heart
        g2d.setColor(Color.RED);
        g2d.fillOval(xPosition, yPosition, heartSize, heartSize);
        g2d.fillOval(xPosition + heartSize / 2, yPosition, heartSize, heartSize);
        int[] xPoints = { xPosition, xPosition + heartSize / 2, xPosition + heartSize };
        int[] yPoints = { yPosition + heartSize, yPosition, yPosition + heartSize };
        g2d.fillPolygon(xPoints, yPoints, 3);
    }

    public void actionPerformed(ActionEvent e) {
        // Move the heart along the line
        xPosition += deltaX;
        yPosition += deltaY;
        if (xPosition <= 50 || xPosition >= 350 - heartSize) {
            deltaX = -deltaX;
        }
        if (yPosition <= 200 || yPosition >= 300 - heartSize) {
            deltaY = -deltaY;
        }
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Animasi Detak Jantung");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new jantung());
        frame.setVisible(true);
    }
}
