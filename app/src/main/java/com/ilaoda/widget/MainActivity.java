package com.ilaoda.widget;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.util.Log;
import android.widget.TextView;

import com.ilaoda.module.fragment.FragmentActivity;
import com.ilaoda.module.fragment.NewListFragment;

/**
 * 适配器： 显示器，可以将数据绑定显示在界面
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private ListView mListView;

    // 需要适配的数据
    private String[] itemName = {"Activity", "Service",
            "BroadcastReceiver", "ContentProvider", "Fragment"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = findViewById(R.id.lv_listview);

        // 创建Adapter实例
        MyBaseAdapter myBaseAdapter = new MyBaseAdapter();

        // 设置 Adapter, 主要用来初始化数据
        mListView.setAdapter(myBaseAdapter);

        // 设置item的监听
        mListView.setOnItemClickListener(new MyItemClickListener());
    }


    /**
     * 自己创建的 Adaper
     *
     */
    class MyBaseAdapter extends BaseAdapter {
        /**
         * 获取 item 总数
         * @return
         */
        @Override
        public int getCount() {
            return itemName.length;
        }

        /**
         * 获取指定位置的 item 对象, 这里的对象就是一个 TextView
         * @param i
         * @return
         */
        @Override
        public Object getItem(int i) {
            return itemName[i];
        }

        /**
         * 获取指定位置 item 的 id
         * @param i
         * @return
         */
        @Override
        public long getItemId(int i) {
            Log.i(TAG, "name: " + itemName[i] + ", id: " + i);
            return i;
        }

        /**
         * 获取指定位置的 item 的视图
         * @param i
         * @param convertView  复用的 view 的对象
         * @param viewGroup
         * @return
         */
        @Override
        public View getView(int i, View convertView, ViewGroup viewGroup) {
            // 得到 item 的 View
            View view = View.inflate(MainActivity.this,
                    R.layout.main_list_item,
                    null);

            // 通过 View 获取 TextView 的实例
            TextView textView = view.findViewById(R.id.tv_list_text);
            textView.setText(itemName[i]);

            return view;
        }
    }

    /**
     * ListView 上 item 的点击事件处理
     */
    private class MyItemClickListener implements AdapterView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            switch (i) {

                case 0:
                    //---
                    break;

                case 1:
                    //---
                    break;

                case 2:
                    //---
                    break;

                case 3:
                    //---
                    break;

                case 4:
                    Intent fragmentIntent = new Intent(MainActivity.this,
                            FragmentActivity.class);
                    startActivity(fragmentIntent);
                    break;
                default:
                    break;
            }

        }
    }



}
