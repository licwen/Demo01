package util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


//工具类
public class sqlSessionFactoryUtils {
	  
	 
	   private static SqlSessionFactory sqlsessionFactory =null;
	    
	   
	   //获取sqlsessionFactory对象
	   public static SqlSessionFactory getsqlsessionFactory() {
		    String resource ="mybatis-config.xml"; 
		    try {
		    	//1获取配置文件
				InputStream  inputStream=Resources.getResourceAsStream(resource);
			    //2创建sqlsessionFactory对象
				sqlsessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		    } catch (IOException e) {
			    e.printStackTrace();
			}
		    
	         return sqlsessionFactory;
	   }
	   
	   //获取sqlsession
	   public static  SqlSession openSqlSession() {
		    if (sqlsessionFactory==null) {
				getsqlsessionFactory();
			}
		   
		   return sqlsessionFactory.openSession();
	   }
	   
	   

}
