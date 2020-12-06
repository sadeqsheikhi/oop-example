package io.sadeq;

import java.util.ArrayList;
import java.util.List;

public class Reserve {

    // Attributes
    private String name;
    private String address;
    private List<Section> sections;

    private Office mainOffice;

    // Constructor
    public Reserve(String name, String address, Office office) {
        this.name = name;
        this.address = address;
        this.mainOffice = office;
        this.sections = new ArrayList<Section>();
    }


    // ==================================================================
    // getters & setters
    // ==================================================================
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Office getMainOffice() {
        return mainOffice;
    }

    public void setMainOffice(Office mainOffice) {
        this.mainOffice = mainOffice;
    }

    public void addSection(Section section) {
        this.sections.add(section);
    }

    public void printSections() {
        for (Section section : this.sections) {
            System.out.println(section.getName());
        }
    }

}