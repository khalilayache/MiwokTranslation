package com.khalilayache.miwoktranslation;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * @author by dlieve_khalil
 * @version 1
 * @since 09/12/2016
 **/

public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context,0,words);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(
                    getContext()).inflate(
                    android.R.layout.simple_list_item_2,
                    parent, false);
        }

        Word currentWord = getItem(position);
        TextView textDefaultTranslation = (TextView) listItemView.findViewById(android.R.id.text1);
        TextView textMiwokTranslation = (TextView) listItemView.findViewById(android.R.id.text2);

        textDefaultTranslation.setText(currentWord.getmDefaultTranslation());
        textMiwokTranslation.setText(currentWord.getmMiwokTranslation());

        return listItemView;
    }
}
