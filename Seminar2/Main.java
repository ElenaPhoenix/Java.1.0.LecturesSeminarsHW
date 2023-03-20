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

        System.out.println(str.toLowerCase()); //
        System.out.println(str.length());
        System.out.println("_*".repeat(10));

        String a = "d";
        String f = "d";

        System.out.println(str.equals("N"));
        //if (str == "N")
        System.out.println(str.contains("N"));
        str = "Hello     World ! РџСЂРёРІРµС‚ РњРёСЂ !";
        System.out.println(str.replace("l", "p"));
        System.out.println(str.replaceFirst("l", "p"));
        System.out.println(str.charAt(1));
        String[] strings = str.split(" ");
        builder.replace(0, 1, "F");
        builder.reverse();
        builder.insert(4, " inserted ");
        builder.deleteCharAt(6);
        builder.indexOf("Fd");
        str = new StringBuilder(str).reverse().toString();

    }
}
