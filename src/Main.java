public class Main {
    public static void main(String[] args) {
        System.out.println("DEMONSTRASI RESPONSI PBO - SISTEM GAME");
        System.out.println("Batas Maksimal HP Global (MAX_HP) : " + KarakterGame.MAX_HP);
        System.out.println("----------------------------------------------");

        // 1. Inheritance, Overloaded Constructor, Super Chaining & Overriding
        Hero hero1 = new Hero("H-001", "Rimuru", 80, 25, 40);
        Monster monster1 = new Monster("M-001", "Ifrit", "Api"); // Menggunakan konstruktor kedua (overloaded)

        System.out.println("\n[1] INFO AWAL KARAKTER (Overriding & Super Method):");
        hero1.tampilkanInfo();
        System.out.println("Status Hidup Hero : " + hero1.apakahMasihHidup());
        System.out.println();
        monster1.tampilkanInfo();

        // 2. Abstract Method & if/else
        System.out.println("\n[2] UJI SKILL & LOGIKA PERCABANGAN STATE:");
        hero1.gunakanSkill();
        hero1.gunakanSkill();
        monster1.gunakanSkill();
        monster1.gunakanSkill();

        // 3. Multiple Interface pada Hero (BisaMenyerang & BisaHeal)
        System.out.println("\n[3] UJI MULTIPLE INTERFACE PADA HERO:");
        hero1.serang(monster1.getNama());
        hero1.pulihkanDiri();

        // 4. Polimorfisme Interface
        System.out.println("\n[4] UJI POLIMORFISME INTERFACE:");
        BisaMenyerang entitasPenyerang1 = new Hero("H-002", "Diablo", 35);
        BisaMenyerang entitasPenyerang2 = new Monster("M-002", "Feldway", "Holy Magic");
        BisaHeal entitasHealer = new Hero("H-003", "Shuna", 20);

        entitasPenyerang1.serang("Feldway");
        entitasPenyerang2.serang("Diablo");
        entitasHealer.pulihkanDiri();
    }
}