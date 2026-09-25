package Spring.Booot.Study.infra;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.DoubleBinaryOperator;

import static java.lang.Double.valueOf;

@Getter
@Setter
public class Serie {
  private   String titulo;
  private   Integer totalTemporadas;
  private   Double avaliacao;
  private   Categoria genero;
  private   String atores;
  private   String poster;
  private   String sinopse;

    public  Serie(DadosSerie dadosSerie){
        this.titulo = dadosSerie.titulo();
        this.totalTemporadas = dadosSerie.totalTemporadas();
        this.avaliacao = OptionalDouble.of
                (Double.valueOf(dadosSerie.avaliacao())).orElse(0.0);
       this.genero = Categoria.fromString(dadosSerie.genero().split(",")[0].trim());
       this.atores = dadosSerie.atores().split(",")[0].trim();
       this.poster = dadosSerie.poster();
       this.sinopse = dadosSerie.sinopse();
    }

    @Override
    public String toString() {
        return   "genero=" + genero +
                ", atores='" + atores + '\'' +
                ", titulo='" + titulo + '\'' +
                ", totalTemporadas=" + totalTemporadas +
                ", avaliacao=" + avaliacao +
                ", poster='" + poster + '\'' +
                ", sinopse='" + sinopse + '\'';
    }
}

