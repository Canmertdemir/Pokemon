public abstract class Pokemon {
    protected String isim;
    protected int can;
    protected int saldirigucu;

    public Pokemon(String isim, int can, int saldirigucu) {
        this.isim = isim;
        this.can = can;
        this.saldirigucu = saldirigucu;
    }

    public String isimAl() {
        return isim;
    }

    public int getHealth() {
        return can;
    }

    public boolean bayilma() {
        return can <= 0;
    }

    public void hasaralma(int saldirigucu) {
        can -= saldirigucu;
        if (can < 0) {
            can = 0;
        }
    }

    public void attack(Pokemon dusman) {
        System.out.println(isim + " düşmana " + dusman.isimAl() + " " + saldirigucu + " damage ile saldırıyor!");
        dusman.hasaralma(saldirigucu);
    }

    public abstract void ozelhareket(Pokemon dusman);
}
