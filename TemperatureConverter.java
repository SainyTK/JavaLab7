import javax.swing.*;
import java.awt.*;

public class TemperatureConverter extends JFrame
{
	private JLabel jlCelcius;
	private JLabel jlFarenheit;
	private JTextField jtfCelcius;
	private JTextField jtfFarenheit;

	public TemperatureConverter()
	{
		super("Temperature Converter");

		jlCelcius = new JLabel("Celcius:");
		jlFarenheit = new JLabel("Farenheit:");
		jtfCelcius = new JTextField(10);
		jtfFarenheit = new JTextField(10);

		setLayout(new GridLayout(2,2));

		add(jlCelcius);
		add(jtfCelcius);
		add(jlFarenheit);
		add(jtfFarenheit);
	}
}