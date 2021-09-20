package com.saraya.model;

import javax.validation.constraints.Size;

public class Crampon {
	private int id;
	
	@Size(min = 4, message = "Enter at least 4 letters  ")
	private String make;
	private String image;
	
	public Crampon(int id, String make, String image) {
		this.id = id;
		this.make = make;
		this.image  = image;
	}

	public Crampon() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String toString() {
		return "Crampon [id=" + id + ", make=" + make + ", image=" + image + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Crampon other = (Crampon) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
