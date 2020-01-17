package com.example.pocketmonsters.Model;

import com.mapbox.mapboxsdk.geometry.LatLng;

import androidx.annotation.NonNull;

public class User {

    private int lifePoints;

    private int expPoints;

    private String username;

    private String base64Image;

    public User() {
        this.lifePoints = 100;
        this.expPoints = 0;
    }

    public User(int lifePoints, int expPoints, String username, String base64Image) {
        this.lifePoints = lifePoints;
        this.expPoints = expPoints;
        this.username = username;
        this.base64Image = base64Image;
    }

    // Setters & getters

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public void setExpPoints(int expPoints) {
        this.expPoints = expPoints;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setBase64Image(String base64Image) {
        this.base64Image = base64Image;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public int getExpPoints() {
        return expPoints;
    }

    public String getUsername() {
        return username;
    }

    public String getBase64Image() {
        return base64Image;
    }

    public void resetLifePoints() {
        this.lifePoints = 100;
    }

    @NonNull
    @Override
    public String toString() {
        return String.format("username: %s; life points: %s; exp points: %s", username, lifePoints, expPoints);
    }

    public boolean canInteract(LatLng lastKnownLocation, MapObject mapObject) {
        LatLng objectLatLng = new LatLng(mapObject.getLat(), mapObject.getLon());
        /*
        if (lastKnownLocation.distanceTo(objectLatLng) < 50.0)
            return true;
        else
            return false;
        */
        return true;
    }
}