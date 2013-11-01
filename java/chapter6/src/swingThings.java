import java.awt.*;
import javax.swing.*;


public class swingThings extends JFrame {
	// a simple swing program called by swingStuff
	private JLabel item1;
	
	public swingThings() {
		super("Title Text");
		setLayout(new FlowLayout() );
		
		item1 = new JLabel("Body Text");
		item1.setToolTipText("Hover Text");
		add(item1);
	}


}
