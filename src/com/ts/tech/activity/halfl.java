package com.ts.tech.activity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.ts.tech.R;


    public class halfl extends Activity 
    {
    	public int easterEggD;
    	public int easterEggE;
    	
    	 @Override
  	   protected void onCreate(Bundle sa)
  	 {
    		 super.onCreate(sa);
  	       setContentView(R.layout.halfl);
  	       
  	       final TableLayout t1= (TableLayout) findViewById(R.id.t1);
  	       final TextView tv1 = (TextView)findViewById(R.id.textView8);
  	       final TextView tv2 = (TextView)findViewById(R.id.textView12);
  	     
  	       easterEggD = 0;
  	       easterEggE = 0;
  	     
  	     tv1.setOnClickListener(new View.OnClickListener() {
      	   @Override
      	   public void onClick(View v) 
      	   {
      	      // TODO Auto-generated method stub
      		   
      		   	   if( easterEggD < 7)
          		   {
          			   easterEggD++;
          		   }
          		   else if (easterEggD  ==  7)
          		   		{
          			   		Toast.makeText(getApplicationContext(), "When does the narwhal bacon? Midnight.", Toast.LENGTH_LONG).show();            			   		
          		   		}
          		   		else
          		        {
          		   			easterEggD = 0; 
          		        }
      		   
      		   
      			  // Toast.makeText(getApplicationContext(), "Hey!", Toast.LENGTH_SHORT).show();
    		   		//Toast.makeText(getApplicationContext(), "Made you look.", Toast.LENGTH_LONG).show();
    		   		
      			   
      	   }
      	});
  	     
  	   tv2.setOnClickListener(new View.OnClickListener() {
      	   @Override
      	   public void onClick(View v) 
      	   {
      	      // TODO Auto-generated method stub
      		   
      		   	   if( easterEggE < 7)
          		   {
          			   easterEggE++;
          		   }
          		   else if (easterEggE  ==  7)
          		   		{
          			   		Toast.makeText(getApplicationContext(), "Hey!", Toast.LENGTH_SHORT).show(); 
          			   		Toast.makeText(getApplicationContext(), "Made you look.", Toast.LENGTH_LONG).show();
          		   		}
          		   		else
          		        {
          		   			easterEggE = 0; 
          		        }
      		   
      		   
      			  // Toast.makeText(getApplicationContext(), "Hey!", Toast.LENGTH_SHORT).show();
    		   		//Toast.makeText(getApplicationContext(), "Made you look.", Toast.LENGTH_LONG).show();
    		   		
      			   
      	   }
      	});
  	       
        }
  	 }


