package com.quis;

import com.quis.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.RadioButton;
import android.app.Activity;

public class Quis_SidikPangestuActivity extends Activity  {
    /** Called when the activity is first created. */
	RadioButton SI,SK,MI,TK;
	Button btn_Ok;
	EditText Edit_Text;
	TextView tv_Hasil;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
      
        Edit_Text = (EditText) findViewById (R.id.input_nirm);
        Edit_Text = (EditText) findViewById (R.id.input_nama);
        SI = (RadioButton) findViewById(R.id.rd_si);
        SK = (RadioButton) findViewById(R.id.rd_sk);
        MI = (RadioButton) findViewById(R.id.rd_mi);
        TK = (RadioButton) findViewById(R.id.rd_tk);
        tv_Hasil = (TextView) findViewById (R.id.tvhasil);
        btn_Ok = (Button) findViewById (R.id.btn_Ok);
       
        
        String s = "Hasil : ";
    	if (SI.isChecked()){
    		s = s + "SI";
    	} if (SK.isChecked()){
    		s = s + "SK";
    	} if (MI.isChecked()) {
    		s = s + "MI";
    	} tv_Hasil.setText(s);
    	
    }
}