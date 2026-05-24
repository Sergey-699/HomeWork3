//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        byte a = 2;
        short b = 25700;
        int c = -10523625;
        long d = 100254762L;
        float e = 2.75f;
        double f = 5.123456789d;
        System.out.println("Значение a: " + a);
        System.out.println("Значение b: " + b);
        System.out.println("Значение c: " + c);
        System.out.println("Значение d: " + d);
        System.out.println("Значение e: " + e);
        System.out.println("Значение f: " + f);


        System.out.println("Задание 2");
        float x = 27.12F;
        long y = 987678965549L;
        double w = 2.786;
        short g = 569;
        short h = -159;
        short i = 27897;
        byte j = 67;
        System.out.println("Значение x: " + x);
        System.out.println("Значение y: " + y);
        System.out.println("Значение w: " + w);
        System.out.println("Значение g: " + g);
        System.out.println("Значение h: " + h);
        System.out.println("Значение i: " + i);
        System.out.println("Значение j: " + j);


        System.out.println("Задание 3");
        byte students1 = 23;
        byte students2 = 27;
        byte students3 = 30;
        int allPaper = 480;
        int allStudents = students1 + students2 + students3;
        System.out.println("Всего учеников в трёх классах " + allStudents + " человек");
        int studentPaper = allPaper / allStudents;
        System.out.println("На каждого ученика рассчитано " + studentPaper + " листов бумаги");


        System.out.println("Задание 4");
        int minutesHour = 60;
        int hoursDay = 24;
        int daysMonth = 30;
        System.out.println("В одном часе " + minutesHour + " минут");
        System.out.println("В одних сутках " + hoursDay + " часа");
        System.out.println("В одном месяце " + daysMonth + " суток");
        int bottles1 = 16;
        int workingMinutes1 = 2;
        int bottlesPerMinute = bottles1 / workingMinutes1;
        System.out.println("За 1 минуту машина произвела " + bottlesPerMinute + " штук бутылок");
        int workingMinutes2 = 20;
        int bottles2 = workingMinutes2 * bottlesPerMinute;
        System.out.println("За " + workingMinutes2 + " минут машина произвела " + bottles2 + " штук бутылок");
        int workingMinutes3 = hoursDay * minutesHour;
        int bottles3 = workingMinutes3 * bottlesPerMinute;
        System.out.println("В сутках " + workingMinutes3 + " минут");
        System.out.println("За " + workingMinutes3 + " минут машина произвела " + bottles3 + " штук бутылок");
        int workingMinutes4 = ((hoursDay * minutesHour) * 3);
        int bottles4 = workingMinutes4 * bottlesPerMinute;
        System.out.println("В 3 сутках " + workingMinutes4 + " минут");
        System.out.println("За " + workingMinutes4 + " минут машина произвела " + bottles4 + " штук бутылок");
        int workingMinutes5 = ((daysMonth * hoursDay) * minutesHour);
        int bottles5 = workingMinutes5 * bottlesPerMinute;
        System.out.println("В 1 месяце " + workingMinutes5 + " минут");
        System.out.println("За " + workingMinutes5 + " минут машина произвела " + bottles5 + " штук бутылок");


        System.out.println("Задание 5");
        byte allCans = 120;
        System.out.println("Всего на ремонт школы закупили " + allCans + " банок белой и коричневой краски");
        byte whiteCans = 2;
        byte brownCans = 4;
        System.out.println("На один класс уходит " + whiteCans + " банки белой краски " + brownCans + " банки коричневой краски");
        int cansPerClass = whiteCans + brownCans;
        System.out.println("На один класс уходит " + cansPerClass + " банок белой и коричневой красок");
        int allClass = allCans / cansPerClass;
        System.out.println("Всего закупили краски двух цветов для ремонта " + allClass + " классов");
        int allWhiteCans = whiteCans * allClass;
        int allBrownCans = brownCans * allClass;
        System.out.println("В школе, где " + allClass + " классов, нужно " + allWhiteCans + " банок белой краски и " + allBrownCans + " банок коричневой краски");


        System.out.println("Задание 6");
        byte weightBanan = 80;
        byte weightMilk100 = 105;
        byte weighIceCream = 100;
        byte weightEgg = 70;
        System.out.println("Вес поштучно каждого продукта для спортзавтрака: 1 банан " + weightBanan + " грамм; 100 мл молока " + weightMilk100 + " грамм; 1 брекет пломбира " + weighIceCream + " грамм; 1 сырого яйца " + weightEgg + " грамм ");
        byte allBanans = 5;
        short allMilk = 2;
        byte allIceCream = 2;
        byte allEggs = 4;
        System.out.println("Для завтрака спортсмену потребуется: бананов " + allBanans + " шт.; молока " + allMilk + " мл; брекетов помбира " + allIceCream + " шт.; сырых яиц " + allEggs + " шт. ");
        int allFoodWeight = ((weightBanan * allBanans) + (weightMilk100 * allMilk) + (weighIceCream * allIceCream) + (weightEgg * allEggs));
        System.out.println("Вес завтрака спортсмена " + allFoodWeight + " граммов");
        float allFoodWeightKg = allFoodWeight / 1000F;
        System.out.println("Вес завтрака спортсмена " + allFoodWeightKg + " килограмм");


    }
}
