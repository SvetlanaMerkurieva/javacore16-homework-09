package mystack;

public class MyStackResult {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();

        System.out.println("Створення колекції: " + stack);

        stack.push("video");
        stack.push("photo");
        stack.push("slide");
        stack.push("audio");
        stack.push("music");
        stack.push("sound");


        System.out.println("Поповнення колекції елементами: " + stack);
        System.out.println("Розмір колекції: " + stack.size());

        stack.remove(2);
        System.out.println("Колекція після видалення елемента за індексом 2: " + stack);

        System.out.println("Отримання першого елементу колекції: " + stack.peek());

        stack.pop();
        System.out.println("Видалення елементу колекції: " + stack);
        stack.pop();
        System.out.println("Ще видалення елементу колекції: " + stack);

        stack.clear();
        System.out.println("Очищення колекції: " + stack + ", розмір: " + stack.size());
    }
}
