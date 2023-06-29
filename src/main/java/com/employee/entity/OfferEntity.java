package com.employee.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "offers")
public class OfferEntity {
    @Id
    @Column(name = "offerId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long offerId;

    @Column(name = "jobTitle")
    private String jobTitle; //(unique)

    @Column(name = "startDate")
    private Date startDate;

    @Column(name = "numberOfApplications")
    private long numberOfApplications;
}
