import javax.swing.*;
import java.awt.*;

public class FractalTreeViewer
{
    private final int WIDTH = 450;
    private final int HEIGHT = 500;
    
    private final int MIN = 1, MAX = 5;
    
    private JButton increase, decrease;
    private JLabel titleLabel, orderLabel;
    private FractalPanel drawing;
    private JPanel panel, tools;
    private JFrame frame;
    
    public static void main(String[] args)
    {
        FractalTreeViewer viewer = new FractalTreeViewer();
    }
    
    public FractalTreeViewer()
    {
        this.tools = new JPanel();
        this.tools.setLayout(new BoxLayout(tools, BoxLayout.X_AXIS));
        this.tools.setBackground(Color.yellow);
        this.tools.setOpaque(true);
        
        this.titleLabel = new JLabel("The Fractal Tree");
        this.titleLabel.setForeground(Color.black);
        
        this.orderLabel = new JLabel("Order: 1");
        this.orderLabel.setForeground(Color.black);
        
        this.tools.add(titleLabel);
        this.tools.add(Box.createHorizontalStrut (20));
        //this.tools.add(decrease);
        //this.tools.add(increase);
        this.tools.add(Box.createHorizontalStrut (20));
        this.tools.add(orderLabel);
        
        this.drawing = new FractalPanel(1);
        
        this.panel = new JPanel();
        this.panel.add (tools);
        this.panel.add (drawing);
        
        this.frame = new JFrame();
        this.frame.setTitle("Fractal Tree");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setSize(WIDTH, HEIGHT);
        this.frame.add(panel);
        this.frame.setVisible(true);
    }
}