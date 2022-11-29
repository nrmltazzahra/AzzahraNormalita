/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.pbo.projectmahasiswa_3067;

/**
 *
 * @author asus
 */
public class AsistenPraktikum_3067 extends Mahasiswa_3067 {
    String mkAsistensi;
    int jmlPertemuan;
    double totalPendapatan;
    
    public double totalPendapatan(){
        totalPendapatan = jmlPertemuan * 50000;
        return totalPendapatan;
    }
    public void tampilDataAsistenPraktikum(){
        tampilDataMahasiswa();
        System.out.println("Mk Asistensi        : "+mkAsistensi);
        System.out.println("Jumlah Pertemuan    : "+jmlPertemuan);
    }
}
