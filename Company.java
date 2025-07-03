package com.jobsearch.model;

public class Company {
    private String name;
    private String website;
    private String careersPage;
    private boolean hiresFreshers;
    private String location;

    // Constructors, getters, setters
    public Company(String name, String website, String careersPage, boolean hiresFreshers, String location) {
        this.name = name;
        this.website = website;
        this.careersPage = careersPage;
        this.hiresFreshers = hiresFreshers;
        this.location = location;
    }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    // ... other getters and setters
}
