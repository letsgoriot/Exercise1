package Exercise;

import java.util.ArrayList;
import java.util.List;

public class StringCompare {

    public boolean compareStrings(String stringOne, String stringTwo) { //создаем метод сравнения строк
        int unmapedLettersCount = 0; //объявляем переменную переменную счетчик лишних символов

        List<Character> myList = splitStringToList(stringOne); //разбиваем строки и помещаем посимвольно в листы
        List<Character> myList2 = splitStringToList(stringTwo);

        if (stringOne.length() >= stringTwo.length() + 2 || stringTwo.length() >= stringOne.length() + 2) {
            return false; //создаем условие, при котором длина строк не может отличатся больше чем на один символ.
        }

        for (int k = 0; k < myList.size(); k++) { //сравнивам строки посимвольно, чтобы найти несовпадающие символы
            if (!myList2.contains(myList.get(k))) {
                unmapedLettersCount += 1;
            }
        }

        if (unmapedLettersCount > 1) {
            return false;
        } else {
            return true;
        }
    }

    private List<Character> splitStringToList(String s) { //метод разбивает строки на символы и добавляющий их в лист
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        return list;
    }


}
