package com.skyiot.recycleview;

class AminoAcidModel {
    String aminoAcidName;
    String aminoAcidAbbreviation;
    String aminoAcidAbbreviationSmall;
    int image;


    public AminoAcidModel(String aminoAcidName,String aminoAcidAbbreviation,
                          String aminoAcidAbbreviationSmall,int image) {
        this.aminoAcidName = aminoAcidName;
        this.aminoAcidAbbreviation = aminoAcidAbbreviation;
        this.aminoAcidAbbreviationSmall = aminoAcidAbbreviationSmall;
        this.image = image;
    }

    public String getAminoAcidName() {
        return aminoAcidName;
    }
    public String getAminoAcidAbbreviation(){
        return aminoAcidAbbreviation;
    }
    public String getAminoAcidAbbreviationSmall(){
        return aminoAcidAbbreviationSmall;
    }

    public int getImage(){
        return image;
    }
}


