import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoonLite extends JFrame {
    JLabel screenTitle;
    JButton Click ;
    JLabel imglabel;

    public MoonLite(){
        super("MoonLite");
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(null);
        setLayout(null);

        Icon img= new ImageIcon("C:\\Users\\haris\\IdeaProjects\\MoonLight Theater 2.0\\src\\Images\\cinema.jpg");
        imglabel=new JLabel();
        imglabel.setIcon(img);
        imglabel.setSize(800,600);
        add(imglabel);

        Click = new JButton("Click me");
        Click.setBackground(Color.ORANGE);
        Click.setBounds(330,350,100,25);
        Click.setBorder(null);

        add(Click);
        Click.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StatusScreen();
                dispose();
            }
        });
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
