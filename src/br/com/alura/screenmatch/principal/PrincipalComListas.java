package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("The Matrix", 1999);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoPett = new Filme("A Reconstrução do Relacionamento", 2023);
        filmeDoPett.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        Filme f1 = filmeDoPett;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPett);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao()>2) {
//                Filme filme = (Filme) item;
                System.out.println("Classificacao " +filme.getClassificacao());
            }

        }



    }

}
