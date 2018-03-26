import javax.swing.*;
import java.awt.*;

public class GuiComponents extends JFrame
{
	private JButton jbtn;
	private JCheckBox jchk;
	private JLabel jlbl;
	private JCheckBox jColor;
	private JTextField jtf;
	private JTextArea jtar;
	private JList<String> jlist;
	private JComboBox<String> jcb;
	private JRadioButton jrbtn;
	private JRadioButton jrbtn1;
	private JRadioButton jrbtn2;

	public GuiComponents()
	{
		super("GuiComponents");

		jbtn = new JButton("Button");
		jchk = new JCheckBox("",false);
		jlbl = new JLabel("Label");
		jColor = new JCheckBox("",false);
		jColor.setBackground(Color.RED);
		jtf = new JTextField(10);
		jtf.setText("Text Field");

		jtar = new JTextArea(10,20);
		jtar.setText("Text Area");

		String[] s = new String[10];
		for(int i=0;i<10;i++)
			s[i] = "Item " + (i+1);
		jlist = new JList<String>(s);
		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(100,52,130,50);
		scroll.setViewportView(jlist);

		jcb = new JComboBox<String>(new String[] {"Yes","No"});
		jrbtn = new JRadioButton("often");
		jrbtn1 = new JRadioButton("sometimes");
		jrbtn2 = new JRadioButton("never");

		Container c = getContentPane();

		c.setLayout(new FlowLayout(FlowLayout.LEFT,5,5));

		c.add(jbtn);
		c.add(jchk);
		c.add(jlbl);
		c.add(jColor);
		c.add(jtf);
		c.add(jtf);
		c.add(jtar);
		c.add(scroll);
		c.add(jcb);
		c.add(jrbtn);
		c.add(jrbtn1);
		c.add(jrbtn2);

		ButtonGroup group = new ButtonGroup();
		group.add(jrbtn);
		group.add(jrbtn1);
		group.add(jrbtn2);

		// this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setSize(1000,500);
		this.setVisible(true);
	}
}