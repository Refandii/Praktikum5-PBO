/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tugaspraktikum.modul5;

/**
 *
 * @author HP-845
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BukuHarian {
    private String namaPemilik;
    private String namaFile;

    // Constructor: Menentukan nama file berdasarkan nama pemilik
    public BukuHarian(String namaPemilik) {
        this.namaPemilik = namaPemilik;
        // Mengubah nama ke huruf kecil dan mengganti spasi dengan underscore untuk nama file
        this.namaFile = "diary_" + namaPemilik.toLowerCase().replaceAll("\\s+", "_") + ".txt";
    }

    // Method untuk menulis catatan harian (Append Mode)
    public void tulisCatatan(String tanggal, String isi) {
        // FileWriter(namaFile, true) memastikan catatan lama tidak tertimpa
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(namaFile, true))) {
            bw.write("[" + tanggal + "] - " + isi);
            bw.newLine(); // Pindah baris
            System.out.println("Catatan tanggal " + tanggal + " berhasil disimpan.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis catatan: " + e.getMessage());
        }
    }

    // Method untuk membaca seluruh isi catatan harian
    public void bacaCatatan() {
        System.out.println("\n=== Catatan Harian " + namaPemilik + " ===");
        try (BufferedReader br = new BufferedReader(new FileReader(namaFile))) {
            String baris;
            boolean adaIsi = false;

            while ((baris = br.readLine()) != null) {
                System.out.println(baris);
                adaIsi = true;
            }

            // Jika file ada tetapi kosong
            if (!adaIsi) {
                System.out.println("Belum ada catatan harian.");
            }
        } catch (IOException e) {
            // Ditangkap jika file belum pernah dibuat / tidak ditemukan
            System.out.println("Belum ada catatan harian.");
        }
    }
}
