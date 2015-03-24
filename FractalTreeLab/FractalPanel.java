import java.awt.*;
import javax.swing.Line2D.Double;
import javax.swing.JPanel;

public class FractalPanel extends JPanel
{
    private final int PANEL_WIDTH = 400;
    private final int PANEL_HEIGHT = 400;
    
    private int order;
    
    public FractalPanel(int order)
    {
        this.order = order;
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
    }
    
    public void drawFractal(int order, int x1, int y1, int x2, int y2, Graphics2D g2)
    {
        if (order == 1)
        {
            Line2D.Double line = new Line2D.Double(x1, y1, x2, y2);
            g2.draw(line);
        }
        else
        {
            
        }
    }
    
    public void paintComponent(Graphics2D g2)
    {
        super.paintComponent(g2);
        
        g2.setColor(Color.green);
        
        drawFractal();
    }
}