import java.applet.Applet;
import java.awt.Graphics;
public class bmu extends Applet{
    public void paint(Graphics g){
        for(double i=0;i<=62.83;i+=0.1){
            g.drawline((int)(20*i), 100-(int)(20*Math.sin(i)), (int)(20*(i+0.1)), 100-(int)(20*Math.sin(i+0.1) )));
        }
    }
}