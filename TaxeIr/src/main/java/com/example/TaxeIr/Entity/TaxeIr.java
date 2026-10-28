package com.example.TaxeIr.Entity;

import jakarta.persistence.Entity;

@Entity
public class TaxeIr {
    @id
    private Long id;
    private String reference;
    private String libelle;
    private String societe;
    private int annee;
    private int mois;

    public void setId(Long id) {
        this.id = id;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public Long getId() {
        return id;
    }

    public int getMois() {
        return mois;
    }

    public String getReference() {
        return reference;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getSociete() {
        return societe;
    }

    public int getAnnee() {
        return annee;
    }
}
