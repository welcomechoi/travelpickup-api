package com.travelpickup.pickup.dto.response;

import com.travelpickup.pickup.entity.PickupCenter;
import lombok.Builder;
import lombok.Getter;

@Getter
public class PickupCenterResponseDto {

    private Long id;

    private String name;

    private String address;

    private String addressDetail;

    private Double latitude;

    private Double longitude;

    @Builder
    public PickupCenterResponseDto(Long id,
                                   String name,
                                   String address,
                                   String addressDetail,
                                   Double latitude,
                                   Double longitude) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.addressDetail = addressDetail;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public static PickupCenterResponseDto of(PickupCenter pickupCenter) {
        return PickupCenterResponseDto
                .builder()
                .id(pickupCenter.getPickupCenterId())
                .name(pickupCenter.getName())
                .address(pickupCenter.getAddress())
                .addressDetail(pickupCenter.getAddressDetail())
                .latitude(pickupCenter.getLatitude())
                .longitude(pickupCenter.getLongitude())
                .build();
    }

}
