public class Pikacu extends Pokemon {

    public Pikacu() {
        super("Pikacu", 100, 20);
    }

    @Override
    public void ozelhareket(Pokemon dusman) {
        System.out.println(isim + " özel hareket: Yıldırım saldırısı!");
        dusman.hasaralma(35);
    }
}
