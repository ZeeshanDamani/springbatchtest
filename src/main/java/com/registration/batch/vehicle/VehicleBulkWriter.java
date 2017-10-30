package com.registration.batch.vehicle;


import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Zeeshan Damani
 */
@Component
public class VehicleBulkWriter implements ItemWriter<Vehicle> {

//    @Autowired
//    VehicleRepository vehicleRepository;

    @Override
    public void write(List<? extends Vehicle> list) throws Exception {

        System.out.println("Writing chunk to Database");
      //  vehicleRepository.save(list);

    }
}
