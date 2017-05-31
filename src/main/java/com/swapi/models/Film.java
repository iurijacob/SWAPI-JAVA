package com.swapi.models;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/**
 * Film model represents a Star Wars single film.
 *
 * @author Zygimantus
 */
public class Film implements Serializable {

    private String title;

    @SerializedName("episode_id")
    private int episodeId;

    @SerializedName("opening_crawl")
    private String openingCrawl;

    private String director;
    private String producer;
    private String release_date;
    private String url;
    private String created;
    private String edited;

    @SerializedName("species")
    private List<String> speciesUrls;

    @SerializedName("starships")
    private List<String> starshipsUrls;

    @SerializedName("vehicles")
    private List<String> vehiclesUrls;

    @SerializedName("planets")
    private List<String> planetsUrls;

    @SerializedName("characters")
    private List<String> charactersUrls;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEpisodeId() {
        return episodeId;
    }

    public void setEpisodeId(int episodeId) {
        this.episodeId = episodeId;
    }

    public String getOpeningCrawl() {
        return openingCrawl;
    }

    public void setOpeningCrawl(String openingCrawl) {
        this.openingCrawl = openingCrawl;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public List<String> getSpeciesUrls() {
        return speciesUrls;
    }

    public void setSpeciesUrls(List<String> speciesUrls) {
        this.speciesUrls = speciesUrls;
    }

    public List<String> getStarshipsUrls() {
        return starshipsUrls;
    }

    public void setStarshipsUrls(List<String> starshipsUrls) {
        this.starshipsUrls = starshipsUrls;
    }

    public List<String> getVehiclesUrls() {
        return vehiclesUrls;
    }

    public void setVehiclesUrls(List<String> vehiclesUrls) {
        this.vehiclesUrls = vehiclesUrls;
    }

    public List<String> getPlanetsUrls() {
        return planetsUrls;
    }

    public void setPlanetsUrls(List<String> planetsUrls) {
        this.planetsUrls = planetsUrls;
    }

    public List<String> getCharactersUrls() {
        return charactersUrls;
    }

    public void setCharactersUrls(List<String> charactersUrls) {
        this.charactersUrls = charactersUrls;
    }

}
