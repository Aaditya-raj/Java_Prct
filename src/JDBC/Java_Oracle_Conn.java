package JDBC;
import java.sql.*;

class TestConnection
{
     Connection cn=null;
     Statement st=null;
     PreparedStatement ps=null;

 ResultSet rs=null;
     String select_sql="select * from customer";
     String insert_sql="insert into customer values(?,?,?)";
     String delete_sql="delete from customer where cid=?";
     String update_sql="update customer set cname=?,cphno=? whereweb aa cid=?";
     public void getData()
     {
    	 try
    	 {
    	 //Class.forName("oracle.jdbc.driver.OracleDriver");//Resister and load the driver.
    	 //cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","iche","iche");//Establish the connection.
    	 ConnectionFactory con = new ConnectionFactory();
    	 //cn=con.getConn();
    		//st=con.getStatement();
    	 //st=cn.createStatement();//create the statement.
    	 //rs=st.executeQuery(select_sql);//execute query and store data.
    	 rs=con.getResultSet(select_sql);
    	 while(rs.next())
    	    {
    		 System.out.println(rs.getString(1)+"=====>"+rs.getString(2)+"======>"+rs.getString(3));
    		}
    	 }
//    	 catch(ClassNotFoundException ce)
//    	 {
//    		 ce.printStackTrace();
//    	 }
    	 catch(SQLException se)
    	 {
    		 se.printStackTrace();  
    	 }
     }
     
     public void insertData()
     {
    	 try
    	 {
//    	 Class.forName("oracle.jdbc.driver.OracleDriver");//Resister and load the driver.
//    	 cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","iche","iche");//Establish the connection.
    		 ConnectionFactory con = new ConnectionFactory();
        	 cn=con.getConn();	 
    		 
    	 ps=cn.prepareStatement(insert_sql);
    	 ps.setString(1, "C2");
    	 ps.setString(2, "SAIF");
    	 ps.setString(3, "43434");
    	 ps.executeUpdate();
    	 cn.commit();
    	 }
//    	 catch(ClassNotFoundException ce)
//    	 {
//    		 ce.printStackTrace();
//    	 }
    	 catch(SQLException se)
    	 {
    		 se.printStackTrace();  
    	 } 
     }
     
     public void deleteData()
     {
    	 try
    	 {
    	 //Class.forName("oracle.jdbc.driver.OracleDriver");//Resister and load the driver.
    	 //cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","iche","iche");//Establish the connection.
    		 ConnectionFactory con = new ConnectionFactory();
        	 cn=con.getConn();
        	 
    	 ps=cn.prepareStatement(delete_sql);
    	 ps.setString(1, "C1");
    	 ps.executeUpdate();
    	 cn.commit();
    	 }
//    	 catch(ClassNotFoundException ce)
//    	 {
//    		 ce.printStackTrace();
//    	 }
    	 catch(SQLException se)
    	 {
    		 se.printStackTrace();  
    	 } 
     }
     
     public void updateData()
     {
    	 try
    	 {
//    	 Class.forName("oracle.jdbc.driver.OracleDriver");//Resister and load the driver.
//    	 cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","iche","iche");//Establish the connection.
    		 ConnectionFactory con = new ConnectionFactory();
        	 cn=con.getConn();
    		 
    	 ps=cn.prepareStatement(update_sql);
    	 ps.setString(1, "SUDIPTA");
    	 ps.setString(2, "99999");
    	 ps.setString(3, "C3");
    	 ps.executeUpdate();
    	 cn.commit();
    	 }
//    	 catch(ClassNotFoundException ce)
//    	 {
//    		 ce.printStackTrace();
//    	 }
    	 catch(SQLException se)
    	 {
    		 se.printStackTrace();  
    	 } 
     }
}

public class Java_Oracle_Conn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestConnection ts = new TestConnection();
//		ts.insertData();
//		ts.deleteData();
//		ts.updateData(); 
		ts.getData();

	}

}
