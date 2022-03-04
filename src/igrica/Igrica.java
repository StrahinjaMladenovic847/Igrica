package igrica;

import java.util.Scanner;
import javax.swing.JFrame;



public class Igrica {


    public static void main(String[] args) throws InterruptedException {
        
       
        JFrame f1 = new JFrame();
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setSize(400,400);
        f1.setLocation(200,200);
        f1.add(new CrniKrug());
        f1.setVisible(true);
        
        Thread.sleep(2000);
        f1.dispose();
        
        
        
        JFrame f2 = new JFrame();
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setSize(400,400);
        f2.setLocation(200,200);
        f2.add(new PlaviKrug());
        f2.setVisible(true);
        
        Thread.sleep(2000);
        f2.dispose();
        
        
        JFrame f3 = new JFrame();
        f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f3.setSize(400, 400);
        f3.setLocation(200, 200);
        f3.add(new ZeleniPravougaonik());
        f3.setVisible(true);
        
        Thread.sleep(2000);
        f3.dispose();
        
        JFrame f4 = new JFrame();
        f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f4.setSize(400, 400);
        f4.setLocation(200, 200);
        f4.add(new ZutiKvadrat());
        f4.setVisible(true);
        
        Thread.sleep(2000);
        f4.dispose();
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Koliko plavih krugova ste videli");
         int n = s.nextInt();
         if (n==1)
             System.out.println("Cestitamo");
         else
             System.out.println("Pogresan odgovor");
        
        
        
    }
    
}
