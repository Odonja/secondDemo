package org.anhu.elements;

public class PositionValue {

	private String id;
	private double current_value;
	// private Date at;

	public PositionValue() {
	}

	public PositionValue(String id, double current_value) {
		this.id = id;
		this.current_value = current_value;
	}

//	public PositionValue(String id, double current_value, Date at) {
//		this.id = id;
//		this.current_value = current_value;
//		this.at = at;
//	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getCurrent_value() {
		return current_value;
	}

	public void setCurrent_value(double current_value) {
		this.current_value = current_value;
	}

//	public Date getAt() {
//		return at;
//	}
//
//	public void setAt(Date at) {
//		this.at = at;
//	}

	@Override
	public String toString() {

		return "PositionValue [id=" + id + ", current_value=" + current_value + "]";
	}

}
