package com.bmc.loan.rates.service

import org.springframework.stereotype.Service

import com.bmc.loan.rates.model.Rate

@Service
class RateService {
    List<Rate> rates
    
        RateService() {
            rates = new ArrayList<Rate>()
            rates.add(new Rate("2.5", "15"))
            rates.add(new Rate("3.0", "20"))
            rates.add(new Rate("3.5", "30"))
        }
        
        List<Rate> findAll() {
            return rates
        }
}
