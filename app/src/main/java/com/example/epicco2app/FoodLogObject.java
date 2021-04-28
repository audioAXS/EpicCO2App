package com.example.epicco2app;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class FoodLogObject {

    Integer dairy;
    Integer meat;
    Integer plant;
    Integer restaurant;
    Integer total;
    DateAndTime logTime;
    public FoodLogObject(){
        Date time = Calendar.getInstance().getTime();
        this.logTime = new DateAndTime();
        logTime.setDay(time.getDate());
        logTime.setMonth(time.getMonth());
        logTime.setYear(time.getYear()+1900);
    }

    public void setFromJSON(JSONObject data) throws JSONException {

        this.dairy = (int) data.getDouble("Dairy");
        this.meat = (int) data.getDouble("Meat");
        this.plant = (int) data.getDouble("Plant");
        this.restaurant = (int) data.getDouble("Restaurant");
        this.total = (int) data.getDouble("Total");
    }

    public void printTime() {
        System.out.println(logTime.toString());
    }

    public DateAndTime getLogTime() {return logTime;}

    public void setLogTime(DateAndTime dataTime) {this.logTime = dataTime;}

    public Integer getDairy() {
        return dairy;
    }

    public void setDairy(Integer dairy) {
        this.dairy = dairy;
    }

    public Integer getMeat() {
        return meat;
    }

    public void setMeat(Integer meat) {
        this.meat = meat;
    }

    public Integer getPlant() {
        return plant;
    }

    public void setPlant(Integer plant) {
        this.plant = plant;
    }

    public Integer getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Integer restaurant) {
        this.restaurant = restaurant;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
