package Spring.Booot.Study.JBDC;

import Spring.Booot.Study.JBDC.model.ConverteDados;
import Spring.Booot.Study.JBDC.model.DadosSerie;
import Spring.Booot.Study.JBDC.service.ConsumoApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BibliotecaAplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaAplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=homem+aranha&apikey=c58aa8ec");
		// System.out.println(json);
		ConverteDados converteDados  = new ConverteDados();
		DadosSerie dados = converteDados.converteDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}