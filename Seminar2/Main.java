package Seminar2;
import java.util.StringTokenizer;

public class Main { // класс - описание того, как должен работать объект. Классы называем с заглавной, переменные - с малой буквы
    public static void main(String[] args) { // точка входа
        //String - константа, Stringbuilder - нефинализирован, можно менять, не создавая новый массив, гораздо быстрее работает
        String str = "";
        StringBuilder builder = new StringBuilder(""); // StringBuilder- класс(объект). Когда создаем объект, под него всегда нужно выделить место, вызвать конструктор - new ...
        //builder.append(str).append("!").append("Привет мир"); // Метод добавления строк в append (и не только строк)

        long begin = System.currentTimeMillis(); // сравнение скорости работы String и StringBuilder
        for (int i = 0; i < 10; i++) {
            str += Character.getName(i); // возвращает букву
        }
        long end = System.currentTimeMillis();
        System.out.println("to String: " + (end - begin));

        begin = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            builder.append(Character.getName(i));
        }
        end = System.currentTimeMillis();
        System.out.println("to StringBuilder: " + (end - begin) );

        //builder.toString() // преобразование из StringBuilder в String

        System.out.println(str.toLowerCase()); //создается ссылка, по которой значения String приводятся к нижнему регистру, при этом сам объект String остается неизменным
        //str=str.toLowerCase() //так можно переписать строку
        System.out.println(str.length());
        System.out.println("_*".repeat(10)); //строка, состоящая из _* повторяется 10 раз, _* - это анонимный полноценный объект, можем с ним работать как с классом

        String a = "d";
        String f = "d";

        System.out.println(str.equals("N")); // сравнение по содержимому строки
        //if (str == "N")
        System.out.println(str.contains("N")); // есть ли в строке к-л символ
        str = "Hello     World!";
        System.out.println(str.replace("l", "p")); // поменять местами символы
        System.out.println(str.replaceFirst("l", "p")); // замена первого символа
        System.out.println(str.charAt(1)); // возвращает букву по индексу
        String[] strings = str.split(" "); // позволяет распилить строку на массив строк по определенному разделителю
        
        builder.replace(0, 1, "F"); // в StringBuilder в replace нужно указывать в условии откуда докуда и чем заменить
        builder.reverse(); // развернуть строку
        builder.insert(4, " inserted "); //воткнуть ч-л после к-л индекса
        builder.deleteCharAt(6); // удалить конкретную букву по конкретному индексу
        builder.indexOf("Fd"); //возвращает индекс строки, которая передается в параметре
        str = new StringBuilder(str).reverse().toString(); //в строке будет записано развернутое предыдущее состояние строки

    }
}
