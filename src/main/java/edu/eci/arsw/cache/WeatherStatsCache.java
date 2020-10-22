package edu.eci.arsw.cache;

import java.util.HashMap;
import org.springframework.stereotype.Service;

import edu.eci.arsw.model.DatosCiudad;


@Service
public class WeatherStatsCache {
    private HashMap<String,DatosCiudad> memoriaDatoCiudad = new HashMap<String,DatosCiudad>();
    
    public void saveDatoCiudad(String ciudad, DatosCiudad datos){
        memoriaDatoCiudad.put(ciudad, datos);
    }

    public HashMap<String,DatosCiudad> getMemoriaCiudad(){
        return memoriaDatoCiudad;
    }


}
