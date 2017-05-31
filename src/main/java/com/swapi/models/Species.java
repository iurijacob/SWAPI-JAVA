package com.swapi.models;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Species model represents a type of person or character within the Star Wars
 * Universe.
 *
 * @author Zygimantus
 */
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
    private ArrayList<String> peopleUrls;

    @SerializedName("films")
    private ArrayList<String> filmsUrls;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getAverageHeight() {
        return averageHeight;
    }

    public void setAverageHeight(String averageHeight) {
        this.averageHeight = averageHeight;
    }

    public String getAverageLifespan() {
        return averageLifespan;
    }

    public void setAverageLifespan(String averageLifespan) {
        this.averageLifespan = averageLifespan;
    }

    public String getEyeColors() {
        return eyeColors;
    }

    public void setEyeColors(String eyeColors) {
        this.eyeColors = eyeColors;
    }

    public String getHairColors() {
        return hairColors;
    }

    public void setHairColors(String hairColors) {
        this.hairColors = hairColors;
    }

    public String getSkinColors() {
        return skinColors;
    }

    public void setSkinColors(String skinColors) {
        this.skinColors = skinColors;
    }

    public String getHomeWorld() {
        return homeWorld;
    }

    public void setHomeWorld(String homeWorld) {
        this.homeWorld = homeWorld;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ArrayList<String> getPeopleUrls() {
        return peopleUrls;
    }

    public void setPeopleUrls(ArrayList<String> peopleUrls) {
        this.peopleUrls = peopleUrls;
    }

    public ArrayList<String> getFilmsUrls() {
        return filmsUrls;
    }

    public void setFilmsUrls(ArrayList<String> filmsUrls) {
        this.filmsUrls = filmsUrls;
    }

}
