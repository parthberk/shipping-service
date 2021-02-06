package com.parth.ebay.shipping.api;

import com.parth.ebay.shipping.model.EligibilityCheckRequest;
import com.parth.ebay.shipping.model.EligibilityCheckResponse;
import io.swagger.annotations.*;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link EligibilityApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-01-28T23:13:52.075-08:00[America/Los_Angeles]")
public interface EligibilityApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /eligibility : Check item eligibility
     * Check item eligibility functionality
     *
     * @param body Eligibility Check Request (required)
     * @return successful operation (status code 200)
     * @see EligibilityApi#checkEligibility
     */
    default ResponseEntity<EligibilityCheckResponse> checkEligibility(EligibilityCheckRequest body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"eligible\" : true, \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
