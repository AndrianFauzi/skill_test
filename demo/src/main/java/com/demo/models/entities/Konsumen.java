package com.demo.models.entities;


import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_konsumen")
public class Konsumen implements Serializable {

    public static final long Serializable = 1l;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="name", length = 100)
    private String name;

    @Column(name = "alamat", length = 500)
    private String alamat;

    @Column(name = "kota", length = 300)
    private String kota;

    @Column(name = "provinsi", length = 300)
    private String provinsi;

    @Column(name = "tgl_registrasi", length = 300, updatable = false)
    @CreationTimestamp
    private LocalDateTime tgl_registrasi;

    @Column(name = "status", length = 100)
    private String status;


    public Konsumen() {
    }

    public Konsumen(long id, String name, String alamat, String kota, String provinsi, LocalDateTime tgl_registrasi, String status) {
        this.id = id;
        this.name = name;
        this.alamat = alamat;
        this.kota = kota;
        this.provinsi = provinsi;
        this.tgl_registrasi = tgl_registrasi;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String nama) {
        this.name = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public LocalDateTime getTgl_registrasi() {
        return tgl_registrasi;
    }

    public void setTgl_registrasi(LocalDateTime tgl_registrasi) {
        this.tgl_registrasi = tgl_registrasi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
