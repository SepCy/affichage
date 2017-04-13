

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;
import java.awt.*;

public class PointDialog extends JDialog implements ActionListener
{
	private Point P;
	JButton OK,Cancel;
	JLabel textX,textY;
	JTextField editX,editY;
	
	PointDialog(JFrame f,String s,Point P)
	{
    super(f,s,true);
    this.P=P;
    setLocationRelativeTo(f);
    setBounds(500,100,400,200);
    setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
    
    Container c=getContentPane();
    c.setLayout(null);
    
    textX=new JLabel("Abscisse du point :");
    textX.setBounds(10,20,120,20);
    c.add(textX);
    
    textY=new JLabel("Ordonnée du point :");
    textY.setBounds(10,50,120,20);
    c.add(textY);
    
    editX=new JTextField(20);
	editX.setBounds(140,20,100,20);
	c.add(editX);
	
	editY=new JTextField(20);
	editY.setBounds(140,50,100,20);
	c.add(editY);
	
	Border bord=BorderFactory.createRaisedBevelBorder();
	OK=new JButton("OK");
	OK.setActionCommand("OK");
	OK.addActionListener(this);
	OK.setBorder(bord);
	OK.setBounds(260,25,60,20);
	c.add(OK);
	
	Cancel=new JButton("Annuler");
	Cancel.setActionCommand("CANCEL");
	Cancel.addActionListener(this);
	Cancel.setBorder(bord);
	Cancel.setBounds(260,50,60,20);
	c.add(Cancel);
	
	ShowPoint();
	}
	
	private void ShowPoint()
	{
		editX.setText(String.valueOf(P.getX()));	
		editY.setText(String.valueOf(P.getY()));	
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
	double x,y;
	if(e.getActionCommand().equals("OK"))
			{
		boolean ok=true;

		if(ok)	{
			 try{
				 x=Double.parseDouble(editX.getText());
				}catch(RuntimeException ex)
				{x=P.getX();editX.setText(String.valueOf(x));ok=false;}
				
				try{
					 y=Double.parseDouble(editY.getText());
					}catch(RuntimeException ex)
			

		{y=P.getY();editY.setText(String.valueOf(y));ok=false;}
				if(ok)
					{
					P.setXY(x,y);
					dispose();
					}
				}
		}
		else if(e.getActionCommand().equals("CANCEL"))
			{
			dispose();
			}
	}
	
}

