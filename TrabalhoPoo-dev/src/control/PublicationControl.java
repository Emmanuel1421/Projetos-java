package control;

import model.Publication;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class PublicationControl extends Publication {
//devo adicionar a classe musica aqui?para comentar especificamente na musica
    Scanner scn = new Scanner(System.in);
    Publication publication = new Publication();

    public void CreatePublication() {



        List<String> Publication = new ArrayList<>();

        System.out.println("Escreva o seu comentário: ");
        setDescription(scn.nextLine());
        publication.add("Comentário: "+setDescription());
        //como eu faço para o comentário ser opcional?
        //tem gente que não escreve, apenas avalia

        System.out.println("Deixe sua avaliação");
        setRating(scn.nextInt());

        System.out.println("Deseja deixar uma curtida?");
        String resposta = scn.nextLine();

        if (resposta.equalsIgnoreCase("SIM")){
        setLike(true);//caso o usuario digite sim,o comentário é curtido


        System.out.println("Comentário adicionado!");
        for (String publications: publication){

        }

        }

    }

}
