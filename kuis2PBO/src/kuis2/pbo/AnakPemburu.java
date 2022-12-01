package kuis2.pbo;
public class AnakPemburu extends Pemburu implements IMengambilTelur{
    public void berburu(TyrannosaurusRex trex) {
        super.berburu(trex);
    }
    public void mengambilTelur(Dinosaurus dino){
        dino.berjalan();
        dino.makan();
        System.out.println("Anak pemburu mengambil telur dan memberikan ke pemburu");
    }
}