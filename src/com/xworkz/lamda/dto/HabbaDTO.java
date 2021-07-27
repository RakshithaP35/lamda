package com.xworkz.lamda.dto;

import java.io.Serializable;

public class HabbaDTO implements Serializable{
	
	private String name;
	private String region;
	private int noOfDays;
	private Religion religion;
	private String spcialFood;
	private boolean shouldBath;
	private boolean wakingUpEarly;
	
	HabbaDTO(){
		System.out.println("default");
	}

	public HabbaDTO(String name, String region, int noOfDays, Religion religion, String spcialFood, boolean shouldBath,
			boolean wakingUpEarly) {
		super();
		this.name = name;
		this.region = region;
		this.noOfDays = noOfDays;
		this.religion = religion;
		this.spcialFood = spcialFood;
		this.shouldBath = shouldBath;
		this.wakingUpEarly = wakingUpEarly;
	}

	@Override
	public String toString() {
		return "HabbaDTO [name=" + name + ", region=" + region + ", noOfDays=" + noOfDays + ", religion=" + religion
				+ ", spcialFood=" + spcialFood + ", shouldBath=" + shouldBath + ", wakingUpEarly=" + wakingUpEarly
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + noOfDays;
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result + ((religion == null) ? 0 : religion.hashCode());
		result = prime * result + (shouldBath ? 1231 : 1237);
		result = prime * result + ((spcialFood == null) ? 0 : spcialFood.hashCode());
		result = prime * result + (wakingUpEarly ? 1231 : 1237);
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
		HabbaDTO other = (HabbaDTO) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (noOfDays != other.noOfDays)
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		if (religion != other.religion)
			return false;
		if (shouldBath != other.shouldBath)
			return false;
		if (spcialFood == null) {
			if (other.spcialFood != null)
				return false;
		} else if (!spcialFood.equals(other.spcialFood))
			return false;
		if (wakingUpEarly != other.wakingUpEarly)
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public Religion getReligion() {
		return religion;
	}

	public void setReligion(Religion religion) {
		this.religion = religion;
	}

	public String getSpcialFood() {
		return spcialFood;
	}

	public void setSpcialFood(String spcialFood) {
		this.spcialFood = spcialFood;
	}

	public boolean isShouldBath() {
		return shouldBath;
	}

	public void setShouldBath(boolean shouldBath) {
		this.shouldBath = shouldBath;
	}

	public boolean isWakingUpEarly() {
		return wakingUpEarly;
	}

	public void setWakingUpEarly(boolean wakingUpEarly) {
		this.wakingUpEarly = wakingUpEarly;
	}

	
	
	

}
