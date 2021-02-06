package com.parth.ebay.shipping.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-01-28T23:13:52.075-08:00[America/Los_Angeles]")
@Controller
@RequestMapping("${openapi.shippingService.base-path:}")
public class EligibilityApiController implements EligibilityApi {

    private final EligibilityApiDelegate delegate;

    public EligibilityApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) EligibilityApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new EligibilityApiDelegate() {});
    }

    @Override
    public EligibilityApiDelegate getDelegate() {
        return delegate;
    }

}
