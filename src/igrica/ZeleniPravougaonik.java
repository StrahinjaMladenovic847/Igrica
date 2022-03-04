package igrica;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
public class ZeleniPravougaonik extends Component{
    
    public ZeleniPravougaonik(){
    
    }
    
    
    @Override
    public void paint(Graphics g){
        
    Graphics2D g2 = (Graphics2D)g;
    g.translate(150, 100);
    g.drawRect(90, 50, 90, 50);
    g.setColor(Color.green);
    g.fillRect(90, 50, 90, 50);
    
    }
    
}
