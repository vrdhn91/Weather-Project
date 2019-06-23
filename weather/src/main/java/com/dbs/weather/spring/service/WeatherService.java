package com.dbs.weather.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.weather.model.Weather;
import com.dbs.weather.spring.repository.WeatherRepository;

@Service
public class WeatherService {
	
	@Autowired
	private WeatherRepository weatherRepository;
	
		
	public Weather getByTimezone(String timezone) {
		return weatherRepository.findByTimezone(timezone);
	}
	
	public Weather getByLatitudeAndLongitude(String latitude, String longitude) {
		return weatherRepository.findByLatitudeAndLongitude(latitude, longitude);
	}
	
	public List<Weather> getAllWeather(){
		return weatherRepository.findAll();
	}
	
	public Weather callDarkSky(String latitude, String longitude) {
		//Weather darksky = darkskyRest.getWeather(latitude+","+longitude);
		Weather darksky = new Weather();
		/*Weather weather = new Weather();
		weather.setCity(darksky.getCity());
		weather.setCountry(darksky.getCountry());
		weather.setLatitude(darksky.getLatitude());
		weather.setLongitude(darksky.getLongitude());*/
		return darksky;
	}
	
	public void create(Weather weather) {
		weatherRepository.save(weather);
	}
	//The business process to delete record more than 3 days, should goes here

}
