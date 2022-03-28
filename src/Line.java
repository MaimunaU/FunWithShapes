import java.awt.*;

public class Line extends Shape{
    public Line()
    {
        super();
    }

    @Override
    public void draw(Graphics g)
    {
        g.setColor(getColor());
        g.drawLine(getPoint1().x, getPoint1().y, getPoint2().x, getPoint2().y);
    }
}
