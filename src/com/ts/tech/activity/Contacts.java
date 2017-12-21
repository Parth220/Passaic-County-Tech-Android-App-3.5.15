package com.ts.tech.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TableLayout;

import com.ts.tech.R;

public class Contacts extends Activity 
{
	@Override
	protected void onCreate(Bundle sa) 
	  {
		super.onCreate(sa);
		setContentView(R.layout.contacts);
		
	    final TableLayout t1 = (TableLayout) findViewById(R.id.t1);
	    final Button b1 = (Button) findViewById(R.id.b1);
	    final Button b2 = (Button) findViewById(R.id.b2);
	    final Button b3 = (Button) findViewById(R.id.b3);
	    final Button b4 = (Button) findViewById(R.id.b4);
	    final Button b5 = (Button) findViewById(R.id.b5);
	    final Button b6 = (Button) findViewById(R.id.b6);
	    final Button b7 = (Button) findViewById(R.id.b7);
	    final Button b8 = (Button) findViewById(R.id.b8);
	    
	    b1.setOnClickListener(new OnClickListener()
      {
	        @Override
	        public void onClick(View arg0)
	          {
	  	        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("tel:19737906000"))); //This is Parth :)
	          }   	   
      });
	    
	    b2.setOnClickListener(new OnClickListener()
      {
	        @Override
	        public void onClick(View arg0)
	          {
	        	startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("tel:19733894259")));
	          }   	   
      });
	    
	    b3.setOnClickListener(new OnClickListener()
      {
	        @Override
	        public void onClick(View arg0)
	          {
	        	startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("tel:19733894223")));
	          }   	   
      });
	    
	    b4.setOnClickListener(new OnClickListener()
      {
	        @Override
	        public void onClick(View arg0)
	          {
	        	startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("tel:19733894166")));
	          }   	   
      });
	    
	    b5.setOnClickListener(new OnClickListener()
      {
	        @Override
	        public void onClick(View arg0)
	          {
	        	startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("tel:19733894204")));
	          }   	   
      });
	    
	    b6.setOnClickListener(new OnClickListener()
      {
	        @Override
	        public void onClick(View arg0)
	          {
	        	startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("tel:19733894236")));
	          }   	   
      });
	    
	    b7.setOnClickListener(new OnClickListener()
      {
	        @Override
	        public void onClick(View arg0)
	          {
	        	startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("tel:19733892035")));
	          }   	   
      });
	    
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