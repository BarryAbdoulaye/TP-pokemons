package com.example.pokemon;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {

    @SerializedName("count")
    @Expose
    private Integer counter;
    @SerializedName("previous")
    @Expose
    private Object previous;
    @SerializedName("results")
    @Expose
    private List<Pokemon> results = null;
    @SerializedName("next")
    @Expose
    private String next;

    public Integer getCount() {
        return this.counter;
    }

    public void setCount(Integer count) {
        this.counter = count;
    }

    public Object getPrevious() {
        return this.previous;
    }

    public void setPrevious(Object previous) {
        this.previous = previous;
    }

    public List<Pokemon> getResults() {
        return results;
    }

    public void setResults(List<Pokemon> results) {
        this.results = results;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "PokemonsData{" +
                "count=" + this.counter +
                ", previous=" + this.previous +
                ", results=" + this.results +
                ", next='" + this.next + '\'' +
                '}';
    }

    /**
     * la classe qui modelise un pokemon
     */
    public class Pokemon {

        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("name")
        @Expose
        private String name;

        public String getUrl() {
            return this.url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Pokemon{" +
                    "url='" + this.url + '\'' +
                    ", name='" + this.name + '\'' +
                    '}';
        }
    }
}

