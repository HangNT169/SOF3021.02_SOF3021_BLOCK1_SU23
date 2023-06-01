package com.fpt.poly.sof3021.B11_DatLich;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling // Danh dau tang chay ngam
public class TestSchedule {

    @Autowired
    private TestService service;

    // dat lich : Cong viec con nguoi khong can tac dong. Dat gio ngay
    // => Viec day tu dong hoan thanh
    // Dat lich => cron job
    // => cron expression => 1 menh de
    // Spring Boot => @Schedule : Dat lich
//    @Scheduled(fixedRate = 2000) // dien thoi gian mong muon => tinh theo ms
//    @Scheduled(cron = "0 9 25 * * ?") // 9h00 ngay 25 hang thang
    @Scheduled(cron = "* * * * * ?")
    public void datLichDayDiHoc() {
        try {
            service.dongHoBaoThuc();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
