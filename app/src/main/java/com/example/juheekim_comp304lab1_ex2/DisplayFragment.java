package com.example.juheekim_comp304lab1_ex2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class DisplayFragment extends Fragment {
    private TextView tvDisplay;

    public DisplayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // display Toast with fragment life status
        Toast toast = Toast.makeText(getContext(), "Display Fragment, onCreateView() executed", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_VERTICAL, 0, 0);
        toast.show();

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_display, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        // display Toast with fragment life status
        Toast toast = Toast.makeText(getContext(), "Display Fragment, onCreateView() executed", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_VERTICAL, 0, 0);
        toast.show();
    }

    // Display method
    public void displayLifeCycle (String status) {

        tvDisplay = (TextView) getActivity().findViewById(R.id.showText);
        tvDisplay.setText(status);
    }
}

