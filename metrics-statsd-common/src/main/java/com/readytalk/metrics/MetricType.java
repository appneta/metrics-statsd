package com.readytalk.metrics;

public enum MetricType {
  COUNTER("c"),
  GAUGE("g"),
  SET("s"),
  TIMING("ms");

  private String code;

  MetricType(String code) {
    this.code = code;
  }

  public String getCode() {
    return code;
  }

}