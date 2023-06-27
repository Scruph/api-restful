package com.example.springboot;

import jakarta.validation.constraints.NotBlank;

public record ClienteRecordDto(@NotBlank String nome, @NotBlank String endereco, @NotBlank String fone,
    @NotBlank String estadoCivil) {
}