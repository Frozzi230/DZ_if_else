import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Задача №1");
        Scanner input = new Scanner(System.in);
        System.out.print("Введите возраст человека: ");
        int age = input.nextInt();
        if (age >= 18)
        {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        else
        {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println();

        System.out.println("Задача №2");
        System.out.print("Введите температуру воздуха: ");
        int temp = input.nextInt();
        if (temp < 5)
        {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        }
        else
        {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }

        System.out.println();

        System.out.println("Задача №3");
        System.out.print("Введите скорость авто: ");
        int speed = input.nextInt();
        if (speed > 60)
        {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        else
        {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        System.out.println();

        System.out.println("Задача №4");
        System.out.print("Введите возраст человека: ");
        age = input.nextInt();
        if (age >= 2 && age <=6)
        {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (age >=7 && age <= 17)
        {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (age >= 18 && age <= 24)
        {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        }
        if (age > 24)
        {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }

        System.out.println();

        System.out.println("Задача №5");
        System.out.print("Введите возраст ребенка: ");
        age = input.nextInt();
        if (age < 5)
        {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }
        if (age > 5 && age <= 14)
        {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослых");
        }
        if (age > 14)
        {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослых");
        }

        System.out.println();

        System.out.println("Задача №6");
        int all = 102;
        System.out.print("Введите количество свободных сидячих мест в вагоне: ");
        int sidFree = input.nextInt();
        int sid = 60;
        while (sidFree > sid || sidFree < 0)
        {
            System.out.print("Число должно быть в диапазоне от 0 (включительно) до " + sid +" (включительно). Введите снова: ");
            sidFree = input.nextInt();
        }
        System.out.print("Введите количество свободных стоячих мест в вагоне: ");
        int standFree = input.nextInt();
        int stand = all - sid;
        while (standFree > stand || standFree < 0)
        {
            System.out.print("Число должно быть в диапазоне от 0 (включительно) до " + stand + " (включительно). Введите снова: ");
            standFree = input.nextInt();
        }
        if (sidFree == 0 && standFree == 0)
        {
            System.out.println("В вагоне нет свободных мест");
        }
        if (sidFree > 0 && standFree == 0)
        {
            System.out.println("В вагоне есть сидячие места и нет стоячих");
        }
        if (standFree > 0 && sidFree == 0)
        {
            System.out.println("В вагоне есть стоячие места и нет сидячих");
        }
        else
        {
            if (sidFree > 0 && standFree > 0)
            {
                System.out.println("В вагоне есть сидячие и стоячие места");
            }
        }

        System.out.println();

        System.out.println("Задача №7");
        System.out.print("Введите первое число: ");
        int one = input.nextInt();
        System.out.print("Введите второе число: ");
        int two = input.nextInt();
        System.out.print("Введите третье число: ");
        int three = input.nextInt();
        if (one > two && one > three)
        {
            System.out.println("Самое большое число - первое " + one);
        }
        if (two > one && two > three)
        {
            System.out.println("Самое большое число - второе " + two);
        }
        if (three > one && three > two)
        {
            System.out.println("Самое большое число - третье " + three);
        }
        else
        {
            if (one == two && one == three)
            {
                System.out.println("Все три числа равны: " + one);
            }
            if (one == two && one > three)
            {
                System.out.println("Первое и второе числа равны и наибольшие: " + one);
            }
            if (one == three && one > two)
            {
                System.out.println("Первое и третье числа равны и наибольшие: " + one);
            }
            if (two == three && two > one)
            {
                System.out.println("Второе и третье числа равны и наибольшие: " + two);
            }
        }
        input.close();
    }
}
