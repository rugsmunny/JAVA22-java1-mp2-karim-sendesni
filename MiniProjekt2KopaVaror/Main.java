package MiniProjekt2KopaVaror;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean run = true;

        Scanner in = new Scanner(System.in);

        Customer kund = new Customer();

        Vara snickers = new Vara("Snickers", 2000, 1000);

        Vara pannkaka = new Vara("Pannkakor", 400, 200);

        Discount banan = new Discount("Banan", 17, 30500, 0.35);


        Vara[] merch = {snickers, pannkaka, banan};
        System.out.println(("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"));
        do{

        System.out.println("\nVälj en vara.\n");
            System.out.println("#   ARTIKEL         (sek)              (st)\n");
            for (int i = 0; i < merch.length; i++) {
                System.out.print((i+1)+".  "+merch[i].toString()+"\n");
            }System.out.print("\n0. - Avsluta -\nGör ditt val av köp: ");
            switch (Integer.parseInt(in.nextLine())){
                case 1 -> {
                    snickers.setAmount(-1);
                    kund.setAmountOfGoods(1);
                    kund.setTotalAmountToPay(snickers.getPrice());
                }case 2 -> {
                    pannkaka.setAmount(-1);
                    kund.setAmountOfGoods(1);
                    kund.setTotalAmountToPay(pannkaka.getPrice());
                }case 3 -> {
                    banan.setAmount(-1);
                    kund.setAmountOfGoods(1);
                    kund.setTotalAmountToPay(banan.getPrice());
                }case 0 ->  run = false;
            }
            System.out.println(("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"));
        }while(run);
        System.out.println("\n\nAntal köpta artiklar: "+ kund.getAmountOfGoods() + "\nDin total landar på: " + kund.getTotalAmountToPay() +":-");


    }
}


//        Det ska finnas en instans av Kund-klassen
//        Det ska finnas 2 instanser av Vara-klassen
//        Det ska finnas 1 instans av Rabatterad-vara-klassen
