package com.garethabrahams;

public class DVD {
    String dvdName, Catergory;

    public  DVD (){

    }

    public DVD(String dvdName, String catergory) {
        this.dvdName = dvdName;
        Catergory = catergory;
    }

    public String getDvdName() {
        return dvdName;
    }

    public void setDvdName(String dvdName) {
        this.dvdName = dvdName;
    }

    public String getCatergory() {
        return Catergory;
    }

    public void setCatergory(String catergory) {
        Catergory = catergory;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "dvdName='" + dvdName + '\'' +
                ", Catergory='" + Catergory + '\'' +
                '}';
    }
}
