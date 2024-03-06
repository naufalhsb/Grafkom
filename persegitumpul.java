
import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class persegitumpul extends JComponent {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Rounded Rectangle Demo");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(new persegitumpul(), BorderLayout.CENTER);
        frame.pack();
        frame.setSize(420, 300);
        frame.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        g2.setPaint(Color.BLACK);
        g2.setStroke(new BasicStroke(2.0f));

        double x = 50;
        double y = 50;
        double w = x + 250;
        double h = y + 100;
        g2.draw(new RoundRectangle2D.Double(x, y, w, h, 50, 50));
    }
}