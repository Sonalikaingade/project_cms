package com.example.studentapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import java.util.ArrayList;


public class club_fragment extends Fragment {


    public club_fragment() {
        // Required empty public constructor
    }

    RecyclerView rcv;
    myadapter adapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_club_fragment, container, false);
        rcv=v.findViewById(R.id.recview);
       rcv.setLayoutManager(new LinearLayoutManager(getContext()));

        adapter=new myadapter(dataqueue());
        rcv.setAdapter(adapter);
        Button b1=v.findViewById(R.id.dept);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu=new PopupMenu(getContext(),b1);
                popupMenu.getMenuInflater().inflate(R.menu.dept_popup_menu,popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {

                        switch(menuItem.getItemId())
                        {
                            case R.id.it:
                                Toast.makeText(getContext(),"ITtttttttttttt",Toast.LENGTH_LONG).show();
                                break;
                            case R.id.cse:
                                Toast.makeText(getContext(),"Cseeeeee",Toast.LENGTH_LONG).show();
                                break;
                        }

                        return true;
                    }
                });
                popupMenu.show();

            }
        });
        Button b=v.findViewById(R.id.type);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu=new PopupMenu(getContext(),b);
                popupMenu.getMenuInflater().inflate(R.menu.type_popup_menu,popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch(menuItem.getItemId())
                        {
                            case R.id.item1:
                                Toast.makeText(getContext(),"techical",Toast.LENGTH_LONG).show();
                                break;
                            case R.id.item2:
                                Toast.makeText(getContext(),"nontechical",Toast.LENGTH_LONG).show();
                                break;
                        }




                        return true;
                    }
                });
                popupMenu.show();
            }
        });

        return v;
    }
    public ArrayList<Model> dataqueue()
    {

        ArrayList<Model> holder=new ArrayList<>();
        Model ob2=new Model();
        ob2.setHeader("SAIT");
        ob2.setDesc("Technical");
        ob2.setImgname(R.drawable.sait);
        holder.add(ob2);



        Model ob1=new Model();
        ob1.setHeader("WLUG");
        ob1.setDesc("Technical");
        ob1.setImgname(R.drawable.wlug);
        holder.add(ob1);



        Model ob3=new Model();
        ob3.setHeader("PACE");
        ob3.setDesc("Non-technical");
        ob3.setImgname(R.drawable.pace);
        holder.add(ob3);

        Model ob4=new Model();
        ob4.setHeader("GDSC");
        ob4.setDesc("Technical");
        ob4.setImgname(R.drawable.gdsc);
        holder.add(ob4);


        Model ob5=new Model();
        ob5.setHeader("ACM");
        ob5.setDesc("Technical");
        ob5.setImgname(R.drawable.acm);
        holder.add(ob5);


        Model ob6=new Model();
        ob6.setHeader("Art circle");
        ob6.setDesc("Non-Technical");
        ob6.setImgname(R.drawable.artcircle);
        holder.add(ob6);




        return holder;
    }

}