
package penilaian;

public class main {
    
  public static void main(String[] args) {
        // Membuat objek Mahasiswa
        mahasiswa mahasiswa = new mahasiswa();
        mahasiswa.setNama("Yuni Maulina");
        mahasiswa.setNpm("2110010145");
        
        // Membuat objek NilaiAkhir
        nilaiAkhir nilaiAkhir = new nilaiAkhir();
        nilaiAkhir.setUts(90);
        nilaiAkhir.setUas(96);
        nilaiAkhir.setTugas(90);
        
        // Menampilkan informasi mahasiswa dan nilai akhirnya
        System.out.println("Nama Mahasiswa: " + mahasiswa.getNama());
        System.out.println("NPM Mahasiswa: " + mahasiswa.getNpm());
        System.out.println("Nilai UTS: " + nilaiAkhir.getUts());
        System.out.println("Nilai UAS: " + nilaiAkhir.getUas());
        System.out.println("Nilai Tugas: " + nilaiAkhir.getTugas());
        System.out.println("Nilai Akhir: " + nilaiAkhir.hitungNilaiAkhir());
    }  
}
