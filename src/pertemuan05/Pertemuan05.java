package pertemuan05;

public class Pertemuan05 {

        public static void main(String[] args) {
            Baju baju = new Baju();
            baju.jenis = "Kaos";
            baju.warna = "Hijau";
            baju.merk = "Guan Khong";
            baju.ukuran = "S";

            Baju bajumu = new Baju();
            bajumu.jenis = "Jas";
            bajumu.warna = "Hitam";
            bajumu.merk = "Sanyo";
            bajumu.ukuran = "M";

            Baju bajuku = new Baju();
            bajuku.jenis = "Jaket";
            bajuku.warna = "Merah";
            bajuku.merk = "Sanec";
            bajuku.ukuran = "L";


            baju.info();
            bajumu.info();
            bajuku.info();

        }
    }


