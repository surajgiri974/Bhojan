package com.example.bhojan;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;


public class ProfileFragment extends Fragment {

    ListView listView;
    String[] listItem;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_profile, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        listView = view.findViewById(R.id.listview);
        listItem = getResources().getStringArray(R.array.array_profile);
        String[] arr = {"a","b","c"};
        final ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(view.getContext(),androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,listItem);
        listView.setAdapter(arrayAdapter);

    }
}