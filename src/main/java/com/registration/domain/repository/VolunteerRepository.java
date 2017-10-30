package com.registration.domain.repository;

import com.registration.domain.jpa.Volunteer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Zeeshan Damani
 */
@Repository
public interface VolunteerRepository extends JpaRepository<Volunteer,Long> {
}
