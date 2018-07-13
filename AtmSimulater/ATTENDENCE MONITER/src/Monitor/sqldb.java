package Monitor;
import java.sql.*;
import javax.swing.JOptionPane;



public class sqldb {
    public static  Statement st;
    public static Connection c;
    public static PreparedStatement adminLogin,addstudent,getPass,changePass;
    static{
        try{
         Class.forName("oracle.jdbc.driver.OracleDriver");
        c = DriverManager.getConnection(
        "jdbc:oracle:thin:@localhost:1521:xe","attenddb","attenddb");
        c.setAutoCommit(false);
         st=c.createStatement();
         adminLogin=c.prepareStatement("select * from adminddb where name=? and password=?");
         getPass=c.prepareStatement("select * from adminddb where name=?");
         changePass=c.prepareStatement("update adminLogin set password=? where name=?");
         addstudent=c.prepareStatement("insert into attenddb(Roll_No,Name,Gender,DOB,Hostler,Mob_No,Adr)"
         +"values(?,?,?,?,?,?,?");
}
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
