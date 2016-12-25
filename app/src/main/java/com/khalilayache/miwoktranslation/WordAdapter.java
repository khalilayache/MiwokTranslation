package com.khalilayache.miwoktranslation;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * @author by dlieve_khalil
 * @version 1
 * @since 09/12/2016
 **/

public class WordAdapter extends ArrayAdapter<Word> {

    private int mBackgroundIdResource;

    public WordAdapter(Activity context, ArrayList<Word> words, int mBackgroundIdResource) {
        super(context,0,words);
        this.mBackgroundIdResource = mBackgroundIdResource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(
                    getContext()).inflate(R.layout.list_item,
                    parent, false);
        }



        Word currentWord = getItem(position);
        ImageView picture = (ImageView) listItemView.findViewById(R.id.picture);
        TextView textDefaultTranslation = (TextView) listItemView.findViewById(R.id.translation_word);
        TextView textMiwokTranslation = (TextView) listItemView.findViewById(R.id.miwok_word);
        LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.words_container);


        linearLayout.setBackgroundResource(mBackgroundIdResource);

        if(currentWord.getmImageResourceId() != -1) {
            picture.setImageResource(currentWord.getmImageResourceId());
        }else{
            picture.setVisibility(View.GONE);
        }



        textDefaultTranslation.setText(currentWord.getmDefaultTranslation());
        textMiwokTranslation.setText(currentWord.getmMiwokTranslation());

        return listItemView;
    }
}
