package com.employee.service;

import com.employee.model.OfferModel;

import java.util.List;

public interface OfferService {
    OfferModel createJobOffer(OfferModel offer);

    OfferModel getJobOffer(long offerId);

    List<OfferModel> getJobOffers();
}
