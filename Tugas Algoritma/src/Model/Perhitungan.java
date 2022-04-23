package Model;
import Interface.Interface;

public class Perhitungan implements Interface {
    public int x;
    private int y;
    private int hasil;

    // public Perhitungan(int a, int b, int hasil) {
    //     this.a =a ;
    //     this.b =b ;
    //     this.hasil =hasil ;
    //     printJudulClass("jadi judul dalam class perhitungan ");
    // }
    public Perhitungan (int x, int y, int hasil){
        this.x = x;
        this.y = y;
        this.hasil = hasil;
    }
    private void printJudulClass(String judul){
        System.out.println(judul);
    }

    public void PrintJudul(){
        System.out.println("Judul di dalam Interface");
    }

    public void HitungTambah() {
        this.hasil = this.x + this.y;
    }

    @Override
    public void HitungKali() {
        this.hasil = this.x * this.y;
    }

    //Method return hasil tambah dengan parameter
    public int hasiltambah(int x1,int y2){
        this.x = x1;
        this.y = y2;
        HitungTambah();
        return  this.hasil;
    }

    //Method return dari hasil kali
    public int hasilkali(int _x,int _y){
        this.x = _x;
        this.y = _y;
        HitungKali();
        return this.hasil;
    }
}
