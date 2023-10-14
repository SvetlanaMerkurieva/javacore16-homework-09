package myqueue;

public class MyQueueResult {
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>();
        System.out.println("Створення черги: " + queue + ", розмір: " + queue.size());

        queue.add("potato");
        queue.add("tomato");
        queue.add("cucumber");
        queue.add("carrot");
        queue.add("beet");
        System.out.println("Додавання елементів в чергу: " + queue + ", розмір: " + queue.size());

        System.out.println("Отримання першого елементу: " + queue.peek());

        queue.poll();
        System.out.println("Видалення елементу: " + queue);

        queue.poll();
        System.out.println("Ще одне видалення елементу: " + queue);

        queue.clear();
        System.out.println("Очищення черги: " + queue + ", розмір: " + queue.size());
    }
}
