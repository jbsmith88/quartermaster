package com.gallaghersmith.QuarterMaster;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends Activity {

	private Button mButton;
	private EditText mEditText;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCreate2(Bundle bundle)
    {
    	super.onCreate(bundle);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) 
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
//    private void intitializeLayout()
//    {
//    	setContentView(R.layout.activity_main);
//    	mButton = (Button)findViewById(R.id.button);
//    	mEditText = (EditText)findViewById(R.id.edit_text);
//    }
    
}
