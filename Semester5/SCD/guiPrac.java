
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
public class guiPrac {
    
    
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Hello");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(500, 200, 500, 300);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

        JButton b1 = new JButton("Page Start");
        JButton b2 = new JButton("Page_End");
        JButton b3 = new JButton("Line_Start");
        JButton b4 = new JButton("CNEter");
        JButton b5 = new JButton("Lines_End");
        
        f.getContentPane().add(b1);
        f.getContentPane().add(b2);
        f.getContentPane().add(b3);
        f.getContentPane().add(b4);
        f.getContentPane().add(b5);

        // FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
        // f.getContentPane().setLayout(fl);

        GridLayout g = new GridLayout(2,3);
        g.setHgap(20);
        g.setVgap(30);
        f.getContentPane().setLayout(g);



    }   

    
}
