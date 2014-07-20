package com.example.treasurelabyrinth;

import java.util.jar.Attributes;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		LinearLayout grid = (LinearLayout) findViewById(R.id.grid);
		
		/*for (int i = 0; i < 3; ++i) {
			LinearLayout row = new LinearLayout(this);
		    LayoutParams rowParams = new LinearLayout.LayoutParams(0,0,1.0f);    
			row.setLayoutParams(rowParams);*/
			
			for (int j = 0; j < 3; ++j) {	
				ImageButton button = new ImageButton(this);
				button.setBackgroundResource(R.drawable.cell);
				
			    LayoutParams params = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT,0,1.0f);    
				button.setLayoutParams(params);
				
				grid.addView(button);
				
				System.out.print(grid.getMeasuredHeight());
				
			}
			//grid.addView(row);
//		}

		TextView text = (TextView) findViewById(R.id.text);
		text.setText(Integer.toString(111));
	
		
		
		
		
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
}
