/** 1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
  */
public class Main {
    /** 3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
     где a, b, c, d – аргументы этого метода, имеющие тип float.
     */
    static float calculate (float a, float b, float c, float d) {
        return a*(b+(c/d));
    }

    /** 4.Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
     *  от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    static boolean between10and20(int x, int y) {
        int sum = x + y;
        return sum >= 10 && sum <= 20;
    }

    /** 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать
     * в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     */
     private static boolean positiveOrNegative(int num) {
         return num >=0;
     }

    /** 6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
     * если число отрицательное, и вернуть false если положительное.
     */
    private static boolean isNegative(int number) {
        return number < 0;
    }

    /** 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен
     * вывести в консоль сообщение «Привет, указанное_имя!».
     */
    private static String Hello(String name) {
        return "Привет, " + name;
    }

    /** 8. * Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
     * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */
    private static boolean isLeapYearBool(int x) {
        return x % 4 == 0 && x % 100 != 0 || x % 400 == 0;
    }


    public static void main(String[] args){
        /** 2. Создать переменные всех пройденных типов данных и инициализировать их значения.
         */
        System.out.println("Задание 2.\n");
        byte o = 100;
        System.out.println(o);
        short w =-100;
        System.out.println(w);
        int f =1;
        System.out.println(f);
        long q =11;
        System.out.println(q);
        float e =2.5f;
        System.out.println(e);
        double k =3.45;
        System.out.println(k);
        char l ='L';
        System.out.println(l);
        boolean tr =true;
        System.out.println(tr);


        System.out.println("Задание 3.\n");

        float a = 5.5f;
        float b = 43.9f;
        float c = 2.7f;
        float d = 3.3f;
        System.out.println("Значения инициализированных переменных:");
        System.out.println("a = " + a + ";" + "\tb = " + b + ";" + "\tc = " + c + ";" + "\td = " + d + ";");
        System.out.println("Результат вычисления выражения: a * (b + (c / d)) = " + calculate(a, b, c, d) + ".\n");

        System.out.println("Задание 4.\n");

        int x = 10;
        int y =5;
        System.out.println("Значения инициализированных переменных:");
        System.out.println("x = " + x + "; " + "y = " + y + ";");
        System.out.printf("Сумма заданных значений равна %d. ", x + y);
        System.out.printf("Метод возвращает значение %s.\n\n", between10and20(x, y));
        System.out.println("Задание 5.\n");

        int num = 32768;
        System.out.printf("Значение переменной = %d. ", num);
        System.out.printf("Число %s.\n\n", positiveOrNegative(num) ? "положительное" : "отрицательное");


        System.out.println("Задание 6.\n");

        int number = -13;
        System.out.printf("Значение переменной = %d. Метод возвращает значение %s.\n\n", number, isNegative(number));


        System.out.println("Задание 7.\n");

        String name = "Максим";
        System.out.println(Hello(name) + "!\n");


        System.out.println("Задание 8.\n");

        System.out.println("Решение. В високосном году 366 дней, т.е. он делится на 4 без остатка. \n" +
                "Однако, по условию, необходимо проверить не делится ли без остатка год на 100.\n" +
                "Если да, то это очередное столетие и его надо проверить на делимость на 400 без остатка.\n" +
                "Если остаток от деления есть, то год является невисокосным. Например, 2300 год хоть и\n" +
                "делится на 4 без остатка, но при делении на 400 получается остаток. Значит год невисокосный.\n");

        int x1 = 2017;
        System.out.printf("Задан %d год. Он %s является високосным.\n", x1, (isLeapYearBool(x1)) ? "\b" : "не");
        int x2 = 2020;
        System.out.printf("Задан %d год. Он %s является високосным.\n", x2, (isLeapYearBool(x2)) ? "\b" : "не");

    }
}



