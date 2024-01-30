package com.nymble.travel.agency;

import com.nymble.travel.agency.entities.Activity;
import com.nymble.travel.agency.entities.Destination;
import com.nymble.travel.agency.entities.Passenger;
import com.nymble.travel.agency.entities.PassengerType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PassengerTest {

    private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void printDetailsTest() {
        Destination destination = Destination.builder().name("Destination X").activities(new ArrayList<>()).build();
        Activity activity = Activity.builder().name("Activity 1").description("Description").cost(50.0).capacity(5).destination(destination).enrolledPassengers(new ArrayList<>()).build();
        Passenger passenger = Passenger.builder().name("John").passengerNum(1).balance(100.0).type(PassengerType.STANDARD).activities(Collections.singletonList(activity)).build();

        passenger.printDetails();

        String expectedOutput = "Passenger Details:\n" +
                "Name: John\n" +
                "Passenger Number: 1\n" +
                "Balance: 100.0\n" +
                "Activities signed up for:\n" +
                "Activity: Activity 1, Destination: Destination X, Price: 50.0\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}
