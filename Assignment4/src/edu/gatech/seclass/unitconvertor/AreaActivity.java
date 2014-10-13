package edu.gatech.seclass.unitconvertor;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class AreaActivity  extends Activity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_area);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.area, menu);
		return true;
	}

	
	public void handleClick(View view){
		boolean checked = ((RadioButton) view).isChecked();
		
		EditText txt = (EditText) findViewById(R.id.SqText1);
		
		double area = Double.parseDouble(txt.getText().toString());
	
		switch(view.getId()){
		
		case R.id.SqRadioButton1:
			if(checked)
				txt.setText(FtToMeter(area));
			break;
		case R.id.SqRadioButton2:
			if(checked)
				txt.setText(MeterToFt(area));
			break;	
			
		}
		
	}

	public CharSequence FtToMeter(double ft) {
		// TODO Auto-generated method stub
		double  meter = ft * 0.3048;
		return String.valueOf(meter);
	}

	public CharSequence MeterToFt(double meter) {
		// TODO Auto-generated method stub
		double ft = meter / 0.3048;
		return String.valueOf(ft);
	}	
}
