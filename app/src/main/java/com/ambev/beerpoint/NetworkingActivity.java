package com.ambev.beerpoint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.ambev.beerpoint.utils.Global;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import org.json.JSONException;
import org.json.JSONObject;

public class NetworkingActivity extends AppCompatActivity {

    private Button btn_qr_code;
    private TextView tv_code;
    private IntentIntegrator qrScan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_networking);

        btn_qr_code = (Button) findViewById(R.id.btn_qr_code);
        tv_code = (TextView) findViewById(R.id.tv_code);

        qrScan = new IntentIntegrator(this);


        btn_qr_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                qrScan.initiateScan();
            }
        });
    }


}
