
import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Despacito extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Despacito();
        canvas.setSize(400, 400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        //g.fillOval(100, 100, 200, 200);
        g.drawArc(1, 60, 2, 2, 2, 60);
    }
}
