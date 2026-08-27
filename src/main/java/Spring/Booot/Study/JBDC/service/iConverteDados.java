package Spring.Booot.Study.JBDC.service;

public interface iConverteDados {
    <T> T converteDados(String json, Class<T> clazz);
}
