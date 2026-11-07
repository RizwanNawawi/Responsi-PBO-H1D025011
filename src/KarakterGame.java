public abstract class KarakterGame {
    public static final int MAX_HP = 100;

    // Immutability: Atribut instans kekal (private final)
    private final String idKarakter;

    // State & Enkapsulasi: Seluruh atribut private
    private String nama;
    private int hp;
    private int energi;

    // Overloaded Constructor
    public KarakterGame(String idKarakter, String nama, int hp, int energi) {
        this.idKarakter = idKarakter;
        this.nama = nama;
        this.hp = hp;
        this.energi = energi;
    }

    public KarakterGame(String idKarakter, String nama) {
        this(idKarakter, nama, MAX_HP, 50);
    }

    // Behavior: Method prosedur (void)
    public void tampilkanInfo() {
        System.out.println("ID     : " + this.idKarakter);
        System.out.println("Nama   : " + this.nama);
        System.out.println("HP     : " + this.hp + "/" + MAX_HP);
        System.out.println("Energi : " + this.energi);
    }

    // Behavior: Method fungsi dengan return value
    public boolean apakahMasihHidup() {
        return this.hp > 0;
    }

    // Abstract Method
    public abstract void gunakanSkill();

    // Getter dan Setter "this"
    // Catatan: idKarakter hanya memiliki Getter karena berstatus final
    public String getIdKarakter() {
        return this.idKarakter;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        if (hp > MAX_HP) {
            this.hp = MAX_HP;
        } else if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }

    public int getEnergi() {
        return this.energi;
    }

    public void setEnergi(int energi) {
        this.energi = energi;
    }
}