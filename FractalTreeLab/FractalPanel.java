import java.awt.geom.Line2D;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JPanel;

public class FractalPanel extends JPanel
{
    private final int PANEL_WIDTH = 400;
    private final int PANEL_HEIGHT = 400;
    
    private final int TOPX = 200, TOPY = 350;
    private final int BOTX = 200, BOTY = 400;
    
    private int order;
    private int angle = 0;
    
    public FractalPanel(int order)
    {
        this.order = order;
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
    }
    
    public void drawFractal(int order, int x1, int y1, int x2, int y2, int angle, Graphics g2)
    {
        int x3, y3, x4, y4, deltaAngle, newAngle, oldAngle;
        if (order == 1)
        {
            g2.drawLine(x1, y1, x2, y2);
        }
        else
        {
            double dist = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
            
            deltaAngle =  (int) Math.toRadians((int) angle);
            int height = (int) (dist*(Math.sin(deltaAngle)));
            int side = (int) (dist*(Math.cos(deltaAngle)));
            
            x3 = x2 + side;
            x4 = x2 - side;
            y3 = y1 - height;
            y4 = y1 - height;
            
            newAngle = this.angle+angle;
            oldAngle = this.angle-angle;
            
            drawFractal(order-1, x1, y1, x2, y2, oldAngle, g2);
            drawFractal(order-1, x1, y1, x3, y3, newAngle, g2);
            drawFractal(order-1, x1, y1, x4, y4, newAngle, g2);
        }
    }
    
    public void paintComponent(Graphics g2)
    {
        super.paintComponent(g2);
        
        g2.setColor(Color.green);
        
        drawFractal(this.order, this.TOPX, this.TOPY, this.BOTX, this.BOTY, this.angle, g2);
    }
    
    public void setOrder(int order)
    {
        this.order = order;
    }
    
    public int getOrder()
    {
        return this.order;
    }
    
    public void setAngle(int angle)
    {
        this.angle = angle;
    }
    
    public int getAngle()
    {
        return this.angle;
    }
}