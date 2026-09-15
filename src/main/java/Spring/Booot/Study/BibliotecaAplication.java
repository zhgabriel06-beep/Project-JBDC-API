package Spring.Booot.Study;

import Spring.Booot.Study.dto.Main;
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
		Main main = new Main();
		main.exibeMenu();

	}
}