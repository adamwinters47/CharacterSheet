package com.winter.charactersheet.models;

import java.io.Serializable;

public class PlayerCharacter implements Serializable {

    private String name;
    private String race;
    private String clazz;
    private String addlInfo;

    public PlayerCharacter() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getAddlInfo() {
        return addlInfo;
    }

    public void setAddlInfo(String addlInfo) {
        this.addlInfo = addlInfo;
    }

    @Override
    public String toString() {
        return "PlayerCharacter{" +
                "name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", clazz='" + clazz + '\'' +
                ", addlInfo='" + addlInfo + '\'' +
                '}';
    }
}
