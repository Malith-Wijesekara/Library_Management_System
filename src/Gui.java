import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import java.awt.CardLayout;

import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JTabbedPane;
import java.util.GregorianCalendar;
//import com.toedter.calendar.JCalendar;
//import com.toedter.calendar.JDateChooser;
//import com.toedter.calendar.JDayChooser;
//import com.toedter.components.JLocaleChooser;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JRadioButton;

import com.sun.javafx.tk.Toolkit;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;


public class Gui extends Main{

	private JFrame frmLibraryAdmin;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	
	private JPanel Home;
	
	private JTabbedPane tabbedPane;
	private JPanel tabIssue;
	private JPanel tabReturn;
	private JPanel tabBooks;
	private JPanel Member_1;
	private JPanel tabAdmin;
	private JTextField txtB_Id;
	private JTextField txtName;
	private JTextField txtAuthor;
	private JTextField txtRackNo;
	private JTextField txtCatagory;
	private JTextField txtAddDate;
	
	private String today;
	private String Rdate;
	
	private JTextField txtM_Id;
	private JTextField txtFname;
	private JTextField txtLname;
	private JTextField txtDoB;
	private JTextField txtAddress;
	private JTextField txtTelephone;
	private JTextField txtA_Id;
	private JTextField txtAFname;
	private JTextField txtALname;
	private JTextField txtADoB;
	private JTextField txtAAddress;
	private JTextField txtAUserName;
	private JTextField txtAPassword;
	private JTextField txtAStartDate;
	private JTextField txtBDate;
	private JTextField txtRB_Id;
	private JTextField txtIB_Id;
	private JTextField txtIM_Id;
	private JTextField txtIBDate;
	private JTextField txtIRDate;
	private JTextField txtRM_Id;
	private JTextField txtRBDate;
	private JTextField txtRRDate;
	private JTextField txtRSt;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
					window.frmLibraryAdmin.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLibraryAdmin = new JFrame();
		frmLibraryAdmin.setTitle("Library Manager");
		
		frmLibraryAdmin.setBounds(100, 100, 700, 500);
		frmLibraryAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLibraryAdmin.getContentPane().setLayout(new CardLayout(0, 0));
		
		
		final JPanel Login = new JPanel();
		frmLibraryAdmin.getContentPane().add(Login, "name_1963062960431579");
		Login.setLayout(null);
		Login.setVisible(true);
		
		JLabel LIcon = new JLabel("");
		Image ic = new ImageIcon(this.getClass().getResource("/login.png")).getImage();
		
		JLabel lblAdministrativeLogin = new JLabel("Administrative Login");
		lblAdministrativeLogin.setFont(new Font("PMingLiU-ExtB", Font.PLAIN, 23));
		lblAdministrativeLogin.setForeground(new Color(255, 215, 0));
		lblAdministrativeLogin.setBounds(53, 39, 324, 46);
		Login.add(lblAdministrativeLogin);
		LIcon.setIcon(new ImageIcon(ic));
		LIcon.setBounds(514, 148, 160, 165);
		Login.add(LIcon);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setForeground(SystemColor.inactiveCaption);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setBounds(134, 148, 160, 31);
		Login.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(SystemColor.inactiveCaption);
		lblPassword.setFont(new Font("Arial", Font.BOLD, 15));
		lblPassword.setBounds(134, 217, 107, 40);
		Login.add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(292, 148, 176, 26);
		Login.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(292, 225, 176, 26);
		Login.add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String username = txtUsername.getText();
					String pw = txtPassword.getText();
					
