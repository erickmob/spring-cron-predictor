package com.erickmob.cronpredictor.service;

import com.erickmob.cronpredictor.model.CronDTO;
import org.springframework.scheduling.support.CronSequenceGenerator;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CronService {

    public CronDTO getNextDatesFromCron(String cron){
        CronSequenceGenerator cronTrigger = new CronSequenceGenerator(cron);
        CronDTO cronDTO = new CronDTO(cron);
        Date dateFromCron = new Date();

        for (int i = 0; i < 5; i++) {
            dateFromCron = cronTrigger.next(dateFromCron);
            cronDTO.getNextDates().add(dateFromCron);
        }
        return cronDTO;
    }

}
