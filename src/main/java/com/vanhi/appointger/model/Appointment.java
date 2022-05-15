package com.vanhi.appointger.model;

import com.vanhi.appointger.enumeration.Specialty;
import jdk.jfr.DataAmount;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Appointment {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private Date date;
    private Specialty specialty;
    public Specialty getSpecialty() {
        return this.specialty;
    }
}
