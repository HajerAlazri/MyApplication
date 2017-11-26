package ita.om.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    String[] name = {"image1", "image2"};
    int[] image = {R.drawable.image, R.drawable.image1};
    ArrayList<HashMap<String,String>> arrayList;
     ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      arrayList = new ArrayList<>();
        list= (ListView) findViewById(R.id.list);

        for (int i=0;i<name.length; i++){
            HashMap<String,String> map=new HashMap<String,String>();
            map.put("name",name[i]);
            map.put("image",image[i]+"");
            arrayList.add(map);

    }
    String[] arry={"name","image"};
        int[] views={R.id.textview,R.id.imageView};
        SimpleAdapter adater=new SimpleAdapter(this,arrayList,R.layout.cell_layout,arry,views);
        list.setAdapter(adater);
}}
