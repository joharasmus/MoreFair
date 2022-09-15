package de.kaliburg.morefair.utils;

import com.icegreen.greenmail.spring.GreenMailBean;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

  @Bean
  public GreenMailBean greenMailBean() {
    GreenMailBean greenMailBean = new GreenMailBean();
    greenMailBean.setAutostart(true);
    greenMailBean.setSmtpProtocol(true);
    greenMailBean.setPop3Protocol(true);
    greenMailBean.setPortOffset(3000);
    greenMailBean.setHostname("localhost");
    greenMailBean.setUsers(List.of("user:secret@localhost"));
    return greenMailBean;
  }
}
