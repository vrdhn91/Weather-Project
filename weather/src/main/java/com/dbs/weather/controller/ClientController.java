package com.dbs.weather.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.dbs.weather.model.DarkSky;
import com.dbs.weather.model.Weather;
import com.dbs.weather.spring.service.WeatherService;

@Controller
public class ClientController {
	
	private static final Logger log = LoggerFactory.getLogger(ClientController.class);
	
	@Autowired
	private WeatherService weatherService;
	
	List<Weather> weatherList = new ArrayList<Weather>();
	String key = "";
	
	@PostConstruct
    public void init() throws Exception {
		weatherList = weatherService.getAllWeather();
    }
		
	@GetMapping
	public String index() {
		return "redirect:/weather";
	}
	
	@GetMapping("/weather")
	public String getWeather(Model model) {
		model.addAttribute("forecasts",weatherList);
		return "weather.html";
	}
	
	@GetMapping("/weather/details/{city}")
	public String getWeatherDetails(@PathVariable String city,Model model) {
		Weather weather = new Weather();
		for(Weather w : weatherList) {
			if(w.getCity().equalsIgnoreCase(city)) {
				weather=w;
			}
		}
		/*Date time = new Date(weather.getTime());
		weather.setFormatTime(time);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		Date currentDate = new Date();
		String formatDate = format.format(currentDate);
		key = formatDate;
		if(time.before(currentDate)) {
			String key = weather.getLatitude()+","+weather.getLongitude()+","+formatDate;
			System.out.println(key);
			return "redirect:/getDarkSky/";
		}*/
		model.addAttribute("city_weather",weather);
		return "details.html";
	}
	
	@GetMapping("/getDarkSky")
	public String getDarkSky(Model model) {
		final String uri = "https://api.darksky.net/forecast/f5ded83d1ea5b555baabadd961f321ef/"+key;
	    RestTemplate restTemplate = new RestTemplate();
	    DarkSky darkSky = restTemplate.getForObject(uri, DarkSky.class);
		
	    log.info("DARK SKY: "+darkSky.toString());

	    return "redirect:/weather/details";
	}
	
	
    

}
