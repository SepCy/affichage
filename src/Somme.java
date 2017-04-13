

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class Somme extends JFrame implements ActionListener
{
	
	private JLabel textX,textY,textS;
	private JTextField editX,editY,editS;
	private JButton buCompute;
	double x,y,s;
	
	public static void main(String [] args)
	{
	Somme a=new Somme();
	}

	Somme()
	{
		x=0;
		y=0;
		setBounds(10,20,400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c;
		c=getContentPane();

		BorderLayout bl=new BorderLayout();
		c.setLayout(bl);
		

		JPanel p=new JPanel();
		p.setLayout(null);

		textX= new JLabel("Valeur de X : ");
		textX.setBounds(10,20,100,20);
		p.add(textX);
		
		textY= new JLabel("Valeur de Y : ");
		textY.setBounds(10,50,100,20);
		p.add(textY);
		
		textS= new JLabel("X+Y vaut : ");
		textS.setBounds(10,80,100,20);
		p.add(textS);
		
		editX=new JTextField(20);
		editX.setBounds(120,20,100,20);
		p.add(editX);
		
		editY=new JTextField(20);
		editY.setBounds(120,50,100,20);
		p.add(editY);
		
		editS=new JTextField(20);
		editS.setBounds(120,80,100,20);
		editS.setEditable(false);
		p.add(editS);
		
		Border bord=BorderFactory.createRaisedBevelBorder();
		buCompute=new JButton("CALCULER");
		buCompute.setActionCommand("CALCULER");
		buCompute.addActionListener(this);
		buCompute.setBorder(bord);
		buCompute.setBounds(240,50,100,20);
		
		p.add(buCompute);
		
		c.add(p, BorderLayout.CENTER);
		setVisible(true);
	}
	

	public void actionPerformed(ActionEvent e)
	{
	if(e.getActionCommand().equals("CALCULER"))
			{
		double vx,vy,d1;
		try{
			 vx=Double.parseDouble(editX.getText());
			}catch(RuntimeException ex)
			{vx=x;editX.setText(String.valueOf(x));}
		try{
			 vy=Double.parseDouble(editY.getText());
			}catch(RuntimeException ex)
			{vy=y;editY.setText(String.valueOf(y));}
			x=vx;
			y=vy;
			s=x+y;
			editS.setText(String.valueOf(s));
			}
	}
}
