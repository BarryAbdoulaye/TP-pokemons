package com.example.pokemon;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Pokemons {

    public static final String ENDPOINT = "https://pokeapi.co/api/v2/";
    public static final String ENDPOINT2 = "https://pokeapi.glitch.me/v1/";

    @GET("pokemon?offset=0&limit=151")
    Call<Data> getPokemons1gen();

    @GET("pokemon?offset=151&limit=100")
    Call<Data> getPokemons2gen();

    @GET("pokemon?offset=251&limit=135")
    Call<Data> getPokemons3gen();

    @GET("pokemon?offset=386&limit=107")
    Call<Data> getPokemons4gen();

    @GET("pokemon?offset=493&limit=156")
    Call<Data> getPokemons5gen();

    @GET("pokemon?offset=649&limit=72")
    Call<Data> getPokemons6gen();

    @GET("pokemon?offset=721&limit=88")
    Call<Data> getPokemons7gen();

    @GET("pokemon?offset=809&limit=89")
    Call<Data> getPokemons8gen();

    @GET("pokemon/{id}")
    Call<List<Details>> getPokemonsdetails(@Path("id") String id);


}
