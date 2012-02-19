/*******************************************************************************
 * Copyright 2012 Saad Farooq
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.paginatedgallery;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public class PaginatedGalleryActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
//        setContentView(R.layout.main);
        
        LinearLayout layout = new LinearLayout(this);
		layout.setOrientation(LinearLayout.VERTICAL);
		layout.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
//		layout.setBackgroundColor(android.R.color.white);	

	       LinearLayout frame = new LinearLayout(this);
	        frame.setBackgroundColor(android.R.color.white);
	        frame.setBackgroundResource(R.drawable.ic_launcher);
//	        frame.setBackgroundDrawable(getResources().getDrawable(R.drawable.ic_launcher));
	        frame.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, 200));
	        layout.addView(frame);
		
		List<Drawable> list = new ArrayList<Drawable>();
		
		for ( int i = 0 ; i < 10 ; i ++ ) {
			list.add(getResources().getDrawable(R.drawable.ic_launcher));
		}
		
		PaginatedGalleryAdapter adapter = new PaginatedGalleryAdapter(this, list, 3);
        
        PaginatedGallery gallery = new PaginatedGallery(this);
//		PaginatedGallery gallery = (PaginatedGallery) findViewById(R.id.paginatedGallery);
        gallery.setAdapter(adapter);
        gallery.setLayoutParams(new ViewGroup.LayoutParams(android.view.ViewGroup.LayoutParams.WRAP_CONTENT, android.view.ViewGroup.LayoutParams.WRAP_CONTENT));
        
        
        TextView tv = new TextView(this);
        tv.setText("testing");
        tv.setTextColor(android.R.color.white);
        tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        
        ImageView image = new ImageView(this);
        image.setImageDrawable(getResources().getDrawable(R.drawable.ic_launcher));
        image.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
//        ((ViewGroup)findViewById(android.R.id.content).getRootView()).addView(tv);
//        ((ViewGroup)findViewById(android.R.id.content).getRootView()).addView(gallery);
        
        layout.addView(tv);
        layout.addView(image);
        layout.addView(gallery);
        setContentView(layout);
        
        
    }
}
