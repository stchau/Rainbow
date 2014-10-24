// Chapter 6 Question 19

// ________________________________________________

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rainbow extends JPanel 
{
  private final Color skyColor = Color.CYAN;
  
  public Rainbow()
  {
    setBackground(skyColor);
  }

  // Draws the rainbow.
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    int width = getWidth();    
    int height = getHeight();

    int xCenter = (int)((double)width/2); // the xcenter formula
    int yCenter = (int)((double)height*3/4);//the ycenter formula
    int largeRadius=(int)((double)width/4);// large radius
   
    int smallRadius=(int)((double)height/4);//makes smallest radius
    int mediumRadius=(int)((double)Math.sqrt(smallRadius*largeRadius)); //makes medium radius
    int teenyRadius=(int)((double)width/11); //makes the smallest radius
    
    // Declare and initialize local int variables xCenter, yCenter
    // that represent the center of the rainbow rings:
    // ________________________________________________
 
    // Declare and initialize the radius of the large semicircle:
    // __________________s______________________________
    

    g.setColor(Color.RED); //makes this arc red

    // Draw the large semicircle:
    // g.fillArc( ______________ );
    g.fillArc(xCenter-largeRadius, yCenter-largeRadius,largeRadius*2,largeRadius*2,0,180); // the paramters

    // Declare and initialize the radii of the small and medium
    // semicircles and draw them:
    // ________________________________________________
    g.setColor(Color.GREEN);//makes color green
    g.fillArc(xCenter-mediumRadius,yCenter-mediumRadius,mediumRadius*2,mediumRadius*2,0,180); //the parameters
    
    
    g.setColor(Color.MAGENTA); //makes color magneta
    g.fillArc(xCenter-smallRadius,yCenter-smallRadius,smallRadius*2,smallRadius*2,0,180);//the parameters
    
    
    g.setColor(skyColor);//makes color same as the skey color
    g.fillArc(xCenter-teenyRadius,yCenter-teenyRadius,teenyRadius*2,teenyRadius*2,0,180);//the parameters
    // Calculate the radius of the innermost (sky-color) semicircle
    // so that the width of the middle (green) ring is the
    // arithmetic mean of the widths of the red and magenta rings:
    // ________________________________________________
  
   
    // Draw the sky-color semicircle:
    // ________________________________________________
    
    
    
  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Rainbow");	
    w.setBounds(300, 300, 300, 200);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new Rainbow());
    w.setVisible(true);
  }
}
