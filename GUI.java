import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;





public class GUI implements ActionListener{
	int count = 0;
	JLabel label;
	JFrame frame;
	JPanel panel; 
	Staff andy = new Staff("Andy");
	Staff tony = new Staff("Tony");
	
	Staff[] all_staff = {andy,tony};
	
	
	public GUI(){
		frame = new JFrame();
		
		JTextField TF = new JTextField();
		
		JButton button = new JButton("push me");
		//  WHEN THE BUTTON IS PRESSED, TAKES THE TEXT INPUT (TF) AS A PARAMETER AND CHECKS IF MATCHES ANY THE STAFF NAMES
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				String x = TF.getText();
				for (Staff staff : all_staff){
					if (staff.name.equals(x)){
						staff.display_it();
					}
				}
			}
		});
		
		label = new JLabel("num of clicks");
		
		panel = new JPanel();
		
		panel.setBorder(BorderFactory.createEmptyBorder(90,90,90,90)); //hight, width
		panel.setLayout(new GridLayout(0,1));  // rows n colums
		
		// ADD ELEMENT TO PANEL
		panel.add(label);
		panel.add(TF);
		panel.add(button);
		
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("OURGUI");
		frame.pack();
		frame.setVisible(true);
		
	}
	
	public static void main(String [] args){
		new GUI();
	}
	public void actionPerformed(ActionEvent e){
		count++;
		label.setText("num clicks: "+ count);
		
		}                                            
		
	
}


//////////////////////////////////////////////////////

//{}    STAFF CLASS FOLLOW

//////////////////////////////////////////////////////



class Staff implements ActionListener{
	JFrame frame;
	JPanel panel;
	
	JLabel label_name;
	
	JLabel label_sat;
	JLabel label_sun;
	JLabel label_mon;
	JLabel label_tue;
	JLabel label_wed;
	JLabel label_thu;
	JLabel label_fri;
	//staff details:
	String name;
	
	Boolean sat = false;
	Boolean sun = false;
	Boolean mon = false;
	Boolean tue = false;
	Boolean wed = false;
	Boolean thu = false;
	Boolean fri = false;
	
	int sat_avb_time = 0;
	int sun_avb_time = 0;
	int mon_avb_time = 0;
	int tue_avb_time = 0;
	int wed_avb_time = 0;
	int thu_avb_time = 0;
	int fri_avb_time = 0;
	
	//constructor set staff name
	public Staff (String name){
		this.name=name;
	}
	// display staff options: CURRENTLY ONLY 1 OPTION AVAILEBLE
	public void display_it(){
		frame = new JFrame();
		
		// DAYS AVAILABILITY BUTTONS:
		JButton button_submit = new JButton("Submit");
		
		JButton button_SAT = new JButton("SATURDAY");
		button_SAT.setBackground(Color.RED);
		button_SAT.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(sat == false){
					sat = true;
					button_SAT.setBackground(Color.GREEN);
					}
				else{
					sat = false;
					button_SAT.setBackground(Color.RED);} 
				System.out.println(sat);
				
			}
		});
		
		JButton button_SUN = new JButton("SUNDAY");
		JButton button_MON = new JButton("MONDAY");
		JButton button_TUE = new JButton("TUESDAY");
		JButton button_WED = new JButton("WEDNESDAY");
		JButton button_THU = new JButton("THURSDAY");
		JButton button_FRI = new JButton("FRIDAY");
		
		// HOURS AVAILABILITY OPTION 
		
		JButton SAT_10 = new JButton("10");
		JButton SAT_12 = new JButton("12");
		JButton SAT_15 = new JButton("15");
		JButton SAT_17 = new JButton("17");
		
		JButton SUN_10 = new JButton("10");
		JButton SUN_12 = new JButton("12");
		JButton SUN_15 = new JButton("15");
		JButton SUN_17 = new JButton("17");
		
		JButton MON_10 = new JButton("10");
		JButton MON_12 = new JButton("12");
		JButton MON_15 = new JButton("15");
		JButton MON_17 = new JButton("17");
		
		JButton TUE_10 = new JButton("10");
		JButton TUE_12 = new JButton("12");
		JButton TUE_15 = new JButton("15");
		JButton TUE_17 = new JButton("17");
		
		JButton WED_10 = new JButton("10");
		JButton WED_12 = new JButton("12");
		JButton WED_15 = new JButton("15");
		JButton WED_17 = new JButton("17");
		
		JButton THU_10 = new JButton("10");
		JButton THU_12 = new JButton("12");
		JButton THU_15 = new JButton("15");
		JButton THU_17 = new JButton("17");
		
		JButton FRI_10 = new JButton("10");
		JButton FRI_12 = new JButton("12");
		JButton FRI_15 = new JButton("15");
		JButton FRI_17 = new JButton("17");
		
		
		
		
		// LABELS:
		label_name = new JLabel(name);
		
		JLabel morning_label = new JLabel("Morings");
		JLabel lunch_label = new JLabel("Lunches");
		JLabel back_label = new JLabel("Backs");
		JLabel dinner_label = new JLabel("Evenings");
		
		label_sat = new JLabel("Saturday");
		label_sun = new JLabel("Sunday");
		label_mon = new JLabel("Monday");
		label_tue = new JLabel("Tuesday");
		label_wed = new JLabel("Wednesday");
		label_thu = new JLabel("Thursday");
		label_fri = new JLabel("Friday");
		
		panel = new JPanel();
		
		panel.setBorder(BorderFactory.createEmptyBorder(90,490,90,90));
		panel.setLayout(new GridLayout(6,8));  // rows n colums
		
		//ADD ALL LABALS TO PANEL
		panel.add(label_name);
		panel.add(label_sat);
		panel.add(label_sun);
		panel.add(label_mon);
		panel.add(label_tue);
		panel.add(label_wed);
		panel.add(label_thu);
		panel.add(label_fri);
		
		//ADD ALL BUTTONS TO PANEL
		panel.add(button_submit);
		panel.add(button_SAT);
		panel.add(button_SUN);
		panel.add(button_MON);
		panel.add(button_TUE);
		panel.add(button_WED);
		panel.add(button_THU);
		panel.add(button_FRI);
		
		panel.add(morning_label);
		panel.add(SAT_10);
		panel.add(SUN_10);
		panel.add(MON_10);
		panel.add(TUE_10);
		panel.add(WED_10);
		panel.add(THU_10);
		panel.add(FRI_10);
		
		panel.add(lunch_label);
		panel.add(SAT_12);
		panel.add(SUN_12);
		panel.add(MON_12);
		panel.add(TUE_12);
		panel.add(WED_12);
		panel.add(THU_12);
		panel.add(FRI_12);
		
		panel.add(back_label);
		panel.add(SAT_15);
		panel.add(SUN_15);
		panel.add(MON_15);
		panel.add(TUE_15);
		panel.add(WED_15);
		panel.add(THU_15);
		panel.add(FRI_15);
		
		panel.add(dinner_label);
		panel.add(SAT_17);
		panel.add(SUN_17);
		panel.add(MON_17);
		panel.add(TUE_17);
		panel.add(WED_17);
		panel.add(THU_17);
		panel.add(FRI_17);
		
		//ADD PANEL TO PRAME
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("OURGUI");
		frame.pack();
		frame.setVisible(true);
		}
		public void actionPerformed(ActionEvent e){
			
		}
}