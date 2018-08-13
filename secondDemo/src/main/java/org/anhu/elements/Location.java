package org.anhu.elements;

public class Location {

	private int tagID;
	private double xPosition;
	private double yPosition;

	public Location() {
	}

	public Location(int tagID, double xPosition, double yPosition) {
		this.tagID = tagID;
		this.xPosition = xPosition;
		this.yPosition = yPosition;
	}

	public int getTagID() {
		return tagID;
	}

	public void setTagID(int tagID) {
		this.tagID = tagID;
	}

	public double getxPosition() {
		return xPosition;
	}

	public void setxPosition(double xPosition) {
		this.xPosition = xPosition;
	}

	public double getyPosition() {
		return yPosition;
	}

	public void setyPosition(double yPosition) {
		this.yPosition = yPosition;
	}

	@Override
	public String toString() {
		return "Location [tagID=" + tagID + ", xPosition=" + xPosition + ", yPosition=" + yPosition + "]";
	}

}
