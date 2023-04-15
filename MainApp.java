package HW_Java_6;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addNotebook(new Notebook("LENOVO", 512,  15, 500,  "HDD", "Windows", "Gray"))
            .addNotebook(new Notebook("HP",     2048, 13, 1000, "HDD", "Windows", "Black" ))
            .addNotebook(new Notebook("APPLE",  2048, 10 ,500,  "SSD", "iOS",     "Gray"))
            .addNotebook(new Notebook("ASUS",   4196, 14, 1000, "SSD", "Windows", "White"))
            .addNotebook(new Notebook("HP",     1024, 15, 1000, "HDD", "Linux",   "Gray"))
            .addNotebook(new Notebook("APPLE",  1024, 14, 200,  "SSD", "iOS",   "Black"))
            .addNotebook(new Notebook("ASUS",   4196, 13, 1000, "HDD", "Windows", "Gray"))
            .addNotebook(new Notebook("LENOVO", 2048, 15, 500,  "SSD", "Linux",   "White"));

        shop.showNoteBooks();
        HashMap<String, Object> filters = shop.askPointsFilter();
        System.out.println(filters);

        HashSet<Notebook> foundNotebooks = shop.findNotebooks2(filters);
        System.out.println("==========================================");
        shop.showfoundNotebooks(foundNotebooks);

    }
}
/*
Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы.
Реализовать в Java.
----------------------------------------------
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии)
фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объём ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев —
сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */