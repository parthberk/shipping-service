package com.parth.ebay.shipping.delegate;

import com.parth.ebay.shipping.api.EligibilityApiDelegate;
import com.parth.ebay.shipping.model.EligibilityCheckRequest;
import com.parth.ebay.shipping.model.EligibilityCheckResponse;
import com.parth.ebay.shipping.service.EligibilityCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EligibilityApiDelegateImpl implements EligibilityApiDelegate {
    private final EligibilityCheckService eligibilityCheckService;

    @Autowired
    public EligibilityApiDelegateImpl(final EligibilityCheckService eligibilityCheckService) {
        this.eligibilityCheckService = eligibilityCheckService;
    }

    @Override
    public ResponseEntity<EligibilityCheckResponse> checkEligibility(final EligibilityCheckRequest request) {
        final EligibilityCheckResponse response = this.eligibilityCheckService.checkEligibility(
                request.getSeller(),
                request.getCategory(),
                request.getPrice(),
                request.getItem()
        );
        return ResponseEntity.ok(response);
    }
}
