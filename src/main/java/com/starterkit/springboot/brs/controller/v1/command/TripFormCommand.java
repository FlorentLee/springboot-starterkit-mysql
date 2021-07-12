package com.starterkit.springboot.brs.controller.v1.command;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.*;
import java.math.BigDecimal;

/**
 * Created by Arpit Khandelwal.
 */
@Data
@Accessors(chain = true)
public class TripFormCommand {
    @NotBlank
    private String sourceStop;

    @NotBlank
    private String destinationStop;

    @NotBlank
    private String busCode;

    @Positive
    private int tripDuration;

    @DecimalMin(value = "0", inclusive = false)
    @DecimalMax(value = "1000", inclusive = false)
    @Digits(integer=3, fraction=2)
    private BigDecimal tripFare;
}
