package com.bmc.loan.rates.api

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiResponse
import io.swagger.annotations.ApiResponses

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

import com.bmc.loan.rates.model.Rate
import com.bmc.loan.rates.service.RateService

@RestController
@RequestMapping(value = '/v1/rates', produces = 'application/json')
@Api(value = '/rates', description = 'the rates API')
class RatesController {
    @Autowired
    RateService service
    
    @ApiOperation(value = 'get all objects',
        notes = 'returns a list of objects that have been created',
        response = Rate.class, responseContainer = 'List')
    @ApiResponses(value = [
        @ApiResponse(code = 200, message = 'objects retrieved'),
        @ApiResponse(code = 500, message = 'unexpected error') ])
    @RequestMapping(value = '', produces = 'application/json', method = RequestMethod.GET)
    ResponseEntity<List<Rate>> getAll() {
        ResponseEntity<List<Rate>> response = null
        try {
            List<Rate> objs = service.findAll()
            response = new ResponseEntity<List<Rate>>(objs, HttpStatus.OK)
        } catch (Exception e) {
            response = new ResponseEntity<List<Rate>>(HttpStatus.INTERNAL_SERVER_ERROR)
        }
        return response
    }

}
