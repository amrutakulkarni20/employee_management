package com.employee.service;

import com.employee.entity.OfferEntity;
import com.employee.model.OfferModel;
import com.employee.repository.OfferRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OfferServiceImpl implements OfferService{

    private ModelMapper modelMapper;
    private OfferRepository offerRepository;

    public OfferServiceImpl(ModelMapper modelMapper,OfferRepository offerRepository){
        this.modelMapper = modelMapper;
        this.offerRepository = offerRepository;
    }

    @Override
    public OfferModel createJobOffer(OfferModel offer) {
        OfferEntity offerEntity = new OfferEntity();
        modelMapper.map(offer,offerEntity);
        offerRepository.save(offerEntity);
        modelMapper.map(offerEntity,offer);
        return offer;
    }

    @Override
    public OfferModel getJobOffer(long offerId) {
        OfferModel offer = new OfferModel();
        OfferEntity offerEntity =  offerRepository.findById(offerId).orElseThrow();
        modelMapper.map(offerEntity,offer);
        return offer;
    }

    @Override
    public List<OfferModel> getJobOffers() {
        List<OfferModel> offerModelList = new ArrayList<>();
        List<OfferEntity> offerEntities = offerRepository.findAll();
        modelMapper.map(offerEntities,offerModelList);
        return offerModelList;
    }
}
