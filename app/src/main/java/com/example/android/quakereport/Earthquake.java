package com.example.android.quakereport;

/**
 * Created by doyou on 3/5/2018.
 */

public class Earthquake {

    String mCity;
    int mMagnitude;
    String mDate;

    public Earthquake(String city, int magnitude, String date){
        mCity = city;
        mMagnitude = magnitude;
        mDate = date;
    }

    public String getCity(){
        return mCity;
    }

    public int getMagnitude(){
        return mMagnitude;
    }

    public String getDate(){
        return mDate;
    }
}
