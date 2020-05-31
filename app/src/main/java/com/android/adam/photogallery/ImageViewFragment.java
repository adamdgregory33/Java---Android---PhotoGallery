package com.android.adam.photogallery;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Adam on 16/08/2017.
 */

public class ImageViewFragment extends DialogFragment {
    private static final String KEY = "drawable";

    public void setDrawable(Drawable drawable) {
        mDrawable = drawable;
    }

    private Drawable mDrawable;

    private ImageView mImageView;



    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        View v = LayoutInflater.from(getActivity()).inflate(R.layout.image_dialog,null);
        mImageView = (ImageView)v.findViewById(R.id.zoomView);

        mImageView.setImageDrawable(mDrawable);
        // Use the Builder class for convenient dialog construction
        return new AlertDialog.Builder(getActivity())
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setView(v)
                .create();
    }

    public static ImageViewFragment newInstance(Drawable drawable){
        ImageViewFragment ivf = new ImageViewFragment();
        ivf.setDrawable(drawable);
        return ivf;
    }


}
