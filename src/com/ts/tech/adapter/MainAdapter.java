package com.ts.tech.adapter;

import java.util.List;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ts.tech.R;


public class MainAdapter extends BaseAdapter{
	
	public static final int BELL = 0;
	public static final int DIRECTIONS = 1;
	public static final int PCTIWEB = 2;
	public static final int PS = 3;
	public static final int MAP = 4;
	public static final int ADMIN = 5;
	
	private Context context;
	private List<AdapterItem> gridItem;

	public MainAdapter(Context context, List<AdapterItem> gridItem) {
		this.gridItem = gridItem;
		this.context = context;
	}

	public View getView(int position, View v, ViewGroup parent) {
		ViewHolder holder;
		AdapterItem entry = gridItem.get(position);
		
		if (v == null) {
			LayoutInflater inflater = (LayoutInflater) context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

			v = inflater.inflate(R.layout.gridview_layout, null);
			
			holder = new ViewHolder();
			holder.title = (TextView) v.findViewById(R.id.title);
			holder.text = (TextView) v.findViewById(R.id.description);
			holder.icon_Image = (ImageView) v.findViewById(R.id.list_image);
			
			v.setTag(holder);
		}
		else {
			holder = (ViewHolder) v.getTag();
		}
			holder.title.setText(entry.getTitle());

			Typeface tfTitle = Typeface.createFromAsset(context.getAssets(),"themefont.ttf");
			Typeface tfDescription = Typeface.createFromAsset(context.getAssets(),"themefont.ttf");
			holder.title.setTypeface(tfTitle);
			holder.text.setTypeface(tfDescription);
			
			switch(entry.getID()){
			case BELL:
				holder.title.setTextColor(context.getResources().getColor(R.color.list_title_color));
				holder.text.setTextColor(context.getResources().getColor(R.color.list_desc_color));
				holder.icon_Image.setImageResource(R.drawable.icon_launcher);
				break;
			case DIRECTIONS:
				holder.title.setTextColor(context.getResources().getColor(R.color.list_title_color));
				holder.text.setTextColor(context.getResources().getColor(R.color.list_desc_color));
				holder.icon_Image.setImageResource(R.drawable.icon_wall);
				break;
			case PCTIWEB:
				holder.title.setTextColor(context.getResources().getColor(R.color.list_title_color));
				holder.text.setTextColor(context.getResources().getColor(R.color.list_desc_color));
				holder.icon_Image.setImageResource(R.drawable.icon_request);
				break;
			case PS:
				holder.title.setTextColor(context.getResources().getColor(R.color.list_title_color));
				holder.text.setTextColor(context.getResources().getColor(R.color.list_desc_color));
				holder.icon_Image.setImageResource(R.drawable.ps);
				break;
			case MAP:
				holder.title.setTextColor(context.getResources().getColor(R.color.list_title_color));
				holder.text.setTextColor(context.getResources().getColor(R.color.list_desc_color));
				holder.icon_Image.setImageResource(R.drawable.icon_info);
				break;
			case ADMIN:
				holder.title.setTextColor(context.getResources().getColor(R.color.list_title_color));
				holder.text.setTextColor(context.getResources().getColor(R.color.list_desc_color));
				holder.icon_Image.setImageResource(R.drawable.icon_anne);
				break;
			}
			holder.text.setText(entry.getDescription());
			holder.title.setText(entry.getTitle());
			
		return v;
	}

	@Override
	public int getCount() {
		return gridItem.size();
	}

	@Override
	public Object getItem(int position) {
		return gridItem.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}
	
	public static class ViewHolder {
		public TextView title;
		public TextView text;
		public ImageView icon_Image;
	}
	
	public static class AdapterItem{
		String Title;
		String Description;
		int ID;
		
		public AdapterItem(String Title, String Description, int ID) {
			this.Title = Title;
			this.Description = Description;
			this.ID = ID;
		}
		
		public String getTitle() {
			return Title;
		}
		
		public String getDescription() {
			return Description;
		}
		
		public int getID() {
			return ID;
		}
	}
}