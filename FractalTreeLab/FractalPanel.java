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
        if (order == 1)
        {
            g2.drawLine(x1, y1, x2, y2);
        }
        else
        {

        }
    }
    
    public void paintComponent(Graphics g2)
    {
        super.paintComponent(g2);
        
        g2.setColor(Color.green);
        
        drawFractal(this.order, this.TOPX, this.TOPY, this.BOTX, this.BOTY, g2);
    }
    
    public void setOrder(int order)
    {
        this.order = order;
    }
    
    public int getOrder()
    {
        return this.order;
    }
}