					if(username.equals("Malith") && pw.equals("123")){					
						JOptionPane.showMessageDialog(null,"Login Sucessful");
						Login.setVisible(false);
						Home.setVisible(true);						
					}
					else
						JOptionPane.showMessageDialog(null,"Login Failed");
			  	}catch(Exception e){System.out.println(e);}				
			}
		});
		btnLogin.setBounds(353, 309, 115, 40);
		Login.add(btnLogin);
		
		JLabel Lbg = new JLabel("");				
		Image b = new ImageIcon(this.getClass().getResource("/black.jpg")).getImage();
		Lbg.setIcon(new ImageIcon(b));
		Lbg.setBounds(0, 0, 684, 461);
		Login.add(Lbg);
				
		
		
		final JPanel Home = new JPanel();
		frmLibraryAdmin.getContentPane().add(Home, "name_1963072785028251");
		Home.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 684, 461);
		Home.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Welcome", null, panel, null);
		panel.setLayout(null);
		
		JLabel Wbg = new JLabel("");
		Wbg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Image b1 = new ImageIcon(this.getClass().getResource("/black.jpg")).getImage();
		
		JLabel label_2 = new JLabel("");
		Image ic1 = new ImageIcon(this.getClass().getResource("/welcome.png")).getImage();
		label_2.setIcon(new ImageIcon(ic1));
		label_2.setBounds(277, 54, 142, 126);
		panel.add(label_2);
		
		JLabel lblHelpTips = new JLabel("Help tips : Select the tabs to do the data manipulation for your library ");
		lblHelpTips.setForeground(new Color(0, 255, 0));
		lblHelpTips.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		lblHelpTips.setBounds(56, 312, 623, 28);
		panel.add(lblHelpTips);
		
		JLabel lblWelcomeToLibrary = new JLabel("Welcome to Library Manager!");
		lblWelcomeToLibrary.setForeground(new Color(255, 200, 0));
		lblWelcomeToLibrary.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 31));
		lblWelcomeToLibrary.setBounds(138, 169, 480, 126);
		panel.add(lblWelcomeToLibrary);
		Wbg.setIcon(new ImageIcon(b1));
		Wbg.setBounds(0, 0, 679, 433);
		panel.add(Wbg);
		
		JPanel tabIssue = new JPanel();
		tabbedPane.addTab("Issuing books", null, tabIssue, null);
		tabIssue.setLayout(null);
		
		JLabel Iico = new JLabel("");
		Image oc2 = new ImageIcon(this.getClass().getResource("/teacher.png")).getImage();
		Iico.setIcon(new ImageIcon(oc2));
		Iico.setBounds(492, 88, 116, 100);
		tabIssue.add(Iico);
		
		
		JLabel lblMemberId_1 = new JLabel("Book ID");
		lblMemberId_1.setForeground(SystemColor.inactiveCaption);
		lblMemberId_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblMemberId_1.setBounds(79, 31, 94, 22);
		tabIssue.add(lblMemberId_1);
		
		JLabel label_1 = new JLabel("Member ID");
		label_1.setForeground(SystemColor.inactiveCaption);
		label_1.setFont(new Font("Arial", Font.BOLD, 14));
		label_1.setBounds(79, 75, 94, 22);
		tabIssue.add(label_1);
		
		JLabel lblBorrowedDate = new JLabel("Borrowed Date");
		lblBorrowedDate.setForeground(SystemColor.inactiveCaption);
		lblBorrowedDate.setFont(new Font("Arial", Font.BOLD, 14));
		lblBorrowedDate.setBounds(79, 119, 116, 22);
		tabIssue.add(lblBorrowedDate);
		
		JLabel lblReturnDate = new JLabel("Return Date");
		lblReturnDate.setForeground(SystemColor.inactiveCaption);
		lblReturnDate.setFont(new Font("Arial", Font.BOLD, 14));
		lblReturnDate.setBounds(79, 170, 94, 22);
		tabIssue.add(lblReturnDate);
		
		
		
		JButton btnIssue = new JButton("Issue");
		btnIssue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int IM_Id = Integer.parseInt(txtIM_Id.getText());
				int IB_Id = Integer.parseInt(txtIB_Id.getText());
				
				try{   
					if(!rsBw.next())
						rsBw = st.executeQuery("select *from Borrow");
					if (rsBw.next()) {
						
						rsBw.moveToInsertRow();
						rsBw.updateInt("M_Id",IM_Id);
						rsBw.updateInt("B_Id",IB_Id);
						rsBw.updateString("BDate",today);
						rsBw.updateString("RDate",Rdate);
						rsBw.updateBoolean("Isreturn",false);
						rsBw.insertRow();
						rsBw.close();
						st.close(); 								
						st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);						
						rsBw = st.executeQuery("select *from Borrow");
					 }
					 rsBw.next();
				JOptionPane.showMessageDialog(null,"Book Issued!");
				
			}catch(Exception e5){System.out.println(e5);}
			}
		});
		btnIssue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnIssue.setBounds(129, 253, 135, 43);
		tabIssue.add(btnIssue);
		
		txtIB_Id = new JTextField();
		txtIB_Id.setBounds(206, 31, 186, 24);
		tabIssue.add(txtIB_Id);
		txtIB_Id.setColumns(10);
		
		txtIM_Id = new JTextField();
		txtIM_Id.setColumns(10);
		txtIM_Id.setBounds(206, 77, 186, 24);
		tabIssue.add(txtIM_Id);
		
		//DATE ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		JFormattedTextField txtIBDate = new JFormattedTextField();		
		txtIBDate.setColumns(10);
		txtIBDate.setBounds(205, 121, 186, 24);
		tabIssue.add(txtIBDate);
		
		Date d = new Date();
		DateFormat f = new SimpleDateFormat("MM/dd/yyyy");	
		today = f.format(d);
		txtIBDate.setText(today);
		
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(d);
		cal.add(Calendar.DATE, 14);
		Date rd = cal.getTime();
		Rdate = f.format(rd);
		JFormattedTextField txtIRDate = new JFormattedTextField(f.format(rd));
		//txtIRDate = new JTextField();
		txtIRDate.setColumns(10);
		txtIRDate.setBounds(206, 168, 186, 24);
		tabIssue.add(txtIRDate);
		
		JButton btnNextIssue = new JButton("Next Issue");
		btnNextIssue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtIB_Id.setText("");
				txtIM_Id.setText("");
			}
		});
		btnNextIssue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNextIssue.setBounds(284, 253, 135, 43);
		tabIssue.add(btnNextIssue);
		
		JLabel Ibg = new JLabel("");
		Image b2 = new ImageIcon(this.getClass().getResource("/black.jpg")).getImage();
		Ibg.setIcon(new ImageIcon(b2));
		Ibg.setBounds(0, 0, 679, 433);
		tabIssue.add(Ibg);
		
		JPanel tabReturn = new JPanel();
		tabReturn.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent arg0) {
				try {
					rsBw.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					st.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		tabbedPane.addTab("Returning Books", null, tabReturn, null);
		tabReturn.setLayout(null);
		
		JLabel Rico = new JLabel("");
		Image oc1 = new ImageIcon(this.getClass().getResource("/return.png")).getImage();
		Rico.setIcon(new ImageIcon(oc1));
		Rico.setBounds(462, 106, 140, 141);
		tabReturn.add(Rico);
		
		txtRSt = new JTextField();
		txtRSt.setBounds(212, 257, 184, 30);
		tabReturn.add(txtRSt);
		txtRSt.setColumns(10);
		
		JButton btnNewButton_8 = new JButton("Return");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				
				try{
					 if(rsBw.next()) {
						rsBw.previous();						
						rsBw.updateBoolean("IsReturn",true);						 
						rsBw.updateRow();
						rsBw.close();
						st.close(); 								
						st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);						
						rsBw = st.executeQuery("select *from Borrow");
					 }
					 //rsBw.next();
					JOptionPane.showMessageDialog(null,"Book Returned!");
				}catch(Exception e5){System.out.println(e5);}
			}
		});
		btnNewButton_8.setBounds(246, 318, 89, 43);
		tabReturn.add(btnNewButton_8);
		
		JButton button_8 = new JButton(">>");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					if(!rsBw.next())
						rsBw = st.executeQuery("select *from Borrow");
					txtRB_Id.setText(rsBw.getString("B_Id"));
					txtRM_Id.setText(rsBw.getString("M_Id"));
					txtRBDate.setText(rsBw.getString("BDate"));
					txtRRDate.setText(rsBw.getString("RDate"));
					if(rsBw.getBoolean("IsReturn")==false){
						txtRSt.setText("Not Returned");
					}else if(rsBw.getBoolean("IsReturn")==true){
						txtRSt.setText("Returned");
					}
					
				}catch(Exception e3){System.out.println(e3);}
			}
		});
		button_8.setBounds(443, 318, 59, 23);
		tabReturn.add(button_8);
		
		JButton button_7 = new JButton(">");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					if(!rsBw.next())
						rsBw = st.executeQuery("select *from Borrow");
					if(rsBw.next()){
						txtRB_Id.setText(rsBw.getString("B_Id"));
						txtRM_Id.setText(rsBw.getString("M_Id"));
						txtRBDate.setText(rsBw.getString("BDate"));
						txtRRDate.setText(rsBw.getString("RDate"));		
						if(rsBw.getBoolean("IsReturn")==false){
							txtRSt.setText("Not Returned");
						}else if(rsBw.getBoolean("IsReturn")==true){
							txtRSt.setText("Returned");
						}
					}else{
						rsBw.previous();
						JOptionPane.showMessageDialog(null,"No records in the previous field");
					}
				}catch(Exception e2){System.out.println(e2);}
			}
		});
		button_7.setBounds(374, 318, 59, 23);
		tabReturn.add(button_7);
		
		JButton button_6 = new JButton("<");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					if(!rsBw.next())
						rsBw = st.executeQuery("select *from Borrow");
					if(rsBw.previous()){
						txtRB_Id.setText(rsBw.getString("B_Id"));
						txtRM_Id.setText(rsBw.getString("M_Id"));
						txtRBDate.setText(rsBw.getString("BDate"));
						txtRRDate.setText(rsBw.getString("RDate"));		
						if(rsBw.getBoolean("IsReturn")==false){
							txtRSt.setText("Not Returned");
						}else if(rsBw.getBoolean("IsReturn")==true){
							txtRSt.setText("Returned");
						}
							
					}else{
						rsBw.next();
						JOptionPane.showMessageDialog(null,"No records in the previous field");
					}
				}catch(Exception e3){System.out.println(e3);}
			}
		});
		button_6.setBounds(145, 318, 59, 23);
		tabReturn.add(button_6);
		
		JButton btnNewButton_7 = new JButton("<<");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					if(!rsBw.next())
						rsBw = st.executeQuery("select *from Borrow");
						txtRB_Id.setText(rsBw.getString("B_Id"));
						txtRM_Id.setText(rsBw.getString("M_Id"));
						txtRBDate.setText(rsBw.getString("BDate"));
						txtRRDate.setText(rsBw.getString("RDate"));
						if(rsBw.getBoolean("IsReturn")==false){
							txtRSt.setText("Not Returned");
						}else if(rsBw.getBoolean("IsReturn")==true){
							txtRSt.setText("Returned");
						}
				}catch(Exception e3){System.out.println(e3);}
			}
		});
		btnNewButton_7.setBounds(54, 318, 59, 23);
		tabReturn.add(btnNewButton_7);
		
		txtRB_Id = new JTextField();
		txtRB_Id.setBounds(212, 35, 184, 30);
		tabReturn.add(txtRB_Id);
		txtRB_Id.setColumns(10);
		
		JLabel lblBookId = new JLabel("Book ID");
		lblBookId.setForeground(SystemColor.inactiveCaption);
		lblBookId.setFont(new Font("Arial", Font.BOLD, 14));
		lblBookId.setBounds(92, 37, 112, 24);
		tabReturn.add(lblBookId);
		
		JLabel lblMemberId_2 = new JLabel("Member ID");
		lblMemberId_2.setForeground(SystemColor.inactiveCaption);
		lblMemberId_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblMemberId_2.setBounds(92, 96, 112, 24);
		tabReturn.add(lblMemberId_2);
		
		JLabel lblBorrowedDate_1 = new JLabel("Borrowed Date");
		lblBorrowedDate_1.setForeground(SystemColor.inactiveCaption);
		lblBorrowedDate_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblBorrowedDate_1.setBounds(92, 152, 112, 24);
		tabReturn.add(lblBorrowedDate_1);
		
		JLabel lblRetunDate = new JLabel("Retun Date");
		lblRetunDate.setForeground(SystemColor.inactiveCaption);
		lblRetunDate.setFont(new Font("Arial", Font.BOLD, 14));
		lblRetunDate.setBounds(92, 204, 112, 24);
		tabReturn.add(lblRetunDate);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setForeground(SystemColor.inactiveCaption);
		lblStatus.setFont(new Font("Arial", Font.BOLD, 14));
		lblStatus.setBounds(92, 254, 112, 24);
		tabReturn.add(lblStatus);
		
		txtRM_Id = new JTextField();
		txtRM_Id.setColumns(10);
		txtRM_Id.setBounds(212, 90, 184, 30);
		tabReturn.add(txtRM_Id);
		
		txtRBDate = new JTextField();
		txtRBDate.setColumns(10);
		txtRBDate.setBounds(212, 146, 184, 30);
		tabReturn.add(txtRBDate);
		
		txtRRDate = new JTextField();
		txtRRDate.setColumns(10);
		txtRRDate.setBounds(212, 198, 184, 30);
		tabReturn.add(txtRRDate);
		
		JLabel Rbg = new JLabel("");
		Image b3 = new ImageIcon(this.getClass().getResource("/black.jpg")).getImage();
		Rbg.setIcon(new ImageIcon(b3));
		Rbg.setBounds(0, 0, 679, 433);
		tabReturn.add(Rbg);
		
		JPanel tabBooks_1 = new JPanel();		
		tabbedPane.addTab("Books", null, tabBooks_1, null);
		tabBooks_1.setLayout(null);
		
		JLabel Bico = new JLabel("");
		Image ic4 = new ImageIcon(this.getClass().getResource("/book1.png")).getImage();
		Bico.setIcon(new ImageIcon(ic4));
		Bico.setBounds(488, 71, 144, 148);
		tabBooks_1.add(Bico);
		
		JLabel lblNewLabel_1 = new JLabel("Book No.");
		lblNewLabel_1.setForeground(SystemColor.inactiveCaption);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(72, 31, 112, 29);
		tabBooks_1.add(lblNewLabel_1);
		
		JLabel lblBookName = new JLabel("Book name");
		lblBookName.setForeground(SystemColor.inactiveCaption);
		lblBookName.setFont(new Font("Arial", Font.BOLD, 14));
		lblBookName.setBounds(72, 71, 122, 29);
		tabBooks_1.add(lblBookName);
		
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setForeground(SystemColor.inactiveCaption);
		lblAuthor.setFont(new Font("Arial", Font.BOLD, 14));
		lblAuthor.setBounds(72, 111, 112, 29);
		tabBooks_1.add(lblAuthor);
		
		JLabel lblRackNo = new JLabel("Rack No.");
		lblRackNo.setForeground(SystemColor.inactiveCaption);
		lblRackNo.setFont(new Font("Arial", Font.BOLD, 14));
		lblRackNo.setBounds(72, 151, 112, 29);
		tabBooks_1.add(lblRackNo);
		
		JLabel lblCatagory = new JLabel("Catagory");
		lblCatagory.setForeground(SystemColor.inactiveCaption);
		lblCatagory.setFont(new Font("Arial", Font.BOLD, 14));
		lblCatagory.setBounds(72, 194, 112, 23);
		tabBooks_1.add(lblCatagory);
		
		JLabel lblDateAdded = new JLabel("Date Added");
		lblDateAdded.setForeground(SystemColor.inactiveCaption);
		lblDateAdded.setFont(new Font("Arial", Font.BOLD, 14));
		lblDateAdded.setBounds(72, 234, 112, 23);
		tabBooks_1.add(lblDateAdded);
		
		txtB_Id = new JTextField();
		txtB_Id.setFont(new Font("Arial", Font.PLAIN, 14));
		txtB_Id.setText("");
		txtB_Id.setBounds(227, 32, 196, 29);
		tabBooks_1.add(txtB_Id);
		txtB_Id.setColumns(10);
		
		txtName = new JTextField();
		txtName.setText("");
		txtName.setColumns(10);
		txtName.setBounds(227, 72, 196, 29);
		tabBooks_1.add(txtName);
		
		txtAuthor = new JTextField();
		txtAuthor.setText("");
		txtAuthor.setColumns(10);
		txtAuthor.setBounds(227, 112, 196, 29);
		tabBooks_1.add(txtAuthor);
		
		txtRackNo = new JTextField();
		txtRackNo.setText("");
		txtRackNo.setColumns(10);
		txtRackNo.setBounds(227, 152, 196, 29);
		tabBooks_1.add(txtRackNo);
		
		txtCatagory = new JTextField();
		txtCatagory.setText("");
		txtCatagory.setColumns(10);
		txtCatagory.setBounds(227, 192, 196, 29);
		tabBooks_1.add(txtCatagory);
		//New record--------------------------------------------------------------------
		JButton btnNew = new JButton("Save");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String BName = txtName.getText();
				String BAuthor = txtAuthor.getText();
				int BRackNo = Integer.parseInt(txtRackNo.getText());
				String Catagory = txtCatagory.getText();
				String BAddDate = txtAddDate.getText();
				try{   
				
					if (rsBook.next()){						
						rsBook.moveToInsertRow();						
						 rsBook.updateString("Name",BName);
						 rsBook.updateString("Author",BAuthor);
						 rsBook.updateInt("RackNo", BRackNo);
						 rsBook.updateString("Catagory",Catagory);
						 rsBook.updateString("AddDate",BAddDate);
						rsBook.insertRow();
						rsBook.close();
						st.close();
						
						st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);						
						rsBook = st.executeQuery("select *from Book");			
						
						}
					rsBook.next();
				JOptionPane.showMessageDialog(null,"New record added!");
				
			}catch(Exception e5){System.out.println(e5);}
			}
		});
		btnNew.setBounds(209, 360, 128, 23);
		tabBooks_1.add(btnNew);
		//UPDATE^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				String BName = txtName.getText();
				String BAuthor = txtAuthor.getText();
				int BRackNo = Integer.parseInt(txtRackNo.getText());
				String Catagory = txtCatagory.getText();			
				String BAddDate = txtAddDate.getText();
				try{ 
					
						 if (rsBook.next()) {
							 rsBook.previous();
							 rsBook.moveToCurrentRow();
							 rsBook.updateString("Name",BName);
							 rsBook.updateString("Author",BAuthor);
							 rsBook.updateInt("RackNo", BRackNo);
							 rsBook.updateString("Catagory",Catagory);
							 rsBook.updateString("AddDate",BAddDate);							
							 rsBook.updateRow();
							 rsBook.close();
							 st.close(); 								
							st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);						
							rsBook = st.executeQuery("select *from Book");
						 }
						 rsBook.next();
					JOptionPane.showMessageDialog(null,"Record updated!");
					
				}catch(Exception e5){System.out.println(e5);}
				
			}
		});
		btnUpdate.setBounds(209, 312, 128, 23);
		tabBooks_1.add(btnUpdate);
		//Delete
		JButton btnDelete = new JButton("Delete This Record");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					rsBook.deleteRow();
					rsBook.close();
					st.close();
					st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);						
					rsBook = st.executeQuery("select *from Book");					
					rsBook.next();
					clear();
					JOptionPane.showMessageDialog(null,"Record deleted!");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnDelete.setBounds(383, 360, 122, 23);
		tabBooks_1.add(btnDelete);
		//First
		JButton btnFirst = new JButton("<<");
		btnFirst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{
					if(!rsBook.next())
					rsBook = st.executeQuery("select *from Book");
					rsBook.first();
					txtB_Id.setText(rsBook.getString(String.valueOf("B_Id")));
					txtName.setText(rsBook.getString("Name"));
					txtAuthor.setText(rsBook.getString("Author"));
					txtRackNo.setText(rsBook.getString(String.valueOf("RackNo")));
					txtCatagory.setText(rsBook.getString("Catagory"));
					txtAddDate.setText(rsBook.getString("AddDate"));
					
				}catch(Exception e1){System.out.println(e1);}
			}
		});
		btnFirst.setBounds(51, 312, 65, 23);
		tabBooks_1.add(btnFirst);
		//Last
		JButton btnLast = new JButton(">>");
		btnLast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					if(!rsBook.next())
					rsBook = st.executeQuery("select *from Book");
					rsBook.last();					
					txtB_Id.setText(rsBook.getString(String.valueOf("B_Id")));
					txtName.setText(rsBook.getString("Name"));
					txtAuthor.setText(rsBook.getString("Author"));
					txtRackNo.setText(rsBook.getString(String.valueOf("RackNo")));
					txtCatagory.setText(rsBook.getString("Catagory"));
					txtAddDate.setText(rsBook.getString("AddDate"));
				}catch(Exception e3){System.out.println(e3);}
			}
		});
		btnLast.setBounds(440, 312, 65, 23);
		tabBooks_1.add(btnLast);
		//previous
		JButton btnPrevious = new JButton("<");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					if(!rsBook.next())
						rsBook = st.executeQuery("select *from Book");
					if(rsBook.previous()){
						
						txtB_Id.setText(rsBook.getString(String.valueOf("B_Id")));
						txtName.setText(rsBook.getString("Name"));
						txtAuthor.setText(rsBook.getString("Author"));
						txtRackNo.setText(rsBook.getString(String.valueOf("RackNo")));
						txtCatagory.setText(rsBook.getString("Catagory"));
						txtAddDate.setText(rsBook.getString("AddDate"));
					}else{
						rsBook.next();
						JOptionPane.showMessageDialog(null,"No records in the previous field");
					}
				}catch(Exception e3){System.out.println(e3);}
			}
		});
		btnPrevious.setBounds(136, 312, 58, 23);
		tabBooks_1.add(btnPrevious);
		//next
		JButton btnNext = new JButton(">");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					if(!rsBook.next())
					rsBook = st.executeQuery("select *from Book");
					if(rsBook.next()){
						txtB_Id.setText(rsBook.getString(String.valueOf("B_Id")));
						txtName.setText(rsBook.getString("Name"));
						txtAuthor.setText(rsBook.getString("Author"));
						txtRackNo.setText(rsBook.getString(String.valueOf("RackNo")));
						txtCatagory.setText(rsBook.getString("Catagory"));
						txtAddDate.setText(rsBook.getString("AddDate"));
					}else{
						rsBook.previous();
						JOptionPane.showMessageDialog(null,"No records in the previous field");
					
					}
					
				}catch(Exception e2){System.out.println(e2);}
			}
		});
		btnNext.setBounds(351, 312, 67, 23);
		tabBooks_1.add(btnNext);
		
		txtAddDate = new JTextField();
		txtAddDate.setBounds(227, 232, 196, 29);
		tabBooks_1.add(txtAddDate);
		txtAddDate.setColumns(10);
		
		JButton btnClear = new JButton("New");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clear();
				txtB_Id.setText("Auto filled");				
			}
		});
		btnClear.setBounds(51, 360, 112, 23);
		tabBooks_1.add(btnClear);
		
		JLabel lblDdmmyyyy = new JLabel("dd/mm/yyyy");
		lblDdmmyyyy.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDdmmyyyy.setForeground(SystemColor.menu);
		lblDdmmyyyy.setBounds(440, 238, 83, 14);
		tabBooks_1.add(lblDdmmyyyy);
		
		JLabel Bbg = new JLabel("");
		Image b4 = new ImageIcon(this.getClass().getResource("/black.jpg")).getImage();
		Bbg.setIcon(new ImageIcon(b4));
		Bbg.setBounds(0, 0, 679, 433);
		tabBooks_1.add(Bbg);
		
		
		//Member\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
		JPanel Member_1 = new JPanel();
		tabbedPane.addTab("Members", null, Member_1, null);
		Member_1.setLayout(null);
		
		JLabel Mico = new JLabel("");
		Image ic6 = new ImageIcon(this.getClass().getResource("/member.png")).getImage();
		Mico.setIcon(new ImageIcon(ic6));
		Mico.setBounds(494, 86, 161, 148);
		Member_1.add(Mico);
		
		JLabel lblMemberId = new JLabel("Member ID");
		lblMemberId.setForeground(new Color(176, 224, 230));
		lblMemberId.setFont(new Font("Arial", Font.BOLD, 13));
		lblMemberId.setBounds(65, 21, 142, 30);
		Member_1.add(lblMemberId);
		
		JLabel lblFirstName = new JLabel("First name");
		lblFirstName.setForeground(new Color(175, 238, 238));
		lblFirstName.setFont(new Font("Arial", Font.BOLD, 13));
		lblFirstName.setBounds(65, 62, 142, 30);
		Member_1.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last name");
		lblLastName.setForeground(new Color(175, 238, 238));
		lblLastName.setFont(new Font("Arial", Font.BOLD, 13));
		lblLastName.setBounds(65, 103, 142, 30);
		Member_1.add(lblLastName);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setForeground(new Color(175, 238, 238));
		lblDateOfBirth.setFont(new Font("Arial", Font.BOLD, 13));
		lblDateOfBirth.setBounds(65, 144, 142, 30);
		Member_1.add(lblDateOfBirth);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setForeground(new Color(175, 238, 238));
		lblAddress.setFont(new Font("Arial", Font.BOLD, 13));
		lblAddress.setBounds(65, 185, 142, 30);
		Member_1.add(lblAddress);
		
		JLabel lblMobileNo = new JLabel("Mobile No.");
		lblMobileNo.setForeground(new Color(175, 238, 238));
		lblMobileNo.setFont(new Font("Arial", Font.BOLD, 13));
		lblMobileNo.setBounds(65, 226, 142, 30);
		Member_1.add(lblMobileNo);
		
		txtM_Id = new JTextField();
		txtM_Id.setFont(new Font("Arial", Font.PLAIN, 13));
		txtM_Id.setBounds(166, 24, 206, 26);
		Member_1.add(txtM_Id);
		txtM_Id.setColumns(10);
		
		txtFname = new JTextField();
		txtFname.setFont(new Font("Arial", Font.PLAIN, 13));
		txtFname.setColumns(10);
		txtFname.setBounds(166, 62, 206, 26);
		Member_1.add(txtFname);
		
		txtLname = new JTextField();
		txtLname.setFont(new Font("Arial", Font.PLAIN, 13));
		txtLname.setColumns(10);
		txtLname.setBounds(166, 103, 206, 26);
		Member_1.add(txtLname);
		
		txtDoB = new JTextField();
		txtDoB.setFont(new Font("Arial", Font.PLAIN, 13));
		txtDoB.setColumns(10);
		txtDoB.setBounds(166, 144, 206, 26);
		Member_1.add(txtDoB);
		
		txtAddress = new JTextField();
		txtAddress.setFont(new Font("Arial", Font.PLAIN, 13));
		txtAddress.setColumns(10);
		txtAddress.setBounds(166, 185, 206, 26);
		Member_1.add(txtAddress);
		
		txtTelephone = new JTextField();
		txtTelephone.setFont(new Font("Arial", Font.PLAIN, 13));
		txtTelephone.setColumns(10);
		txtTelephone.setBounds(166, 229, 206, 26);
		Member_1.add(txtTelephone);
		
		JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{	
					if(!rsMember.next())
						rsMember = st.executeQuery("select *from Member");
					rsMember.first();
					txtM_Id.setText(rsMember.getString(String.valueOf("M_Id")));
					txtFname.setText(rsMember.getString("Fname"));
					txtLname.setText(rsMember.getString("Lname"));
					txtDoB.setText(rsMember.getString(String.valueOf("DoB")));
					txtAddress.setText(rsMember.getString("Address"));
					txtTelephone.setText(rsMember.getString("Telephone"));
					
				}catch(Exception e1){System.out.println(e1);}
			}
		});
		btnNewButton.setBounds(35, 299, 65, 23);
		Member_1.add(btnNewButton);
		
		JButton button = new JButton("<");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					if(!rsMember.next())
						rsMember = st.executeQuery("select *from Member");
					if(rsMember.next()){
						txtM_Id.setText(rsMember.getString(String.valueOf("M_Id")));
						txtFname.setText(rsMember.getString("Fname"));
						txtLname.setText(rsMember.getString("Lname"));
						txtDoB.setText(rsMember.getString("DoB"));
						txtAddress.setText(rsMember.getString("Address"));
						txtTelephone.setText(rsMember.getString("Telephone"));						
					}else{
						rsMember.next();
						JOptionPane.showMessageDialog(null,"No records in the previous field");
					}
				}catch(Exception e3){System.out.println(e3);}
			}
		});
		button.setBounds(110, 299, 65, 23);
		Member_1.add(button);
		
		JButton button_1 = new JButton(">");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					if(!rsMember.next())
						rsMember = st.executeQuery("select *from Member");
					if(rsMember.next()){
						txtM_Id.setText(rsMember.getString(String.valueOf("M_Id")));
						txtFname.setText(rsMember.getString("Fname"));
						txtLname.setText(rsMember.getString("Lname"));
						txtDoB.setText(rsMember.getString("DoB"));
						txtAddress.setText(rsMember.getString("Address"));
						txtTelephone.setText(rsMember.getString("Telephone"));												
					}
					else{
						rsMember.previous();
						JOptionPane.showMessageDialog(null,"No records in the previous field");
					
					}
				}catch(Exception e2){System.out.println(e2);}
			}
		});
		button_1.setBounds(307, 299, 65, 23);
		Member_1.add(button_1);
		
		JButton button_2 = new JButton(">>");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					if(!rsMember.next())
						rsMember = st.executeQuery("select *from Member");
										
					txtM_Id.setText(rsMember.getString(String.valueOf("M_Id")));
					txtFname.setText(rsMember.getString("Fname"));
					txtLname.setText(rsMember.getString("Lname"));
					txtDoB.setText(rsMember.getString("DoB"));
					txtAddress.setText(rsMember.getString("Address"));
					txtTelephone.setText(rsMember.getString("Telephone"));			
				}catch(Exception e3){System.out.println(e3);}
			}
		});
		button_2.setBounds(382, 299, 65, 23);
		Member_1.add(button_2);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String MFname = txtFname.getText();
				String MLname = txtLname.getText();
				String MAddress = txtAddress.getText();
				String MTelephone = txtTelephone.getText();			
				String MDoB = txtDoB.getText();
				try{ 										 
						 if (rsMember.next()) {
							 rsMember.previous();
							 rsMember.updateString("Fname",MFname);
							 rsMember.updateString("Lname",MLname);
							 rsMember.updateString("Address", MAddress);
							 rsMember.updateString("DoB", MDoB);
							 rsMember.updateString("Telephone",MTelephone);
							 rsMember.updateRow();
							 rsMember.close();
							st.close(); 								
							st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);						
							rsMember = st.executeQuery("select *from Member");
						 }
						 rsMember.next();
					
					JOptionPane.showMessageDialog(null,"Record updated!");
					
				}catch(Exception e5){System.out.println(e5);}
			}
		});
		btnNewButton_1.setBounds(198, 299, 89, 23);
		Member_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clearMember();
			}
		});
		btnNewButton_2.setBounds(35, 353, 140, 23);
		Member_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Save");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String MFname = txtFname.getText();
				String MLname = txtLname.getText();
				String MAddress = txtAddress.getText(); 
				String MTelephone = txtTelephone.getText();			
				String MDoB = txtDoB.getText();
				try{   
					
					if (rsMember.next()){						
						rsMember.moveToInsertRow();
						rsMember.updateString("Fname",MFname);
						rsMember.updateString("Lname",MLname);
						rsMember.updateString("Address", MAddress);
						rsMember.updateString("DoB", MDoB);
						rsMember.updateString("Telephone",MTelephone);
						rsMember.insertRow();
						rsMember.close();						
						st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);						
						rsMember = st.executeQuery("select *from Member");						
					}
					rsMember.next();
				JOptionPane.showMessageDialog(null,"New record added!");
				
			}catch(Exception e5){System.out.println(e5);}
			}
		});
		btnNewButton_3.setBounds(198, 353, 89, 23);
		Member_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Delete");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					rsMember.deleteRow();
					rsMember.close();
					st.close();
					st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);						
					rsMember = st.executeQuery("select *from Member");					
					rsMember.next();
					clearMember();
					JOptionPane.showMessageDialog(null,"Record deleted!");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnNewButton_4.setBounds(307, 353, 140, 23);
		Member_1.add(btnNewButton_4);
		
		JLabel lblMmddyyyy = new JLabel("mm/dd/yyyy");
		lblMmddyyyy.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMmddyyyy.setForeground(new Color(240, 248, 255));
		lblMmddyyyy.setBounds(382, 148, 89, 21);
		Member_1.add(lblMmddyyyy);
		
		JLabel Mbg = new JLabel("");
		Image b5 = new ImageIcon(this.getClass().getResource("/black.jpg")).getImage();
		Mbg.setIcon(new ImageIcon(b5));
		Mbg.setBounds(0, 0, 679, 433);
		Member_1.add(Mbg);
		
		JPanel tabAdmin = new JPanel();
		tabbedPane.addTab("Admin", null, tabAdmin, null);
		tabAdmin.setLayout(null);
		
		JLabel Aico = new JLabel("");
		Image ic7 = new ImageIcon(this.getClass().getResource("/admin.png")).getImage();
		Aico.setIcon(new ImageIcon(ic7));
		Aico.setBounds(521, 132, 148, 116);
		tabAdmin.add(Aico);
		
		JLabel lblNewLabel_2 = new JLabel("Admin ID");
		lblNewLabel_2.setForeground(new Color(175, 238, 238));
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2.setBounds(48, 21, 148, 26);
		tabAdmin.add(lblNewLabel_2);
		
		JLabel lblFirstName_1 = new JLabel("First name");
		lblFirstName_1.setForeground(new Color(175, 238, 238));
		lblFirstName_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblFirstName_1.setBounds(48, 58, 148, 26);
		tabAdmin.add(lblFirstName_1);
		
		JLabel lblLastName_1 = new JLabel("Last name");
		lblLastName_1.setForeground(new Color(175, 238, 238));
		lblLastName_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblLastName_1.setBounds(48, 95, 148, 26);
		tabAdmin.add(lblLastName_1);
		
		JLabel lblDateOfBirth_1 = new JLabel("Date of Birth");
		lblDateOfBirth_1.setForeground(new Color(175, 238, 238));
		lblDateOfBirth_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblDateOfBirth_1.setBounds(48, 132, 148, 26);
		tabAdmin.add(lblDateOfBirth_1);
		
		JLabel lblAddress_1 = new JLabel("Address");
		lblAddress_1.setForeground(new Color(175, 238, 238));
		lblAddress_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblAddress_1.setBounds(48, 169, 148, 26);
		tabAdmin.add(lblAddress_1);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(new Color(175, 238, 238));
		lblUsername.setFont(new Font("Arial", Font.BOLD, 14));
		lblUsername.setBounds(48, 246, 148, 26);
		tabAdmin.add(lblUsername);
		
		JLabel lblPassword_1 = new JLabel("Password");
		lblPassword_1.setForeground(new Color(175, 238, 238));
		lblPassword_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblPassword_1.setBounds(48, 283, 148, 26);
		tabAdmin.add(lblPassword_1);
		
		txtA_Id = new JTextField();
		txtA_Id.setBounds(214, 23, 198, 24);
		tabAdmin.add(txtA_Id);
		txtA_Id.setColumns(10);
		
		txtAFname = new JTextField();
		txtAFname.setColumns(10);
		txtAFname.setBounds(214, 60, 198, 24);
		tabAdmin.add(txtAFname);
		
		txtALname = new JTextField();
		txtALname.setColumns(10);
		txtALname.setBounds(214, 97, 198, 24);
		tabAdmin.add(txtALname);
		
		txtADoB = new JTextField();
		txtADoB.setColumns(10);
		txtADoB.setBounds(214, 134, 198, 24);
		tabAdmin.add(txtADoB);
		
		txtAAddress = new JTextField();
		txtAAddress.setColumns(10);
		txtAAddress.setBounds(214, 171, 198, 24);
		tabAdmin.add(txtAAddress);
		
		txtAUserName = new JTextField();
		txtAUserName.setColumns(10);
		txtAUserName.setBounds(214, 250, 198, 24);
		tabAdmin.add(txtAUserName);
		
		txtAPassword = new JTextField();
		txtAPassword.setColumns(10);
		txtAPassword.setBounds(214, 285, 198, 24);
		tabAdmin.add(txtAPassword);
		
		JButton btnNewButton_5 = new JButton("<<");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{					
					if(!rsAdmin.next())
						rsAdmin = st.executeQuery("select *from Admin");
					txtA_Id.setText(rsAdmin.getString(String.valueOf("A_Id")));
					txtAFname.setText(rsAdmin.getString("Fname"));
					txtALname.setText(rsAdmin.getString("Lname"));
					txtADoB.setText(rsAdmin.getString("DoB"));					
					txtAStartDate.setText(rsAdmin.getString("Startdate"));
					txtAAddress.setText(rsAdmin.getString("Address"));	
					txtAUserName.setText(rsAdmin.getString("UserName"));	
					txtAPassword.setText(rsAdmin.getString("Password"));	
				}catch(Exception e1){System.out.println(e1);}
			}
		});
		btnNewButton_5.setBounds(48, 336, 63, 23);
		tabAdmin.add(btnNewButton_5);
		
		JButton button_3 = new JButton("<");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					if(!rsAdmin.next())
						rsAdmin = st.executeQuery("select *from Admin");
					if(rsAdmin.previous()){
						txtA_Id.setText(rsAdmin.getString(String.valueOf("A_Id")));
						txtAFname.setText(rsAdmin.getString("Fname"));
						txtALname.setText(rsAdmin.getString("Lname"));
						txtADoB.setText(rsAdmin.getString("DoB"));					
						txtAStartDate.setText(rsAdmin.getString("Startdate"));
						txtAAddress.setText(rsAdmin.getString("Address"));	
						txtAUserName.setText(rsAdmin.getString("UserName"));	
						txtAPassword.setText(rsAdmin.getString("Password"));	
					}else{
						rsAdmin.next();
						JOptionPane.showMessageDialog(null,"No records in the previous field");
					}
				}catch(Exception e3){System.out.println(e3);}
			}
		});
		button_3.setBounds(135, 336, 63, 23);
		tabAdmin.add(button_3);
		
		JButton button_4 = new JButton(">");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					if(rsAdmin.next()){
						if(!rsAdmin.next())
							rsAdmin = st.executeQuery("select *from Admin");
						txtA_Id.setText(rsAdmin.getString(String.valueOf("A_Id")));
						txtAFname.setText(rsAdmin.getString("Fname"));
						txtALname.setText(rsAdmin.getString("Lname"));
						txtADoB.setText(rsAdmin.getString("DoB"));					
						txtAStartDate.setText(rsAdmin.getString("Startdate"));
						txtAAddress.setText(rsAdmin.getString("Address"));	
						txtAUserName.setText(rsAdmin.getString("UserName"));	
						txtAPassword.setText(rsAdmin.getString("Password"));
					}else{
						rsAdmin.previous();
						JOptionPane.showMessageDialog(null,"No records in the previous field");
					
					}
					
				}catch(Exception e2){System.out.println(e2);}
			}
		});
		button_4.setBounds(337, 336, 63, 23);
		tabAdmin.add(button_4);
		
		JButton button_5 = new JButton(">>");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					if(!rsAdmin.next())
						rsAdmin = st.executeQuery("select *from Admin");				
					txtA_Id.setText(rsAdmin.getString(String.valueOf("A_Id")));
					txtAFname.setText(rsAdmin.getString("Fname"));
					txtALname.setText(rsAdmin.getString("Lname"));
					txtADoB.setText(rsAdmin.getString("DoB"));					
					txtAStartDate.setText(rsAdmin.getString("Startdate"));
					txtAAddress.setText(rsAdmin.getString("Address"));	
					txtAUserName.setText(rsAdmin.getString("UserName"));	
					txtAPassword.setText(rsAdmin.getString("Password"));
				}catch(Exception e3){System.out.println(e3);}
			}
		});
		button_5.setBounds(421, 336, 63, 23);
		tabAdmin.add(button_5);
		
		JButton btnUpdate_1 = new JButton("Update");
		btnUpdate_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String AFname = txtAFname.getText();
				String ALname = txtALname.getText();
				String ADoB = txtADoB.getText();
				String AStartDate = txtAStartDate.getText();
				String AAddress = txtAAddress.getText();			
				String AUserName = txtAUserName.getText();
				String APassword = txtAPassword.getText();
				try{  									 
						 if (rsAdmin.next()) {
							 rsAdmin.previous();
							 rsAdmin.updateString("Fname",AFname);
							 rsAdmin.updateString("Lname",ALname);
							 rsAdmin.updateString("DoB", ADoB);
							 rsAdmin.updateString("StartDate", AStartDate);
							 rsAdmin.updateString("Address", AAddress);
							 rsAdmin.updateString("UserName",AUserName);
							 rsAdmin.updateString("Password",APassword);
							 rsAdmin.updateRow();
							 rsAdmin.close();
							st.close(); 								
							st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);						
							rsAdmin = st.executeQuery("select *from Admin");
						 }
						 //rsAdmin.next();
					
					JOptionPane.showMessageDialog(null,"Record updated!");
					
				}catch(Exception e5){System.out.println(e5);}
			}
		});
		btnUpdate_1.setBounds(220, 336, 89, 23);
		tabAdmin.add(btnUpdate_1);
		
		JButton btnNewButton_6 = new JButton("New");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clearAdmin();
			}
		});
		btnNewButton_6.setBounds(48, 382, 125, 23);
		tabAdmin.add(btnNewButton_6);
		
		JButton btnDelete_1 = new JButton("Delete");
		btnDelete_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					rsAdmin.deleteRow();
					rsAdmin.close();
					st.close();
					st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);						
					rsAdmin = st.executeQuery("select *from Admin");					
					rsAdmin.next();
					clearAdmin();					
					JOptionPane.showMessageDialog(null,"Record deleted!");
				} catch (Exception e) {					
					e.printStackTrace();
				}
			}
		});
		btnDelete_1.setBounds(359, 382, 125, 23);
		tabAdmin.add(btnDelete_1);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String AFname = txtAFname.getText();
				String ALname = txtALname.getText();
				String ADoB = txtADoB.getText();
				String AStartDate = txtAStartDate.getText();
				String AAddress = txtAAddress.getText();			
				String AUserName = txtAUserName.getText();
				String APassword = txtAPassword.getText();
				try{   
					
					if (rsAdmin.next()){						
						rsAdmin.moveToInsertRow();
						rsAdmin.updateString("Fname",AFname);
						 rsAdmin.updateString("Lname",ALname);
						 rsAdmin.updateString("DoB", ADoB);
						 rsAdmin.updateString("StartDate", AStartDate);
						 rsAdmin.updateString("Address", AAddress);
						 rsAdmin.updateString("UserName",AUserName);
						 rsAdmin.updateString("Password",APassword);
						rsAdmin.insertRow();
						rsAdmin.close();
						st.close();						
						st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);						
						rsAdmin = st.executeQuery("select *from Admin");						
					}
					rsAdmin.next();
				JOptionPane.showMessageDialog(null,"New record saved!");
				
			}catch(Exception e5){System.out.println(e5);}
			}
		});
		btnSave.setBounds(202, 382, 125, 23);
		tabAdmin.add(btnSave);
		
		txtAStartDate = new JTextField();
		txtAStartDate.setColumns(10);
		txtAStartDate.setBounds(214, 210, 198, 24);
		tabAdmin.add(txtAStartDate);
		
		JLabel lblStartDate = new JLabel("Start Date");
		lblStartDate.setForeground(new Color(175, 238, 238));
		lblStartDate.setFont(new Font("Arial", Font.BOLD, 14));
		lblStartDate.setBounds(48, 209, 148, 26);
		tabAdmin.add(lblStartDate);
		
		JLabel lblMmddyyyy_1 = new JLabel("mm/dd/yyyy");
		lblMmddyyyy_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMmddyyyy_1.setForeground(new Color(240, 255, 240));
		lblMmddyyyy_1.setBounds(420, 139, 76, 14);
		tabAdmin.add(lblMmddyyyy_1);
		
		JLabel label = new JLabel("mm/dd/yyyy");
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setForeground(new Color(253, 245, 230));
		label.setBounds(421, 215, 75, 14);
		tabAdmin.add(label);
		
		JLabel Abg = new JLabel("");
		Image b7 = new ImageIcon(this.getClass().getResource("/black.jpg")).getImage();
		Abg.setIcon(new ImageIcon(b7));
		Abg.setBounds(0, 0, 679, 433);
		tabAdmin.add(Abg);
		Home.setVisible(true);
	}
	void clear(){
		txtName.setText("");
		txtAuthor.setText("");
		txtRackNo.setText("");
		txtCatagory.setText("");
		txtAddDate.setText("");
	}
	void clearMember(){
		txtFname.setText("");
		txtLname.setText("");
		txtAddress.setText("");
		txtTelephone.setText("");
		txtDoB.setText("");
		txtM_Id.setText("Auto filled");	
	}
	void clearAdmin(){
		txtAFname.setText("");
		txtALname.setText("");
		txtADoB.setText("");
		txtAStartDate.setText("");
		txtAAddress.setText("");			
		txtAUserName.setText("");
		txtAPassword.setText("");
		txtA_Id.setText("Auto filled");
	}
}
