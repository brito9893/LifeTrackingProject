package Health.model;

import java.util.List;
import java.util.Objects;

public class Desease {
    private List<String> symptoms;
    private String name;
    private String description;

    public Desease(List<String> symptoms, String name, String description) {
        this.symptoms = symptoms;
        this.name = name;
        this.description = description;
    }

    public List<String> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(List<String> symptoms) {
        this.symptoms = symptoms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Desease)) return false;
        Desease desease = (Desease) o;
        return Objects.equals(getSymptoms(), desease.getSymptoms()) &&
                Objects.equals(getName(), desease.getName()) &&
                Objects.equals(getDescription(), desease.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSymptoms(), getName(), getDescription());
    }
}
