package admin;
import image.*;
import l_a_f.*;
import adminFrame.*;
import java.sql.*;
import funct.*;
import java.lang.*;
import java.util.*;
import java.util.regex.*;
import java.io.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Admin implements ActionListener
{
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/";

	//  Database credentials
	static final String USER = "root";
	static final String PASS = "";


	Connection conn = null;
	Statement stmt = null;

	funct.Functions function = new funct.Functions();

	JFrame aconsole = new JFrame("Employee Login");
	JTextField uname;
	static JPasswordField pass; 
	JButton ab;
	boolean status = false;

	public Admin()
	{
		sql.Sql sq = new sql.Sql();

		aconsole.setVisible(true);
		aconsole.setSize(250,190);
		aconsole.setLocationRelativeTo(null);
		//aconsole.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aconsole.setLayout(null);
		aconsole.setResizable(false);
		aconsole.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		image.Logo image = new image.Logo(aconsole);

		l_a_f.LookAndFeel laf = new l_a_f.LookAndFeel(aconsole);
		
		JLabel al1 = new JLabel("Username");
		al1.setBounds(20,20,100,20);// x axis, y axis, width, height
		aconsole.add(al1);

		uname = new JTextField();
		uname.setBounds(85,21,100,20);
		aconsole.add(uname);

		JLabel al2 = new JLabel("Password");
		al2.setBounds(20,60,100,20);
		aconsole.add(al2);

		pass = new JPasswordField();
		pass.setBounds(85,61,100,20);
		aconsole.add(pass);pass.addActionListener(this);

		ab = new JButton("Sign In");
		ab.setBounds(60,101,100,40);
		aconsole.add(ab);ab.addActionListener(this);

		aconsole.setBackground(Color.black);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource() == ab || ae.getSource() == pass)
		{
			try
			{
				//STEP 2: Register JDBC driver
				Class.forName("com.mysql.jdbc.Driver");

				//STEP 3: Open a connection
				conn = DriverManager.getConnection(DB_URL, USER, PASS);

				//STEP 4: Execute a query
				stmt = conn.createStatement();

				String sql = "SELECT username,password FROM java.admin";
				ResultSet rs = stmt.executeQuery(sql);
				//STEP 5: Extract data from result set
				while(rs.next())
				{
					//Retrieve by column name
					String username = rs.getString("username");
					String pas = rs.getString("password");
					char[] password = pas.toCharArray();

					String pass2 = new String (pass.getPassword());

					//Display values
					// System.out.print("Name\n" + name+"\n");
					if ((String.valueOf(uname.getText()).equals(username)))
					{
						if (pas.equals(pass2))
						{
							JOptionPane.showMessageDialog(aconsole,"Log In Successful");
							adminFrame.AdminFrame adminPage = new adminFrame.AdminFrame();
							function.updateQuery("java","user","IsActive","0","username",""+username);
							aconsole.setVisible(false);
						}
						else
						{
							JOptionPane.showMessageDialog(aconsole,"Wrong Password");
						}
					}
					else
					{
						JOptionPane.showMessageDialog(aconsole,"Wrong Username");
					}
				}
				rs.close();
			}
		   catch(SQLException se)
		   {
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }
		   catch(Exception e)
		   {
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }
		   finally
		   {
		      //finally block used to close resources
		      try
		      {
		         if(stmt!=null)
		            conn.close();
		      }
		      catch(SQLException se){
		      }// do nothing
		      try
		      {
		         if(conn!=null)
		            conn.close();
		      }
		      catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		}
	}

	public static void main(String args[])
	{
		new Admin();
	}
}