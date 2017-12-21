package com.ts.tech.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.ts.tech.R;

public class full extends Activity 
{
	
	public int easterEggB;
	public int easterEggC;
	 @Override
	   protected void onCreate(Bundle sa)
	 {
		   super.onCreate(sa);
	       setContentView(R.layout.fullbell);
	       
	       final TableLayout l1 = (TableLayout) findViewById(R.id.l1);
	       final TextView tv2 = (TextView)findViewById(R.id.textView8);
	       final TextView tv1 = (TextView)findViewById(R.id.textView1);
           easterEggB = 0;
           easterEggC = 0;
           
           tv1.setOnClickListener(new View.OnClickListener() {
        	   @Override
        	   public void onClick(View v) 
        	   {
        	      // TODO Auto-generated method stub
        		   
        		   if( easterEggC < 20)
            		   {
            			   easterEggC++;
            		   }
            		   else if (easterEggC  ==  20)
            		   		{
            			   		Toast.makeText(getApplicationContext(), "App Made By: Parth Patel, Kevin Maspono, Miguel Inoa, and Joncarlos Perdomo!", Toast.LENGTH_LONG).show(); 
            			   		Toast.makeText(getApplicationContext(), "Joncarlos carried the team though.", Toast.LENGTH_SHORT).show();
            		   		}
            		   		else
            		        {
            		   			easterEggC = 0; 
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
        		   
        		   if( easterEggB < 21)
            		   {
            			   easterEggB++;
            		   }
            		   else if (easterEggB  ==  21)
            		   		{
            			   		Toast.makeText(getApplicationContext(), "Never gonna give you up.", Toast.LENGTH_SHORT).show();
            			   		Toast.makeText(getApplicationContext(), "Never gonna let you down.", Toast.LENGTH_SHORT).show();
            			   		Toast.makeText(getApplicationContext(), "Never gonna run around and desert you.", Toast.LENGTH_SHORT).show();
            			   		Toast.makeText(getApplicationContext(), "Never gonna make you cry.", Toast.LENGTH_SHORT).show();
            			   		Toast.makeText(getApplicationContext(), "Never gonna say goodbye.", Toast.LENGTH_SHORT).show();
            			   		Toast.makeText(getApplicationContext(), "Never gonna tell a lie and hurt you.", Toast.LENGTH_SHORT).show();
            			   		
            		   		}
            		   		else
            		        {
            		   			easterEggB = 0; 
            		        }
        		   
        		   
        			  // Toast.makeText(getApplicationContext(), "Hey!", Toast.LENGTH_SHORT).show();
      		   		//Toast.makeText(getApplicationContext(), "Made you look.", Toast.LENGTH_LONG).show();
      		   		
        			   
        	   }
        	});

      }
}