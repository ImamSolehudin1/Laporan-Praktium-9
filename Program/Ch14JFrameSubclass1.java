
package ch14jframesubclass1;

import javax.swing.JFrame;
//import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class Ch14JFrameSubclass1 extends JFrame {

    private static final int FRAME_WIDTH    = 300;
    private static final int FRAME_HEIGHT   = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;

    public Ch14JFrameSubclass1() {
        
        // set the frame default properties
        setTitle    ("My First Subclass");
        setSize     (FRAME_WIDTH, FRAME_HEIGHT);
        setLocation (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        
        // register 'exit upon closing' as a default close operation
        setVisible(true);
        setDefaultCloseOperation( EXIT_ON_CLOSE);
        
    }
    
}
