package com.trybe.java.regraprogressao;

public class Activity {
  private String title;
  private int weight;
  private int note;

  public Activity(String title, int weight, int note) {
    this.title = title;
    this.note = note;
  }

  public String getTitle() {
    return title;
  }

  public int getNote() {
    return note;
  }

  public int getWeight() {
    return weight;
  }
}
