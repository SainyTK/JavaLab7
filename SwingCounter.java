import javax.swing.*;
import java.awt.*;

public class SwingCounter extends JFrame{

	private JLabel jlCount;
	private JTextField jtfCount;
	private JButton jbCount;

	public SwingCounter()
	{
		super("Swing Counter");

		jlCount = new JLabel("Counter");
		jtfCount = new JTextField(10);
		jbCount = new JButton("count");

		Container c = getContentPane();

		c.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));

		c.add(jlCount);
		c.add(jtfCount);
		c.add(jbCount);
	}
}

