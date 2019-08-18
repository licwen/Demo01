package pojo;

public class Ticket {
	private Integer id;
	private String address;
	private String price;
	private Integer uid;

	public Ticket() {
		super();
	}

	public Ticket(Integer id, String address, String price, Integer uid) {
		super();
		this.id = id;
		this.address = address;
		this.price = price;
		this.uid = uid;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", address=" + address + ", price=" + price + ", uid=" + uid + "]";
	}

}
