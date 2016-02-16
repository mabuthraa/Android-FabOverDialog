package com.apipas.app.faboverdialog;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentCustomDialog extends Fragment {
    private static final String ARG_TITLE = "param1";
    private static final String ARG_MESSAGE = "param2";

    private String mTitle;
    private String mMessage;


    public FragmentCustomDialog() {
        // Required empty public constructor
    }

    public static FragmentCustomDialog newInstance(String param1, String param2) {
        FragmentCustomDialog fragment = new FragmentCustomDialog();
        Bundle args = new Bundle();
        args.putString(ARG_TITLE, param1);
        args.putString(ARG_MESSAGE, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mTitle = getArguments().getString(ARG_TITLE);
            mMessage = getArguments().getString(ARG_MESSAGE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_custom_dialog, container, false);
        ((TextView)rootView.findViewById(R.id.title)).setText(mTitle);
        ((TextView)rootView.findViewById(R.id.message)).setText(mMessage);
        return rootView;
    }

}
