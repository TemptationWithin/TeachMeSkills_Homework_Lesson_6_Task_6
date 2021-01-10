package com.homeWork_Lesson_6_Task_6;

import com.homeWork_Lesson_6_Task_6.vector.Vector;

/**
 * ЗАДАНИЕ 6
 * 	Создайте класс, который описывает вектор (в трёхмерном пространстве).
 * 	У него должны быть:
 * 		- конструктор с параметрами в виде списка координат x, y, z
 * 		- конструктор без параметров, по умолчанию все координаты проставляются в 0
 * 		- метод, вычисляющий длину вектора. Длина вектора высчитывается по формуле: корень квадраный из x^2+y^2+z^2.
 * 		Корень можно посчитать с помощью Math.sqrt():
 * 		- метод, вычисляющий скалярное произведение двух векторов. Формула для этого: x1*x2 + y1*y2 + z1*z2
 * 		- метод, вычисляющий векторное произведение с другим вектором. Формула для этого: (y1*z2 - z1*y2, z1*x2 - x1*z2, x1*y2 - y1*x2)
 * 		- методы для суммы и разности двух векторов. Формулы для этого: (x1 + x2, y1 + y2, z1 + z2) и (x1 - x2, y1 - y2, z1 - z2)
 * 		- статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.
 * 		- пеопределенный метод toString()
 *
 * 	Что практикуем в этом задании:
 * 		- констуркторы с параметрами и без параметров в одном классе
 * 		- написание методов, которые возвращают объект написанного нами класса(класса Vector)
 * 		- переопределение метода toString
 * 		- статические методы
 */
public class HomeWork_Lesson_6_Task_6 {
    public static void main(String[] args) {
        Vector[] vectors = Vector.randomVectors(2);
        for (int i = 0; i < vectors.length; i++) {
            System.out.println(vectors[i].toString());
        }
        Vector vector1 = Vector.vectorsProduct(vectors[0],vectors[1]);
        System.out.print("Result of vector product: ");
        System.out.println(vector1.toString());

        long resultScalarProduct = Vector.vectorsScalarProduct(vectors[0],vectors[1]);
        System.out.print("Result scalar product: ");
        System.out.println(resultScalarProduct);

        vector1 = Vector.sumVectors(vectors[0], vectors[1]);
        System.out.print("Result of sum of vectors (by Override toString()) : ");
        System.out.println(vector1.toString());

        vector1 = Vector.differenceVectors(vectors[0], vectors[1]);
        System.out.print("Result of difference of vectors (by Override toString()): ");
        System.out.println(vector1.toString());

    }
}
