import java.awt.*;
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
    
    public void paintComponent(Graphics2D g2)
    {
        super.paintComponent(g2);
        
        g2.setColor(Color.GREEN);
        
    }
}