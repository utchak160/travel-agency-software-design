package com.nymble.travel.agency.entities;

import com.nymble.travel.agency.enums.PassengerTypeName;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Passenger {
    private String name;
    private int passengerNum;
    private double balance;
    private PassengerType type;
    private List<Activity> activities;

    public void printDetails() {
        System.out.println("Passenger Details:");
        System.out.println("Name: " + name);
        System.out.println("Passenger Number: " + passengerNum);
        System.out.println("Balance: " + balance);
        System.out.println("Activities signed up for:");
        for (Activity activity : activities) {
            System.out.println("Activity: " + activity.getName() + ", Destination: " + activity.getDestination().getName() + ", Price: " + activity.getCost());
        }
    }
}
