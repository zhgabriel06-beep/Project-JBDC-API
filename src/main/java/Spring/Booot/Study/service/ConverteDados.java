package Spring.Booot.Study.service;

import tools.jackson.core.JacksonException;
import tools.jackson.databind.ObjectMapper;

public class ConverteDados  implements iConverteDados {
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public <T> T converteDados(String json, Class<T> clazz) {
       try {
           return objectMapper.readValue(json, clazz);
       }catch (JacksonException e){
           e.printStackTrace();
       }
        return null;
    }
}
