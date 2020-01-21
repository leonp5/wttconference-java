package de.wttconference.backend.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "attendees")

public class Attendee {
  private String name;
  private String address;
  private String location;
  private String email;
  private String phone;
  private String highschool;
  private String gender;
  private String nutrition;
  private String other;

public Attendee(String name, String address, String location, String email, String phone, String highschool,
		String gender, String nutrition, String other) {
	this.name = name;
	this.address = address;
	this.location = location;
	this.email = email;
	this.phone = phone;
	this.highschool = highschool;
	this.gender = gender;
	this.nutrition = nutrition;
	this.other = other;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getHighschool() {
	return highschool;
}

public void setHighschool(String highschool) {
	this.highschool = highschool;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getNutrition() {
	return nutrition;
}

public void setNutrition(String nutrition) {
	this.nutrition = nutrition;
}

public String getOther() {
	return other;
}

public void setOther(String other) {
	this.other = other;
}

@Override
public String toString() {
	return "Attendee [address=" + address + ", email=" + email + ", gender=" + gender + ", highschool=" + highschool
			+ ", location=" + location + ", name=" + name + ", nutrition=" + nutrition + ", other=" + other + ", phone="
			+ phone + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((address == null) ? 0 : address.hashCode());
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	result = prime * result + ((gender == null) ? 0 : gender.hashCode());
	result = prime * result + ((highschool == null) ? 0 : highschool.hashCode());
	result = prime * result + ((location == null) ? 0 : location.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((nutrition == null) ? 0 : nutrition.hashCode());
	result = prime * result + ((other == null) ? 0 : other.hashCode());
	result = prime * result + ((phone == null) ? 0 : phone.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Attendee other = (Attendee) obj;
	if (address == null) {
		if (other.address != null)
			return false;
	} else if (!address.equals(other.address))
		return false;
	if (email == null) {
		if (other.email != null)
			return false;
	} else if (!email.equals(other.email))
		return false;
	if (gender == null) {
		if (other.gender != null)
			return false;
	} else if (!gender.equals(other.gender))
		return false;
	if (highschool == null) {
		if (other.highschool != null)
			return false;
	} else if (!highschool.equals(other.highschool))
		return false;
	if (location == null) {
		if (other.location != null)
			return false;
	} else if (!location.equals(other.location))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (nutrition == null) {
		if (other.nutrition != null)
			return false;
	} else if (!nutrition.equals(other.nutrition))
		return false;
	if (this.other == null) {
		if (other.other != null)
			return false;
	} else if (!this.other.equals(other.other))
		return false;
	if (phone == null) {
		if (other.phone != null)
			return false;
	} else if (!phone.equals(other.phone))
		return false;
	return true;
}

}

  

