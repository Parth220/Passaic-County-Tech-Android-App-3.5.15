package com.ts.tech.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.ts.tech.R;

 public class lunchh extends Activity  
{
	   
	 public int easterEggF;
	 public int easterEggG;
	 
	 @Override
	   protected void onCreate(Bundle sa)
	 {
		   super.onCreate(sa);
	       setContentView(R.layout.lunchhalf);
	       
	       final LinearLayout t1= (LinearLayout) findViewById(R.id.t1);
	       final TextView tv1 = (TextView)findViewById(R.id.textView12);
	       final TextView tv2 = (TextView)findViewById(R.id.textView7);
           easterEggF = 0;
           easterEggG = 0;
           
           tv1.setOnClickListener(new View.OnClickListener() {
        	   @Override
        	   public void onClick(View v) 
        	   {
        	      // TODO Auto-generated method stub
        		   
        		   if( easterEggF < 75)
        		   {
        			   easterEggF++;
        		   }
        		   else if (easterEggF  ==  75)
        		   		{
        			   		Toast.makeText(getApplicationContext(), "#FreeMix", Toast.LENGTH_LONG).show();
        		   		}
        		   		else
        		        {
        		   			easterEggF = 0; 
        		        }
        			   
        	   }
        	});
           
           tv2.setOnClickListener(new View.OnClickListener() {
        	   @Override
        	   public void onClick(View v) 
        	   {
        	      // TODO Auto-generated method stub
        		   
        		   if( easterEggG < 113)
        		   {
        			   easterEggG++;
        		   }
        		   else if (easterEggG  == 113 )
        		   		{
        			   		Toast.makeText(getApplicationContext(), "Half Life 3 Confirmed. All hail GabeN!", Toast.LENGTH_LONG).show();
        		   		}
        		   		else
        		        {
        		   			easterEggG = 0; 
        		        }
        			   
        	   }
        	});

	 }
}
