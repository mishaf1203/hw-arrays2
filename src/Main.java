public class Main {



    public static void main(String[] args) {

        int[] arr = generateRandomArray();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
//Задание 1
        int sum = 0;
        for (int i = 0; i < arr.length; ++i)
            sum += arr[i];
        System.out.println(sum);
//Задание 2
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+min +" рублей" );

        int max = arr[29];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Максимальная сумма трат за день составила "+max +" рублей" );
//Задание 3
        double avg = 0;
        if (arr.length > 0)
        {
            double sum1 = 0;
            for (int b = 0; b < arr.length; b++) {
                sum1 += arr[b];
            }
            avg = sum1 / arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила "+avg+ " рублей");


//Задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length; i > 0; i--) {
            System.out.print(reverseFullName[i-1]);
        }


        return arr;
    }

}