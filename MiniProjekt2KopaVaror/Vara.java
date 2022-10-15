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
        return name  + String.format("%1$"+(20-name.length()-Integer.toString(price).length())+ "s",  "" ) +  price + ":-" + String.format("%1$"+(15-Integer.toString(amount).length())+ "s", "" ) + "(" +  amount + ")" ;
    }

    protected int getPrice() {
        return price;
    }

    protected void setAmount(int amount) {
        this.amount += amount;
    }
}



//Vara
//        Egenskaper: Minst tre stycken egenskaper för att presentera varan korrekt i menyn
//        Metoder:Minst en metod för att uppdatera en av egenskaperna varje gång en vara köps

//Subklass till Vara: rabatterad vara
//        Egenskaper: Utöver egenskaperna i Vara behövs egenskapen Rabatt i procent. (Alltså 0.01 = 1%)
//        Metoder: Räkna ut och returnera nya priset utifrån rabatten så att endast det rabatterade priset visas i menyn för en av varorna

