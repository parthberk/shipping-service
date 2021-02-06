package com.parth.ebay.shipping.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class EligibilityCheckRepository {
    private final String[] sellers;
    private final String[] categories;
    private final double price;

    @Autowired
    public EligibilityCheckRepository(
            @Value("${eligibility.sellers}") final String[] sellers,
            @Value("${eligibility.category}") final String[] categories,
            @Value("${eligibility.price}") final double price) {
        this.sellers = sellers;
        this.categories = categories;
        this.price = price;
    }

    public String[] getEligibleSellers() {
        return sellers;
    }

    public String[] getEligibleCategories() {
        return categories;
    }

    public double getEligiblePrice() {
        return price;
    }
}
