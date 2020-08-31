package com.erickmob.cronpredictor.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CronDTO {

    private String cron;
    private List<Date> nextDates = new ArrayList<>();

    public CronDTO(String cron) {
        this.cron = cron;
    }

    public CronDTO() {
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }

    public List<Date> getNextDates() {
        return nextDates;
    }

    public void setNextDates(List<Date> nextDates) {
        this.nextDates = nextDates;
    }
}
