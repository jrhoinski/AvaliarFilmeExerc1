package com.example.avaliarfilmeexerc1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class FilmeAdapter extends ArrayAdapter<Filme> {
    private int rId;

    public FilmeAdapter(Context context, int resource, List<Filme> objects){
        super(context, resource, objects);
        this.rId =  resource;
    }

    //@NonNull
    @Override
    public View getView(int position, View currentView, ViewGroup parent) {
        View mView = currentView;

        if (mView == null ){
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            mView = inflater.inflate(rId,null);
        }

        Filme filme = getItem(position);

        TextView textNomeFilme = ((View) mView).findViewById(R.id.textNomeFilme);
        TextView spinnerGenero = ((View) mView).findViewById(R.id.spinnerGenero);
        TextView textNota = ((View) mView).findViewById(R.id.editTextNota);

        textNomeFilme.setText(filme.getNome());
        spinnerGenero.setText(filme.getGenero());
        textNota.setText(filme.getNota());

        return  mView;


    }
}



