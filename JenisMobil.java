public class JenisMobil {
    String merk;
    int cc;
    String jenis;

    void main(){
        System.out.println("Mobil anda ber merk : "+merk);
        System.out.println("Mobil abda mempunyai cc : "+cc);
    }
    boolean LCGC(){
        if (cc<=1300)return true;
        return false;
    }
    boolean MPV(){
        if (cc>=1300||cc<2000)return true;
        return false;
    }
    boolean SUV(){
        if (cc>=2000||cc<3000)return true;
        return false;
    }
    boolean SPORT(){
        if (cc>=3000||cc<5000)return true;
        return false;
    }
    boolean HYPERCAR(){
        if (cc>=5000)return true;
        return false;
    }
}
