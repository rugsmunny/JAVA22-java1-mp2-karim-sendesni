package MiniProjekt2KopaVaror;

class Discount extends Vara {

    Discount(String name, int price, int amount, double discountRate) {
        super(name, (int) (Math.round(price - price * discountRate)), amount);

    }


}
