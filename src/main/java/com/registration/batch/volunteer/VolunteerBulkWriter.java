package com.registration.batch.volunteer;


import com.registration.domain.jpa.Volunteer;
import com.registration.domain.repository.VolunteerRepository;
import lombok.AllArgsConstructor;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Zeeshan Damani
 */

@AllArgsConstructor
@Component
public class VolunteerBulkWriter implements ItemWriter<Volunteer> {


    private final VolunteerRepository volunteerRepository;

    @Override
    public void write(List<? extends Volunteer> list) throws Exception {

        for(Volunteer volunteer : list){
        System.out.println("Writing chunk to Database");
        System.out.println(volunteer.toString());
        volunteerRepository.save(volunteer);
        }


    }
}
