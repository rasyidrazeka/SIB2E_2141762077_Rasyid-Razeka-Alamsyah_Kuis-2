package kuis2.pbo;
public class Kuis2Main {
    public static void main(String[] args) {
        TyrannosaurusRex trex = new TyrannosaurusRex();
        Triceratops triceratops = new Triceratops();
        Oviraptor oviraptor = new Oviraptor();
        Pemburu pemburu = new Pemburu();
        AnakPemburu anakPemburu = new AnakPemburu();

        System.out.println("=================================================");
        System.out.println("                TYRANNOSAURUSREX                 ");
        System.out.println("=================================================");
        trex.berjalan();
        trex.makan();
        System.out.println("=================================================");
        System.out.println();
        
        System.out.println("=================================================");
        System.out.println("                   TRICERATOPS                   ");
        System.out.println("=================================================");
        triceratops.berjalan();
        trex.makan();
        System.out.println("=================================================");
        System.out.println();

        System.out.println("=================================================");
        System.out.println("                    OVIRAPTOR                    ");
        System.out.println("=================================================");
        oviraptor.berjalan();
        oviraptor.makan();
        oviraptor.bertelur();
        System.out.println("=================================================");
        System.out.println();

        System.out.println("=================================================");
        System.out.println("                     PEMBURU                     ");
        System.out.println("=================================================");
        pemburu.berburu(trex);
        System.out.println("=================================================");
        System.out.println();

        System.out.println("=================================================");
        System.out.println("                  ANAK PEMBURU                   ");
        System.out.println("=================================================");
        anakPemburu.berburu(trex);
        anakPemburu.mengambilTelur(oviraptor);
        System.out.println("=================================================");
    }
}