package entities;

public class Teachers {
	
	private String teachersFirstName;
	private String teachersLastName;
	
	
	public Teachers(String teachersFirstName, String teachersLastName) {
		this.teachersFirstName = teachersFirstName;
		this.teachersLastName= teachersLastName;
	}
	
	
	public String getTeachersFirstName() {
		return teachersFirstName;
	}
	public void setTeachersFirstName(String teachersFirstName) {
		this.teachersFirstName = teachersFirstName;
	}
	public String getTeachersLastName() {
		return teachersLastName;
	}
	public void setTeachersLastName(String teachersLastName) {
		this.teachersLastName = teachersLastName;
	}
	
	
	

}
