public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int dog = 8;
        byte cat = 1;
        short paper = 3789;
        long poster = 75655559;
        float gogetle = 5.7E+25F;
        double big = 2.3E+250;
        System.out.println(paper);
        System.out.println(poster);
        System.out.println(gogetle);
        System.out.println(big);
            }

    public static void task2() {
        System.out.println("Задача 2");
        float dog = 27.12F;
        long cat = 987678965549L;
        float paper = 2.786F;
        int f = 569;
        short d = -159;
        short c = 27897;
        int e = 67;
    }

    public static void task3() {
        System.out.println("Задача 3");
        int LP = 23;
        int AS = 27;
        int EA = 30;
        int total = 480;
        int n = total/(LP+AS+EA);
        System.out.println("На каждого ученика рассчитано "+n+" листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        int efficiency = 16;
        int efficiency1 = 16/2*20;
        int efficiency2 = 16/2*24*60;
        int efficiency3 = 16/2*24*60*3;
        int efficiency4 = 16/2*24*60*30;
        System.out.println("За 20 минут машина произвела "+efficiency1+" штук бутылок");
        System.out.println("За сутки машина произвела "+efficiency2+" штук бутылок");
        System.out.println("За 3 дня машина произвела "+efficiency3+" штук бутылок");
        System.out.println("За 1 месяц машина произвела "+efficiency4+" штук бутылок");
            }

    public static void task5() {
        System.out.println("Задача 5");
        int pot = 120;
        int white = 2;
        int bromn = 4;
        int clas = pot/(white+bromn);
        int whiteN = clas*white;
        int brownN = clas*bromn;
        System.out.println("В школе, где "+clas+" классов, нужно "+whiteN+" банок белой краски и "+brownN+" банок коричневой краски");
            }

    public static void task6() {
        System.out.println("Задача 6");
        int banan = 5*80;
        int milk = 200/100*105;
        int ice = 2*100;
        int egg = 4*70;
        float total = (banan+milk+ice+egg)/1000F;
        System.out.println("Вес спортзавтрака " + total + " кг");
    }

    public static void task7() {
        System.out.println("Задача 7");
        int total = 7000;
        int weight250 = 250;
        int weight500 = 500;
        int day250 = total/weight250;
        int day500 = total/weight500;
        System.out.println(day250 + " дней потребуется, если терять по 250грамм");
        System.out.println(day500 + " дней потребуется, если терять по 250грамм");
           }

    public static void task8() {
        System.out.println("Задача 8");
        int Macha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        double Macha10 = Macha*1.1;
        double Denis10 = Denis*1.1;
        double Kristina10 = Kristina*1.1;
        double MachaYear = Macha10*12-Macha*12;
        double DenisYear = Denis10*12-Denis*12;
        double KristinaYear = Kristina10*12-Kristina*12;

        System.out.println("Маша теперь получает " +Macha10+ " рублей. Годовой доход вырос на "+MachaYear+" рублей");
        System.out.println("Денис теперь получает " +Denis10+ " рублей. Годовой доход вырос на "+DenisYear+" рублей");
        System.out.println("Кристина теперь получает " +Kristina10+ " рублей. Годовой доход вырос на "+KristinaYear+" рублей");

    }
}
