package com.ambev.beerpoint.model;

import java.util.ArrayList;

/**
 * Created by matheuscatossi on 05/08/17.
 */

public class Networking {

    private int id;
    private ArrayList<Person> people;

    public Networking(int id, ArrayList<Person> people) {
        this.people = people;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeolpe(ArrayList<Person> people) {
        this.people = people;
    }
}
