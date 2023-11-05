package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job () {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }



    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        if ( name == null && employer == null && location == null && positionType == null && coreCompetency == null) return newLine + "OOPS! This job does not seem to exist.";
        // ternary operator
        // short for if else
        return newLine +
                "ID: " + ( id <= 0 ? "Data Not Available" : id) +  newLine +
                "Name: " + ( name == null || name.isEmpty() ? "Data mot Available" : name.toString()) + newLine +
                "Employer: " + ( employer == null ? "Data mot Available" : employer.toString()) + newLine +
                "Location: " + (location == null ? "Data mot Available" : location.toString()) + newLine +
                "Position Type: " + (positionType == null ? "Data mot Available" : positionType.toString()) + newLine +
                "Core Competency: " + (coreCompetency == null ? "Data mot Available" : coreCompetency.toString()) + newLine;
    }
}
