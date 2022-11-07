package MiniProjekt2KopaVaror;

class Customer {

    private int amountOfGoods = 0;
    private int totalAmountToPay = 0;

    protected int getAmountOfGoods() {
        return amountOfGoods;
    }

    protected void setAmountOfGoods(int amountOfGoods) {
        this.amountOfGoods += amountOfGoods;
    }

    protected int getTotalAmountToPay() {
        return totalAmountToPay;
    }

    protected void setTotalAmountToPay(int totalAmountToPay) {
        this.totalAmountToPay += totalAmountToPay;
    }
}



