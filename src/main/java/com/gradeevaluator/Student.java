package com.gradeevaluator;

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

  public static double resultCalculate(int[][] data) {
    double dividend = 0;
    int divider = 100;

    for (int[] datum : data) {
      dividend += (datum[0] * datum[1]);
    }

    return dividend / divider;
  }

  /**
   * Method to gather information about activities.
   *
   * @param quantity The number of activities.
   * @return The calculated result.
   */
  public static double informationCollect(Scanner scanner, int quantity) {
    int totalWeight = 0;
    int loop = 0;
    int[][] data = new int[quantity][2];
    while (loop < quantity) {
      System.out.println("Digite o nome da atividade " + (loop + 1) + ":");
      String name = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + (loop + 1) + ":");
      String weight = scanner.nextLine();
      totalWeight += Integer.parseInt(weight);
      System.out.println("Digite a nota obtida para " + name + ":");
      String note = scanner.nextLine();
      data[loop][0] = Integer.parseInt(weight);
      data[loop][1] = Integer.parseInt(note);

      if (totalWeight > 100) {
        System.out.println("A soma dos pesos deve ser igual a 100.");
        System.exit(0);
        scanner.close();
      }

      loop += 1;
    }

    return resultCalculate(data);
  }
}
