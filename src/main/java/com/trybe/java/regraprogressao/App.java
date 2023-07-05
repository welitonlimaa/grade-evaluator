package com.trybe.java.regraprogressao;

import java.util.HashMap;
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
    int quantity = scanner.nextInt();

    Student.informationCollect(quantity);
  }
}