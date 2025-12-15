
public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        // Форматируем цену: убираем лишние нули после запятой
        String priceStr;
        if (price == (long) price) {
            priceStr = String.format("%d", (long) price);
        } else {
            priceStr = String.format("%.1f", price);
            // Убираем лишние нули после точки
            priceStr = priceStr.replaceAll("0+$", "").replaceAll("\\.$", "");
        }

        return name + " — " + priceStr + " руб.";
    }
}
