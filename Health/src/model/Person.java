package model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Person {
    private String name;
    private int age;
    /**
     * Date of birth
     */
    private Date dob;
    private List<Medication> activeMedication;
    private List<Medication> allMedication;

    public Person(String name, int age, Date dob, List<Medication> activeMedication, List<Medication> allMedication) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.activeMedication = activeMedication;
        this.allMedication = allMedication;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public List<Medication> getActiveMedication() {
        return activeMedication;
    }

    public void setActiveMedication(List<Medication> activeMedication) {
        this.activeMedication = activeMedication;
    }

    public List<Medication> getAllMedication() {
        return allMedication;
    }

    public void setAllMedication(List<Medication> allMedication) {
        this.allMedication = allMedication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() &&
                Objects.equals(getName(), person.getName()) &&
                Objects.equals(getDob(), person.getDob()) &&
                Objects.equals(getActiveMedication(), person.getActiveMedication()) &&
                Objects.equals(getAllMedication(), person.getAllMedication());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getDob(), getActiveMedication(), getAllMedication());
    }
}
