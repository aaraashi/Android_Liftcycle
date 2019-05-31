package com.example.juheekim_comp304lab1_ex2;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class ActivitiesFragment extends Fragment {

    public ActivitiesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_activities, container, false);

        // display Toast with fragment life status
        Toast toast = Toast.makeText(getContext(),"Activity Fragment, onCreateView() executed", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_VERTICAL, 0, 120);
        toast.show();

        final ListView listView = view.findViewById(R.id.list);
        listView.setSelector(android.R.color.holo_blue_dark);
        //DisplayFragment fragment = (DisplayFragment)getFragmentManager().findFragmentById(R.id.displayFragment);


        // Event handler for selected list item and put an intent
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(getActivity(), AIActivity.class);
                    intent.putExtra("activity", "AIActivity");
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(getActivity(), ARActivity.class);
                    intent.putExtra("activity", "VRActivity");
                    startActivity(intent);
                }
            }
        }
        );
        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        // display Toast with fragment life status
        Toast toast = Toast.makeText(getContext(), "Activity Fragment, onCreateView() executed", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_VERTICAL, 0, 120);
        toast.show();
    }
}
