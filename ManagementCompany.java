package abc;

public class ManagementCompany {
	//contains an array of Property objects (aggregation) and related methods.
	//fields
	private String name;
	private String taxId;

	private Property[] properties;
	private int propertyCount;
	//constant
	public static final int MAX_PROPERTIES = 5;

	//parameterized constructor
	public ManagementCompany(String name, String taxId) {
		this.name = name;
		this.taxId = taxId;
		this.properties = new Property[MAX_PROPERTIES];
		this.propertyCount = 0;
	}

	//copy constructor
	public ManagementCompany(ManagementCompany other) {
		this.name = other.name;
		this.taxId = other.taxId;
		this.properties = new Property[other.properties.length];
		for (int i = 0; i < other.properties.length; i++) {
			if (other.properties[i] != null) {
				this.properties[i] = new Property(other.properties[i]);
			}
		}
		this.propertyCount = other.propertyCount;
	}
	//getters
	public String getName() {
		return name;
	}
	public String getTaxId() {
		return taxId;
	}
	public Property[] getProperties() {
		return properties;
	}
	public int getPropertyCount() {
		return propertyCount;
	}
	public Property getProperty(int index) {
		if (index >=0 && index < propertyCount) {
			return properties[index];
		}
		return null;
	}
	//setters
	public void setName(String name) {
		this.name = name;
	}
	public void setTaxID(String taxId) {
		this.taxId = taxId;
	}
	public void setProperties(Property[] properties) {
		this.properties = properties;
	}
	public void setPropertyCount(int propertyCount) {
		this.propertyCount = propertyCount;
	}

	//methods
	public int addProperty(Property p) {
		//adds a property to the array(copy into the array)
		if (propertyCount == MAX_PROPERTIES) {
			return -1;
		} else if (p == null){
			return -2;
		}
		properties[propertyCount] = new Property(p);
		propertyCount++;
		//return index or error code if full
		return propertyCount -1;
	}
	//return sum of all property rents
	public double totalRent() {
		double sum = 0.0;
		for (Property property : properties) {
			if (property != null) {
				sum += property.getRentAmount();
			}
		}
		return sum;
	}
	//toString
	@Override
	public String toString() {
		String result = "\nCompany name: " + name + "\nTax ID: " + taxId + "\nProperties: \n";
		for (Property property : properties) {
			if(property != null) {
				result += property.toString() + "\n";
			}
		}
		result += "Total amount of rent: " + totalRent();
		return result;
	}

}
