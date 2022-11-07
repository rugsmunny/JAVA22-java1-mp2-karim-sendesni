package MiniProjekt2KopaVaror;

class Vara {

private final String name;
private int price;
private int amount;

    Vara(String name, int price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return name  + String.format("%1$"+(20-name.length()-Integer.toString(price).length())+ "s",  "" )
                +  price + ":-" + String.format("%1$"+(15-Integer.toString(amount).length())+ "s", "" )
                + "(" +  amount + ")" ;
    }

    protected int getPrice() {
        return price;
    }
    protected int getAmount() {
        return amount;
    }

    protected void setPrice(int price) { this.price = price; }

    protected void subtractOneArticle() {
        this.amount -= 1;
    }
}





