package bo.com.capacitacion.capacitacion_service.mock;

import java.io.InputStream;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

import com.fasterxml.jackson.databind.ObjectMapper;

import bo.com.capacitacion.capacitacion_service.dto.GeoLocationResponseDTO;

@Service
@RequestScope
public class GeoLocationMockService {

	   private final ObjectMapper objectMapper = new ObjectMapper();

	    public GeoLocationResponseDTO getGeoLocationMock() {
	        try {
	            InputStream is = new ClassPathResource(
	                    "mock/geolocation-response.json"
	            ).getInputStream();

	            return objectMapper.readValue(is, GeoLocationResponseDTO.class);

	        } catch (Exception e) {
	            throw new RuntimeException("Error leyendo JSON mock", e);
	        }
	    }
}
