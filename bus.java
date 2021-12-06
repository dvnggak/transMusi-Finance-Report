package transMusiApp;

public class bus {
    // DEKLARASI VARIABEL SCOPE NYA DI DI ROOT transMusiApp  
    private String idBus;  
    private String platNomorUnit;
    private String namaDriver;
    private final static double biayaAwal = 5000;
    private final static double biayaPerKM = 1500;
    private static int busCount = 0;
    private static double costTotal = 0;
    private Penumpang[] penumpang = new Penumpang[10];
    private double[] km = new double[10];
    private int jumPenumpang;
    private double jumPendapatan;
 
    //KONSTRUKTOR UNIT TRANSMUSI 
    public bus (String plat, String driver) {
        //INISIALIASI VALUE
        this.platNomorUnit = plat;
        this.namaDriver = driver;
        busCount++; //INCREMENT UNIT
        /// inisialisasi ID busTM dengan memanggil method newId
        this.idBus = newId(busCount); 
        jumPendapatan = 0;
        jumPenumpang = 0 ;       
    }

    //METHOD NEWID
    private String newId (int count) {
        //DEKLARASI VARIABEL
        String ID;
            //KONDISI JUMLAH UNIT BUS 
        if (count > 10) {
            ID = "0" + String.valueOf(count); /// inisialisasi ID dengan menambahkan nomor pendaftaran 
        }else {
            ID = String.valueOf(count); /// inisisalisasi ID dengan menggunakan nomor pendaftaran
        }
        return ("2021_" + ID); /// Return ID busTM dengan menambahkan tahun 
    }

    //METHOD toString (meng-format nilai selain String ke String)
    public String toString () {
        return String.format("Bus id = %s | Plat = %s | Driver = %s", idBus, platNomorUnit, namaDriver);
    }

    //METHOD getBusCount
    public static int getBusCount () {
        return busCount;
    }

    //METHOD PERJALANAN 
    public void perjalanan (Penumpang cust, int Km) {
        //INCREMENT JUMLAH PENUMPANG
        jumPenumpang++;
        penumpang [jumPenumpang -1] = cust; // pengisian cust pada array penumpang
        km [jumPenumpang -1] = Km; //pengisian Km pada array km
        //CETAK DATA
        System.out.printf("Bus %s | Penumpang ke %d : %s : %d-km : Bayar = %5.2f \n", idBus, jumPenumpang, cust.getNama(), Km, getPembayaran(Km));
    };

    //METHOD PEMBAYARAN
    public double getPembayaran (int Km) {
        //INISIALISASI
        double biaya = 0;
        //KONDISI KM
        if (Km <=2) {
            biaya = biayaAwal;
        } else {
            biaya =((Km - 2) * biayaPerKM + biayaAwal);  //DEVANGGA RUMUSNYO MASIH BELUM BENER
        };
        jumPendapatan += biaya; ///  hasil dari jumlah pendapatan + biaya di inisialisasikan ke jumPendapatan 
        return biaya;
    };

    //METHOD PRINT DATA PENUMPANG
    public void printDataPenumpang () {
        //LOOPING PENUMPANG
        for (int i=0 ; i<jumPenumpang; i++) {
            dataCust(penumpang[i]); //PANGGIL METHOD DATACUST DENGAN PARAMETER ARRAY PENUMPANG
        };
    };

    //METHOD DATACUST
    public void dataCust (Penumpang cust) {
        //CETAK NILAI
        System.out.printf("Nama : %s | Asal : %s | Tujuan : %s ", cust.getNama(), cust.getAsal(), cust.getTujuan());
        System.out.println(); // UNTUK JARAK DEVANGGA (OPSIONAL)
    };

    //METHOD GET JUMLAH PENDAPATAN BUS
    public double getJumlahPendapatan () {
        return jumPendapatan;
    };
};

// CLASS BUS FINISH 

/*
 ----NOTE!!!!!------
 1. RUMUS MASIH KURANG BAIK
 2. PATOKAN HARGA TIAP BUS BELUM FIX
 3. CLASS PENUMPANG BELUM ADA
 4. ARRAY PENUMPANG KEMUNGKINAN ADA BUG PERLU DEBUGGING
*/