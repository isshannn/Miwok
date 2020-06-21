package com.example.android.miwok;

public class WordClass {
    private String mgetMiwokTranslation;
    private String mgetDefaultTranslation;
    private int Image = NO_IMAGE_PROVIDED;
    private int musicid;
    private static final int NO_IMAGE_PROVIDED = -1;

    // This constructor accepts two strings and a integer(Resource id for music file) for Phrase fragment
    public  WordClass(String DefaultTranslation , String MiwokTranslation , int id){
        mgetDefaultTranslation = DefaultTranslation;
        mgetMiwokTranslation = MiwokTranslation;
        musicid = id;
    }

    // This constructor accepts two string and two integers which includes Resource id for Image file
    public  WordClass(String DefaultTranslation , String MiwokTranslation , int RImage , int id){
        mgetDefaultTranslation = DefaultTranslation;
        mgetMiwokTranslation = MiwokTranslation;
        Image = RImage;
        musicid = id;
    }


    // The functions below are called in WordAdapter class in getView()

    // This function checks for image provided to WordClass and returns false if not.
    public boolean ChkImg(){
        return  Image != NO_IMAGE_PROVIDED;
    }

    public String getMiwokTranslation(){
        return mgetMiwokTranslation;
    }

    public String getDefaultTranslation(){
        return mgetDefaultTranslation;
    }

    public int getDefaultImage(){ return  Image;}

    public int getMusicid() {return  musicid;}


}
