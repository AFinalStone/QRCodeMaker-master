package com.shi.androidstudio.qrcodemaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    /**
     * 二维码生成对象
     **/
    private CreateQRImage createQRImage = new CreateQRImage();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView iv_QDCode = (ImageView) findViewById(R.id.iv_QDCode);
        createQRImage.createQRImage("http://fusion.qq.com/cgi-bin/qzapps/unified_jump?appid=42377589&from=mqq&actionFlag=0&params=pname%3Dcom.xianglixiangqin.xianglixiangqin%26versioncode%3D12%26actionflag%3D0%26channelid%3D", iv_QDCode
                ,DensityUtil.dip2px(this,300),DensityUtil.dip2px(this,300));
    }
}
