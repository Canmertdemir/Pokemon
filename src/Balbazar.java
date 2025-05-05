public class Balbazar extends Pokemon {

    public Balbazar() {
        super("Charmander", 100, 18);
    }

    @Override
    public void ozelhareket(Pokemon dusman) {
        System.out.println(isim + " özel hareket: Jilet diken saldırısı");
        dusman.hasaralma(30);
    }
}
