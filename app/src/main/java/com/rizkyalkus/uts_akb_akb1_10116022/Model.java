package com.rizkyalkus.uts_akb_akb1_10116022;

public class Model {

    //Model Intro
    String Title,Description;
    int ScreenImg;


    /* NIM : 10116022
   Nama : M Rizky Al Kusaeri
   Kelas : AKB-1
   Tanggal Pengerjaan : 16 Mei 2019
 */
    //Model Home


    public Model(String title, String description, int screenImg) {
        Title = title;
        Description = description;
        ScreenImg = screenImg;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getScreenImg() {
        return ScreenImg;
    }

    public void setScreenImg(int screenImg) {
        ScreenImg = screenImg;
    }
}
