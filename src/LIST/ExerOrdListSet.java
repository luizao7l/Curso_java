package LIST;

import java.util.*;

public class ExerOrdListSet {
    public static void main(String[] args) {
        System.out.println("--\tordem aleatória\t--");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got","fantasia",60));
            add(new Serie("dark","drama",60));
            add(new Serie("that '70 show","comédia",25));
        }};
        for (Serie serie : minhasSeries) System.out.println(serie.getNome()+" - "+ serie.getGenero() +" - "+serie.getTempoDeEpisodio());
        System.out.println("--\tordem Inserção\t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("got","fantasia",60));
            add(new Serie("dark","drama",60));
            add(new Serie("that '70 show","comédia",25));
        }};
        for (Serie serie : minhasSeries1) System.out.println(serie.getNome()+" - "+ serie.getGenero() +" - "+serie.getTempoDeEpisodio());
        System.out.println("--\tordem natural TempoDeEpisódio\t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie : minhasSeries2) System.out.println(serie.getNome()+" - "+ serie.getGenero() +" - "+serie.getTempoDeEpisodio());
        System.out.println("--\tordem Nome/Gênero/TempoDeEpisódio\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatoNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie : minhasSeries3) System.out.println(serie.getNome()+" - "+ serie.getGenero() +" - "+serie.getTempoDeEpisodio());



    }
}
class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer tempoDeEpisodio;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempoDeEpisodio, serie.tempoDeEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoDeEpisodio);
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoDeEpisodio=" + tempoDeEpisodio +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoDeEpisodio() {
        return tempoDeEpisodio;
    }

    public Serie(String nome, String genero, Integer tempoDeEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoDeEpisodio = tempoDeEpisodio;
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare (this.getTempoDeEpisodio(),serie.getTempoDeEpisodio());
        if (tempoEpisodio!=0) return tempoEpisodio;

        return  this.getGenero().compareTo(serie.getGenero());

    }
}
class ComparatoNomeGeneroTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome !=0) return nome;
        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero !=0) return genero;
        return Integer.compare (s1.getTempoDeEpisodio(),s2.getTempoDeEpisodio());




    }
}