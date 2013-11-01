import java.applet.*;
import java.awt.*;

public class applets extends Applet {


	public void init() {
		// TODO Auto-generated method stub

	}
	public void stop(){
		
	}
	public void paint(Grapics g){
		
		g.setColor(Color.BLACK);
		g.fillOval(0,0,20,40);
		
		g.setColor(Color.YELLOW);
		g.drawRect(20,50,40,60);
		
		g.setColor(Color.GREEN);
		g.fillRect(0,40,50,10);
	}

}
