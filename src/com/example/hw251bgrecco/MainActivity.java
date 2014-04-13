package com.example.hw251bgrecco;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener  {

	Button signIn;
	EditText email;
	EditText password;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        signIn = (Button) findViewById(R.id.signin); 
        signIn.setOnClickListener(this);
        
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        
    }
    
	@Override
    public void onClick(View v) {
		String emailText = email.getText().toString(); 
        String passwordText = password.getText().toString(); 
        if (TextUtils.isEmpty(emailText) || TextUtils.isEmpty(passwordText))
        {
       		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        	alertDialogBuilder.setTitle("Data Incomplete");
        	alertDialogBuilder.setMessage("Please fill out the email and password fields");
        		alertDialogBuilder.setPositiveButton("OK",new DialogInterface.OnClickListener() {
        			public void onClick(DialogInterface dialog, int id) {
            	 	   }
                  });
            AlertDialog alertDialog = alertDialogBuilder.create();
            // show alert
            alertDialog.show();	         
        	
        }
        else
        {
        	Intent infoIntent = new Intent(this, InfoActivity.class);
        	infoIntent.putExtra("email", emailText);
        	infoIntent.putExtra("password", passwordText);        	
        	startActivity(infoIntent);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
