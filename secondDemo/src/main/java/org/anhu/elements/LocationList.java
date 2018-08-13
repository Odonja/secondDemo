package org.anhu.elements;

import java.util.ArrayList;
import java.util.List;

public class LocationList {

	List<Location> locations;

	public LocationList() {
	}

	public LocationList(List<Location> locations) {
		this.locations = locations;
	}

	public List<Location> getLocations() {
		if (locations == null) {
			locations = new ArrayList<>();
		}
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}

	public void addLocation(Location location) {
		if (locations == null) {
			locations = new ArrayList<>();
		}
		locations.add(location);
	}

	@Override
	public String toString() {
		return "LocationList [locations=" + locations + "]";
	}

}
