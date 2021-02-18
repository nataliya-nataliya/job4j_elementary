package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            result = (word[word.length - 1 - i] == post[post.length - 1 - i]) ? true : false;
            break;
        }
        /* проверить. что массив word имеет последние элементы одинаковые с post */
        return result;
    }
}
