package day14;

import java.util.Objects;

public class Details {

	private String name ;
	private String city ;
	
	public Details() {}
	public Details(String name,String city) {
		
		this.name = name ;
		this.city = city ;
		
	}
	
	void setName(String n) {
		
		this.name = n ;
	}
	
	String getName() {
		
		return name ;
	}
	
	void setCity(String c) {
		
		this.city = c;
	}
	
	String getCity() {
		
		return this.city ;
	}
	@Override
	public String toString() {
		return "Details [name=" + name + ", city=" + city + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(city, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Details other = (Details) obj;
		return Objects.equals(city, other.city) && Objects.equals(name, other.name);
	}
}
