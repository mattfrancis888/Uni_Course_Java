package cp213;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

@SuppressWarnings("serial")
public class ReactorView extends JFrame {
	private JPanel contentPane;
	private JTextArea outputArea = new JTextArea("Tick 0: Temp: 0\u00b0C Power: 0MW\nRod Height: 0 Rod Insertion: 0\nAverage Temperature: 0\\u00b0C Average Power: 0MW");
	private JButton btnLowerRod = new JButton("Lower Rod");
	private JButton btnRaiseRod = new JButton("Raise Rod");
	private JButton btnStop = new JButton("Stop");
	private JButton btnStart = new JButton("Start");
	private DisplayView displayView = new DisplayView();
	
	private Reactor model;
	private ReactorController control;
	public boolean manual= false;
	private int prevHeight = 0;
	
	public ReactorView(){
		this.init(model);
		outputArea.setBounds(12, 10, 420, 76);
		outputArea.setFocusable(false);
		outputArea.setText(String.format("Tick %d:Temp: %.2f\u00b0C Power: %.2fMW\nRod Height: %d Rod Insertion: %d\nAverage Temperature: %.2f\u00b0C Average Power: %.2fMW",
				model.getTicks(),model.getTemperature(),model.getPower(),model.getRodsHeight(),200-model.getRodsHeight(),model.getTemperature(),model.getPower()));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.layoutView();
		this.registerListener();
	}
	
	//Helper to initalize model in init()
	private boolean isInt(String str) {
		try { 
			Integer.parseInt(str); 
		} catch(NumberFormatException e) { 
			return false; 
		}
		return true;
	}
	
	//Initialize model after asking for inputs
	private void init(Reactor model) {
		String answer = "";
		do{
			answer = JOptionPane.showInputDialog("Enter an initial temperature");
		}while (!isInt(answer)||Integer.parseInt(answer)<25);
		int initTemp = Integer.parseInt(answer);
		do{
			answer = JOptionPane.showInputDialog("Enter an initial rod height (not insertion length)");
		}while (!isInt(answer)||(Integer.parseInt(answer)<0||Integer.parseInt(answer)>200));
		int initHeight = Integer.parseInt(answer);
		int ans = JOptionPane.showConfirmDialog(contentPane, "Run reactor manually?");
		if (ans == JOptionPane.YES_OPTION)
			this.manual = true;
		this.model = new Reactor(initTemp,initHeight);
	}
	
	
	private void layoutView() {
		//x,y,width, height
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(outputArea);
		btnRaiseRod.setBounds(0, 91, 101, 76);
		contentPane.add(btnRaiseRod);
		btnStart.setBounds(113, 91, 207, 76);
		contentPane.add(btnStart);
		btnLowerRod.setBounds(332, 91, 100, 76);
		contentPane.add(btnLowerRod);
		btnStop.setBounds(0, 172, 432, 81);
		contentPane.add(btnStop);
		btnStop.setEnabled(false);
		btnRaiseRod.setEnabled(false);
		btnLowerRod.setEnabled(false);
	}

	

	public class DisplayView extends JFrame{

		private JLabel tempLabel = new JLabel("");
		private JPanel displayPane;
		private	JLabel lbl10 = new JLabel("10%");
		private JLabel lblColor10 = new JLabel("");
		private JLabel lbl20 = new JLabel("20%");
		private JLabel lblColor20 = new JLabel("");
		private JLabel lbl30 = new JLabel("30%");
		private JLabel lblColor30 = new JLabel("");
		private JLabel lbl40 = new JLabel("40%");
		private JLabel lblColor40 = new JLabel("");
		private JLabel lbl50 = new JLabel("50%");
		private JLabel lblColor50 = new JLabel("");
		private JLabel lbl60 = new JLabel("60%");
		private JLabel lblColor60 = new JLabel("");
		private JLabel lbl70 = new JLabel("70%");
		private JLabel lblColor70 = new JLabel("");
		private JLabel lbl80 = new JLabel("80%");
		private JLabel lblColor80 = new JLabel("");
		private JLabel lbl90 = new JLabel("90%");
		private JLabel lblColor90 = new JLabel("");
		private JLabel lbl100 = new JLabel("100%");
		private JLabel lblColor100 = new JLabel("");



