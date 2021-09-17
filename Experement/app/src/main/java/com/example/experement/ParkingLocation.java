package com.example.experement;
public class ParkingLocation {
    int logo;
    String LocName;
    String TotalSlot;
    String AvailableSlot;
    String TwoWheel;
    String FourWheel;

    public ParkingLocation(int logo, String locName, String totalSlot, String availableSlot, String twoWheel, String fourWheel) {
        this.logo = logo;
        LocName = locName;
        TotalSlot = totalSlot;
        AvailableSlot = availableSlot;
        TwoWheel = twoWheel;
        FourWheel = fourWheel;
    }

    public String getTwoWheel() {
        return TwoWheel;
    }

    public void setTwoWheel(String twoWheel) {
        TwoWheel = twoWheel;
    }

    public String getFourWheel() {
        return FourWheel;
    }

    public void setFourWheel(String fourWheel) {
        FourWheel = fourWheel;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getLocName() {
        return LocName;
    }

    public void setLocName(String locName) {
        LocName = locName;
    }

    public String getTotalSlot() {
        return TotalSlot;
    }

    public void setTotalSlot(String totalSlot) {
        TotalSlot = totalSlot;
    }

    public String getAvailableSlot() {
        return AvailableSlot;
    }

    public void setAvailableSlot(String availableSlot) {
        AvailableSlot = availableSlot;
    }
}
