package com.example.pokemon;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Details {

    private String number;
    private String name;
    private String species;
    private List<String> types = null;
    private Abilities abilities;
    private List<String> eggGroups = null;
    private List<Double> gender = null;
    private String height;
    private String weight;
    private Family family;
    private Boolean starter;
    private Boolean legendary;
    private Boolean mythical;
    private Boolean ultraBeast;
    private Boolean mega;
    private Integer gen;
    private String sprite;
    private String description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public Abilities getAbilities() {
        return abilities;
    }

    public void setAbilities(Abilities abilities) {
        this.abilities = abilities;
    }

    public List<String> getEggGroups() {
        return eggGroups;
    }

    public void setEggGroups(List<String> eggGroups) {
        this.eggGroups = eggGroups;
    }

    public List<Double> getGender() {
        return gender;
    }

    public void setGender(List<Double> gender) {
        this.gender = gender;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Boolean getStarter() {
        return starter;
    }

    public void setStarter(Boolean starter) {
        this.starter = starter;
    }

    public Boolean getLegendary() {
        return legendary;
    }

    public void setLegendary(Boolean legendary) {
        this.legendary = legendary;
    }

    public Boolean getMythical() {
        return mythical;
    }

    public void setMythical(Boolean mythical) {
        this.mythical = mythical;
    }

    public Boolean getUltraBeast() {
        return ultraBeast;
    }

    public void setUltraBeast(Boolean ultraBeast) {
        this.ultraBeast = ultraBeast;
    }

    public Boolean getMega() {
        return mega;
    }

    public void setMega(Boolean mega) {
        this.mega = mega;
    }

    public Integer getGen() {
        return gen;
    }

    public void setGen(Integer gen) {
        this.gen = gen;
    }

    public String getSprite() {
        return sprite;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


    public class Abilities {

        private List<String> normal = null;
        private List<String> hidden = null;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        public List<String> getNormal() {
            return normal;
        }

        public void setNormal(List<String> normal) {
            this.normal = normal;
        }

        public List<String> getHidden() {
            return hidden;
        }

        public void setHidden(List<String> hidden) {
            this.hidden = hidden;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }
    }

    public class Family {

        private Integer id;
        private Integer evolutionStage;
        private List<String> evolutionLine = null;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getEvolutionStage() {
            return evolutionStage;
        }

        public void setEvolutionStage(Integer evolutionStage) {
            this.evolutionStage = evolutionStage;
        }

        public List<String> getEvolutionLine() {
            return evolutionLine;
        }

        public void setEvolutionLine(List<String> evolutionLine) {
            this.evolutionLine = evolutionLine;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }

    @Override
    public String toString() {
        return "PokemonDataDetails{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
