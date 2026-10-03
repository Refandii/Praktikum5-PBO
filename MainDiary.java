/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tugaspraktikum.modul5;

/**
 *
 * @author HP-845
 */
public class MainDiary {
    public static void main(String[] args) {
        // a. Instansiasi objek BukuHarian
        BukuHarian diaryku = new BukuHarian("Refandi");

        // b. Panggil method tulisCatatan minimal 2 kali
        diaryku.tulisCatatan("12-09-2026", "Belajar Java File I/O dan Try-With-Resources.");
        diaryku.tulisCatatan("12-09-2026", "Halo semua, kenali aku Refan, mahasiswa semester 3 Informatika UNS!.");
        
        diaryku.tulisCatatan("13-09-2026", "Mencoba fitur append agar catatan lama tidak terhapus.");
        diaryku.tulisCatatan("13-09-2026", "Hai, ini catatan keduaku lanjutan dari catatanku sebelumnyaa, 12-09-2026.");
        
        
        // c. Panggil method bacaCatatan untuk menampilkan seluruh data
        diaryku.bacaCatatan();
    }
}