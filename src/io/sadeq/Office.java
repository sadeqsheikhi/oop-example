package io.sadeq;

public class Office {
    private String officeManager;

    public Office(String officeManager) {
        this.officeManager = officeManager;
    }

    String getOfficeManager() {
        return officeManager;
    }

    void setOfficeManager(String officeManager) {
        this.officeManager = officeManager;
    }
}