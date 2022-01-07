package com.gap.hackathon.DataQuality.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorCountDetails {

    private String errorCode;

    private String errorMessage;

    private int count;
}
