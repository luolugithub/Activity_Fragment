package com.example.luolu.myappfra;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by luolu on 2017/11/10.
 */

public class TwoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_two, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //获取Activity传递过来的数据并且显示到
        Bundle args=getArguments();
        TextView tv=(TextView)view.findViewById(R.id.et_one);
        tv.setText(args.getString("text"));//遇到空指针异常的问题
    }

}
