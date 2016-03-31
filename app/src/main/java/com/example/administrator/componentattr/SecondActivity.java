package com.example.administrator.componentattr;

import android.app.Activity;
import android.content.ComponentName;
import android.os.Bundle;
import android.widget.EditText;

/**
 * Created by Administrator on 2016/3/31.
 */
public class SecondActivity extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        EditText show = (EditText) findViewById(R.id.edittext);
        ComponentName comp = getIntent().getComponent();
        show.setText("组件包名:"+comp.getPackageName()+"\n组件类名为:"+comp.getClassName());
    }
}
