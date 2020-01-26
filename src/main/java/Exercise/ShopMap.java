package Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShopMap {
//    public static void main(String[] args) {
//        HashMap<String, Integer> myMap = new HashMap<>();
//        myMap.put("Шариковая ручка", 36);
//        myMap.put("Цветные карандаши (набор)", 12);
//        myMap.put("Линейка", 0);
//
//        Scanner s = new Scanner(System.in);
//        String order = s.nextLine();
//        s.close();
//        checkAvailability(order, myMap);
//    } // проверка, что метод работает
    public static void checkAvailability (String name, HashMap<String,Integer> myShop){
        int value = myShop.get(name);
        if (value == 0) {
            System.out.println("Такого товара нет в наличии");
        }
        else {
            System.out.println("Количество товара:" + " " + value);
        }

    }


}
