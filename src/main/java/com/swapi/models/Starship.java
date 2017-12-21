package com.swapi.models;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Starship model represents a single transport craft that has hyperdrive
 * capability.
 *
 * @author Zygimantus
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Starship extends Vehicle implements Serializable {

    @SerializedName("starship_class")
    private String starshipClass;

    @SerializedName("hyperdrive_rating")
    private String hyperdriveRating;

    @SerializedName("MGLT")
    private String mglt;

}
