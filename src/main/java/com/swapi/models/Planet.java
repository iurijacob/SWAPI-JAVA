package com.swapi.models;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
 * Planet model represents a large mass, planet or planetoid in the Star Wars
 * Universe, at the time of 0 ABY.
 *
 * @author Zygimantus
 */
@Data
public class Planet implements Serializable {

    private String name;
    private String diameter;
    private String gravity;
    private String population;
    private String climate;
    private String terrain;
    private String created;
    private String edited;
    private String url;

    @SerializedName("rotation_period")
    private String rotationPeriod;

    @SerializedName("orbital_period")
    private String orbitalPeriod;

    @SerializedName("surface_water")
    private String surfaceWater;

    @SerializedName("residents")
    private List<String> residentsUrls;

    @SerializedName("films")
    private List<String> filmsUrls;
}
