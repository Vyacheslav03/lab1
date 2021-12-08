package bsu.rfe.java.group7.lab1.Chikilev.var10;


import java.util.Arrays;


public class MainApplication {
    // Конструктор класса отсутствует!!!
    // Главный метод главного класса
    public static void main(String[] args) throws Exception {
        // Определение ссылок на продукты завтрака
        Food[] breakfast = new Food[20];
        boolean calories_needed = false;
        boolean sort_needed = false;
        int chees = 0;
        int cake = 0;
        int apple = 0;

        // Анализ аргументов командной строки и создание для них
        // экземпляров соответствующих классов для завтрака
        int itemsSoFar = 0;

        for (String arg : args) {
            if(arg.equals("-calories"))
                calories_needed = true;
            if(arg.equals("-sort"))
                sort_needed = true;
            String[] parts = arg.split(  "/");
            if (parts[0].equals("Сыр")) {
// У сыра дополнительных параметров нет
                breakfast[itemsSoFar] = new Cheese();
                chees++;
                itemsSoFar++;
            }
            if (parts[0].equals("Apple")) {

// ... Продолжается анализ других продуктов для завтрака
                //У яблока – 1 параметр, который находится в parts[1]
                breakfast[itemsSoFar] = new Apple(parts[1]);
                itemsSoFar++;
                apple++;

            }

            if (parts[0].equals("Cake")) {
                breakfast[itemsSoFar] = new Cake(parts[1]);
                cake++;
                itemsSoFar++;
            }
            if(sort_needed)
            Arrays.sort(breakfast, new FoodComparator());
        }
// Перебор всех элементов массива
        int f = 0;
        while (breakfast[f] != null){
            breakfast[f++].consume();
        }
           System.out.println("сыров"+ chees);
        System.out.println("яблок"+ apple);
        System.out.println("пирожинок"+ cake);
// Если дошли до элемента null – значит достигли конца
// списка продуктов, ведь 20 элементов в массиве было
// выделено с запасом, и они могут быть не
// использованы все

        if (calories_needed) {
            int calorii = 0;
            for (int i = 0; i < 3; i++) calorii += breakfast[i].calculateCalories();
            System.out.println("калорийность: " + calorii);
        }

        for (int i = 0; i < 3; i++)
            System.out.println(breakfast[i]);
        System.out.println("Всего хорошего!");

    }
    }
