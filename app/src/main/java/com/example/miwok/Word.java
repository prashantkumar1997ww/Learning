package com.example.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mFrenchTranslation;

    private  int  mImageResourceId = NO_IMAGE_PROVIDED;

    private  static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceId;


    public Word(String defaultTranslation, String frenchTranslation, int audioResourceId )
    {
        mDefaultTranslation = defaultTranslation;
        mFrenchTranslation = frenchTranslation;
        mAudioResourceId = audioResourceId;
    }


    public Word(String defaultTranslation, String frenchTranslation, int imageResourceId, int audioResourceId)
    {
        mDefaultTranslation = defaultTranslation;
        mFrenchTranslation = frenchTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }


    public String getmDefaultTranslation()
    {
        return  mDefaultTranslation;
    }


    public String getmFrenchTranslation()
    {
        return mFrenchTranslation;
    }

    public  int getImageResourceId()
    {
        return  mImageResourceId;
    }

    public boolean hasImage()
    {
        return  mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public  int getmAudioResourceId(){
        return mAudioResourceId;
    }

}
