public class Main {
    public static void main(String[] args) {
        // Создаем корзину
        Cart cart = new Cart();

        System.out.println("=== Магазин электроники ===");

        // Создаем товары
        Product laptop = new Product("Ноутбук", 75000.0);
        Product mouse = new Product("Мышка", 1500.0);
        Product keyboard = new Product("Клавиатура", 3000.0);

        // Добавляем товары в корзину
        System.out.println("\nДобавляем товары:");
        cart.addProduct(laptop);
        cart.addProduct(mouse);
        cart.addProduct(keyboard);

        // Показываем корзину
        cart.printCart();

        // Удаляем товар
        System.out.println("\nУдаляем: Мышка");
        cart.removeProduct("Мышка");

        // Снова показываем корзину
        cart.printCart();

        // Демонстрация дополнительных операций
        System.out.println("\n=== Дополнительные операции ===");

        // Добавляем еще товаров
        Product headphones = new Product("Наушники", 5000.0);
        Product monitor = new Product("Монитор", 25000.0);

        cart.addProduct(headphones);
        cart.addProduct(monitor);

        // Показываем финальную корзину
        cart.printCart();

        // Показываем статистику
        System.out.println("\nСтатистика:");
        System.out.println("Товаров в корзине: " + cart.getItemCount());
        System.out.println("Общая сумма: " + cart.getTotal() + " руб.");
    }
}