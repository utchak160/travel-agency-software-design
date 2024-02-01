package com.nymble.travel.agency.entities;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Destination {
    private String name;
    private List<Activity> activities;

    /**
     * To add activity to the particular destination
     * @param activity which has to be added to this destination
     */
    public void addActivity(Activity activity) {
        activities.add(activity);
    }
}
