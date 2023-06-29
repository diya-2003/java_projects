import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class p2 extends JFrame
{
     Container c;
     JLabel l1,l2,l3;
     JTextField t1,t2;
     JComboBox<String> cbox;
     JButton b1,b2;

    public p2()
    {
        setTitle("Temperature Converter");
        setSize(400, 300);
        setLocation(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c=getContentPane();
        c.setLayout(null);
        component();
    }
    public void component()
    {
        l3 = new JLabel("Result");
        l3.setBounds(20, 150, 100, 20);
        c.add(l3);

        l1 = new JLabel("Enter temperature");
        l1.setBounds(20, 50, 200, 20);
        c.add(l1);

        l2 = new JLabel("Convert temperature");
        l2.setBounds(20, 100, 200, 20);
        c.add(l2);

       t1=new JTextField();
       t1.setBounds(180,50,120,20);
       c.add(t1);

       t2=new JTextField();
        t2.setBounds(180, 150, 180, 20);
        t2.setEditable(false);
       c.add(t2);

       String[] s={"Celsius","Fahrenheit","Kelvin"};
       cbox=new JComboBox<String>(s);
       cbox.setBounds(180, 100, 100, 20);
       c.add(cbox);

       b1=new JButton("Clear");
        b1.setBounds(20, 200, 100, 30);
       c.add(b1);
       b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) 
            {
                t1.setText("");
                t2.setText("");
            }});

       b2=new JButton("Convert");
       b2.setBounds(140, 200, 100, 30);
       c.add(b2);   
       b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                try {
                convertTemperature();
                }catch (NumberFormatException ex) 
                {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number");
                }catch (Exception ex) 
                {
                    JOptionPane.showMessageDialog(null, "Please enter a number with no more than 2 digits after the decimal point");
                }  
       }});

       setVisible(true);
    }
    private void convertTemperature() throws Exception{
        String input = t1.getText();
        String unit = (String) cbox.getSelectedItem();
        double temperature = Double.parseDouble(input);
        double convertedTemperature = 0;
        switch (unit) 
            {
             case "Celsius":
                convertedTemperature = celsiusToFahrenheit(temperature);
             break;
             case "Fahrenheit":
                convertedTemperature = fahrenheitToCelsius(temperature);
             break;
             case "Kelvin":
                convertedTemperature = kelvinToCelsius(temperature);
             break;
            }

            if (input.contains(".") && input.split("\\.")[1].length() > 2) 
            {
                JOptionPane.showMessageDialog(null, "Please enter a number with no more than 2 digits after the decimal point");
                return;
            }
            t2.setText("" + convertedTemperature);
    }

    private double celsiusToFahrenheit(double celsius) 
    {
        return (celsius * 9 / 5) + 32;
    }
    private double fahrenheitToCelsius(double fahrenheit) 
    {
        return (fahrenheit - 32) * 5 / 9;
    }
    private double kelvinToCelsius(double kelvin) 
    {
        return kelvin - 273.15;
    }
}
class project2{
public static void main(String[] args) 
{
    p2 p=new p2();
}}
