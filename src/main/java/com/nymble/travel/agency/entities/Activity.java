package com.nymble.travel.agency.entities;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private Destination destination;
    private List<Passenger> enrolledPassengers;

    public boolean hasSpace() {
        return enrolledPassengers.size() < capacity;
    }

    public int getAvailableSpace() {
        return capacity - enrolledPassengers.size();
    }
}
