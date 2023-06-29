package com.employee.model;

import com.employee.util.CustomDateDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OfferModel {
    private long offerId;
    private String jobTitle; //(unique)
    @JsonDeserialize(using = CustomDateDeserializer.class)
    private Date startDate;
    private long numberOfApplications;
}
