package igrica;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
public class ZutiKvadrat extends Component{
    
    public ZutiKvadrat(){
    
    }
    
    
    @Override
    public void paint(Graphics g){
        
    Graphics2D g2 = (Graphics2D)g;
    g2.translate(150, 100);
    g2.draw3DRect(-50, -50, 200, 200, true);
    g2.setColor(Color.yellow);
    g2.fill3DRect(-50, -50, 200, 200, true);
    
    
    }
    
}
