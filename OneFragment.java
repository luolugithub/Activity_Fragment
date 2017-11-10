package com.example.luolu.myappfra;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by luolu on 2017/11/10.
 */

public class OneFragment extends Fragment {
    OnOneFragmentClickLisener mCallback;
    private EditText et;
    private Button btn;

    public interface OnOneFragmentClickLisener {
        void onArticleClick(String text);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_one,container,false);
        et=(EditText)view.findViewById(R.id.et_one);
        btn=(Button)view.findViewById(R.id.btn_one);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCallback.onArticleClick(et.getText().toString());
            }
        });

        return view;
    }
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mCallback = (OnOneFragmentClickLisener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnHeadlineSelectedListener");
        }
    }

}