		public final Color[] STATUS = {new Color(28,104,220),new Color(28, 164, 220),new Color(28, 220, 216)
				,new Color(	28, 220, 156),new Color(28, 220, 36),new Color(	80, 220, 28),new Color(140, 220, 28),new Color(238, 232, 32)
				,new Color(220, 120, 28),new Color(220, 28, 56)};


		public DisplayView() {
			layoutView();
		}
		private void layoutView() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(200, 200, 450, 300);
			displayPane = new JPanel();
			displayPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(displayPane);
			displayPane.setLayout(null);

			lbl10.setBounds(5, 5, 104, 40);
			displayPane.add(lbl10);
			lblColor10.setBounds(109, 5, 104, 40);
			lblColor10.setOpaque(true);
			lblColor10.setBackground(STATUS[0]);
			displayPane.add(lblColor10);

			lbl20.setBounds(213, 5, 104, 40);
			displayPane.add(lbl20);
			lblColor20.setBounds(317, 5, 104, 40);
			lblColor20.setOpaque(true);
			lblColor20.setBackground(STATUS[1]);
			displayPane.add(lblColor20);

			lbl30.setBounds(5, 45, 104, 40);
			displayPane.add(lbl30);
			lblColor30.setOpaque(true);
			lblColor30.setBackground(STATUS[2]);
			lblColor30.setBounds(109, 45, 104, 40);
			displayPane.add(lblColor30);

			lbl40.setBounds(213, 45, 104, 40);
			displayPane.add(lbl40);
			lblColor40.setOpaque(true);
			lblColor40.setBackground(STATUS[3]);
			lblColor40.setBounds(317, 45, 104, 40);
			displayPane.add(lblColor40);

			lbl50.setBounds(5, 85, 104, 40);
			displayPane.add(lbl50);
			lblColor50.setOpaque(true);
			lblColor50.setBounds(109, 85, 104, 40);
			displayPane.add(lblColor50);
			lblColor50.setBackground(STATUS[4]);

			lbl60.setBounds(213, 85, 104, 40);
			displayPane.add(lbl60);
			lblColor60.setOpaque(true);
			lblColor60.setBackground(STATUS[5]);
			lblColor60.setBounds(317, 85, 104, 40);
			displayPane.add(lblColor60);

			lbl70.setBounds(5, 125, 104, 40);
			displayPane.add(lbl70);
			lblColor70.setBounds(109, 125, 104, 40);
			lblColor70.setOpaque(true);
			lblColor70.setBackground(STATUS[6]);
			displayPane.add(lblColor70);

			lbl80.setBounds(213, 125, 104, 40);
			displayPane.add(lbl80);
			lblColor80.setOpaque(true);
			lblColor80.setBounds(317, 125, 104, 40);
			lblColor80.setBackground(STATUS[7]);
			displayPane.add(lblColor80);

			lbl90.setBounds(5, 165, 104, 40);
			displayPane.add(lbl90);
			lblColor90.setOpaque(true);
			lblColor90.setBackground(STATUS[8]);
			lblColor90.setBounds(109, 165, 104, 40);
			displayPane.add(lblColor90);

			lbl100.setBounds(213, 165, 104, 40);
			displayPane.add(lbl100);
			lblColor100.setOpaque(true);
			lblColor100.setBounds(317, 165, 104, 40);
			lblColor100.setBackground(STATUS[9]);
			displayPane.add(lblColor100);

			tempLabel.setOpaque(true);
			tempLabel.setBackground(STATUS[0]);
			tempLabel.setBounds(5, 205, 416, 40);
			displayPane.add(tempLabel);
			displayPane.setVisible(true);

		}

