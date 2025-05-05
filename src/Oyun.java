import java.util.Scanner;
public class Oyun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pokemon player1 = new Pikacu();
        Pokemon player2 = new Balbazar();

        System.out.println("Pokemon Kapısması!");
        System.out.println(player1.isimAl() + " vs " + player2.isimAl());

        int round = 1;
        while (!player1.bayilma() && !player2.bayilma()) {
            System.out.println("\n--- Round " + round + " ---");

            player1.attack(player2);
            if (player2.bayilma()) break;

            player2.attack(player1);
            if (player1.bayilma()) break;

            System.out.println(player1.isimAl() + " HP: " + player1.getHealth());
            System.out.println(player2.isimAl() + " HP: " + player2.getHealth());

            System.out.println("Özel yetenek kullanmak ister misiniz? (Evet/Hayır)");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Evet")) {
                player1.ozelhareket(player2);
                if (!player2.bayilma()) {
                    player2.ozelhareket(player1);
                }
            }

            round++;
        }

        if (player1.bayilma()) {
            System.out.println("\nÖlüm " + player1.isimAl() + " bayılttı " + player2.isimAl() + " Kazanan!");
        } else {
            System.out.println("\nÖlüm " + player2.isimAl() + " bayılttı. " + player1.isimAl() + " Kazanan!");
        }

        scanner.close();
    }
}
