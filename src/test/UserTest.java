package test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import mapper.IUserMapper;
import pojo.User;
import util.sqlSessionFactoryUtils;

public class UserTest {
	public static void main(String[] args) {
		//addUser();
		//selectUserById();
		//deleteUserById();
		findUserWithTicketTest();
	}

	//添加用户
	public static void addUser() {
		SqlSession sqlSession = sqlSessionFactoryUtils.openSqlSession();
		IUserMapper mapper = sqlSession.getMapper(IUserMapper.class);
		User user = new User(0, "tom", "123", 18, "男", "10086", 0, "巨有钱", null);
		int row = mapper.addUser(user);
		if (row > 0) {
			System.out.println("添加成功");
		} else {
			System.out.println("添加失败");
		}
		//System.out.println(user.getId());
		sqlSession.commit();
		sqlSession.close();
	}

	//查询用户
	public static void selectUserById() {
		SqlSession sqlSession = sqlSessionFactoryUtils.openSqlSession();
		IUserMapper mapper = sqlSession.getMapper(IUserMapper.class);
		User user = mapper.selectUserById(2);
		System.out.println(user);
		sqlSession.commit();
		sqlSession.close();
	}

	//删除用户
	public static void deleteUserById() {
		SqlSession sqlSession = sqlSessionFactoryUtils.openSqlSession();
		IUserMapper mapper = sqlSession.getMapper(IUserMapper.class);
		int row = mapper.deleteUserById(4);
		if (row > 0) {
			System.out.println("删除成功");
		} else {
			System.out.println("删除失败");
		}
		sqlSession.commit();
		sqlSession.close();
	}
	
	
	//
		public static void findUserWithTicketTest() {
			SqlSession sqlSession = sqlSessionFactoryUtils.openSqlSession();
			List<User> user = sqlSession.selectList("findUserWithTicket", 1);
			System.out.println(user);
			sqlSession.close();
		}

}
