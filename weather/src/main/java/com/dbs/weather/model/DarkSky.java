package com.dbs.weather.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DarkSky {
	
	private String latitude;
	private String longitude;
	private String timezone;
	private Currently currently;
	
	public DarkSky() {
	}

	public DarkSky(String latitude, String longitude, String timezone, Currently currently) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.timezone = timezone;
		this.currently = currently;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public Currently getCurrently() {
		return currently;
	}

	public void setCurrently(Currently currently) {
		this.currently = currently;
	}
	
	
	
	

}
