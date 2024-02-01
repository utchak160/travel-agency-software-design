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

    /**
     * To print the itinerary for the particular travel package including the activity on all the destinations
     */
    public void printItinerary() {
        System.out.println("Travel Package: " + name);
        for (Destination destination : itinerary) {
            System.out.println("Destination: " + destination.getName());
            for (Activity activity : destination.getActivities()) {
                System.out.println("Activity: " + activity.getName() + ", Cost: " + activity.getCost() + ", Capacity: " + activity.getCapacity() + ", Description: " + activity.getDescription());
            }
        }
    }

    /**
     * To print the passenger list in the travel package
     */
    public void printPassengerList() {
        System.out.println("Passenger List for: " + name);
        System.out.println("Capacity: " + capacity);
        System.out.println("Current Passengers: " + passengers.size());
        for (Passenger passenger : passengers) {
            System.out.println("Passenger: " + passenger.getName() + ", Number: " + passenger.getPassengerNum());
        }
    }

    /**
     * To check and print the activities details which has still some space left for passengers to enroll
     */
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
