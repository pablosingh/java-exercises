package com.dos.portfolio.dailyfun;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledService {
    @Scheduled(cron = "0 0 0 * * ?")
    public void executeDailyTask() {
        System.out.println("Tarea ejecutada diariamente a la medianoche");
    }
}
