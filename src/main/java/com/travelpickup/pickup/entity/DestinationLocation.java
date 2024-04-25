package com.travelpickup.pickup.entity;

import com.travelpickup.pickup.dto.request.PickupLocationDto;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@NoArgsConstructor
@Table(name = "destination_location")
public class DestinationLocation {

    @Id
    @Column(name = "destination_location_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long destinationLocationId;

    @Column(name = "pickup_id")
    private Long pickupId;

    @Column(name = "description")
    private String description;

    @Column(name = "latitude", columnDefinition = "DECIMAL(10, 8")
    private Double latitude;

    @Column(name = "longitude", columnDefinition = "DECIMAL(10, 8")
    private Double longitude;


    @Builder
    public DestinationLocation(Long pickupId,
                               String description,
                               Double latitude,
                               Double longitude) {
        this.pickupId = pickupId;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public static DestinationLocation of(PickupLocationDto pickupLocationDto,
                                         Long pickupId) {
        return DestinationLocation
                .builder()
                .pickupId(pickupId)
                .description(pickupLocationDto.getDescription())
                .latitude(pickupLocationDto.getLatitude())
                .longitude(pickupLocationDto.getLongitude())
                .build();
    }

    public static DestinationLocation createEmpty() {
        return DestinationLocation.builder().build();
    }

}
