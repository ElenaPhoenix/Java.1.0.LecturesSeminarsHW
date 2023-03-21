// 1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
// 2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
// 3* Напишите программу, чтобы перевернуть строку с помощью рекурсии.
// 4. Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
// 5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
// 6. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
// 7* Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.

package HomeworkAfterSeminar2;

public class Main {
    public static void main(String[] args) { // точка входа
        String data = "съешь ещё этих мягких французских булок да выпей чаю";
        String control = "да выпей чаю";
        StringBuilder builder = new StringBuilder("");


        System.out.println("1. Содержит ли в себе первая строка вторую строку: " + data.contains(control));


        char[] array = control.toCharArray();
        String reversedControl = "";
        for (int i = array.length - 1; i >= 0; i--) {
            reversedControl = reversedControl + array[i];
        }
        //System.out.println(reversedControl);
        System.out.println("2. Являются ли две данные строки вращением друг друга: "+data.equals(reversedControl));


        System.out.println("3* Переворот второй строки с помощью рекурсии: "+reverseString(control));
        System.out.println("");


        int firstNumber=3;
        int secondNumber=56;
        StringBuilder sum=new StringBuilder().append(firstNumber).append(" + ").append(secondNumber).append(" = ").append(firstNumber+secondNumber);
        StringBuilder differ=new StringBuilder().append(firstNumber).append(" - ").append(secondNumber).append(" = ").append(firstNumber-secondNumber);
        StringBuilder composition=new StringBuilder().append(firstNumber).append(" * ").append(secondNumber).append(" = ").append(firstNumber*secondNumber);
            
        System.out.println(sum);
        System.out.println(differ);
        System.out.println(composition);
        System.out.println("");


        sum.insert(8, "равно").deleteCharAt(7);
        System.out.println(sum);

        differ.insert(8, "равно").deleteCharAt(7);
        System.out.println(differ);

        composition.insert(8, "равно").deleteCharAt(7);
        System.out.println(composition);
        System.out.println("");


        sum.replace(7, 12, "РАВНО").toString();
        System.out.println(sum);

        differ.replace(7, 12, "РАВНО");
        System.out.println(differ);

        composition.replace(7, 12, "РАВНО");
        System.out.println(composition);
        System.out.println("");


        // long begin = System.currentTimeMillis(); // сравнение скорости работы String и StringBuilder
        // for (int i = 0; i < 10000; i++) {
        //     sum += Character.getName(i); // возвращает букву
        // }
        // long end = System.currentTimeMillis();
        // System.out.println("to String: " + (end - begin));

        // begin = System.currentTimeMillis();
        // for (int i = 0; i < 10; i++) {
        //     sum.append(Character.getName(i));
        // }
        // end = System.currentTimeMillis();
        // System.out.println("to StringBuilder: " + (end - begin) );

    }

    public static String reverseString(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
        }
    
}
