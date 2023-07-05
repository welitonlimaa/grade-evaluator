package com.trybe.java.regraprogressao;

/**
 * Activity Class.
 */
public class Activity {

  private String title;
  private int weight;
  private int note;

  /**
   * Activity Method.
   */
  public Activity(String title, int weight, int note) {
    this.title = title;
    this.weight = weight;
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
