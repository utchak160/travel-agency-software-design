package com.nymble.travel.agency.entities;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Destination {
    private String name;
    private List<Activity> activities;

    public void addActivity(Activity activity) {
        activities.add(activity);
    }
}
