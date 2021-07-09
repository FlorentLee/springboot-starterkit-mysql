package com.starterkit.springboot.brs.controller.v1.command;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;


@Data
@Accessors(chain = true)
public class ValueFormCommand {
    @NotNull

    @Max(value = 999)

    @Min(value = 0)

    private int newValue;
}
