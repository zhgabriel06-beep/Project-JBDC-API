package Spring.Booot.Study.service;

public interface iConverteDados {
    <T> T converteDados(String json, Class<T> clazz);
}
