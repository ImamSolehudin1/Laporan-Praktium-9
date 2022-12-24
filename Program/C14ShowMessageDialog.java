
package c14showmessagedialog;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class C14ShowMessageDialog {

    public static void main(String[] args) {
        // TODO code application logic here
        JFrame form = new JFrame("Message");
        form.setSize(400, 550);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setVisible(true);
        
        JOptionPane.showMessageDialog(null,"one\ntwo\nthree");
        JOptionPane.showInputDialog(null,"What is your name ?");
        String input;
        input = JOptionPane.showInputDialog(null, "What is your name?");
    }
    
}
