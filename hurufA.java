import java.awt.*;
import java.awt.geom.*;

/**
 * The letter A is defined by a GeneralPath and the letter and the
 * control points are drawn.
 *
 * @author Frank Klawonn
 *         Last change 01.02.2005
 */
public class hurufA extends Frame {

    // Constructor
    public hurufA() {
        // Enables the closing of the window.
        addWindowListener(new MyFinishWindow());
    }

    public void paint(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        // Use of antialiasing to have nicer lines.
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // The lines should have a thickness of 3.0 instead of 1.0.
        BasicStroke bs = new BasicStroke(3.0f);
        g2d.setStroke(bs);

        // The control points for defining the letter.
        int xa1 = 50;
        int ya1 = 300;

        int xa2 = 200;
        int ya2 = 50;

        int xa3 = 350;
        int ya3 = 300;

        int xa4 = 275;
        int ya4 = 250;

        int xa5 = 125;
        int ya5 = 250;

        // Definition and drawing of the lines that define the letter.
        g2d.drawLine(xa1, ya1, xa2, ya2);
        g2d.drawLine(xa2, ya2, xa3, ya3);
        g2d.drawLine(xa4, ya4, xa5, ya5);

        // Draw the control points.
        drawSmallRect(xa1, ya1, g2d);
        drawSmallRect(xa2, ya2, g2d);
        drawSmallRect(xa3, ya3, g2d);
        drawSmallRect(xa4, ya4, g2d);
        drawSmallRect(xa5, ya5, g2d);

        // Label the control points.
        g2d.setFont(new Font("serif", Font.PLAIN, 24));
        g2d.drawString("P1", xa1 + 5, ya1);
        g2d.drawString("P2", xa2 - 40, ya2 - 10);
        g2d.drawString("P3", xa3 + 10, ya3);
        g2d.drawString("P4", xa4 - 20, ya4 + 10);
        g2d.drawString("P5", xa5 + 10, ya5 + 10);
    }

    /**
     * Draws a small square around the centre (x,y).
     *
     * @param x   x-coordinate of the centre
     * @param y   y-coordinate of the centre
     * @param g2d Graphics2D object for drawing
     */
    public static void drawSmallRect(int x, int y, Graphics2D g2d) {
        Rectangle rect = new Rectangle(x - 4, y - 3, 8, 8);
        g2d.fill(rect);
    }

    public static void main(String[] argv) {
        hurufA f = new hurufA();
        f.setTitle("Huruf A");

        f.setSize(420, 450);
        f.setVisible(true);
    }

}
