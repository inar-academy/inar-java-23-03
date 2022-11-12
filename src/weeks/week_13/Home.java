package weeks.week_13;

public class Home {
    private int yuzOlcumu;
    private int odaSayisi;
    private int banyoSayisi;
    private boolean garajVarMi;
    private int ucret;
    private int kiraUcreti;
    private String cephesi;
    private int yil;

    public Home() {
        this(0,0,0,false,0,0,null,0);
    }

    public Home(int yuzOlcumu, int odaSayisi, int banyoSayisi, boolean garajVarMi, int ucret, int kiraUcreti, String cephesi, int yil) {
        this.yuzOlcumu = yuzOlcumu;
        this.odaSayisi = odaSayisi;
        this.banyoSayisi = banyoSayisi;
        this.garajVarMi = garajVarMi;
        this.ucret = ucret;
        this.kiraUcreti = kiraUcreti;
        this.cephesi = cephesi;
        this.yil = yil;
    }

    public int getYuzOlcumu() {
        return yuzOlcumu;
    }

    public void setYuzOlcumu(int yuzOlcumu) {
        this.yuzOlcumu = yuzOlcumu;
    }

    public int getOdaSayisi() {
        return odaSayisi;
    }

    public void setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
    }

    public int getBanyoSayisi() {
        return banyoSayisi;
    }

    public void setBanyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
    }

    public boolean isGarajVarMi() {
        return garajVarMi;
    }

    public void setGarajVarMi(boolean garajVarMi) {
        this.garajVarMi = garajVarMi;
    }

    public int getUcret() {
        return ucret;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }

    public int getKiraUcreti() {
        return kiraUcreti;
    }

    public void setKiraUcreti(int kiraUcreti) {
        this.kiraUcreti = kiraUcreti;
    }

    public String getCephesi() {
        return cephesi;
    }

    public void setCephesi(String cephesi) {
        this.cephesi = cephesi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public void renovasyon(){
        this.ucret = (int) (this.ucret *1.1);
        this.kiraUcreti = (int) (this.kiraUcreti *1.2);
    }

    public void print(){
        System.out.println("---------------- HOME DETAILS --------------------");
        System.out.printf("yuzOlcumu:%d\nodaSayisi:%d\nbanyoSayisi:%d\ngarajVarMi:%s\nucret:%d\nkiraUcreti:%d\ncephesi:%s\nyil:%d\n",this.yuzOlcumu, this.odaSayisi,this.banyoSayisi,this.garajVarMi,this.ucret,this.kiraUcreti,this.cephesi,this.yil);
        System.out.println("--------------------------------------------------");
    }
}
