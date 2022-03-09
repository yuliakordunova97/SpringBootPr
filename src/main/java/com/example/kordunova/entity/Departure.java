package com.example.kordunova.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Departure {
    private int id;
    private String name;
    private String location;
}
