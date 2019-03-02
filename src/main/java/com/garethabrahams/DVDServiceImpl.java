package com.garethabrahams;

public class DVDServiceImpl implements DVDInterface {
    String Name="";

    @Override
    public void createDVD(String dvdName) {
        Name = dvdName;
    }

    @Override
    public String getDvdName() {
        return Name;
    }

    @Override
    public void setDvdName(String dvdName) {
        Name = dvdName;
    }
}
