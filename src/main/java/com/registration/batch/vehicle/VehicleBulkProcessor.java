package com.registration.batch.vehicle;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Zeeshan Damani
 */
@Component
public class VehicleBulkProcessor implements ItemProcessor<Vehicle,Vehicle> {

    @Autowired
    private ObjectMapper mapper;

    @Override
    public Vehicle process(Vehicle v) throws Exception{

      //  System.out.println(mapper.writeValueAsString(v).toString());
        return v;
    }
}