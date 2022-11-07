package MiniProjekt2KopaVaror;

class Discount extends Vara {

    double discountRate;


    public Discount(String name, int price, int amount, double discountRate) {
        super(name, price, amount);
        this.discountRate = discountRate;
    }

    public void discountedPrice() {

        this.setPrice ((int) ( super.getPrice()-super.getPrice()*this.discountRate)) ;
    }
}



