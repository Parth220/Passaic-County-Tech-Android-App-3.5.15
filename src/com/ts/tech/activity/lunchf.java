package com.ts.tech.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.ts.tech.R;

	public class lunchf extends Activity  
	 {
		public int easterEggA;
		
		   @Override
		   protected void onCreate(Bundle sa)
		 {
			   super.onCreate(sa);
		       setContentView(R.layout.lunchfull);
		       
		       final LinearLayout t1= (LinearLayout) findViewById(R.id.t1);
               final TextView tv = (TextView)findViewById(R.id.textView12);
               easterEggA = 0;
               
               tv.setOnClickListener(new View.OnClickListener() {
            	   @Override
            	   public void onClick(View v) 
            	   {
            	      // TODO Auto-generated method stub
            		   
            		   if( easterEggA < 7)
            		   {
            			   easterEggA++;
            		   }
            		   else if (easterEggA  ==  7)
            		   		{
            			   		Toast.makeText(getApplicationContext(), "Dr. Parent: You the reel mvp.", Toast.LENGTH_LONG).show();
            		   		}
            		   		else
            		        {
            		   			easterEggA = 0; 
            		        }
            			   
            	   }
            	});
		 }
     }

