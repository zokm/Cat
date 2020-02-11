
public class Loader
{
    public static void main(String[] args) {
        //создаю объекты (5-7 кошек)
        Cat vaska = new Cat();
        Cat murzik = new Cat();
        Cat milka = new Cat();
        Cat gavr = new Cat();
        Cat gog = new Cat();
        Cat grom = new Cat();
        Cat zero = new Cat();
        Cat musya = new Cat();
        //близнецы
        vaska.setCreateTwin(murzik.getWeight());
        System.out.println("weight vaska: " + vaska.getWeight());
        System.out.println("weight murzik: " + murzik.getWeight());
        //узнаем количество котов
        System.out.println(Cat.getCount());
        System.out.println(vaska.getStatus());
        //смотрим их вес
        System.out.println(vaska.getWeight());
        System.out.println(milka.getWeight());
        System.out.println(gavr.getWeight());
        System.out.println(gog.getWeight());
        System.out.println(zero.getWeight());
        System.out.println(grom.getWeight());
        System.out.println(murzik.getWeight());
        murzik.meow();
        System.out.println(murzik.getWeight());
        System.out.println(milka.getWeight());
        //кормим милку
        milka.feed(1000.0);
        System.out.println(milka.getWeight());
        System.out.println(gavr.getWeight());
        //поим гавра
        gavr.drink(3500.0);
        System.out.println(gavr.getWeight());
        System.out.println(gavr.getStatus());
        System.out.println(gog.getWeight());
        //кормим и поим гога
        gog.feed(5000.0);
        gog.drink(3000.0);
        System.out.println(gog.getStatus());
        //замяукивание васьки досмерти
        while (vaska.getWeight() >= Cat.minWeight)
            vaska.meow();
        System.out.println(vaska.getStatus());
        //кормить зеро пока не взорвется
        while (zero.getWeight() <= Cat.maxWeight)
            zero.feed(1500.0);
        System.out.println(zero.getWeight());
        System.out.println(zero.getStatus());
        //узнаем количество оставшихся котов
        System.out.println(Cat.getCount());
        //вызываю метод для котенка и вывожу его вес
        System.out.println(musya.getLittle(100.0 + 100.0 * Math.random()));


    }

}