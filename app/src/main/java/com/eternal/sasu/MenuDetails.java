package com.eternal.sasu;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuDetails extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menudetail);

        ImageView iv = (ImageView)findViewById(R.id.imageView1);
        TextView menuTitle = (TextView)findViewById(R.id.menu_title);
        TextView menuCost = (TextView)findViewById(R.id.menu_price);
        TextView menuCalo = (TextView)findViewById(R.id.menu_calorie);
        TextView menuInfo = (TextView)findViewById(R.id.menu_info);

        //Intent intent = getIntent(); //보내온 Intent받기
       // menuImg.setImageResource(intent.getInExtra);
    }
}
