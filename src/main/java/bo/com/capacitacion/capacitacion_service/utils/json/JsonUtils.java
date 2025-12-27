package bo.com.capacitacion.capacitacion_service.utils.json;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Rodnie Montano Aguilera
 */
public class JsonUtils {

	private final Gson gson;
	
	private Logger log = LoggerFactory.getLogger(getClass());

	public JsonUtils() {
		gson = new GsonBuilder().serializeNulls().create();
	}

	// ------------------------------------------------------------------
	public String toJson(JsonObject obj) {
		return gson.toJson(obj);
	}

	public String toJson(List<JsonObject> list) {
		return gson.toJson(list);
	}

	public <E> String toJsonObject(E obj) {
		return gson.toJson(obj);
	}

	public <E> String toJsonObject(List<E> list) {
		return gson.toJson(list);
	}

	public <E> JsonArray toJsonArray(List<E> types) {
		JsonArray list = new JsonArray();
		for (E e : types) {
			list.add(fromJson(e));
		}
		return list;
	}

	public <E, F> JsonArray toJsonArray(Map<E, F> values) {
		JsonArray list = new JsonArray();
		for (E key : values.keySet()) {
			F value = values.get(key);
			if (value instanceof List) {
				list.add(toJsonArray((List<?>) value));
			} else {
				list.add(fromJson(value));
			}

		}
		return list;
	}

	// ------------------------------------------------------------------
	public <E> E fromJson(String json, Class<E> clazz) {
		return gson.fromJson(json, clazz);
	}

	public <E> E fromJson(String json, Type type) {
		return gson.fromJson(json, type);
	}

	public <E> E fromJson(JsonElement json, Type type) {
		return gson.fromJson(json, type);
	}

	public <E> E fromJson(JsonElement json, Class<E> clazz) {
		return gson.fromJson(json, clazz);
	}

	public List<Long> fromJsonListIds(String json) {
		Type listOfType = new TypeToken<ArrayList<Long>>() {
		}.getType();

		List<Long> list = gson.fromJson(json, listOfType);
		return list;
	}

	public <E> JsonObject fromJson(String json) {
		JsonObject jsonObject = null;
		if (StringUtils.isNotEmpty(json)) {
			jsonObject = gson.fromJson(json, JsonObject.class);
		}
		return jsonObject;
	}

	public <E> JsonObject fromJson(E dto) {
		return dto == null ? null : fromJson(gson.toJson(dto));
	}

	// ------------------------------------------------------------------
	public static JsonUtils newInstance() {
		return new JsonUtils();
	}
	
	//*******************************************************************
	
    public <E> String logResponses(String value, Class<E> clazz) throws JsonGenerationException, JsonMappingException, IOException {
    	Object result = fromJson(value, clazz);
    	ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
    	String jsonLog = ow.writeValueAsString(result);
    	//log.info(jsonLog);
    	return (String) jsonLog;
    }

    
    public  <E> E convertirJsonToObject(String jsonString, Class<E> clazz) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(jsonString, clazz);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public void recorrerMapa(Map<String, Object> mapa) {
    	mapa.forEach((clave, valor) -> {
            log.info(clave + ":" + valor);
    	});
    }

    public boolean validarClave(Map<String, Object> mapa, String clave) {
        return mapa.containsKey(clave);
    }

    public <E> String logResponseJson(E obj, Class<E> clazz) throws JsonGenerationException, JsonMappingException, IOException {
    	String value=toJsonObject(obj);
    	Object result = fromJson(value, clazz);
    	ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
    	String jsonLog = ow.writeValueAsString(result);
    	//log.info(jsonLog);
    	return (String) jsonLog;
    }

}
