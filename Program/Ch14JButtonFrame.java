
package ch14jbuttonframe;

import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Ch14JButtonFrame extends JFrame{

    private static final int FRAME_WIDTH    = 500;
    private static final int FRAME_HEIGHT   = 300;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250; 
    
    private JButton cancelButton;
    private JButton okButton;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Ch14JButtonFrame frame = new Ch14JButtonFrame();
        frame.setVisible(true);
    }
    public Ch14JButtonFrame(){
        Container contenPane = getContentPane();
        
        setSize     (FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setTitle    ("Program Ch14JButtonFrame");
        setLocation (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        
        //set the layout manager
        contenPane.setLayout(new FlowLayout());
        
        //create andplace two buttons on the frame's content pane
        okButton = new JButton("OK");
        contenPane.add(okButton);
        cancelButton = new JButton("CANCLE");
        contenPane.add(cancelButton);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
