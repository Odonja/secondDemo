package org.anhu.elements;

import java.util.Arrays;

public class Tag {

	private int id;
	private String address;
	PositionValue[] datastreams;

	public Tag() {
	}

	public Tag(int id, String address, PositionValue[] datastreams) {
		this.id = id;
		this.address = address;
		this.datastreams = datastreams;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public PositionValue[] getDatastreams() {
		return datastreams;
	}

	public void setDatastreams(PositionValue[] datastreams) {
		this.datastreams = datastreams;
	}

	@Override
	public String toString() {
		return "Tag [id=" + id + ", address=" + address + ", datastreams=" + Arrays.toString(datastreams) + "]";
	}

}
