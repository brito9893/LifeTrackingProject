package Health.model;

import java.util.List;
import java.util.Objects;

public class Medication {
    private String name;
    private String description;
    private String dosage;
    /**
     * Time period in which the medication should be administrated
     */
    private int timeFrame;
    /**
     * List of medicine that might cause a bad reaction in conjunction with this one.
     */
    private List<Medication> conflicts;

    public Medication(String name, String description, String dosage, int timeFrame, List<Medication> conflicts) {
        this.name = name;
        this.description = description;
        this.dosage = dosage;
        this.timeFrame = timeFrame;
        this.conflicts = conflicts;
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

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public int getTimeFrame() {
        return timeFrame;
    }

    public void setTimeFrame(int timeFrame) {
        this.timeFrame = timeFrame;
    }

    public List<Medication> getConflicts() {
        return conflicts;
    }

    public void setConflicts(List<Medication> conflicts) {
        this.conflicts = conflicts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Medication)) return false;
        Medication that = (Medication) o;
        return getTimeFrame() == that.getTimeFrame() &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getDescription(), that.getDescription()) &&
                Objects.equals(getDosage(), that.getDosage()) &&
                Objects.equals(getConflicts(), that.getConflicts());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDescription(), getDosage(), getTimeFrame(), getConflicts());
    }
}
