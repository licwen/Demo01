package pojo;

import java.util.List;

public class User { // user
	private Integer id;
	private String name;
	private String pwd;
	private Integer age;
	private String sex;
	private String tel;
	private Integer point;// 积分
	private String remark;// 备注
	private List<Ticket> ticketList;

	public User() {
		super();
	}

	public User(Integer id, String name, String pwd, Integer age, String sex, String tel, Integer point, String remark,
			List<Ticket> ticketList) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.age = age;
		this.sex = sex;
		this.tel = tel;
		this.point = point;
		this.remark = remark;
		this.ticketList = ticketList;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Integer getPoint() {
		return point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<Ticket> getTicketList() {
		return ticketList;
	}

	public void setTicketList(List<Ticket> ticketList) {
		this.ticketList = ticketList;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", pwd=" + pwd + ", age=" + age + ", sex=" + sex + ", tel=" + tel
				+ ", point=" + point + ", remark=" + remark + ", ticketList=" + ticketList + "]";
	}

}
