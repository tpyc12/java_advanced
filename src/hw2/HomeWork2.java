package hw2;

public class HomeWork2 {
    public static void main(String[] args) {
        try {
            myArray(new String[][]{
                    {"1", "2", "3", "4"},
                    {"5", "6", "7", "8"},
                    {"9", "10", "11", "12"},
                    {"13", "14", "15", "16"}
            });
        } catch (MyArraySizeException | MyArrayDataException e) {
        }
    }


    public static void myArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4) {
            throw new MyArraySizeException("Хочу, чтобы Вы указали массив 4х4");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("Хочу, чтобы Вы указали массив 4х4");
            }
        }
        int sum = 0;
        int x;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    Integer.parseInt(arr[i][j]);
                    x = Integer.parseInt(arr[i][j]);
                    sum += x;
                } catch (Exception e) {
                    throw new MyArrayDataException("В массиве не все элементы являются числом. Проверьте элемент массива" + i + " " + j);
                }
            }
        }
        System.out.println("Сумма всех элементов массива = " + sum);
    }
}