package transMusiApp;

public class Penumpang {
    // DEKLARASI VARIABEL SCOPE NYA DI DI ROOT transMusiApp  
    private String nama;
    private String asalJurusan;
    private String tujuanJurusan;

    //KNSTRUKTOR
    public Penumpang (String N, String A, String T  ) { // ===> parameter A,N&T tuh inisial untuk variabel Priveate dev
        //Inisialisasi Nilai
        this.nama = N; 
        this.asalJurusan = A;
        this.tujuanJurusan = T;
    };

    //METHOD GET NAMA
    public String getNama() { 
        return this.nama;
    };

    //METHOD GET ASAL JURUSAN
    public String getAsal () {
        return this.asalJurusan;     
    };

    //METHOD GET TUJUAN JURUSAN
    public String getTujuan () {
        return this.tujuanJurusan ;
    }
}
