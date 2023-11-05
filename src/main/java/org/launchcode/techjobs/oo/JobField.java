package org.launchcode.techjobs.oo;
import java.util.Objects;
public class JobField {
    private int id;
    private static int nextId = 1;
    private String value;
    public JobField() {
        id = nextId;
        nextId++;
    }


    public JobField(String value) {
        this();
        if (value.isEmpty()) {
            this.value = "Data not available";
        } else {
            this.value = value;
        }
    }
    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String toString() {

        return getValue();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }
}
