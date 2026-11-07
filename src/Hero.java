public class Hero extends KarakterGame implements BisaMenyerang, BisaHeal {
    private int attackPower;

    // Overloaded Constructor & Super Chaining super
    public Hero(String idKarakter, String nama, int hp, int energi, int attackPower) {
        super(idKarakter, nama, hp, energi);
        this.attackPower = attackPower;
    }

    public Hero(String idKarakter, String nama, int attackPower) {
        super(idKarakter, nama);
        this.attackPower = attackPower;
    }

    // Overriding
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Role   : Hero (Attack Power: " + this.attackPower + ")");
    }

    // if else (abstract method)
    @Override
    public void gunakanSkill() {
        if (this.getEnergi() >= 20) {
            this.setEnergi(this.getEnergi() - 20);
            this.attackPower += 15;
            System.out.println("[SKILL] " + this.getNama() + " mengaktifkan Buff Pedang! Energi -20, Attack Power menjadi " + this.attackPower);
        } else {
            System.out.println("[GAGAL] Energi " + this.getNama() + " tidak cukup untuk menggunakan skill (Sisa: " + this.getEnergi() + ")");
        }
    }

    // Interface 1 (BisaMenyerang)
    @Override
    public void serang(String target) {
        System.out.println("[SERANG] Hero " + this.getNama() + " menebas " + target + " dengan damage " + this.attackPower + "!");
    }

    // Interface 2 (BisaHeal)
    @Override
    public void pulihkanDiri() {
        this.setHp(this.getHp() + 25);
        System.out.println("[HEAL] Hero " + this.getNama() + " memulihkan diri! HP sekarang: " + this.getHp());
    }

    public int getAttackPower() {
        return this.attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}