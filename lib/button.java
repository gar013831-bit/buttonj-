package lib;

import javax.swing.*;
import java.util.Random;
import java.awt.Color;

public class button extends JButton{
	double ren;
	public button(int posx,int posy,int sizex,int sizey,int much,Color colgete,Color enterco,String texting){
		super(texting);
		super.setBackground(colgete);
		super.setBorderPainted(false);
		super.setFocusPainted(false);
		if(colgete.equals(Color.WHITE)||colgete.equals(new Color(255,255,255)))
			super.setForeground(Color.BLACK);
		else
			super.setForeground(Color.WHITE);
		Random r=new Random();
		int g=r.nextInt(7,10);
		ren=(double)g/much;
		super.setBounds(posx,(int)(posy+ren),sizex,sizey);
		gon(colgete,enterco);
	}
	public void gon(Color colgete,Color enterco){
		getModel().addChangeListener(e -> {
            if (getModel().isPressed()) {
                super.setBackground(enterco);
            } else {
                super.setBackground(colgete);
            }
        });
	}
}