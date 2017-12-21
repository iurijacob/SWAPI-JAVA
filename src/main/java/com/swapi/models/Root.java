package com.swapi.models;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import lombok.Data;

/**
 * Root model that provides information on all avaiable resources within the
 * API.
 *
 * @author Zygimantus
 */
@Data
public class Root implements Serializable {

    @SerializedName("films")
    private String filmsUrl;
    @SerializedName("people")
    private String peopleUrl;
    @SerializedName("planets")
    private String planetsUrl;
    @SerializedName("species")
    private String speciesUrl;
    @SerializedName("starships")
    private String starshipsUrl;
    @SerializedName("vehicles")
    private String vehiclesUrl;
}
