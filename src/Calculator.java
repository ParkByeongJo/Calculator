import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;

public class Calculator extends JFrame {

	private JPanel panel;
	private JTextField tField;
	private JButton[] buttons;
	private String[] lables= {"Back"," "," ","CE","C","7","8","9","/","Sqrt","4","5","6","x","%",
			                  "1","2","3","-","1/x","0","+/-",".","+","="
	};
	
	public Calculator() {
		tField=new JTextField(35);
		panel=new JPanel();
		tField.setText("0.");
		tField.setEnabled(true);
		
		panel.setLayout(new GridLayout(0,5,3,3));
		buttons=new JButton[25];
		int index=0;
		for(int rows=0;rows<5;rows++) {
			for(int cols=0;cols<5;cols++) {
				buttons[index]=new JButton(lables[index]);
				if(cols>=3) {
					buttons[index].setForeground(Color.red);
				}
				else
					buttons[index].setForeground(Color.blue);
				buttons[index].setBackground(Color.yellow);
				panel.add(buttons[index]);
				index++;
			}
		}
		this.add(tField,BorderLayout.NORTH);
		this.add(panel,BorderLayout.CENTER);
		this.setVisible(true);
		this.pack();
	}
	
	public static void main(String[] args) {
		Calculator c= new Calculator();
	}

}
