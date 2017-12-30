package com.ilaoda.module.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ilaoda.widget.R;

/**
 * Created by hbh on 2017/12/30.
 */

public class NewListFragment extends Fragment {

    /**
     * 为 Fragment 创建/加载 布局的时候调用
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        // 用 inflate 动态加载 Fragment 的布局

        View viewFragment = inflater.inflate(R.layout.fragment, container, false);
        return viewFragment;
    }


}
