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
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);


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
        byte weightMilkPortion = 105;
        byte milkPortionMl = 100;
        byte weighIceCreamBar = 100;
        byte weightEgg = 70;
        System.out.println("1 порция молока " + milkPortionMl + " мл.");
        System.out.println("Вес поштучно каждого продукта для спортзавтрака: 1 банан " + weightBanan + " грамм; 1 порция молока " + weightMilkPortion + " грамм; 1 брекет пломбира " + weighIceCreamBar + " грамм; 1 сырого яйца " + weightEgg + " грамм ");
        byte allBanans = 5;
        short allMilkPortions = 2;
        byte allIceCreamBars = 2;
        byte allEggs = 4;
        System.out.println("Для завтрака спортсмену потребуется: бананов " + allBanans + " шт.; молока " + allMilkPortions + " порции; брекетов помбира " + allIceCreamBars + " шт.; сырых яиц " + allEggs + " шт. ");
        int allFoodWeight = ((weightBanan * allBanans) + (weightMilkPortion * allMilkPortions) + (weighIceCreamBar * allIceCreamBars) + (weightEgg * allEggs));
        System.out.println("Вес завтрака спортсмена " + allFoodWeight + " граммов");
        float allFoodWeightKg = allFoodWeight / 1000F;
        System.out.println("Вес завтрака спортсмена " + allFoodWeightKg + " килограмм");


        System.out.println("Задание 7");
        byte weightLossKg = 7;
        int weightLossGr = weightLossKg * 1000;
        int dailyWeightLossGr1 = 250;
        int dailyWeightLossGr2 = 500;
        System.out.println("Спортсмену нужно сбросить " + weightLossKg + " кг. Переводим вес в граммы. Получаем " + weightLossGr + " грамм.");
        System.out.println("2 рациона питания для сброса веса. По первому рациону спортсмен теряет " + dailyWeightLossGr1 + " грамм в день. По второму " + dailyWeightLossGr2 + " грамм в день");
        int daysDailyRation1 = weightLossGr / dailyWeightLossGr1;
        int daysDailyRation2 = weightLossGr / dailyWeightLossGr2;
        int averageDays = ((daysDailyRation1 + daysDailyRation2) / 2);
        System.out.println("Для нужной потери веса по первому рациону спортсмену потребуется " + daysDailyRation1 + " дней");
        System.out.println("Для нужной потери веса по второму рациону спортсмену потребуется " + daysDailyRation2 + " дней");
        System.out.println("Для нужной потери веса спортсмену в среднем потребуется " + averageDays + " день");


        System.out.println("Задание 8");
        int salaryMasha = 67760;
        System.out.println("Зарплата Маши до увеличения " + salaryMasha);
        int salaryDenis = 83690;
        System.out.println("Зарплата Дениса до увеличения " + salaryDenis);
        int salaryKristina = 76230;
        System.out.println("Зарплата Кристины до увеличения " + salaryKristina);
        float percent = 0.10F;
        System.out.println("Увеличение зарплаты на 10% ");

        float increaseMasha = salaryMasha * percent;
        float increaseDenis = salaryDenis * percent;
        float increaseKristina = salaryKristina * percent;

        float newSalaryMasha = salaryMasha + increaseMasha;
        float newSalaryDenis = salaryDenis + increaseDenis;
        float newSalaryKristina = salaryKristina + increaseKristina;

        float annualIncomeMasha = salaryMasha * 12;
        float annualIncomeDenis = salaryDenis * 12;
        float annualIncomeKristina = salaryKristina * 12;


        float newAnnualIncomeMasha = newSalaryMasha * 12;
        float newAnnualIncomeDenis = newSalaryDenis * 12;
        float newAnnualIncomeKristina = newSalaryKristina * 12;


        float annualIncomeGrowthMasha = newAnnualIncomeMasha - annualIncomeMasha;
        float annualIncomeGrowthDenis = newAnnualIncomeDenis - annualIncomeDenis;
        float annualIncomeGrowthKristina = newAnnualIncomeKristina - annualIncomeKristina;

        System.out.println("После увеличения зарплаты Маша получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + annualIncomeGrowthMasha + " рублей");
        System.out.println("После увеличения зарплаты Денис получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + annualIncomeGrowthDenis + " рублей");
        System.out.println("После увеличения зарплаты Кристина получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + annualIncomeGrowthKristina + " рублей");


    }
}
