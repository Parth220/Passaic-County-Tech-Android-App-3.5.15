package com.ts.tech.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

import com.ts.tech.R;

public class BellPage extends Activity
{
	   @Override
	public void onCreate(Bundle sa)
	 {
		   super.onCreate(sa);
	       setContentView(R.layout.bellpage);
	       
	       final LinearLayout t1 = (LinearLayout) findViewById(R.id.t1);
	       final Button f1 = (Button) findViewById(R.id.f1);
	       final Button h1 = (Button) findViewById(R.id.h1);
	       final Button lf = (Button) findViewById(R.id.lf);
	       final Button hl = (Button) findViewById(R.id.hl);
	       
	       
	       f1.setOnClickListener(new OnClickListener()
	       {
	    	       @Override
	    	       public void onClick(View arg0)
	    	         {
	    	    	    Intent i = new Intent(BellPage.this, full.class); 
	    		        startActivity(i);
	    	         }   	   
	       });
	       
	       lf.setOnClickListener(new OnClickListener()
	       {
	    	       @Override
	    	       public void onClick(View arg0)
	    	         {
	    	    	    Intent i = new Intent(BellPage.this, lunchf.class); 
	    		        startActivity(i);
	    	         }   	   
	       });
	       
	       h1.setOnClickListener(new OnClickListener()
	       {
	    	       @Override
	    	       public void onClick(View arg0)
	    	         {
	    	    	    Intent i = new Intent(BellPage.this, halfl.class); 
	    		        startActivity(i);
	    	         }   	   
	       });
	       
	       hl.setOnClickListener(new OnClickListener()
	       {
	    	       @Override
	    	       public void onClick(View arg0)
	    	         {
	    	    	    Intent i = new Intent(BellPage.this, lunchh.class); 
	    		        startActivity(i);
	    	         }   	   
	       });

	 }
	
	
}
