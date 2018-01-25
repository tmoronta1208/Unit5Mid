package com.example.android.unit5mid.model;

import java.util.List;

/**
 * Created by TatianaM on 1/24/18.
 */

public class Results {

    private String results;
    private Name[] name;
    private Location[] location;
    private String email;
    private String dob;
    private String cell;

    public Name[] getName() {
        return name;
    }

    public void setName(Name[] name) {
        this.name = name;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public Location[] getLocation() {
        return location;
    }

    public void setLocation(Location[] location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }
}
