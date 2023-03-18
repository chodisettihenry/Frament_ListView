package com.example.framentlistviewtype;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImageFragment extends Fragment {

    ImageView image;



    public ImageFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_image, container, false);

        image= view.findViewById(R.id.imageView);

        Bundle bundle = getArguments();
        int takePositionImage = bundle.getInt("position",0);

        if(takePositionImage==0)
        {
            image.setImageResource(R.drawable.england);
        } else if (takePositionImage==1) {
            image.setImageResource(R.drawable.afirica);
        } else if (takePositionImage==2) {
            image.setImageResource(R.drawable.america);
        } else if (takePositionImage==3) {
            image.setImageResource(R.drawable.india);
        } else if (takePositionImage==4) {
            image.setImageResource(R.drawable.russia);

        }



        return view;
    }
}