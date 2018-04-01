import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class Main {
	ResultSet rsBook,rsMember, rsAdmin, rsBw;
	Statement st;
	Connection con;
	PreparedStatement pst;
public Main(){
	connect();
}
public void connect(){
	try{
		
		//String driver = "sun.jdbc.odbc.JdbcOdbcDriver";		
		//Class.forName(driver);
		
		
		con = DriverManager.getConnection("jdbc:ucanaccess://F:/Java programing/Library Management system/LibraryDb.accdb");
		
		st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		
		rsBook = st.executeQuery("select *from Book");
		
		rsMember = st.executeQuery("select *from Member");
		
		rsAdmin = st.executeQuery("select *from Admin");
		
		rsBw = st.executeQuery("select *from Borrow");
	}catch(Exception e){System.out.println(e);}
}
	public static void main(String[] args) {
		new Main();
		new Gui();
	}

}
