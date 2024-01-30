package com.nymble.travel.agency.entities;

import com.nymble.travel.agency.enums.PassengerTypeName;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PassengerType {
    public static final PassengerType STANDARD = new PassengerType(PassengerTypeName.STANDARD, 0);
    public static final PassengerType GOLD = new PassengerType(PassengerTypeName.GOLD, 0.1);
    public static final PassengerType PREMIUM = new PassengerType(PassengerTypeName.PREMIUM, 1);

    private PassengerTypeName name;
    private double discountRate;
}
