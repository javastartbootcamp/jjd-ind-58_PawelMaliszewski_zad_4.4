package pl.javastart.task.aplication;

import pl.javastart.task.aplication.Config;

public class Offer {

    Config config;
    private boolean valid;
    private double value;
    private double percentage;

    boolean isValid() {
        return valid;
    }

    void setValid(boolean valid) {
        this.valid = valid;
    }

    double getValue() {
        return value;
    }

    void setValue(double value) {
        this.value = value;
    }

    double getPercentage() {
        return percentage;
    }

    void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
