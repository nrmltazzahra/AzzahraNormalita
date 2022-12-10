/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.pbo.projectmahasiswa_3067;

/**
 *
 * @author asus
 */
public class StudentStaff_3067 extends Mahasiswa_3067{
    int unitKerja, jamKerja;
    double totalPendapatan;

    public double totalPendapatan(){
        totalPendapatan = jamKerja * 30000;
        return totalPendapatan;
    }
    public void tampilDataStudentStaff(){
        tampilDataMahasiswa();
        System.out.println("Unit Kerja      : "+unitKerja);
        System.out.println("Jam Kerja       : "+jamKerja);
    }
}
