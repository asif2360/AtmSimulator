
package MyBankAtm;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class sqldb {
    public static  Statement st;
    public static Connection c;
    public static PreparedStatement addUser,unblockUser,readUser,blockUser,loginadmin,getAll,updateUser1,getUser,updateUser,delUser,loginuser,transUser,pinUpdate,depositUser;
     public static PreparedStatement readAccount,fastcash,suspendUser,getstuLike;
    static{
        try{
         Class.forName("oracle.jdbc.driver.OracleDriver");
        c = DriverManager.getConnection(
        "jdbc:oracle:thin:@localhost:1521:xe","atmdb","atmdb");
        c.setAutoCommit(true);
         st=c.createStatement();
         loginuser=c.prepareStatement("select * from holder where name=? and card =? and pin=?");
         loginadmin=c.prepareStatement("select * from login where name=?  and pin=?");
         addUser=c.prepareStatement("insert into holder(name,gender,mob,bank,card,pin,balance)"+
                 "values(?,?,?,?,?,?,?)");
         updateUser=c.prepareStatement("update holder set balance=balance-? where  card=? and pin=? and balance>0");
        getUser=c.prepareStatement("select balance from holder where card=?");
        transUser=c.prepareStatement("update holder set balance=balance+? where card=?");
        pinUpdate=c.prepareStatement("update holder set pin=? where card=? and pin=?");
        depositUser=c.prepareStatement("update holder set balance=balance+? where card=? and pin=?");
        getAll=c.prepareStatement("select * from holder");
        readUser=c.prepareStatement("select * from holder where name=? and id=?");
        blockUser=c.prepareStatement("update holder set pin=0000 where name=? and id=?");
        unblockUser=c.prepareStatement("update holder set pin=? where name=? and id=?");
        readAccount=c.prepareStatement("select * from holder where card=? and pin=?");
        suspendUser=c.prepareStatement("delete from holder where id=? and name=?");
        getstuLike=c.prepareStatement("select * from holder where name like=? ");
        //updateUser1=c.prepareStatement("update holder set balance=balance-? where  card=? and pin=? and balance>");
        //updateUser=c.prepareStatement("if (balance>0) update holder set balance=balance-? where  card=? and pin=?; end;");
         //updateUser=c.prepareStatement("update holder set balance=if(balance>0,balance-?,balance) where balance is NOT NULL");
         //addUser=c.prepareStatement( "insert into userinfo(name,phone,age,email)"+
         //"values(?,?,?,?)");
         //getUser=c.prepareStatement("select from userinfo where  userid=?");
         //updateUser=c.prepareStatement("update userinfo set name=?,phone=?,age=?,email=? where userid=?");
         //delUser=c.prepareStatement("delete from userinfo where userid=?");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Driver nhi mila");
        }
    }
}
