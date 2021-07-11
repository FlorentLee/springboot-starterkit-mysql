package com.starterkit.springboot.brs.controller.v1.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.validation.constraints.*;
import java.math.BigDecimal;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)

public class AddValueRequest {
    @DecimalMin(value = "0", inclusive = false)
    @DecimalMax(value = "1000", inclusive = false)
    @Digits(integer=3, fraction=2)
    private BigDecimal newValue;
}
