package com.swapi.models;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Zygimantus
 * @param <T>
 */
public class SWModelList<T> implements Serializable {

    private int count;
    private String next;
    private String previous;
    private ArrayList<T> results;

    public boolean hasMore() {
        return (next != null && next.length() != 0);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public ArrayList<T> getResults() {
        return results;
    }

    public void setResults(ArrayList<T> results) {
        this.results = results;
    }

}
