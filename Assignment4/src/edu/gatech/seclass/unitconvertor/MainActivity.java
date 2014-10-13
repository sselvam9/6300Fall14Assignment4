package edu.gatech.seclass.unitconvertor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// setup button listeners
		Button convertDistanceButton = (Button) findViewById(R.id.convertDistanceButton);
		convertDistanceButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				startConvertDistanceActivity();
			}
		});

		Button convertAreaButton = (Button) findViewById(R.id.convertAreaButton);
		convertAreaButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				startConvertAreaActivity();
			}
		});

		Button convertCurrencyButton = (Button) findViewById(R.id.convertCurrencyButton);
		convertCurrencyButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				startConvertCurrencyActivity();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	private void startConvertDistanceActivity() {
		Intent intent = new Intent(this, DistanceActivity.class);
		startActivity(intent);
	}

	private void startConvertAreaActivity() {
		Intent intent = new Intent(this, AreaActivity.class);
		startActivity(intent);
	}

	private void startConvertCurrencyActivity() {
		Intent intent = new Intent(this, CurrencyActivity.class);
		startActivity(intent);
	}

}
