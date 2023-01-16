package com.example.recycleview_esercizio;

public class Persona {
    private String name,cognome;
    private int image;

    public Persona(String name, String cognome, int image) {
        this.name = name;
        this.cognome = cognome;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
