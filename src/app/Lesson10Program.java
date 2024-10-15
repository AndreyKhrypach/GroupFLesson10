package app;

import java.util.Arrays;
import java.util.Random;

public class Lesson10Program {

    //public static final double PI = 3.1415;
    //public double pi = 3.1415;

    public static void main(String[] args) {

        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55...
        //todo
        //create calculatefibbonaci(int number) no more 30
        // number = array length for fibbonaci number

//        Random random = new Random();
//
//        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println(Arrays.toString(numbers));
//
//        //1,2,3,4,5,6,7,8,9,10
//        //10,9,8,7,6,5,4,3,2,1
//        reverseArray(numbers);
//
//        System.out.println(Arrays.toString(numbers));

//        double circleLength = 12;
//
//        ServiceFigure service = new ServiceFigure();
//
//        System.out.println(service.calculateRadius(circleLength));
//        double radius1 = circleLength / (2 * ServiceFigure.PI);
//        System.out.println(radius1);


//        Lesson10Program program = new Lesson10Program();
//
//        double circleLength = 12;
//        double radius1 = circleLength / (2 * PI);
//        double radius2 = circleLength / (2 * program.pi);
//        double radius3 = program.calculateRadius(circleLength);
//
//        System.out.println(radius1);
//        System.out.println(radius2);
//        System.out.println(radius3);

//        short num = 3;
//        int[] numbers1 = initializeArray(num);
//        int[] numbers2 = initializeArray(3);

        //public
        //protected
        //no modificator = default
        //private

//        int[] numbers1 = new int[6];
//        int[] numbers2 = new int[9];
//
//        initializeArray(numbers1);
//        initializeArray(numbers2);
//        int[] numbers3 = initializeArray(3);
//
//        int number = 0;
//        number = initializeNumber(number);
//        initializeArray(initializeNumber(number));

//        int[] numbers1 = initializeArray(new int[8]);
//        int[] numbers2 = initializeArray(new int[12]);
//        int[] numbers3 = initializeArray(3);

//        int[] numbers1 = new int[10];
//        int[] numbers2 = new int[20];
//
//        numbers1 = initializeArray(numbers1);
//        numbers2 = initializeArray(numbers2);


//        System.out.println(Arrays.toString(numbers1));
//        System.out.println(Arrays.toString(numbers2));
//        System.out.println(Arrays.toString(numbers3));
//        System.out.println(number);
    }

    public static void initializeArray(int[] numbers) {
        Random random = new Random();
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = random.nextInt();
        }
    }

    public static int[] initializeArray(short lengthArray) {
        Random random = new Random();
        int[] numbers = new int[lengthArray];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = random.nextInt();
        }
        return numbers;
    }

    public static int[] initializeArray(int lengthArray) {
        Random random = new Random();
        int[] numbers = new int[lengthArray];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = random.nextInt();
        }
        return numbers;
    }

    public static int[] initializeArray(int lengthArray, boolean check) {
        Random random = new Random();
        int[] numbers = new int[lengthArray];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = random.nextInt();
        }
        return numbers;
    }

    public static int[] initializeArray(boolean check, int lengthArray) {
        Random random = new Random();
        int[] numbers = new int[lengthArray];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = random.nextInt();
        }
        return numbers;
    }

    public static int initializeNumber(int number) {
        Random random = new Random();
        number = random.nextInt(10) + 1;
        return number;
    }

//    public double calculateRadius(double circleLength){
//        double radius = circleLength / (2 * pi);
//        return radius;
//    }

    public static void reverseArray(int[] array){
        for (int i = 0; i < array.length /2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
