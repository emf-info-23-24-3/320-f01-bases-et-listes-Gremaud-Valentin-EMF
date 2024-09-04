package app;

import java.util.ArrayList;

import models.Personne;

public class Application {

    public static void main(String[] args) {

        ArrayList<Personne> tableauPersonne = new ArrayList<>();
        tableauPersonne.add(new Personne("Bardy", "Jerome", "La rue 1", 1541));
        tableauPersonne.add(new Personne("Gremaud", "Baptiste", "La rue 2", 1765));
        tableauPersonne.add(new Personne("Ribeiro", "Guilherme", "La rue 3", 1834));

        for (Personne personne : tableauPersonne) {
            System.out.println(personne.getNom());
        }

    }

}
