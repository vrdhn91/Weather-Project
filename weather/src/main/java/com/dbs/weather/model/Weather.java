package com.dbs.weather.model;

import java.util.Date;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown =true)
@Document
public class Weather {
	
	@Id
	private String id;
	private String latitude;
	private String longitude;
	private String timezone;
	private String city;
	private String country;
//	private Currently currently;
	private String summary;
	private double temperature;
	private long time;
	private int precipIntensity;
	private int precipProbability;
	private double apparentTemperature;
	private double dewPoint;
	private double humidity;
	private double pressure;
	private double windSpeed;
	private double windGust;
	private int windBearing;
	private double cloudCover;
	private int uvIndex;
	private double visibility;
	private double ozone;
	private Date formatTime;
	
	public Weather() {
	}
	
	

	public Weather(String latitude, String longitude, String timezone, String city, String country, String summary,
			double temperature, long time, int precipIntensity, int precipProbability, double apparentTemperature,
			double dewPoint, double humidity, double pressure, double windSpeed, double windGust, int windBearing,
			double cloudCover, int uvIndex, double visibility, double ozone, Date formatTime) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.timezone = timezone;
		this.city = city;
		this.country = country;
		this.summary = summary;
		this.temperature = temperature;
		this.time = time;
		this.precipIntensity = precipIntensity;
		this.precipProbability = precipProbability;
		this.apparentTemperature = apparentTemperature;
		this.dewPoint = dewPoint;
		this.humidity = humidity;
		this.pressure = pressure;
		this.windSpeed = windSpeed;
		this.windGust = windGust;
		this.windBearing = windBearing;
		this.cloudCover = cloudCover;
		this.uvIndex = uvIndex;
		this.visibility = visibility;
		this.ozone = ozone;
		this.formatTime = formatTime;
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
	/*public Currently getCurrently() {
		return currently;
	}
	public void setCurrently(Currently currently) {
		this.currently = currently;
	}*/


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getSummary() {
		return summary;
	}


	public void setSummary(String summary) {
		this.summary = summary;
	}


	public double getTemperature() {
		return temperature;
	}


	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}


	public long getTime() {
		return time;
	}


	public void setTime(long time) {
		this.time = time;
	}


	public int getPrecipIntensity() {
		return precipIntensity;
	}


	public void setPrecipIntensity(int precipIntensity) {
		this.precipIntensity = precipIntensity;
	}


	public int getPrecipProbability() {
		return precipProbability;
	}


	public void setPrecipProbability(int precipProbability) {
		this.precipProbability = precipProbability;
	}


	public double getApparentTemperature() {
		return apparentTemperature;
	}


	public void setApparentTemperature(double apparentTemperature) {
		this.apparentTemperature = apparentTemperature;
	}


	public double getDewPoint() {
		return dewPoint;
	}


	public void setDewPoint(double dewPoint) {
		this.dewPoint = dewPoint;
	}


	public double getHumidity() {
		return humidity;
	}


	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}


	public double getPressure() {
		return pressure;
	}


	public void setPressure(double pressure) {
		this.pressure = pressure;
	}


	public double getWindSpeed() {
		return windSpeed;
	}


	public void setWindSpeed(double windSpeed) {
		this.windSpeed = windSpeed;
	}


	public double getWindGust() {
		return windGust;
	}


	public void setWindGust(double windGust) {
		this.windGust = windGust;
	}


	public int getWindBearing() {
		return windBearing;
	}


	public void setWindBearing(int windBearing) {
		this.windBearing = windBearing;
	}


	public double getCloudCover() {
		return cloudCover;
	}


	public void setCloudCover(double cloudCover) {
		this.cloudCover = cloudCover;
	}


	public int getUvIndex() {
		return uvIndex;
	}


	public void setUvIndex(int uvIndex) {
		this.uvIndex = uvIndex;
	}


	public double getVisibility() {
		return visibility;
	}


	public void setVisibility(double visibility) {
		this.visibility = visibility;
	}

	public double getOzone() {
		return ozone;
	}

	public void setOzone(double ozone) {
		this.ozone = ozone;
	}

	public Date getFormatTime() {
		return formatTime;
	}

	public void setFormatTime(Date formatTime) {
		this.formatTime = formatTime;
	}
	
	
}
