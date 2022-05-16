package com.vanhi.appointger.model;

import com.vanhi.appointger.enumeration.Specialty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    @ManyToOne
    @JoinColumn(name="person_id", nullable = false)
    private Person person;
    public Specialty getSpecialty() {
        return this.specialty;
    }
}
