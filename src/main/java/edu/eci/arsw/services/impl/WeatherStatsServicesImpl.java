package edu.eci.arsw.services.impl;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;

import edu.eci.arsw.cache.WeatherStatsCache;
import edu.eci.arsw.connection.HttpConnectionService;
import edu.eci.arsw.services.WeatherStatsServices;
import edu.eci.arsw.model.DatosCiudad;

/**
 * @author Nicolás
 * Servicio de consulta del clima
 */
@Service
public class WeatherStatsServicesImpl implements WeatherStatsServices {

	@Autowired
	public HttpConnectionService connectionHttp;

	@Autowired
	public WeatherStatsCache weatherStatsCache;
	
	@Autowired
	public WeatherStatsCache cache;
	
	/**
	 * Retorna el objeto con los datos del clima de la ciudad seleccionada
	 * @param String city
	 * @return DatosCiudad 
	 */
	@Override
	public DatosCiudad cityWeather(String city) {
		DatosCiudad resp=null;
		if (cache.getMemoriaCiudad().containsKey(city)) {
			resp=cache.getMemoriaCiudad().get(city);
		}else {
			HttpResponse<JsonNode> res = connectionHttp.cityWeather(city);
			
			JSONObject r = res.getBody().getObject().getJSONObject("main");
			
			String temp=Double.toString(r.getDouble("temp"));
			String sens=Double.toString(r.getDouble("feels_like"));
			String min=Double.toString(r.getDouble("temp_min"));
			String max=Double.toString(r.getDouble("temp_max"));
			String pre=String.valueOf(r.getLong("pressure"));
			String hum=String.valueOf(r.getLong("humidity"));
			
			resp= new DatosCiudad(city, temp, sens, min, max, hum, pre);
		}		
		
		
		return resp;
	}

}
