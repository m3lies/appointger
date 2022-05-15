package com.vanhi.appointger;

import com.vanhi.appointger.enumeration.Specialty;
import com.vanhi.appointger.model.Appointment;
import com.vanhi.appointger.repository.AppointmentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

import static java.time.LocalDateTime.now;

@SpringBootApplication
public class AppointgerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppointgerApplication.class, args);
    }
    @Bean
    CommandLineRunner run(AppointmentRepo appointmentRepo) throws ParseException {
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.FRANCE);
        Date date1 = simpleDateFormat1.parse("3/04/2022 14:00");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.FRANCE);
        Date date2 =simpleDateFormat2.parse("15/05/2022 12:30");
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.FRANCE);
        Date date3 = simpleDateFormat3.parse("31/12/2022 9:30");

        return args -> {
            appointmentRepo.save(new Appointment(null, date1, Specialty.DENTIST));
            appointmentRepo.save(new Appointment(null, date2, Specialty.DERMATOLOGIST));
            appointmentRepo.save(new Appointment(null, date3, Specialty.PSYCHIATRIST));
        };
    }
}
