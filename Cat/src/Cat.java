
public class Cat
{
    private Double originWeight;
    public Double weight;
    static Double minWeight;
    static Double maxWeight;
    private Double massFood;
    private Double massAfterToil;
    //создаем статическую переменную
    static Integer count = 0;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;
    }
    public Cat(Double weight)
    {
        this.weight =  weight;
        count++;
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            count--;
            return "Dead";
        }
        else if(weight > maxWeight) {
            count--;
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }

    }
    //создаем метод возвращающий массу съеденной еды
    public Double getMassFood()
    {
        massFood = 350.0 * Math.random();
        return massFood;
    }
    //-Создаем метод “сходить в туалет”, который уменьшает вес кошки и печатает
    public Double getGoToil()
    {
        massAfterToil = weight - (weight * 0.1);
        System.out.println("UF ... UF ... UF ...");
        return massAfterToil;
    }
    //создаем метод getCount
    static int getCount()
    {
        return count;
    }
    //метод создать близнеца
    public void setCreateTwin(Double weight)
    {
        this.weight = weight;
        originWeight = weight;
    }
    //сщздаю метод для котенка
    public Double getLittle (Double weight)
    {
        return weight;
    }



}