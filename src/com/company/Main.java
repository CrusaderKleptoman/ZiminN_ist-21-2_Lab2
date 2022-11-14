package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число строк и столбцов");
        System.out.print("Строки = ");
        int rows = scanner.nextInt();
        System.out.print("Стобцы = ");
        int columns = scanner.nextInt();
        TaskMatrix taskMatrix = new TaskMatrix(rows, columns);


        System.out.println("Введите элементы матрицы");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                taskMatrix.setElemMatrix(scanner.nextInt(), i, j);
            }
        }
        taskMatrix.getUpdMatr();
        System.out.println("Задание a)");
        taskMatrix.writeMatrix();

        taskMatrix.delZeroElem();
        System.out.println("Задание b)");
        taskMatrix.writeMatrix();

        taskMatrix.getOneDimMatr();
        System.out.println("Задание c)");
        taskMatrix.writeMatrix();

        System.out.println("Введите текст");
        scanner.nextLine();
        String text = scanner.nextLine();

        TaskText taskText = new TaskText(text);
        System.out.println("Задание d)");
        System.out.println("Количество слов = " + taskText.getNumOfWord());
    }
}