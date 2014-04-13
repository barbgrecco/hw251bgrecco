package com.example.hw251bgrecco;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class InfoActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_info);
		
		TextView emailView = (TextView) findViewById(R.id.enteredEmail);
		TextView passwordView = (TextView) findViewById(R.id.enteredPassword);
		
		Bundle extras = getIntent().getExtras();
		if (extras != null){
			emailView.setText(extras.getString("email"));
			passwordView.setText(extras.getString("password"));
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.info, menu);
		return true;
	}

}
