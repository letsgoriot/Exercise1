package Exercise;


import javax.net.ssl.StandardConstants;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class WordStat {
    public static void main(String[] args) {
        try {
            File file = new File("src//main//resources//data//battleship//phrase1"); //считываем файл
            InputStreamReader w = new InputStreamReader(new FileInputStream(file), "UTF-8"); //кодировка текста
            BufferedReader bufferedReader = new BufferedReader(w);
            Map<String, Integer> map = new HashMap<String, Integer>(); //создаев мапу

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] myArray = line.split(" "); //создаем массив, разбиваем по пробелам строки
                for (String s : myArray) { //итерируемся по массиву
                    if (map.containsKey(s)) { //смотрим, если такой ключ существует, то увеличиваем значение на 1
                        map.put(s, map.get(s) + 1);
                    } else {
                        map.put(s, 1); //если нет, то добавляем новый ключ со значением 1
                    }
                }
            }
            bufferedReader.close();

            System.out.println(map);

//           for (Map.Entry<String, Integer> entry : map.entrySet()) { //2-й вариант вариант вывода
//                System.out.print(entry.getKey() + ": ");
//                System.out.println(entry.getValue());
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
