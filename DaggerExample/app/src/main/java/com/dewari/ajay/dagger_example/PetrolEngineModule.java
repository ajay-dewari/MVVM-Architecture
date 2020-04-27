package com.dewari.ajay.dagger_example;

import com.dewari.ajay.dagger_example.model.DieselEngine;

import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModule {

    private int horsePower;

    public PetrolEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int provideHorsePower() {
        return horsePower;
    }

    @Provides
    Engine provideEngine(DieselEngine engine){
     return engine;
    }
}
