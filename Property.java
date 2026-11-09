/*
 * Class: CMSC203
 * Instructor: Gary Thai
 * Description: This program manage multiple properties owned or managed by a company. The
 * ManagementCompany class is the aggregation and data management, propertyDriver class is the main class
 * and property class has the info for each rental such as the name of property, city, owner's name and rental amount price.
 * Due: 11/08/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
   Print your Name here: Laura Jimena Nino Castillo
*/

package abc;
//represents a single rental property.
public class Property {
	//private fields
	private String propertyName;
	private String city;
	private String owner;
	private double rentAmount;

	//constructors
	//default constructor
	public Property() {
		this.propertyName = "";
		this.city = "";
		this.owner = "";
		this.rentAmount = 0.0;
	}

	//parameterized constructor
	public Property(String propertyName, String city,double rentAmount, String owner) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
	}

	//copy constructor--takes another Property object and copies its fields
	public Property(Property other) {
		this.propertyName = other.propertyName;
		this.city = other.city;
		this.owner = other.owner;
		this.rentAmount = other.rentAmount;
	}
	//getters and setters for **all fields**
	//getters
	public String getPropertyName() {
		return propertyName;
	}
	public String getCity() {
		return city;
	}
	public String getOwner() {
		return owner;
	}
	public double getRentAmount() {
		return rentAmount;
	}
	//setters
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}
	//toString display
	@Override
	public String toString() {
		return "Property name: " + propertyName + "\nCity: " + city + "\nAmount of rent: " + rentAmount + "\nOwner: " + owner;
	}
}
