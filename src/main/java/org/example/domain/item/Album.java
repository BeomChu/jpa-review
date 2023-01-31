package org.example.domain.item;

import javax.persistence.Entity;

@Entity
public class Album extends Item{

    private String Artist;
    private String etc;

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }

    public String getEtc() {
        return etc;
    }

    public void setEtc(String etc) {
        this.etc = etc;
    }
}
