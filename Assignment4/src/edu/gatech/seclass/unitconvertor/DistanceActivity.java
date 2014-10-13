package edu.gatech.seclass.unitconvertor;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class DistanceActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_distance);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.distance, menu);
		return true;
	}

	public void handleClick(View view){
		boolean checked = ((RadioButton) view).isChecked();
		EditText txt = (EditText) findViewById(R.id.Text1);
		double distance = Double.parseDouble(txt.getText().toString());
		switch(view.getId()){
		case R.id.CurradioButton1:
			if(checked)
				txt.setText(kmToMiles(distance));
			break;
		case R.id.radioButton2:
			if(checked)
				txt.setText(MilesTokm(distance));
			break;	
			
		}
		}

	public CharSequence MilesTokm(double miles) {
		// TODO Auto-generated method stub
		double km = miles * 1.609;
		return String.valueOf(km);
	}

	public CharSequence kmToMiles(double km) {
		// TODO Auto-generated method stub
		double miles = km / 1.609;
		return String.valueOf(miles);
	}
}
	

