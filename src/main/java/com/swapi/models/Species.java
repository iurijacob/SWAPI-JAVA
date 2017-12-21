package com.swapi.models;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
 * Species model represents a type of person or character within the Star Wars
 * Universe.
 *
 * @author Zygimantus
 */
@Data
public class Species implements Serializable {

    private String name;
    private String classification;
    private String designation;

    @SerializedName("average_height")
    private String averageHeight;

    @SerializedName("average_lifespan")
    private String averageLifespan;

    @SerializedName("eye_colors")
    private String eyeColors;

    @SerializedName("hair_colors")
    private String hairColors;

    @SerializedName("skin_colors")
    private String skinColors;

    @SerializedName("homeworld")
    private String homeWorld;

    private String language;
    private String created;
    private String edited;
    private String url;

    @SerializedName("people")
    private List<String> peopleUrls;

    @SerializedName("films")
    private List<String> filmsUrls;

}
