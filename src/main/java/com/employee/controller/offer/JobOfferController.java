package com.employee.controller.offer;

import com.employee.model.OfferModel;
import com.employee.service.OfferService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobOffer")
public class JobOfferController {

    private OfferService offerService;

    public JobOfferController(OfferService offerService){
        this.offerService = offerService;
    }

    @PostMapping("/offer")
    public OfferModel createJobOffer(@RequestBody OfferModel offer){
        return offerService.createJobOffer(offer);
    }

    @GetMapping("/offer/{offerId}")
    public OfferModel getJobOffer(@PathVariable("offerId") long offerId){
        return offerService.getJobOffer(offerId);
    }

    @GetMapping("/offers")
    public List<OfferModel> getJobOffers(){
        return offerService.getJobOffers();
    }
}
