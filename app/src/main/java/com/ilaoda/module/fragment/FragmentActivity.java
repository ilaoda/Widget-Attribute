package com.ilaoda.module.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.ilaoda.widget.R;

/**
 * Created by hbh on 2017/12/30.
 *
 * 和 Fragment 关联的Activity;
 *
 */

public class FragmentActivity extends Activity {
    @SuppressLint("CommitTransaction")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_main);

        /**
         * 下面为: 将 fragment 动态添加到 Activity的布局中
         */

        // 1. 获取Framgement实例对象
        NewListFragment newListFragment = new NewListFragment();

        // 2. 获取FragmentManager对象
        FragmentManager fragmentManager = getFragmentManager();

        // 3. 通过上述FragmentManager 获取FragmentTransaction对象
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // 4. 调用 fg 的 add(), 添加 Fragment的布局到 Activity 中
        fragmentTransaction.add(R.id.fg_main, newListFragment);

        // 5. fg 调用 commit()提交
        fragmentTransaction.commit();
    }



}














