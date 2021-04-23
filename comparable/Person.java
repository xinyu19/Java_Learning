package comparable;

import java.util.*;
import static java.util.Comparator.*;

public class Person {

	private String firstName;
	private String lastName;
	private Integer zipCode;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public Person(String firstName, String lastName, Integer zipCode) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.zipCode = zipCode;
	}

	public String toString() {
		return String.format("Person(%s %s, %d)", firstName, lastName, zipCode);
	}

}
