package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Привет!\nЯ конвертер температуры из градусов Цельсия в градусы по Фаренгейту.\nВведите температуру в градусах цельсия: ");
        float tempC = inputValue();
        float tempF = convertToFahrenheit(tempC);
        System.out.printf("Градусы Цельсия: %s\nГрадусы по Фаренгейту: %s%n",tempC,tempF);
    }

    public static float convertToFahrenheit (float tempC){
        return tempC * 9 / 5 + 32;
    }

    public static float inputValue() {
        while (true) {
            float num = isDigit();
            if (num > -273.15) {
                return num;
            } else {
                System.out.print("Некорректный ввод! Минимальная температура в градусах цельсия -273.15.\nВведите температуру в градусах Цельсия: ");
            }
        }
    }

    public static float isDigit() {
        while (true) {
            try {
                return new Scanner(System.in).nextFloat();
            } catch (Exception e) {
                System.out.print("Некорректный ввод! Введите температуру в градусах Цельсия: ");
            }
        }
    }

}