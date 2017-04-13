


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class Distance extends JFrame implements ActionListener
{
	
	private JLabel textXA,textYA,textXB,textYB,textDistance;
	private JTextField editXA,editXB,editYA,editYB,editDistance;
	private JButton editA,editB;
	private Point A,B;
	
	public static void main(String [] args)
	{
	Distance app=new Distance();
	}

	Distance()
	{
		setBounds(10,10,400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c;
		c=getContentPane();

		BorderLayout bl=new BorderLayout();
		c.setLayout(bl);
		

		JPanel p=new JPanel();
		p.setLayout(null);

		textXA= new JLabel("Abscisse de A : ");
		textXA.setBounds(10,20,100,20);
		p.add(textXA);
		
		textYA= new JLabel("Ordonnée de A : ");
		textYA.setBounds(10,50,100,20);
		p.add(textYA);
		
		textXB= new JLabel("Abscisse de B : ");
		textXB.setBounds(10,90,100,20);
		p.add(textXB);
		
		textYB= new JLabel("Ordonnée de B : ");
		textYB.setBounds(10,120,100,20);
		p.add(textYB);
		
		textDistance= new JLabel("La distance AB vaut : ");
		textDistance.setBounds(10,170,150,20);
		p.add(textDistance);
		
		editXA=new JTextField(20);
		editXA.setBounds(120,20,100,20);
		editXA.setEditable(false);
		p.add(editXA);
		
		editYA=new JTextField(20);
		editYA.setBounds(120,50,100,20);
		editYA.setEditable(false);
		p.add(editYA);
		
		
		editXB=new JTextField(20);
		editXB.setBounds(120,90,100,20);
		editXB.setEditable(false);
		p.add(editXB);
		
		editYB=new JTextField(10);
		editYB.setBounds(120,120,100,20);
		editYB.setEditable(false);
		p.add(editYB);
		
		editDistance=new JTextField(20);
		editDistance.setBounds(150,170,150,20);
		editDistance.setEditable(false);
		p.add(editDistance);
		
		Border bord=BorderFactory.createRaisedBevelBorder();
		editA=new JButton("MODIFIER A");
		editA.setActionCommand("EDITA");
		editA.addActionListener(this);
		editA.setBorder(bord);
		editA.setBounds(240,35,100,20);
		p.add(editA);
		
		editB=new JButton("MODIFIER B");
		editB.setActionCommand("EDITB");
		editB.addActionListener(this);
		editB.setBorder(bord);
		editB.setBounds(240,105,100,20);
		p.add(editB);
		
		
		
		c.add(p, BorderLayout.CENTER);
		setVisible(true);
		
		A=new Point();
		B=new Point();
		ShowPoint();
	}

	
	void ShowPoint()
	{
	editXA.setText(String.valueOf(A.getX()));	
	editYA.setText(String.valueOf(A.getY()));	
	editXB.setText(String.valueOf(B.getX()));	
	editYB.setText(String.valueOf(B.getY()));	
	editDistance.setText(String.valueOf(A.distance(B)));
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getActionCommand().equals("EDITA"))
		{
        PointDialog dialog=new PointDialog(this,"Modification du point A",A);
	 dialog.setVisible(true);
	 ShowPoint();
		}
		else
		if(e.getActionCommand().equals("EDITB"))
		{
		PointDialog dialog=new PointDialog(this,"Modification du point B",B);
		dialog.setVisible(true);
		ShowPoint();
		}
	}
}