		public void changeStatus(Reactor model) {
			int percent = (int) (model.getTemperature()/100);
			if (percent<=1)
				tempLabel.setBackground(STATUS[0]);
			else if (percent==2)
				tempLabel.setBackground(STATUS[1]);
			else if (percent ==3)
				tempLabel.setBackground(STATUS[2]);
			else if (percent==4)
				tempLabel.setBackground(STATUS[3]);
			else if (percent ==5)
				tempLabel.setBackground(STATUS[4]);
			else if (percent==6)
				tempLabel.setBackground(STATUS[5]);
			else if (percent ==7)
				tempLabel.setBackground(STATUS[6]);
			else if (percent==8)
				tempLabel.setBackground(STATUS[7]);
			else if (percent ==9)
				tempLabel.setBackground(STATUS[8]);
			else
				tempLabel.setBackground(STATUS[9]);
			DisplayView.this.repaint();
		}

	}

	//Output result
	public void setOutput(Reactor model) {
		String output = String.format("Tick %d:Temp: %.2f\u00b0C Power: %.2fMW\nRod Height: %d Rod Insertion: %d",
				model.getTicks(),model.getTemperature(),model.getPower(),model.getRodsHeight(),200-model.getRodsHeight());
		this.outputArea.setText(output);
	}
	
	//Property Change Listener
	private class TickListener implements PropertyChangeListener{

		private String output;

		@Override
		public void propertyChange(PropertyChangeEvent e) {
			output = String.format("Tick %d:Temp: %.2f\u00b0C Power: %.2fMW\nRod Height: %d Rod Insertion: %d\nAverage Temperature: %.2f\u00b0C Average Power: %.2fMW",
					model.getTicks(),model.getTemperature(),model.getPower(),model.getRodsHeight(),200-model.getRodsHeight(),model.getAverageTemperature(),model.getAveragePower());
			ReactorView.this.outputArea.setText(output);
			ReactorView.this.displayView.changeStatus(model);
			if (prevHeight != model.getRodsHeight()) {
                ReactorView.this.btnRaiseRod.setEnabled(true);
                ReactorView.this.btnLowerRod.setEnabled(true);
            }
			if (model.getStatus()!=Reactor.Status.OPERATING) {
				btnRaiseRod.setEnabled(false);
				btnLowerRod.setEnabled(false);
			}
			if (model.getStatus()==Reactor.Status.MELTDOWN)
				ReactorView.this.outputArea.setText(ReactorView.this.outputArea.getText()+"\nMELTDOWN!!!");
			else if (model.getStatus()==Reactor.Status.FINISHED)
				ReactorView.this.outputArea.setText("Simlulator Done");
		}
	}
	
	
	
	//Button Listeners
	private void registerListener() {

		btnStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnStart.setEnabled(false);
				btnStop.setEnabled(true);
				ReactorView.this.displayView.setVisible(true);
				ReactorView.this.control = new ReactorController(model,ReactorView.this);
				Thread controlThread = new Thread(ReactorView.this.control);
				controlThread.start();
				if (ReactorView.this.manual) {
					btnRaiseRod.setEnabled(true);
					btnLowerRod.setEnabled(true);
					contentPane.setEnabled(false);
				}

			}
		});

		btnStop.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				   ReactorView.this.btnRaiseRod.setEnabled(false);
	                ReactorView.this.btnLowerRod.setEnabled(false);
	                ReactorView.this.model.quit();
			}

		});

		btnRaiseRod.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			       prevHeight = ReactorView.this.model.getRodsHeight();
	                ReactorView.this.model.raiseRods();
	                ReactorView.this.btnRaiseRod.setEnabled(false);
	                ReactorView.this.btnLowerRod.setEnabled(false);
			}

		});

		btnLowerRod.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			     prevHeight = ReactorView.this.model.getRodsHeight();
	                ReactorView.this.model.raiseRods();
	                ReactorView.this.btnRaiseRod.setEnabled(false);
	                ReactorView.this.btnLowerRod.setEnabled(false);
			}

		});

		this.model.addPropertyChangeListener(new TickListener());
	}
	

}
