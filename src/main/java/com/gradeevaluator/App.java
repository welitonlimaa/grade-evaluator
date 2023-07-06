package com.gradeevaluator;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a quantidade de atividades para cadastrar:");
    int quantity = Integer.parseInt(scanner.nextLine());

    double result = Student.informationCollect(scanner, quantity);
    String message = "";
    if (result >= 85.0d) {
      message = "Parabéns! Você alcançou " + result
          + "%! E temos o prazer de informar que você obteve aprovação!";
    } else {
      message =
          "Lamentamos informar que, com base na sua pontuação alcançada neste período, " + result
              + "%, você não atingiu a pontuação mínima necessária para sua aprovação.";
    }

    System.out.println(message);
    scanner.close();
  }
}