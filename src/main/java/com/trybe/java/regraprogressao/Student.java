package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * Student Class.
 */
public class Student {

  /**
   * Result Method.
   */

  public static int resultCalculate(Activity[] data) {
    int dividend = 0;
    int divider = 100;

    for (int i = 0; i < data.length; i++) {
      Activity activity = data[i];
      dividend += (activity.getNote() * activity.getWeight());
    }

    int result = dividend / divider;
    return result;
  }

  /**
   * Collect Method.
   */
  public static int informationCollect(int quantity) {
    Scanner scanner = new Scanner(System.in);
    int loop = 0;
    Activity[] data = new Activity[quantity];
    while (loop < quantity) {
      System.out.println("Digite o nome da atividade " + (loop + 1) + ":");
      String name = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + (loop + 1) + ":");
      int weight = Integer.parseInt(scanner.nextLine());
      System.out.println("Digite a nota obtida para " + name + ":");
      int note = Integer.parseInt(scanner.nextLine());
      data[loop] = new Activity(name, weight, note);
      loop += 1;
    }

    scanner.close();
    int result = resultCalculate(data);

    return result;
  }
}
