package mapper;

import pojo.User;

public interface IUserMapper {
	//添加用户
	public int addUser(User user);
	//查询用户
	public User selectUserById(Integer id);
	//删除用户
	public int deleteUserById(Integer id);
}
