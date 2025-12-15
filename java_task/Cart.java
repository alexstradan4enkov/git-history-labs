import java.util.ArrayList;


public class Cart {
    private ArrayList<Product> products;


    public Cart() {
        products = new ArrayList<Product>();
    }


    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Добавлен: " + product.getName());
    }

    public boolean removeProduct(String name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equalsIgnoreCase(name)) {
                Product removed = products.remove(i);
                System.out.println("Удален: " + removed.getName());
                return true;
            }
        }
        System.out.println("Товар '" + name + "' не найден в корзине");
        return false;
    }

    public double getTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }


    public void printCart() {
        System.out.println("\n=== Корзина ===");

        if (products.isEmpty()) {
            System.out.println("Корзина пуста");
            return;
        }

        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ". " + products.get(i));
        }

        // Форматируем общую сумму
        double total = getTotal();
        String totalStr;
        if (total == (long) total) {
            totalStr = String.format("%d", (long) total);
        } else {
            totalStr = String.format("%.1f", total);
            totalStr = totalStr.replaceAll("0+$", "").replaceAll("\\.$", "");
        }

        System.out.println("Итого: " + totalStr + " руб.");
    }


    public int getItemCount() {
        return products.size();
    }
}
