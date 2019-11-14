/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.13).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package gov.nasa.uamdc.exapi;

import gov.nasa.uamdc.model.USSExchange;
import gov.nasa.uamdc.model.UTMRestResponse;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-11-14T14:04:30.458-08:00[US/Pacific]")
@Api(value = "uss-exchange", description = "the uss-exchange API")
public interface UssExchangeApi {

    @ApiOperation(value = "Upload an array of models", nickname = "ussExchangePost", notes = "", response = UTMRestResponse.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Data received. No content returned.", response = UTMRestResponse.class),
        @ApiResponse(code = 400, message = "Bad request. Typically validation error. Fix your request and retry.", response = UTMRestResponse.class),
        @ApiResponse(code = 401, message = "Invalid or missing access_token provided.", response = UTMRestResponse.class),
        @ApiResponse(code = 403, message = "Forbidden. Do not retry with same access token. Reason not provided, but do you have the right scopes? Does uss_name match the sub claim?", response = UTMRestResponse.class) })
    @RequestMapping(value = "/uss-exchange",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<UTMRestResponse> ussExchangePost(@ApiParam(value = "Upload an array of models" ,required=true )  @Valid @RequestBody List<USSExchange> body);

}