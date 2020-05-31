package com.android.adam.photogallery;

/**
 * Created by Adam on 10/08/2017.
 */

public class GalleryItem {
    public String getCaption() {
        return mCaption;
    }

    public void setCaption(String caption) {
        mCaption = caption;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    private String mCaption;
    private String mId;
    private String mUrl;


    @Override
    public String toString(){
        return mCaption;
    }

}
