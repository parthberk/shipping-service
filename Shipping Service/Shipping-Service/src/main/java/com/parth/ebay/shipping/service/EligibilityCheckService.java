package com.parth.ebay.shipping.service;

import com.parth.ebay.shipping.data.EligibilityCheckRepository;
import com.parth.ebay.shipping.model.EligibilityCheckResponse;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.Arrays;

@Service
public class EligibilityCheckService {
    private final EligibilityCheckRepository eligibilityCheckRepository;

    public EligibilityCheckService(final EligibilityCheckRepository eligibilityCheckRepository) {
        this.eligibilityCheckRepository = eligibilityCheckRepository;
    }

    public EligibilityCheckResponse checkEligibility(
            final String seller,
            final String category,
            @Valid final BigDecimal price,
            final String item) {
        final EligibilityCheckResponse response = new EligibilityCheckResponse();
        if (!isSellerEligible(seller)) {
            response.setEligible(false);
            response.setMessage(String.format("Ineligible seller: %s", seller));
        } else if (!isEligibleCategory(category)) {
            response.setEligible(false);
            response.setMessage(String.format("Ineligible category: %s", category));
        } else if (!isPriceInRange(price)) {
            response.setEligible(false);
            response.setMessage(String.format("Ineligible price: %s", price));
        } else {
            response.setEligible(true);
            response.setMessage(String.format("%s is eligible", item));
        }

        return response;
    }

    private boolean isSellerEligible(final String seller) {
        final String[] eligibleSellers = eligibilityCheckRepository.getEligibleSellers();
        return Arrays.stream(eligibleSellers).anyMatch(s -> s.equalsIgnoreCase(seller));
    }

    private boolean isEligibleCategory(final String category) {
        final String[] eligibleCategories = eligibilityCheckRepository.getEligibleCategories();
        return Arrays.stream(eligibleCategories).anyMatch(s -> s.equalsIgnoreCase(category));
    }

    private boolean isPriceInRange(final BigDecimal price) {
        final double eligiblePrice = eligibilityCheckRepository.getEligiblePrice();
        return price.doubleValue() <= eligiblePrice;
    }
}
