package com.cg.mvc.practise.SpringDependency;

public class Tyre {
	private String brand;
	private int sno;

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "sno"+sno+ "]";
	}

	public Tyre(String brand, int sno) {
		this.brand = brand;
		this.sno = sno;
	}

	public Tyre() {
	}

}
