package com.carapi.carapi.dto;

import java.util.Date;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

public record CarDTO(

  @NotNull String modelo, 

  @NotNull String fabricante, 

  @Past Date dataFabricacao, 

  @NotNull int valor, 

  @NotNull int anoModelo

) {  
}
