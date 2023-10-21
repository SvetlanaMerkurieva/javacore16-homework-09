package myhashmap;

public class MyHashMapResult {
    public static void main(String[] args) {
        MyHashMap<String, Integer> hashMap = new MyHashMap<>();
        System.out.println("Створення коллекції: " + hashMap + ", розмір: " + hashMap.size());

        hashMap.put("Director", 50000);
        hashMap.put("Manager", 48000);
        hashMap.put("Accounter", 48000);

        System.out.println("Додавання елементів в коллекцію: " + hashMap + ", розмір: " + hashMap.size());

        hashMap.put("Manager", 45000);
        hashMap.put("Head of production", 45000);
        hashMap.put("Worker", 30000);

        System.out.println("Ще додавання елементів в коллекцію: " + hashMap + ", розмір: " + hashMap.size() + "\n(з однаковим ключем НЕ додається)");

        System.out.println("Отримання значення зарплатні Accounter: " + hashMap.get("Accounter"));
        System.out.println("Отримання значення зарплатні Head of production: " + hashMap.get("Head of production"));

        hashMap.remove(3);
        System.out.println("Cклад коллекції після видалення: " + hashMap + ", розмір: " + hashMap.size());

        hashMap.clear();
        System.out.println("Очищення коллекції: " + hashMap + ", розмір: " + hashMap.size());
    }
}
