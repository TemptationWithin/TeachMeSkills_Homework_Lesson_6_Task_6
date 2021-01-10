package com.homeWork_Lesson_6_Task_6.vector;

import java.util.Random;
/**
 * У него должны быть:
 *  - конструктор с параметрами в виде списка координат x, y, z
 *  - конструктор без параметров, по умолчанию все координаты проставляются в 0
 *  - метод, вычисляющий длину вектора. Длина вектора высчитывается по формуле: корень квадраный из x^2+y^2+z^2.
 *  Корень можно посчитать с помощью Math.sqrt():
 *  - метод, вычисляющий скалярное произведение двух векторов. Формула для этого: x1*x2 + y1*y2 + z1*z2
 *  - метод, вычисляющий векторное произведение с другим вектором. Формула для этого: (y1*z2 - z1*y2, z1*x2 - x1*z2, x1*y2 - y1*x2)
 *  - методы для суммы и разности двух векторов. Формулы для этого: (x1 + x2, y1 + y2, z1 + z2) и (x1 - x2, y1 - y2, z1 - z2)
 *  - статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.
 *  - пеопределенный метод toString()
 *  *
 *  Что практикуем в этом задании:
 *  - констуркторы с параметрами и без параметров в одном классе
 *  - написание методов, которые возвращают объект написанного нами класса(класса Vector)
 *  - переопределение метода toString
 *  - статические методы
 */
public class Vector {
    // idea ask to make x, y, z final (i dont know why)
    private final long x;
    private final long y;
    private final long z;

//- конструктор без параметров, по умолчанию все координаты проставляются в 0
    public Vector(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

// - конструктор с параметрами в виде списка координат x, y, z
    public Vector (long x, long y, long z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

//- метод, вычисляющий длину вектора. Длина вектора высчитывается по формуле: корень квадраный из x^2+y^2+z^2.
    public double vectorLength(long x, long y, long z){
        return Math.sqrt(x*x + y*y + z*z);
    }

//- метод, вычисляющий скалярное произведение двух векторов. Формула для этого: x1*x2 + y1*y2 + z1*z2
    /**
     * SETTED TO STATIC (because it is convenient to write down the calculation of the scalar product of vectors in some variable)!
     */
    public static long vectorsScalarProduct(Vector vector1, Vector vector2){
        return vector1.x * vector2.x + vector1.y * vector2.y + vector1.z * vector2.z;
    }

//- метод, вычисляющий векторное произведение с другим вектором. Формула для этого: (y1*z2 - z1*y2, z1*x2 - x1*z2, x1*y2 - y1*x2)
    /**
     * SETTED TO STATIC (because the cross product of vectors is a vector)!
      */
    public static Vector vectorsProduct(Vector vector1, Vector vector2){
        return new Vector(vector1.y * vector2.z - vector1.z * vector2.y,
                            vector1.z * vector2.x - vector1.x * vector2.z,
                                vector1.x * vector2.y - vector1.y * vector2.x);
    }

//- методы для суммы и разности двух векторов. Формулы для этого: (x1 + x2, y1 + y2, z1 + z2) и (x1 - x2, y1 - y2, z1 - z2)
    /**
     * SETTED TO STATIC (because sum and difference of vectors are vectors)!
     */
    public static Vector sumVectors(Vector vector1, Vector vector2){
        return new Vector(vector1.x + vector2.x, vector1.y + vector2.y, vector1.z + vector2.z);
    }
    public static Vector differenceVectors(Vector vector1, Vector vector2){
        return new Vector(vector1.x - vector2.x, vector1.y - vector2.y, vector1.z - vector2.z);
    }

//- статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.
    public static Vector[] randomVectors(int n){
        Vector[] vectors = new Vector[n];
        Random random = new Random();
        for (int i = 0; i < vectors.length; i++) {
            vectors[i] = new Vector(random.nextInt(1000), random.nextInt(1000),random.nextInt(1000));
        }
        return vectors;
    }

//    - пеопределенный метод toString()
    @Override
    public String toString() {
        return "Vector{" +     "x=" + x + ", y=" + y + ", z=" + z + '}' + ", length= " + vectorLength(x,y,z);
    }
}
