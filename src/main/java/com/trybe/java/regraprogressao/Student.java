package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * Student Class.
 */
public class Student {

  /**
   * Calculates the result.
   *
   * @param data is a matrix where each row represents a grade and its weight.
   * @return The result in percentage.
   */

  public static int resultCalculate(int[][] data) {
    int dividend = 0;
    int divider = 100;

    for (int[] datum : data) {
      dividend += (datum[0] * datum[1]);
    }

    return dividend / divider;
  }

  /**
   * Validates the weight of the activity.
   *
   * @param totalWeight The total available weight.
   * @return The valid weight of the activity.
   */
  private static int validateWeight(Scanner scanner, int totalWeight) {
    int weight = Integer.parseInt(scanner.nextLine());
    if (weight > totalWeight) {
      weight = totalWeight;
    }
    return weight;
  }

  /**
   * Method to gather information about activities.
   *
   * @param quantity The number of activities.
   * @return The calculated result.
   */
  public static int informationCollect(int quantity) {
    Scanner scanner = new Scanner(System.in);
    int totalWeight = 100;
    int loop = 0;
    int[][] data = new int[quantity][2];
    while (loop < quantity) {
      System.out.println("Digite o nome da atividade " + (loop + 1) + ":");
      String name = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + (loop + 1) + ":");
      int weight = validateWeight(scanner, totalWeight);
      System.out.println("Digite a nota obtida para " + name + ":");
      int note = Integer.parseInt(scanner.nextLine());
      data[loop][0] = weight;
      data[loop][1] = note;
      totalWeight -= weight;
      loop += 1;
    }

    scanner.close();

    return resultCalculate(data);
  }
}
