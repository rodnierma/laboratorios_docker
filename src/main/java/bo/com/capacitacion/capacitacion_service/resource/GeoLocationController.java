package bo.com.capacitacion.capacitacion_service.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import bo.com.capacitacion.capacitacion_service.dto.GeoLocationResponseDTO;
import bo.com.capacitacion.capacitacion_service.mock.GeoLocationMockService;
import bo.com.capacitacion.capacitacion_service.utils.json.JsonUtils;

@RestController
public class GeoLocationController {

	private Logger log = LoggerFactory.getLogger(getClass());

    private final GeoLocationMockService service;

    private JsonUtils jsonUtils = JsonUtils.newInstance();
    
    public GeoLocationController(GeoLocationMockService service) {
        this.service = service;
    }

    @GetMapping("/api/mock/geolocation")
    public GeoLocationResponseDTO getMock() {
    	try {
        	GeoLocationResponseDTO mockResponse = service.getGeoLocationMock(); 
        	log.info("Geolocalizacion: " + jsonUtils.logResponseJson(mockResponse, GeoLocationResponseDTO.class));
            return mockResponse;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
    	return null;
    }
    
	@GetMapping("/api/mock/geolocalizacion/{nro}")
    public GeoLocationResponseDTO getMockPath(@PathVariable String nro) {
    	try {
    		if (nro != null) {
    			if (nro != "") {
    				int nroint = Integer.parseInt(nro);
    				GeoLocationResponseDTO mockResponse = new GeoLocationResponseDTO();
    				for (int i=0; i<nroint; i++){
        	        	mockResponse = service.getGeoLocationMock(); 
        	        	int fila = i+1;
        	        	log.info(String.format("Geolocalizacion NRO: %s " + jsonUtils.logResponseJson(mockResponse, GeoLocationResponseDTO.class),fila));
    				}
    	            return mockResponse;    					
    			}
    		}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	return null;
    }

}
