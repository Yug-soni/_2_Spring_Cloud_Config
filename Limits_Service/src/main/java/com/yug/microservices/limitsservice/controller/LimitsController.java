package com.yug.microservices.limitsservice.controller;

import com.yug.microservices.limitsservice.bean.Limits;
import com.yug.microservices.limitsservice.config.LimitsConfiguration;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class LimitsController {

  private LimitsConfiguration configuration;

  @GetMapping("/limits")
  public Limits retrieveLimits() {
    return new Limits(configuration.getMinimum(), configuration.getMaximum());
//    return new Limits(1, 1000);
  }
}
