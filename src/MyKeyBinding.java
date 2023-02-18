import java.awt.Color;

import java.awt.event.ActionEvent;

import javax.swing.*;

public class MyKeyBinding extends JFrame{
	
	JLabel label;
	Action upAction;
	Action downAction;
	int width=100;
	int height =100;
	
	Action leftAction;
	Action rightAction;
	JLabel info;
	public MyKeyBinding() {
		
		label= new JLabel();
		label.setBounds(100,100,width, height);
		label.setBackground(Color.red);
		label.setOpaque(true);
		
		info= new JLabel("here");
		info.setBounds(200,0,100,100);
		
		
		
		
		
		upAction = new UpAction();
		downAction = new DownAction();
		leftAction= new LeftAction();
		rightAction= new RightAction();
		
		label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
		label.getActionMap().put("upAction", upAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");

		label.getActionMap().put("downAction", downAction);
		
		
		label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
		label.getActionMap().put("leftAction", leftAction);
		
		
		label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
		label.getActionMap().put("rightAction", rightAction);

		this.setTitle("Move object");
		this.add(info);
		this.add(label);
		this.setLayout(null);
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public class UpAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {

			
				height -=10;
			
			label.setLocation(label.getX(),label.getY()-10);
			info.setText("x ="+(label.getX()) +" \n y " + (label.getY()));
		}
		
	}
	
	public class DownAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {

			label.setLocation(label.getX(),label.getY()+10);
			height +=10;
			info.setText("x ="+(label.getX()) +" \n y " + (label.getY()));
		}
		
	}
	
	
	public class RightAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {

			label.setLocation(label.getX()+10,label.getY());
			width-=10;
			info.setText("x ="+(label.getX()) +" \n y " + (label.getY()));
		}
		
	}
	
	public class LeftAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX()-10,label.getY());
			width+=10;
			info.setText("x ="+(label.getX()) +" \n y " + (label.getY()));
		}
		
	}



}
