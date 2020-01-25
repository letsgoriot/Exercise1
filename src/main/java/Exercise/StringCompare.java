package Exercise;

import java.util.ArrayList;
import java.util.List;

public class StringCompare {

    public boolean compareStrings(String stringOne, String stringTwo) {
        int unmapedLettersCount = 0;

        List<Character> myList = splitStringToList(stringOne);
        List<Character> myList2 = splitStringToList(stringTwo);

        if (stringOne.length() >= stringTwo.length() + 2 || stringTwo.length() >= stringOne.length() + 2) {
            return false;
        }

        for (int k = 0; k < myList.size(); k++) {
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

    private List<Character> splitStringToList(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        return list;
    }


}
