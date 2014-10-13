package edu.gatech.seclass.unitconvertor;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class CurrencyActivity  extends Activity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_currency);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.currency, menu);
		return true;
	}

	public void handleClick(View view){
		boolean checked = ((RadioButton) view).isChecked();
		
		EditText txt = (EditText) findViewById(R.id.CurText1);
		
		double curr = Double.parseDouble(txt.getText().toString());
	
		switch(view.getId()){
		
		case R.id.CurradioButton1:
			if(checked)
				txt.setText(UsdToEuro(curr));
			break;
		case R.id.CurradioButton2:
			if(checked)
				txt.setText(EuroToUsd(curr));
			break;	
			
		}
		
	}

	public CharSequence UsdToEuro(double usd) {
		// TODO Auto-generated method stub
		double  euro = usd * 0.79;
		return String.valueOf(euro);
	}

	public CharSequence EuroToUsd(double euro) {
		// TODO Auto-generated method stub
		double usd = euro / 0.79;
		return String.valueOf(usd);
	}
}
