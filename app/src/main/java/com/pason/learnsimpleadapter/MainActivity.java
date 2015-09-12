package com.pason.learnsimpleadapter;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.SimpleAdapter;

import com.pason.learnsimpleadapter.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends ListActivity {
    private List<Map<String,Object>> mList = new ArrayList<Map<String,Object>>();
    private Map<String,Object> mMap = new HashMap<String,Object>();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMap = new HashMap<String,Object>();
        mMap.put("name", "pason");
        mMap.put("sign","I love C++");
        mMap.put("photo", R.drawable.pason);
        mList.add(mMap);

        mMap = new HashMap<String,Object>();
        mMap.put("name", "李宗睿");
        mMap.put("sign", "喵喵");
        mMap.put("photo", R.drawable.zr);
        mList.add(mMap);

        mMap = new HashMap<String,Object>();
        mMap.put("name", "田胖子");
        mMap.put("sign","我是逗逼");
        mMap.put("photo", R.drawable.db);
        mList.add(mMap);

        mMap = new HashMap<String,Object>();
        mMap.put("name", "赵帆");
        mMap.put("sign","我要去澳大利亚");
        mMap.put("photo", R.drawable.xff);
        mList.add(mMap);

        mMap = new HashMap<String,Object>();
        mMap.put("name", "杜江");
        mMap.put("sign","I love Chris Paul");
        mMap.put("photo", R.drawable.dj);
        mList.add(mMap);

        SimpleAdapter adapter = new SimpleAdapter(this,mList,R.layout.simple_item,
                new String[]{"name","sign","photo"},
                new int[]{R.id.title,R.id.info,R.id.img});
        this.setListAdapter(adapter);
    }
}