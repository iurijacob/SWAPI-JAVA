package com.swapi.sw;

import com.swapi.models.Film;
import com.swapi.models.People;
import com.swapi.models.Planet;
import com.swapi.models.Root;
import com.swapi.models.SWModelList;
import com.swapi.models.Species;
import com.swapi.models.Starship;
import com.swapi.models.Vehicle;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Oleur on 21/12/2014. Star Wars API interface for making calls.
 */
public interface StarWars {

    @GET("")
    public void getRootUrls(Callback<Root> callback);

    @GET("people/")
    public Call<SWModelList<People>> getAllPeople(@Query("page") int page);

    @GET("people/{id}/")
    public void getPeople(@Path("id") int peopleId,
            Callback<People> callback);

    @GET("films/")
    public Call<SWModelList<Film>> getAllFilms(@Query("page") int page);

    @GET("films/{id}/")
    public void getFilm(@Path("id") int filmId,
            Callback<Film> callback);

    @GET("starships")
    public Call<SWModelList<Starship>> getAllStarships(@Query("page") int page);

    @GET("starships/{id}/")
    public void getStarship(@Path("id") int starshipId,
            Callback<Starship> callback);

    @GET("vehicles/")
    public Call<SWModelList<Vehicle>> getAllVehicles(@Query("page") int page);

    @GET("vehicles/{id}/")
    public void getVehicle(@Path("id") int vehicleId,
            Callback<Vehicle> callback);

    @GET("species/")
    public Call<SWModelList<Species>> getAllSpecies(@Query("page") int page);

    @GET("species/{id}/")
    public Call<Species> getSpecies(@Path("id") int speciesId);

    @GET("planets/")
    public Call<SWModelList<Planet>> getAllPlanets(@Query("page") int page);

    @GET("planets/")
    public Call<SWModelList<Planet>> getAllPlanetsByName(@Query("search") String name, @Query("page") int page);

    @GET("planets/{id}/")
    public void getPlanet(@Path("id") int planetId,
            Callback<Planet> callback);

}
