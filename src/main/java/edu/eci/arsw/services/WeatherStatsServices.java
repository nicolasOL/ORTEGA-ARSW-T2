package edu.eci.arsw.services;

import edu.eci.arsw.model.DatosCiudad;

/**
 * @author Nicolás
 * Servicio de consulta del clima
 */
public interface WeatherStatsServices {
	
	public  DatosCiudad cityWeather (String city);

}
