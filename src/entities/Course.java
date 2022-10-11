package entities;

public class Course {
	
 private String courseName;
 private double unitPrice;
 
public Course(String courseName, double unitPrice) {
	super();
	this.courseName = courseName;
	this.unitPrice = unitPrice;
}

public Course() {
	super();
}

public String getCourseName() {
	return courseName;
}

public void setCourseName(String courseName) {
	this.courseName = courseName;
}

public double getUnitPrice() {
	return unitPrice;
}

public void setUnitPrice(double unitPrice) {
	this.unitPrice = unitPrice;
}
 
 
 
 

}
