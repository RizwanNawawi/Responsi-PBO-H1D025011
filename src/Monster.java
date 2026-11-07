public class Monster extends KarakterGame implements BisaMenyerang {
    private String tipeElemen;

    // Overloaded Constructor & Super Chaining super
    public Monster(String idKarakter, String nama, int hp, int energi, String tipeElemen) {
        super(idKarakter, nama, hp, energi);
        this.tipeElemen = tipeElemen;
    }

    public Monster(String idKarakter, String nama, String tipeElemen) {
        super(idKarakter, nama);
        this.tipeElemen = tipeElemen;
    }

    // Overriding
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Role   : Monster (Elemen: " + this.tipeElemen + ")");
    }

    // if else
    @Override
    public void gunakanSkill() {
        if (this.getEnergi() >= 30) {
            this.setEnergi(this.getEnergi() - 30);
            System.out.println("[SKILL] Monster " + this.getNama() + " menyemburkan serangan elemen " + this.tipeElemen + "! (Energi -30)");
        } else {
            this.setEnergi(this.getEnergi() + 15);
            System.out.println("[ISTIRAHAT] Energi kurang, Monster " + this.getNama() + " menyerap mana alam (+15 Energi). Energi sekarang: " + this.getEnergi());
        }
    }

    // Implementasi Interface BisaMenyerang
    @Override
    public void serang(String target) {
        System.out.println("[SERANG] Monster " + this.getNama() + " menggigit " + target + " dengan elemen " + this.tipeElemen + "!");
    }


    public String getTipeElemen() {
        return this.tipeElemen;
    }

    public void setTipeElemen(String tipeElemen) {
        this.tipeElemen = tipeElemen;
    }
}