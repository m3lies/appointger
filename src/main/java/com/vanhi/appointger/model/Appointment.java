package com.vanhi.appointger.model;

import com.vanhi.appointger.enumeration.Specialty;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="appointments")
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
