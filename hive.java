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
       //JvM������
       Class.forName(driverName);
       //������hive��һ������
      Connection conn=DriverManager.getConnection(url,user,password);
       //statement��java�������ݿ��һ���ӿڣ����������ӵ����ݿⷢ��SQLָ��
       Statement stmt=conn.createStatement();
       System.out.println(stmt);
}
}
