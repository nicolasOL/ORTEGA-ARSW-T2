package edu.eci.arsw.services;

import java.util.HashMap;
import java.util.List;

import edu.eci.arsw.model.*;

public interface WeatherStatsServices {
	
	public HashMap<String, String> globalNumbers ();

	public List<DatosPais> getAllCountryNumbers(); 

	public HashMap<String,List<HashMap<String,String>>> statsNumbers ();
	
	public HashMap<String, String> countryNumbers (String pais); 
	
	public List<DatosProvincia> countryStatsNumbers (String pais);
		
	public String[] getAllCountries();
}