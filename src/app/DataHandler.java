
package app;
// Клас для обробки даних
public class DataHandler {

    // Узагальнений метод для обробки масиву будь-якого типу
    public <T> String handleData(T[] items) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        // Цикл для обробки кожного елемента масиву
        for (T item : items) {
            count++;
            sb.append(String.format("(%d) %s ", count, item));
        }

        // Видалення зайвого пробілу в кінці рядка
        return sb.toString().trim();
    }
}
