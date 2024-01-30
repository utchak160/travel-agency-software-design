package com.nymble.travel.agency.entities;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class TravelPackage {
    private String name;
    private int capacity;
    private List<Destination> itinerary;
    private List<Passenger> passengers;

    public void printItinerary() {
        System.out.println("Travel Package: " + name);
        for (Destination destination : itinerary) {
            System.out.println("Destination: " + destination.getName());
            for (Activity activity : destination.getActivities()) {
                System.out.println("Activity: " + activity.getName() + ", Cost: " + activity.getCost() + ", Capacity: " + activity.getCapacity() + ", Description: " + activity.getDescription());
            }
        }
    }

    public void printPassengerList() {
        System.out.println("Passenger List for: " + name);
        System.out.println("Capacity: " + capacity);
        System.out.println("Current Passengers: " + passengers.size());
        for (Passenger passenger : passengers) {
            System.out.println("Passenger: " + passenger.getName() + ", Number: " + passenger.getPassengerNum());
        }
    }

    public void printAvailableActivities() {
        System.out.println("Available Activities for " + name);
        for (Destination destination : itinerary) {
            for (Activity activity : destination.getActivities()) {
                if (activity.hasSpace()) {
                    System.out.println("Destination: " + destination.getName() +
                            ", Activity: " + activity.getName() +
                            ", Available Spaces: " + activity.getAvailableSpace());
                }
            }
        }
    }
}
