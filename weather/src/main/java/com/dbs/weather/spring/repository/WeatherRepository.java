package com.dbs.weather.spring.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dbs.weather.model.Weather;

@Repository
public interface WeatherRepository extends MongoRepository<Weather, String>{
	public Weather findByTimezone(String timezone);
	
	public Weather findByLatitudeAndLongitude(String latitude, String longitude);
	
	public List<Weather> findAll();
	
	
	
}
