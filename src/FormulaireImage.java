


import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.*;
import java.net.*;

public class FormulaireImage {

   public static void main(String[] args) {
		JFrame f = new JFrame("Formulaire");
		JLayeredPane l = new JLayeredPane(); 
		l.setPreferredSize(new Dimension(150,150));
		JPanel pi = new JPanel() {
			public void paint(Graphics g) {
				try {
					URL ImageWB = new URL("http://upload.wikimedia.org/wikipedia/commons/6/64/Wikibooks-logo-fr.png");
					// ou bien mettez le lieb vers le logo en local
					BufferedImage image1 = ImageIO.read(ImageWB);
					g.drawImage(image1, 0, 0, null);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};
		pi.setBounds(10,10,150,150);	// FenÃªtre 150*150 placÃ©e Ã  aux coordonnÃ©es 10,10 
		l.add(pi,new Integer(0));	// DÃ©posÃ©e sur la couche zÃ©ro
		
		JPanel pb = new JPanel();
		JButton b1 = new JButton("Bouton 1");
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clic bouton 1");
			}
		});
		pb.add(b1);
		JButton b2 = new JButton("Bouton 2");
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clic bouton 2");
			}
		});		
		pb.add(b2);
		pb.setBounds(30,30,100,60);
		l.add(pb,new Integer(1));
		f.add(l);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);	// Ou show(); deprecated
   }
}