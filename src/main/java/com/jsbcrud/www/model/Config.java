package com.jsbcrud.www.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.time.LocalDate;

@ConfigurationProperties(prefix = "app")
@RequiredArgsConstructor
@Getter
public class Config{
    private final String name;
    private final String headerName;
    private final String shortName;
    private final int year;
    private final String copyright;
    private final String logo;

    public String getCopyright() {
        int currentYear = LocalDate.now().getYear();
        return currentYear > year
                ? copyright.replace("[YEAR]", year + " - " + currentYear)
                : copyright.replace("[YEAR]", String.valueOf(currentYear));
    }
}