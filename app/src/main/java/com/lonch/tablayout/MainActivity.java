package com.lonch.tablayout;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout tableLayout;
    private List<TabBean> tabs = new ArrayList<>();
    private String type = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        addTable();//@1
    }

    private void addTable() {
        tabs.add(new TabBean("0", "新闻"));
        tabs.add(new TabBean("1", "体育"));
        tabs.add(new TabBean("2", "音乐"));
        tabs.add(new TabBean("3", "娱乐"));
        for (TabBean tab : tabs) {
            tableLayout.addTab(tableLayout.newTab().setText(tab.title));
        }
    }

    private void initData() {
//        viewPager = (ViewPager) findViewById(R.id.viewpage);
        tableLayout = (TabLayout) findViewById(R.id.tabLayout);
        //@2
//        tableLayout.addTab(tableLayout.newTab().setText("新闻").setIcon(R.mipmap.ic_launcher));
//        tableLayout.addTab(tableLayout.newTab().setText("体育").setIcon(R.mipmap.ic_launcher));
//        tableLayout.addTab(tableLayout.newTab().setText("音乐").setIcon(R.mipmap.ic_launcher));
//        tableLayout.addTab(tableLayout.newTab().setText("娱乐").setIcon(R.mipmap.ic_launcher));
//        tableLayout.addTab(tableLayout.newTab().setText("1").setIcon(R.mipmap.ic_launcher));
//        tableLayout.addTab(tableLayout.newTab().setText("2").setIcon(R.mipmap.ic_launcher));
//        tableLayout.addTab(tableLayout.newTab().setText("3").setIcon(R.mipmap.ic_launcher));
//        tableLayout.addTab(tableLayout.newTab().setText("4").setIcon(R.mipmap.ic_launcher));
//        tableLayout.addTab(tableLayout.newTab().setText("5").setIcon(R.mipmap.ic_launcher));
        //tableLayout.getTabAt(position).select();默认选中
        //tableLayout.setupWithViewPager(viewPager);关联ViewPage
        tableLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                //选中了tab的逻辑
                TabBean tabBean = tabs.get(tab.getPosition());
                type = tabBean.id;
                //LoadData();此处添加网络数据
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                //未选中tab的逻辑

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                //再次选中tab的逻辑

            }
        });
    }
}