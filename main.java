package transMusiApp;


public class main {
    public static void main(String[] args) {
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

        //INSTANSIASI PENUMPANG
            // UNTUK BUS 1
        Penumpang Cust1 = new Penumpang("Budi", "Mergan", "Dinoyo");   

        //PANGGIL METHOD PERJALANAN DARI CLASS BUS
        Bus1.perjalanan(Cust1, 5); 

        Cust1 = new Penumpang("Samsul", "Landungsari", "ALun-alun");
        Bus1.perjalanan(Cust1, 7);
        System.out.println();

            // UNTUK BUS 2
        Penumpang Cust2 = new Penumpang("Doni", "Bandulan", "Dinoyo");
        Bus2.perjalanan(Cust2, 3);

        Cust2 = new Penumpang("Dino", "Dinoyo", "ALun-alun");
        Bus2.perjalanan(Cust2, 9);

        Cust2 = new Penumpang("Reni", "Merjosari", "ALun-alun");
        Bus2.perjalanan(Cust2, 2);
        System.out.println();

            // UNTUK BUS 3
        Penumpang Cust3 = new Penumpang("Ani", "Merjosari", "Dinoyo");
        Bus3.perjalanan(Cust3, 5);

        Cust3 = new Penumpang("Rino", "Bandulan", "ALun-alun");
        Bus3.perjalanan(Cust3, 1);

        Cust3 = new Penumpang("Deni", "Landungsari", "Dinoyo");
        Bus3.perjalanan(Cust3, 0);

        Cust3 = new Penumpang("Boni", "Arjosari", "ALun-alun");
        Bus3.perjalanan(Cust3, 13);
        System.out.println();

            //UNTUK BUS 4
        Penumpang Cust4 = new Penumpang("Ani", "Merjosari", "Dinoyo");
        Bus4.perjalanan(Cust4, 5);

        Cust4 = new Penumpang("Rino", "Bandulan", "ALun-alun");
        Bus4.perjalanan(Cust4, 1);

        Cust4 = new Penumpang("Deni", "Landungsari", "Dinoyo");
        Bus4.perjalanan(Cust4, 0);

        Cust4 = new Penumpang("Boni", "Arjosari", "ALun-alun");
        Bus4.perjalanan(Cust4, 13);
        System.out.println();


            //UNTUK BUS 5
        Penumpang Cust5 = new Penumpang("Ani", "Merjosari", "Dinoyo");
        Bus5.perjalanan(Cust5, 5);

        Cust5 = new Penumpang("Rino", "Bandulan", "ALun-alun");
        Bus5.perjalanan(Cust5, 1);

        Cust5 = new Penumpang("Deni", "Landungsari", "Dinoyo");
        Bus5.perjalanan(Cust5, 0);

        Cust5 = new Penumpang("Boni", "Arjosari", "ALun-alun");
        Bus5.perjalanan(Cust5, 13);
        System.out.println();
        
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
    }
}
