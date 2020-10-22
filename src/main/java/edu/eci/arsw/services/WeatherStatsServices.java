package edu.eci.arsw.services;

import edu.eci.arsw.model.DatosCiudad;

public interface WeatherStatsServices {
	
	public  DatosCiudad cityWeather (String city);
	/*

	public List<DatosPais> getAllCountryNumbers(); 

	public HashMap<String,List<HashMap<String,String>>> statsNumbers ();
	
	public HashMap<String, String> countryNumbers (String pais); 
	
	public List<DatosProvincia> countryStatsNumbers (String pais);
		
	public String[] getAllCountries();
	*/
}
