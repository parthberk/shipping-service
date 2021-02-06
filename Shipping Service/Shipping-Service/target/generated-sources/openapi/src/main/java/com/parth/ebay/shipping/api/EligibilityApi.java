/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.parth.ebay.shipping.api;

import com.parth.ebay.shipping.model.EligibilityCheckRequest;
import com.parth.ebay.shipping.model.EligibilityCheckResponse;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-01-28T23:13:52.075-08:00[America/Los_Angeles]")
@Validated
@Api(value = "eligibility", description = "the eligibility API")
public interface EligibilityApi {

    default EligibilityApiDelegate getDelegate() {
        return new EligibilityApiDelegate() {};
    }

    /**
     * POST /eligibility : Check item eligibility
     * Check item eligibility functionality
     *
     * @param body Eligibility Check Request (required)
     * @return successful operation (status code 200)
     */
    @ApiOperation(value = "Check item eligibility", nickname = "checkEligibility", notes = "Check item eligibility functionality", response = EligibilityCheckResponse.class, tags={ "eligibility", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = EligibilityCheckResponse.class) })
    @PostMapping(
        value = "/eligibility",
        produces = { "application/json" }
    )
    default ResponseEntity<EligibilityCheckResponse> checkEligibility(@ApiParam(value = "Eligibility Check Request" ,required=true )  @Valid @RequestBody EligibilityCheckRequest body) {
        return getDelegate().checkEligibility(body);
    }

}
