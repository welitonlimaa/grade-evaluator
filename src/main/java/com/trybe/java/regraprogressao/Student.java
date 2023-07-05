package com.trybe.java.regraprogressao;

import java.util.Scanner;

public class Student {
  public static void informationCollect(int quantity) {
    Scanner scanner = new Scanner(System.in);
    int loop = 0;
    Activity[] data = new Activity[quantity];
    while(loop < quantity) {
      System.out.println("Digite o nome da atividade " + (loop + 1) + ":");
      String name = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + (loop + 1) + ":");
      int weight = scanner.nextInt();
      scanner.nextLine();
      System.out.println("Digite a nota obtida para " + name + ":");
      int note = scanner.nextInt();
      scanner.nextLine();
      data[loop] = new Activity(name, weight, note);
      loop += 1;
    }

    scanner.close();
  }
}
