package modle;

public class User {
	private int id;
	private String name;
	private String password;
	private int point;
	
	public User() {}
	public User(int id, String name, String password, int point) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.point = point;
	}
	
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}//ֻ��������һ�Σ���ע��ʱ
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	//����Ա�ɻ�����룬�԰������������ͬѧ����user����getPassword
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	
	public int getPoint() {return point;}
	//public void setPoint(int point) {this.point = point;}
	
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", point=" + point
				+ "]";
	}
	
}
