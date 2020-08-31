package com.erickmob.cronpredictor.controller;

import com.erickmob.cronpredictor.model.CronDTO;
import com.erickmob.cronpredictor.service.CronService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CronController {

    private final CronService cronService;

    public CronController(CronService cronService) {
        this.cronService = cronService;
    }

    @GetMapping("/")
    public String cronForm(Model model) {
        model.addAttribute("cronDto", new CronDTO());
        return "cron";
    }

    @PostMapping("/")
    public String cronSubmit(@ModelAttribute CronDTO cronDTO, Model model) {
        try {
            cronDTO = cronService.getNextDatesFromCron(cronDTO.getCron());
        } catch (Exception e) {
            e.getMessage();
        }
        model.addAttribute("cronDto", cronDTO);
        return "cron";
    }
}
