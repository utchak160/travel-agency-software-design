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

    /**
     * To check whether this activity has space left for more passengers to enroll
     * @return true or false depending upon the availability
     */
    public boolean hasSpace() {
        return enrolledPassengers.size() < capacity;
    }

    /**
     * To get the available spaces for passengers to enroll
     * @return number of spaces left
     */
    public int getAvailableSpace() {
        return capacity - enrolledPassengers.size();
    }
}
