package com.ggproject.gustavo.ggram.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ggproject.gustavo.ggram.R;
import com.ggproject.gustavo.ggram.adapter.PictureAdapterRecyclerView;
import com.ggproject.gustavo.ggram.model.Picture;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        showToolBar(getResources().getString(R.string.tab_home), false, view);

        RecyclerView picturesRecycler = (RecyclerView) view.findViewById(R.id.pictureRecycler);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(linearLayoutManager.VERTICAL);

        picturesRecycler.setLayoutManager(linearLayoutManager);

        PictureAdapterRecyclerView pictureAdapterRecyclerView = new PictureAdapterRecyclerView(
                buildPicture(),
                R.layout.cardview_picture,
                getActivity()
        );

        picturesRecycler.setAdapter(pictureAdapterRecyclerView);
        return view;
    }

    public ArrayList<Picture> buildPicture(){

        ArrayList<Picture> pictures = new ArrayList<>();

        pictures.add(
                new Picture("http://www.wallpapers-web.com/data/out/82/4454029-food-wallpapers.jpg",
                        "Gustavo Gómez",
                        "5 días",
                        "53 Me Gusta"));
        pictures.add(
                new Picture("https://s-media-cache-ak0.pinimg.com/originals/8a/e1/a8/8ae1a8abe2676f008e310100df0569e1.jpg",
                        "Carmen de la Rosa",
                        "4 días",
                        "23 Me Gusta"));
        pictures.add(
                new Picture("http://ichef.bbci.co.uk/food/ic/food_16x9_608/recipes/kids_minestrone_soup_40496_16x9.jpg",
                        "Agustin Meriño",
                        "23 días",
                        "12 Me Gusta"));

        return pictures;
    }

    public void showToolBar(String tittle, boolean upButton, View view){
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(tittle);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }

}
