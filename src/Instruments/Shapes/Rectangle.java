package Instruments.Shapes;

import java.awt.*;

public class Rectangle extends RectShape{

    public Rectangle(Instruments.Shapes.Point start, Instruments.Shapes.Point finish) {
        super(start, finish);
    }

    public void draw(Graphics g) {
        g.setColor(this.borderColor);

        int x1 = leftTop.getX();
        int x2 = rightBottom.getX();
        int y1 = leftTop.getY();
        int y2 = rightBottom.getY();

        if (getHeight() == 0 || getWidth() == 0) {
            g.drawLine(x1, y1, x2, y2 );
        } else {
            g.drawLine(x1, y1, x2, y1);
            g.drawLine(x2, y1, x2, y2);
            g.drawLine(x2, y2, x1, y2);
            g.drawLine(x1, y2, x1, y1);
        }
    }
}