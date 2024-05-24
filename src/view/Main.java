package view;

import model.Attack;
import model.Bulbizarre;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main fonctionne");

        // Création d'une instance de Bulbizarre avec des valeurs fictives
        Bulbizarre bulbizarre = new Bulbizarre(1, "Bulbi", "Bulbizarre", "PLANTE", 17, 5, 100, new Attack("Vine Whip", "PLANTE", 20));

        // Affichage des informations sur le Bulbizarre
        System.out.println("Nom du Pokémon : " + bulbizarre.getName());
        System.out.println("Niveau : " + bulbizarre.getLevel());
        System.out.println("Points de vie : " + bulbizarre.getHp());
        System.out.println("Points de vie maximum : " + bulbizarre.getMaxHp());
        System.out.println("Points de vie maximum : " + bulbizarre.getMaxHp());
        // Et ainsi de suite pour les autres informations que vous souhaitez afficher
    }
}
