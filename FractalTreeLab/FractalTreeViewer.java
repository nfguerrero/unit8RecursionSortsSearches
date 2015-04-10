import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FractalTreeViewer implements ActionListener
{
    private final int WIDTH = 450;
    private final int HEIGHT = 500;
    
    private final int MIN = 1, MAX = 9;
    
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
        
        this.increase = new JButton(new ImageIcon ("increase.gif"));
        this.increase.setMargin(new Insets (0, 0, 0, 0));
        this.increase.addActionListener(this);
        this.decrease = new JButton(new ImageIcon ("decrease.gif"));
        this.decrease.setMargin(new Insets (0, 0, 0, 0));
        this.decrease.addActionListener(this);
        
        this.orderLabel = new JLabel("Order: 1");
        this.orderLabel.setForeground(Color.black);
        
        this.tools.add(titleLabel);
        this.tools.add(Box.createHorizontalStrut (20));
        this.tools.add(decrease);
        this.tools.add(increase);
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
    
    public void actionPerformed (ActionEvent event)
    {
        int order = drawing.getOrder();
        int angle = drawing.getAngle();
        
        if (event.getSource() == increase)
        {
            order++;
            angle += 30;
        }        
        else
        {
            order--;
            angle -= 30;
        }
        
        if (order >= MIN && order <= MAX)
        {
            orderLabel.setText ("Order: " + order);
            drawing.setOrder(order);
            drawing.setAngle(60+angle);
            frame.repaint();
        }
    }
}