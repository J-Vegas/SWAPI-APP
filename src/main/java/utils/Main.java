package utils;

import static utils.People.*;
import static utils.Films.*;
import static utils.Planets.*;
import static utils.Starships.*;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("----------People----------");
        //getPeopleByName (String name);
        System.out.println("--------------------------");
        getPeopleByID(3); //Done
        System.out.println("--------------------------");
        //getAllPeople();

        System.out.println("----------Planet----------");
        //getPlanetByName(String name);
        System.out.println("--------------------------");
        getPlanetByID(2); //Done
        System.out.println("--------------------------");
        //getAllPlanets();

        System.out.println("----------Film----------");
        //getFilmByTitle(String title);
        System.out.println("--------------------------");
        getFilmByID(5); //Done
        System.out.println("--------------------------");
        //getAllFilms();

        System.out.println("----------Species----------");
        //getSpeciesByName(String name);
        System.out.println("--------------------------");
        //getSpeciesByID(2);
        System.out.println("--------------------------");
        //getAllSpecies();

        System.out.println("----------Vehicle----------");
        //getVehicleByName(String name);
        System.out.println("--------------------------");
        //getVehicleByID( int id);
        System.out.println("--------------------------");
        //getAllVehicles();

        System.out.println("----------Starship----------");
        //getStarshipByName(String name);
        System.out.println("--------------------------");
        getStarshipByID(3);
        System.out.println("--------------------------");
        //getAllStarships();
    }
}
