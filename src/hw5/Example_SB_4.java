package hw5;

public class Example_SB_4 {

    public static void method1() {

        final int SIZE = 10000000;

        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + (float) (i / 5)) * Math.cos(0.2f + (float) (i / 5)) * Math.cos(0.4f + (float) (i / 2)));
        }
        System.currentTimeMillis();
        System.out.println("Метод 1 делает операцию за : " + (System.currentTimeMillis() - a) + " мс.");
    }

    public static void method2() {

        final int SIZE = 10000000;
        final int HALF = SIZE / 2;

        float[] arr1 = new float[HALF];
        float[] arr2 = new float[HALF];

        float[] arr = new float[SIZE];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, arr1, 0, HALF);
        System.arraycopy(arr, HALF + 1, arr2, 0, HALF - 1);

        Thread score1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < arr1.length; i++) {
                    arr1[i] = (float) (arr[i] * Math.sin(0.2f + (float) (i / 5)) * Math.cos(0.2f + (float) (i / 5)) * Math.cos(0.4f + (float) (i / 2)));
                }
            }
        });
        Thread score2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < arr2.length; i++) {
                    arr2[i] = (float) (arr2[i] * Math.sin(0.2f + (float) (HALF + i) / 5) * Math.cos(0.2f + (float) (HALF + i) / 5) * Math.cos(0.4f + (float) (HALF + i) / 2));
                }
            }
        });
        score1.start();
        score2.start();
        try {
            score1.join();
            score2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(arr1, 0, arr, 0, HALF - 1);
        System.arraycopy(arr2, 0, arr, HALF, HALF);
        System.currentTimeMillis();
        System.out.println("Метод 2 делает операцию за : " + (System.currentTimeMillis() - a) + " мс.");
    }
}

