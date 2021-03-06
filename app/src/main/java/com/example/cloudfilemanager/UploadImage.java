package com.example.cloudfilemanager;

import com.google.firebase.database.Exclude;

 //variables using to store info of images
public class UploadImage {
    private String mName;
    private String mImageUrl;
    private String mKey;

    public UploadImage(){
        // needed
    }

    public UploadImage(String name, String imageUrl){
        if(name.trim().equals("")){
            name="No Name";
        }

        mName=name;
        mImageUrl= imageUrl;
    }

    public String getName(){
        return mName;
    }

    public void setName(String name){
        mName=name;
    }
    public String getImageUrl(){
        return mImageUrl;
    }
    public void setImageUrl(String imageUrl){
        mImageUrl=imageUrl;
    }
    @Exclude
    public String getKey() {
        return mKey;
    }
    @Exclude
    public void setKey(String key) {
        mKey = key;
    }

}
