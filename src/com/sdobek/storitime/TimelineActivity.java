package com.sdobek.storitime;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.parse.Parse;
import com.parse.ParseObject;

public class TimelineActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Parse.initialize(this, "h0YIg8GPxufMoiNZR6llo3TrdG4z52d2joYr20bl", "XDDlR6ccr1fwBAp9HHa7Jnx1wFthWdPzKQaS1dF3");
		setContentView(R.layout.activity_timeline);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.timeline, menu);
		return true;
	}

}
