package com.registration.batch.vehicle;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Zeeshan Damani
 */
@Data
@Entity
@Table(name = "vehicle")
public class Vehicle {

    @Id
    @Column(name = "id")
    long id;

    String form_no;
    String jamt_khana;
    String jamat_khana_code;

    String owner_name;
    String owner_father_name;
    String owner_surname;
    String owner_current_address;
    String owner_cnic;
    String owner_home_phone;
    String owner_cell_phone;
    String owner_license_no;
    String owner_license_issue_date;
    String owner_license_expiry_date;

    String driver_name;
    String driver_father_name;
    String driver_surname;
    String driver_curent_address;
    String driver_cnic;
    String driver_home_phone;
    String driver_cell_phone;
    String driver_license_no;
    String driver_license_issue_date;
    String driver_license_expiry;
    String driver_owner_association;

    String vehicle_make;
    String vehicle_model;
    String vehicle_registration;
    String vehicle_color;
    String vehicle_category;
    String dd_id_no;
    String day_01;
    String day_01_first_half;
    String day_01_second_half;

    String day_02;
    String day_02_first_half;
    String day_02_second_half;

}
