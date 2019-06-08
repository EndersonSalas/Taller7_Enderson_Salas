package com.example.taller7_enderson_salas.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.navigation.Navigation;

import com.example.taller7_enderson_salas.R;


public class OrangeFragment extends Fragment {

    private final String TAG= "OrangeFragment";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_orange, container, false);
        setupUI(view);
        return  view;
    }

    public void  setupUI (final View view ){
        FloatingActionButton btnNext= (FloatingActionButton) view.findViewById(R.id.floating_next3);
        TextView textViewReceived= view.findViewById(R.id.text_view_result);
        OrangeFragmentArgs args = OrangeFragmentArgs.fromBundle(getArguments());
        String message = args.getMessage();
        textViewReceived.setText(message);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG,"button fragment 1 clicked");
                Navigation.findNavController(view)
                        .navigate(R.id.fragmentto1);
            }
        });
    }

}
