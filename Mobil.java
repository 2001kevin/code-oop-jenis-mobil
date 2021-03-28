public class Mobil {
    public static void main(String[] args) {
        JenisMobil mbl=new JenisMobil();
        mbl.merk="TOYOTA";
        mbl.cc=4000;

        mbl.main();

        if (mbl.LCGC()){
            System.out.println("Mobil anda berjenis LCGC ");
        }
        if (mbl.MPV()){
            System.out.println("Mobil anda berjenis MPV");
        }
        if (mbl.SPORT()){
            System.out.println("Mobil anda berjenis SPORT");
        }
        if (mbl.HYPERCAR()){
            System.out.println("Mobil anda berjenis HYPERCAR");
        }
    }
}
