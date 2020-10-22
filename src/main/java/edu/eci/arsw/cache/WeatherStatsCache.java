package edu.eci.arsw.cache;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.eci.arsw.model.DatosCiudad;


@Service
public class WeatherStatsCache {
    private HashMap<String,DatosCiudad> memoriaDatoCiudad = new HashMap<String,DatosCiudad>();
    
    public void saveDatoPais(String pais, DatosCiudad datosPais){
        memoriaDatoCiudad.put(pais, datosPais);
    }

    public HashMap<String,DatosCiudad> getMemoriaDatoPais(){
        return memoriaDatoCiudad;
    }


}
