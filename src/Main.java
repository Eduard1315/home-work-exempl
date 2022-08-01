public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        System.out.println("Пишем наше ДЗ!!");
        System.out.println("Делаем коммит и пуш");
        System.out.println("Переходим в гитхаб");

        //Задача 1
        byte cat = 3;
        short mouse = 2;
        int dog = 1;
        long snake = 4L;
        float saltWeight = 4.5f;
        double sugarWeight = 5.3;
        boolean dogIsAdult = dog > 10;
        char bar = 38;
        System.out.println(dogIsAdult);

        //Задача 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOfAllBoxers = boxer1 + boxer2;
        double weightDifference = boxer1 - boxer2;
        System.out.println("общий вес боксёров " + weightOfAllBoxers);
        System.out.println("разница в весе " + weightDifference);

        //Задание 3
        int bananas = 5*80;
        int milk = 105*2;
        int icecreamsundae = 2*100;
        int Raweggs = 4*70;
        int totalweight = bananas + milk + icecreamsundae + Raweggs;
        System.out.println("обший вес завтрака в гр. " + totalweight);
        float totalweightkg = totalweight / 1000f;
        System.out.println("обший вес завтрака в кг. " + totalweightkg);

        //Задание 4
        short toReset = 7000;
        short daysToReset = 7000 / 250;
        short daysToResetquickly = 7000 / 500;
        System.out.println("надо дней при похудении 250гр. в день - " + daysToReset);
        System.out.println("надо дней при похудении 500гр. в день - " + daysToResetquickly);

        //Задание 5
        long Masha = 67760;
        long Denis = 83690;
        long Kristy = 76230;
        long increaseMasha = 67760 / 10;
        System.out.println("повысили зарплату Маше на " + increaseMasha + " р.");
        long increaseDenis = 83690 / 10;
        System.out.println("повысили зарплату Денису на " + increaseDenis + " р.");
        long increaseKristy = 76230 / 10;
        System.out.println("повысили зарплату Кристине на " + increaseKristy + " р.");
        long itbecameMasha = Masha + increaseMasha;
        System.out.println("Зарплата у Маши стала " + itbecameMasha + " р.");
        long itbecameDenis = Denis + increaseDenis;
        System.out.println("Зарплата у Дениса стала " + itbecameDenis + " р.");
        long itbecameKristy = Kristy + increaseKristy;
        System.out.println("Зарплата у Кристины стала " + itbecameKristy + " р.");

        long Mashahaditinayear = Masha * 12;
        long itbecameMashayear = itbecameMasha * 12;
        long thedifferenceinannualsalaryMasha = itbecameMashayear - Mashahaditinayear;
        System.out.println("была годовая з.п. у Маши " + Mashahaditinayear +" р.");
        System.out.println("стала годовая з.п. у Маши " + itbecameMashayear +" р.");
        System.out.println("разница у Маши составила " + thedifferenceinannualsalaryMasha +" р.");

        long Denishaditinayear = Denis * 12;
        long itbecameDenisyear = itbecameDenis * 12;
        long thedifferenceinannualsalaryDenis = itbecameDenisyear - Denishaditinayear;
        System.out.println("была годовая з.п. у Дениса " + Denishaditinayear +" р.");
        System.out.println("стала годовая з.п. у Дениса " + itbecameDenisyear +" р.");
        System.out.println("разница у Дениса составила " + thedifferenceinannualsalaryDenis +" р.");

        long Kristyhaditinayear = Kristy * 12;
        long itbecameKristyyear = itbecameKristy * 12;
        long thedifferenceinannualsalaryKristy = itbecameKristyyear - Kristyhaditinayear;
        System.out.println("была годовая з.п. у Кристины " + itbecameKristyyear +" р.");
        System.out.println("стала годовая з.п. у Кристины " + itbecameKristyyear +" р.");
        System.out.println("разница у Кристины составила " + thedifferenceinannualsalaryKristy +" р.");





    }
}
