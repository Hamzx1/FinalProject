package date;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//This class for student information in the university but it will be shown as GUI(graphical user interface).
public class StudentsEventDriven {
	static String userName;
	static String userBirthDate;
	static String typeOfSubject2;
	static int userStudentID;
	static int enterGPA;
	public static void main(String[] args) {
		JFrame frame1 = new JFrame();
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //To remove it from the ram when we close the frame1.
		frame1.setSize(450,350);//Size of the frame1
		frame1.setVisible(true); //To make the frame1 that been created able to be seen when I run the code.
		frame1.setLayout(null); //To create our layout (To stop using the default layout so we be able to arrange everything as I like)
		
		//Creating object from JFrame type.
		JFrame frame2 = new JFrame();
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //To remove it from the ram when we close the frame2.
		frame2.setSize(450,350);//Size of the frame2 
		frame2.setLayout(null); //To create our layout (To stop using the default layout so we be able to arrange everything as I like)

		//Creating object from JLabel type.
		JLabel nameLabel = new JLabel("Enter your name:");
		JTextField name = new JTextField(); //Creating object from JLabel type.
		frame1.add(nameLabel); //Adding the label to frame1.
		frame1.add(name); //Adding the field to frame1.
		nameLabel.setBounds(15, 20, 100, 25); //Size of the label.
		name.setBounds(15, 50, 100, 25); //Size of the field.

		
		JLabel studentIDLabel = new JLabel("Enter your ID:");
		JTextField studentID = new JTextField();
		frame1.add(studentIDLabel); 
		frame1.add(studentID);
		studentIDLabel.setBounds(15, 75, 100, 25); 
		studentID.setBounds(15, 100, 100, 25);

		JLabel birthDateLabel = new JLabel("Enter your birth date:");
		JTextField birthDate = new JTextField();
		frame1.add(birthDateLabel);
		frame1.add(birthDate);		
		birthDateLabel.setBounds(15, 125, 200, 25);
		birthDate.setBounds(15, 150, 100, 25);

		
		JLabel typeOfSubjectLabel = new JLabel("Enter you are graduate student or undergraduate student?");
		JTextField typeOfSubject = new JTextField(); 
		frame1.add(typeOfSubjectLabel);
		frame1.add(typeOfSubject);
		typeOfSubjectLabel.setBounds(15, 175, 400, 25);
		typeOfSubject.setBounds(15, 200, 100, 25);
		
		//Creating an object from JButton type.
		//This button will be add in the frame1 and will I created a action listener for it.
		JButton button1 = new JButton("Ckeck if you passed");
		frame1.add(button1);
		button1.setBounds(110, 250, 200, 25);
		
		JLabel thesisTitleLabel = new JLabel("Enter the thesis title");
		JTextField thesisTitle = new JTextField();
		thesisTitleLabel.setBounds(15, 20, 500, 25);
		thesisTitle.setBounds(15, 50, 100, 25);
		
		
		JLabel projectTitleLabel = new JLabel("Enter the project title");
		JTextField projectTitle = new JTextField();
		projectTitleLabel.setBounds(15, 20, 500, 25);
		projectTitle.setBounds(15, 50, 100, 25);

		
		JLabel GPALabel = new JLabel("Enter your project GPA");
		JLabel GPALabel2 = new JLabel("Enter your thesis GPA");
		JTextField GPA = new JTextField();
		GPALabel.setBounds(15, 75, 200, 25);
		GPALabel2.setBounds(15, 75, 200, 25);
		GPA.setBounds(15, 100, 100, 25);
		frame2.add(GPA); //To be add in the frame2
		
		//Creating an object from JButton type.
		//This button will be add in the frame1 and will I created a action listener for it.
		JButton button2 = new JButton ("Enter to know if you passed");
		frame2.add(button2);
		button2.setBounds(110, 250, 200, 25);
		
		//Action listener for button1.
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userStudentID = -1;
				try {//To secure the code that the user will write something inside the student ID.
					userName = name.getText();
					userBirthDate = birthDate.getText();
					typeOfSubject2 = typeOfSubject.getText();
					userStudentID = Integer.parseInt(studentID.getText());
					
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Fill the missing feilds");//To show a message for the user.
				} 
				if (userStudentID == -1) {
					JOptionPane.showMessageDialog(null, "No data to be shown");//To show a message for the user.
				}
				else {
					frame1.setVisible(false);
					if (typeOfSubject2.equalsIgnoreCase("undergraduate")) {
						frame2.setVisible(true);//To make the frame2 that been created able to be seen when I run the code.
						frame2.add(projectTitleLabel);//For adding the projectTitlelabel to the frame2.
						frame2.add(projectTitle);//For adding the projectTitle to the frame2.
						frame2.add(GPALabel);//For adding the GPAlabel to the frame2.

					}
					else if (typeOfSubject2.equalsIgnoreCase("graduate")) {
						frame2.setVisible(true);
						frame2.add(thesisTitleLabel);
						frame2.add(thesisTitle);
						frame2.add(GPALabel2);

					}
					else {
						JOptionPane.showMessageDialog(null, "Invalid Option");					}
				}
			} 
		});
		//Action listener for button2.
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterGPA = -1;
				try {//To secure the code that the user will write something inside the student ID.
					enterGPA = Integer.parseInt(GPA.getText());
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Fill the missing feilds");//To show a message for the user.
				}
				if (enterGPA == -1) {
					JOptionPane.showMessageDialog(null, "No data to be shown");
				}
				else {
					if (typeOfSubject2.equalsIgnoreCase("undergraduate")) {
						if (enterGPA >= 50) {
							JOptionPane.showMessageDialog(null, "Student Name is:" + userName + "\nBirth date is:" +userBirthDate+
									"\nStudent ID is:" +userStudentID+"\nProject name is:"+projectTitle.getText()+" iS passed");
						}
						else {
							JOptionPane.showMessageDialog(null, "Student Name is:" + userName + "\nBirth date is:" +userBirthDate+
									"\nStudent ID is:" +userStudentID+"\nProject name is:"+projectTitle.getText()+" iS failed");
						}
					}
					else {
						if (enterGPA >= 70) {
							JOptionPane.showMessageDialog(null, "Student Name is:" + userName + "\nBirth date is:" +userBirthDate+
									"\nStudent ID is:" +userStudentID+"\nProject name is:"+thesisTitle.getText()+" iS passed");
						}
						else {
							JOptionPane.showMessageDialog(null, "Student Name is:" + userName + "\nBirth date is:" +userBirthDate+
									"\nStudent ID is:" +userStudentID+"\nProject name is:"+thesisTitle.getText()+" iS failed");
						}
					}
				}
			}
		});
	}
}
