package hive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class hive {
       public static String driverName="org.apache.hive.jdbc.HiveDriver";
       public static String url="jdbc:hive2://192.168.77.200:9000/default";
       public static String user="root";
       public static String password="123456";
       public static void main(String[] args) throws ClassNotFoundException, SQLException{
       //JvM加载类
       Class.forName(driverName);
       //建立与hive的一个连接
      Connection conn=DriverManager.getConnection(url,user,password);
       //statement是java操作数据库的一个接口，用于向连接的数据库发送SQL指令
       Statement stmt=conn.createStatement();
       System.out.println(stmt);
}
}
