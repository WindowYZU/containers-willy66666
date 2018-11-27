/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.containers;

import java.awt.BorderLayout;
import java.io.File;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class SplashScreenSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        JFrame frame=new JFrame();
        JWindow window = new JWindow();
        File file = new File("120430.gif");
        ImageIcon icon = new ImageIcon(file.toURI().toURL());
        window.setLayout(new BorderLayout());
        window.getContentPane().add(new JLabel(icon));
        window.setSize(500, 500);
        window.setLocationRelativeTo(null);
        JProgressBar bar = new JProgressBar();
        bar.setIndeterminate(true);
        window.getContentPane().add(bar, "South");
        
        
        //////////////////////////////////////////////////////
        
        Thread t=new Thread(){
            public void run(){
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(SplashScreenSample.class.getName()).log(Level.SEVERE, null, ex);
                }
                window.setVisible(false);
                frame.setVisible(true);
            }
        };
        t.start();
        window.setVisible(true);
    }
    
}
