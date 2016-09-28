package com.supriyalahade.session12assign3;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by BIDWAI on 28-09-2016.
 */
public class CustomFragment extends ListFragment {

    String[] name = {"YouTube","eBlogger"};
    int[] images = {R.drawable.youtube,R.drawable.eblogger};

    String[] description = {"YouTube description","eBlogger description"};

    ArrayList<HashMap<String,String>> aList;

    HashMap<String,String> hm;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        aList = new ArrayList<HashMap<String,String>>() ;

        for(int i=0; i<name.length;i++){

            hm = new HashMap<String,String>();

            hm.put("NAME",name[i]);
            hm.put("DESCRIPTION",description[i]);
            hm.put("IMAGE",Integer.toString(images[i]));
            aList.add(hm);

        }

        //Keys used in hashmap

        String[] from = {"NAME","DESCRIPTION","IMAGE",};
        //Ids of View in ListView Layout

        int[] to= {R.id.txt,R.id.des,R.id.image};

        SimpleAdapter adapter = new SimpleAdapter(getActivity(),aList,R.layout.listview_layout,from,to);
        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
