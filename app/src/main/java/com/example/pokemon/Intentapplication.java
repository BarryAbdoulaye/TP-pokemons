package com.example.pokemon;

public class Intentapplication extends android.app.Application {

    String pokeurl;

    @Override
    public void onCreate() {
        super.onCreate();
        this.pokeurl = null;
    }

    public String geturl() {
        return pokeurl;
    }

    public void seturl(String pokeurl) {
        this.pokeurl = pokeurl;
    }
}


