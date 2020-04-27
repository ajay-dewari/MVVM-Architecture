package com.dewari.ajay.dagger_example.model;

import android.util.Log;

import com.dewari.ajay.dagger_example.Engine;

import static com.dewari.ajay.dagger_example.Car.TAG;

public class DiaselEngine implements Engine {
    @Override
    public void engine() {
        Log.d(TAG, "Petrol-engine started...");
    }
}
