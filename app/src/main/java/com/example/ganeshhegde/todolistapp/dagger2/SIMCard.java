package com.example.ganeshhegde.todolistapp.dagger2;

import javax.inject.Inject;

public class SIMCard {

    private ServiceProvider serviceProvider;

    @Inject
    public SIMCard(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }
}
