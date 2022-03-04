package igrica;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class PlaviKrug extends Component{
    public PlaviKrug(){
    
    }
    @Override
    
public void paint(Graphics g){
    Graphics2D g2 = (Graphics2D)g;
    g2.translate(150,100);
    g2.drawOval(-50,-50,200,200);
    g2.setColor(Color.blue);
    g2.fillOval(-50,-50,200,200);
}}
       
   
    
    

    
    
