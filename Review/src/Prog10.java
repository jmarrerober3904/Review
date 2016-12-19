// APCS1 Lab Test 2
//
// Prog10.java
//
// Hungry PAC-MAN
//
// Points: 4
//
//
////////////////////////////////////////////////////////////////////////////////
// Right now this program draws the classic arcade icon of PAC-MAN with 6 round
// snacks in front of him.
//
////////////////////////////////////////////////////////////////////////////////
// You need to animate this program so PAC-MAN actually "eats" his snacks.
// Packman needs to move from his current possition all the way to the other side
// of the screen.  (By using the "draw and erase" method, the snacks will also be
// erased and seem to be "eaten".)  The delay method is provided for you.
//
// THE SNACKS NEED TO DISAPPEAR "INSIDE" PAC-MAN'S MOUTH!  NOT IN FRONT OF HIM!
// "Flickering" is a normal side effect of the "draw and erase" method and is
// fine for this program.
//
// PAC-MAN's mouth will stay open the entire time.
//
//
////////////////////////////////////////////////////////////////////////////////
// NOTE: You will need to load Prog10.html in order to execute this file.
//
// ALSO: The sample exection of this file is on the back of your lab test sheet.
//
// ALSO: On some computers, the output will not show up until you move the mouse.



import java.awt.*;
import java.applet.*;


public class Prog10 extends Applet
{
	public void paint(Graphics g)
	{
		// draw maze
		g.setColor(Color.black);
		g.fillRect(0,0,800,600);
		g.setColor(Color.cyan);
		g.fillRect(0,80,800,20);
		g.fillRect(0,500,800,20);
		
		// draw 6 snacks
		g.setColor(Color.white);
		g.fillOval(200,260,80,80);
		g.fillOval(300,260,80,80);
		g.fillOval(400,260,80,80);
		g.fillOval(500,260,80,80);
		g.fillOval(600,260,80,80);
		g.fillOval(700,260,80,80);
		
		// draw PAC-MAN
	
  	}
	
	
	public void delay(int n)
	{
		long startDelay = System.currentTimeMillis();
		long endDelay = 0;
		while (endDelay - startDelay < n)
			endDelay = System.currentTimeMillis();	
	}	
}

