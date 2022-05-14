package com.vanhi.appointger.enumeration;

public enum Specialty {
    DERMATOLOGIST("DERMATOLOGIST"),
    PSYCHIATRIST("PSYCHATRIST"),
    DENTIST("DENTIST");

    private final String specialty;

    Specialty (String specialty){
        this.specialty = specialty;
    }

    public String getSpecialty(){
        return this.specialty;
    }


}
