package com.ts.tech.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

import com.ts.tech.R;


public class Cows extends Activity 
  {

	  @Override
	  protected void onCreate(Bundle s) 
	   {
	     super.onCreate(s);
	     setContentView(R.layout.cows);
	     
	     final LinearLayout L1= (LinearLayout) findViewById(R.id.L1);
		    final Button b8 = (Button) findViewById(R.id.b8);

	     b8.setOnClickListener(new OnClickListener()
	      {
		        @Override
		        public void onClick(View arg0)
		          {
		        	Intent i = new Intent("android.intent.action.VIEW", Uri.parse("http://www.pcti.tec.nj.us/index.php?option=com_content&view=article&id=124"));
			          startActivity(i);
		          }   	   
	      });
       }
  }