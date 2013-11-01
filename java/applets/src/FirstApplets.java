import java.applet.*;
import java.awt.*;

public class FirstApplets extends Applet {

	public void init() {

	}

	public void stop() {

	}

	public void paint(Graphics g) {

		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 200, 400);

		g.setColor(Color.YELLOW);
		g.drawOval(40, 50, 90, 70);

		g.setColor(Color.GREEN);
		g.fillRect(25, 40, 50, 100);
	}

}
