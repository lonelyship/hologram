package com.example.giftest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class MainActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBar().hide();
		// getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
		 
		setContentView(R.layout.activity_main);
	//	CustomGifView gif = (CustomGifView) findViewById(R.drawable.gif);
		   
	}

}