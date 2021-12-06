package transMusiApp;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        String nama ;
        String asalJurusan ;
        String tujuanJurusan ;
        int jmlPenumpang ;
        int jarakRute;

        //INSTANSIASI BUS
        bus Bus1 = new bus("BG 1111 XXX", "Devangga");  
        bus Bus2 = new bus("BG 2222 XXX", "Rinaldi");  
        bus Bus3 = new bus("BG 3333 XXX", "Rama");  
        bus Bus4 = new bus("BG 4444 XXX", "Mutiah");  
        bus Bus5 = new bus("BG 5555 XXX", "Mutiara");  

        //CETAK DATA TAXI
        System.out.println(Bus1);  
        System.out.println(Bus2);  
        System.out.println(Bus3);  
        System.out.println(Bus4);  
        System.out.println(Bus5);  

        // PANGGIL METHOD getBusCount PADA CLASS BUS KEMUDIAN CETAK 
        System.out.println("Jumlah Bus = " + bus.getBusCount());   
        System.out.println(); // UNTUK JARAK DEVANGGA (OPSIONAL)

        // DAPATKAN DATA BANYAK PENUMPANG BUS 1 DARI USER
        System.out.print("Masukan Data Jumlah Penumpang Bus 1 : ");
        jmlPenumpang = in.nextInt();

        //INSTANSIASI PENUMPANG
            // UNTUK BUS 1
                // LAKUKAN PERULANGAN SESUAI JUMLAH PENUMPANG
        for (int i = 1; i <= jmlPenumpang ; i++) {

                    System.out.print("Input Nama Penumpang ke-" + i + " Bus 1 :");
                    nama = in.next();
                    System.out.print("Input Asal Jurusan Penumpang ke-"+ i + " Bus 1 : ");
                    asalJurusan = in.next();
                    System.out.print("Input Tujuan Jurusan Penumpang ke-"+ i + " Bus 1 : ");
                    tujuanJurusan = in.next();
                    System.out.print("Jarak Perjalanan Bus 1 pada Rute " + tujuanJurusan + " : ");
                    jarakRute = in.nextInt();

                    Penumpang Cust1 = new Penumpang(nama, asalJurusan, tujuanJurusan);   
                    Bus1.perjalanan(Cust1, jarakRute ); 
                    System.out.println();
        }

        // DAPATKAN DATA BANYAK PENUMPANG BUS 2 DARI USER
        System.out.print("Masukan Data Jumlah Penumpang Bus 2 : ");
        jmlPenumpang = in.nextInt();

        //INSTANSIASI PENUMPANG
            // UNTUK BUS 2
                // LAKUKAN PERULANGAN SESUAI JUMLAH PENUMPANG
        for (int i = 1; i <= jmlPenumpang ; i++) {

                    System.out.print("Input Nama Penumpang ke-" + i + " Bus 2 :");
                    nama = in.next();
                    System.out.print("Input Asal Jurusan Penumpang ke-"+ i + " Bus 2 : ");
                    asalJurusan = in.next();
                    System.out.print("Input Tujuan Jurusan Penumpang ke-"+ i + " Bus 2 : ");
                    tujuanJurusan = in.next();
                    System.out.print("Jarak Perjalanan Bus 2 pada Rute " + tujuanJurusan + " : ");
                    jarakRute = in.nextInt();

                    Penumpang Cust2 = new Penumpang(nama, asalJurusan, tujuanJurusan);   
                    Bus2.perjalanan(Cust2, jarakRute ); 
                    System.out.println();
        }

        // DAPATKAN DATA BANYAK PENUMPANG BUS 3 DARI USER
        System.out.print("Masukan Data Jumlah Penumpang Bus 3 : ");
        jmlPenumpang = in.nextInt();

        //INSTANSIASI PENUMPANG
            // UNTUK BUS 3
                // LAKUKAN PERULANGAN SESUAI JUMLAH PENUMPANG
        for (int i = 1; i <= jmlPenumpang ; i++) {

                    System.out.print("Input Nama Penumpang ke-" + i + " Bus 3 :");
                    nama = in.next();
                    System.out.print("Input Asal Jurusan Penumpang ke-"+ i + " Bus 3 : ");
                    asalJurusan = in.next();
                    System.out.print("Input Tujuan Jurusan Penumpang ke-"+ i + " Bus 3 : ");
                    tujuanJurusan = in.next();
                    System.out.print("Jarak Perjalanan Bus 3 pada Rute " + tujuanJurusan + " : ");
                    jarakRute = in.nextInt();

                    Penumpang Cust3 = new Penumpang(nama, asalJurusan, tujuanJurusan);   
                    Bus3.perjalanan(Cust3, jarakRute ); 
                    System.out.println();
        }

        // DAPATKAN DATA BANYAK PENUMPANG BUS 4 DARI USER
        System.out.print("Masukan Data Jumlah Penumpang Bus 4 : ");
        jmlPenumpang = in.nextInt();

        //INSTANSIASI PENUMPANG
            // UNTUK BUS 4
                // LAKUKAN PERULANGAN SESUAI JUMLAH PENUMPANG
        for (int i = 1; i <= jmlPenumpang ; i++) {

                    System.out.print("Input Nama Penumpang ke-" + i + " Bus 4 :");
                    nama = in.next();
                    System.out.print("Input Asal Jurusan Penumpang ke-"+ i + " Bus 4 : ");
                    asalJurusan = in.next();
                    System.out.print("Input Tujuan Jurusan Penumpang ke-"+ i + " Bus 4 : ");
                    tujuanJurusan = in.next();
                    System.out.print("Jarak Perjalanan Bus 4 pada Rute " + tujuanJurusan + " : ");
                    jarakRute = in.nextInt();

                    Penumpang Cust4 = new Penumpang(nama, asalJurusan, tujuanJurusan);   
                    Bus4.perjalanan(Cust4, jarakRute ); 
                    System.out.println();
        }

        // DAPATKAN DATA BANYAK PENUMPANG BUS 5 DARI USER
        System.out.print("Masukan Data Jumlah Penumpang Bus 5 : ");
        jmlPenumpang = in.nextInt();

        //INSTANSIASI PENUMPANG
            // UNTUK BUS 5
                // LAKUKAN PERULANGAN SESUAI JUMLAH PENUMPANG
        for (int i = 1; i <= jmlPenumpang ; i++) {

                    System.out.print("Input Nama Penumpang ke-" + i + " Bus 5 :");
                    nama = in.next();
                    System.out.print("Input Asal Jurusan Penumpang ke-"+ i + " Bus 5 : ");
                    asalJurusan = in.next();
                    System.out.print("Input Tujuan Jurusan Penumpang ke-"+ i + " Bus 5 : ");
                    tujuanJurusan = in.next();
                    System.out.print("Jarak Perjalanan Bus 5 pada Rute " + tujuanJurusan + " : ");
                    jarakRute = in.nextInt();

                    Penumpang Cust5 = new Penumpang(nama, asalJurusan, tujuanJurusan);   
                    Bus5.perjalanan(Cust5, jarakRute ); 
                    System.out.println();
        }
        
        //CETAK DATA PENUMPANG PAKAI METHOD printDataPenumpang
        System.out.println("Data Penumpang Bus 1 : ");  
        Bus1.printDataPenumpang();  
        System.out.println("Data Penumpang Bus 2 : ");  
        Bus2.printDataPenumpang();  
        System.out.println("Data Penumpang Bus 3 : ");  
        Bus3.printDataPenumpang();  
        System.out.println("Data Penumpang Bus 4 : ");  
        Bus4.printDataPenumpang(); 
        System.out.println("Data Penumpang Bus 5 : ");  
        Bus5.printDataPenumpang();  

        System.out.println();// UNTUK JARAK DEVANGGA (OPSIONAL)


        /// PANGGIL METHOD  getJumlahPendapatan PADA CLASS BUS KEMUDIAN CETAK 
        System.out.printf("Pendapatan Bus 1 : %.2f \n", Bus1.getJumlahPendapatan());   
        System.out.printf("Pendapatan Bus 2 : %.2f \n", Bus2.getJumlahPendapatan());
        System.out.printf("Pendapatan Bus 3 : %.2f \n", Bus3.getJumlahPendapatan());
        System.out.printf("Pendapatan Bus 4 : %.2f \n", Bus4.getJumlahPendapatan());
        System.out.printf("Pendapatan Bus 5 : %.2f \n", Bus5.getJumlahPendapatan());
        System.out.println();
        

        /// mencetak hasil pendapatan perusahaan dari tiap bus
        System.out.printf("Total Pendapatan Perushaan : %.2f \n", (Bus1.getJumlahPendapatan() + Bus2.getJumlahPendapatan() + Bus3.getJumlahPendapatan() + Bus3.getJumlahPendapatan() + Bus4.getJumlahPendapatan() + Bus5.getJumlahPendapatan()));  
        in.close();
    }
}
