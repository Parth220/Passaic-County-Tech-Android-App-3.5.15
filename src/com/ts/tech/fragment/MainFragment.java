package com.ts.tech.fragment;


import java.util.ArrayList;
import java.util.List;

import view.ScrollGridView;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

import com.actionbarsherlock.app.SherlockFragment;
import com.ts.tech.R;
import com.ts.tech.activity.BellPage;
import com.ts.tech.activity.Contacts;
import com.ts.tech.adapter.MainAdapter;
import com.ts.tech.adapter.MainAdapter.AdapterItem;


/** 
 ** Some lines may be off a few numbers
 ** Just be sure you're in the general area WOW
 **/

public class MainFragment extends SherlockFragment{
	
	ScrollGridView gridView;
	final List<AdapterItem> listOfStuff = new ArrayList<AdapterItem>();
	
	public static final int BELL = 0;
	public static final int DIRECTIONS = 1;
	public static final int PCTIWEB = 2;
	public static final int PS = 3;
	public static final int MAP = 4;
	public static final int ADMIN = 5;
	 
	// This is the background layout that gets inflated behind the list view
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		return inflater.inflate(R.layout.gridview_behind, null);
	}

	// Starts when the MainFragment is launched
	@Override
	public void onActivityCreated(Bundle savedInstanceState){
		super.onActivityCreated(savedInstanceState);
		
		boolean tabletSize = getResources().getBoolean(R.bool.isTablet);
		if (tabletSize) {
			gridView = (ScrollGridView)getView().findViewById(R.id.grid);
			listOfStuff.add(new AdapterItem(getResources().getString (R.string.bell), 
					getResources().getString (R.string.desc_bell), 0));
			listOfStuff.add(new AdapterItem(getResources().getString (R.string.directions), 
					getResources().getString (R.string.desc_directions), 1));
			listOfStuff.add(new AdapterItem(getResources().getString (R.string.pctiweb), 
					getResources().getString (R.string.desc_web), 2));
			listOfStuff.add(new AdapterItem(getResources().getString (R.string.ps), 
					getResources().getString (R.string.desc_ps), 3));
			listOfStuff.add(new AdapterItem(getResources().getString (R.string.contact), 
					getResources().getString (R.string.desc_contact), 4));
			listOfStuff.add(new AdapterItem(getResources().getString (R.string.announce), 
					getResources().getString (R.string.desc_info), 5));

			
		} else {
			gridView = (ScrollGridView)getView().findViewById(R.id.grid);
			listOfStuff.add(new AdapterItem(getResources().getString (R.string.bell), 
					getResources().getString (R.string.desc_bell), 0));
			listOfStuff.add(new AdapterItem(getResources().getString (R.string.directions), 
					getResources().getString (R.string.desc_directions), 1));
			listOfStuff.add(new AdapterItem(getResources().getString (R.string.pctiweb), 
					getResources().getString (R.string.desc_web), 2));
			listOfStuff.add(new AdapterItem(getResources().getString (R.string.ps), 
					getResources().getString (R.string.desc_ps), 3));
			listOfStuff.add(new AdapterItem(getResources().getString (R.string.contact), 
					getResources().getString (R.string.desc_contact), 4));
			listOfStuff.add(new AdapterItem(getResources().getString (R.string.announce), 
					getResources().getString (R.string.desc_info), 5));
		}
		
			MainAdapter adapter = new MainAdapter(getActivity(), listOfStuff);
	
			gridView.setAdapter(adapter);
			gridView.setExpanded(true);
			gridView.setOnItemClickListener(new OnItemClickListener() {
				public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
					
					
					@SuppressWarnings("unused")
					MainFragment gridContentT = null;
					
					boolean tabletSize = getResources().getBoolean(R.bool.isTablet);
					if (tabletSize) { // For TABLETS
						
						switch (position) {
					case BELL:
						Intent bell = new Intent(getSherlockActivity(), BellPage.class);
						startActivity(bell);
			        	break;
					case DIRECTIONS:
						Intent directions = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir//Passaic+County+Technical+Institute,+45+Reinhardt+Rd,+Wayne,+NJ+07470/@40.930604,-74.203272,17z/data=!4m12!1m3!3m2!1s0x89c2fd911a4fc7c7:0xfe17b95cbbdd8c0d!2sPassaic+County+Technical+Institute!4m7!1m0!1m5!1m1!1s0x89c2fd911a4fc7c7:0xfe17b95cbbdd8c0d!2m2!1d-74.203272!2d40.930604"));
						startActivity(directions);
						
			        	break;
					case PCTIWEB:
						Intent pctiweb = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.pcti.tec.nj.us/"));
						startActivity(pctiweb);
			        	break;
					case PS:
						Intent ps = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ps.pcti.tec.nj.us/public/"));
						startActivity(ps);
		        		break;
					case MAP:
						Intent map = new Intent(getSherlockActivity(), Contacts.class);
						startActivity(map);
		        		break;
					case ADMIN:
						Intent admin =  new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.pcti.tec.nj.us/index.php?option=com_content&view=article&id=160&Itemid=474"));
						startActivity(admin);
		        		break;
		        		
						}	
				} else {	// For PHONES
					switch (position) {
					case BELL:
						Intent bell = new Intent(getSherlockActivity(), BellPage.class);
						startActivity(bell);
		        		break;
					case DIRECTIONS:
						Intent directions = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir//Passaic+County+Technical+Institute,+45+Reinhardt+Rd,+Wayne,+NJ+07470/@40.930604,-74.203272,17z/data=!4m12!1m3!3m2!1s0x89c2fd911a4fc7c7:0xfe17b95cbbdd8c0d!2sPassaic+County+Technical+Institute!4m7!1m0!1m5!1m1!1s0x89c2fd911a4fc7c7:0xfe17b95cbbdd8c0d!2m2!1d-74.203272!2d40.930604"));
						startActivity(directions);
		        		break;
					case PCTIWEB:
						Intent pctiweb = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.pcti.tec.nj.us/"));
						startActivity(pctiweb);
		        		break;
					case PS:
						Intent ps = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ps.pcti.tec.nj.us/public/"));
						startActivity(ps);
		        		break;
					case MAP:
						Intent map = new Intent(getSherlockActivity(), Contacts.class);
						startActivity(map);
		        		break;
					case ADMIN:
						Intent admin =  new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.pcti.tec.nj.us/index.php?option=com_content&view=article&id=160&Itemid=474"));
						startActivity(admin);
		        		break;
		        	
		        	
		        		
					}
				}
				}	
			});
			
	}
}