import java.io.*;

public class LabGUI{

	public static void main(String[] args)
	{
		// TemperatureConverter s = new TemperatureConverter();
		SwingCalculator s = new SwingCalculator();
		s.setLocationRelativeTo(null);
		s.setDefaultCloseOperation(s.EXIT_ON_CLOSE);
		s.setSize(200,200);
		s.setVisible(true);
	}
}