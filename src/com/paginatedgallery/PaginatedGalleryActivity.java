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
import android.os.Bundle;

public class PaginatedGalleryActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.main);
        
        /*List<Drawable> list = new ArrayList<Drawable>();
		
		for ( int i = 0 ; i < 10 ; i ++ ) {
			list.add(getResources().getDrawable(R.drawable.ic_launcher));
		}*/
		
		List<String> list = new ArrayList<String>();

		for ( int i = 0 ; i < 10 ; i ++ ) {
			list.add("http://www.gravatar.com/avatar/fc63e1912648ed92e560144b1152dc61?s=128&d=identicon&r=PG");
		}
		
		
		PaginatedGalleryAdapter adapter = new PaginatedGalleryAdapter(this, list, 4, getResources().getDrawable(R.drawable.ic_launcher));
        
//        PaginatedGallery gallery = new PaginatedGallery(this);
		PaginatedGallery gallery = (PaginatedGallery) findViewById(R.id.paginatedGallery);
        gallery.setAdapter(adapter);
//        gallery.setLayoutParams(new ViewGroup.LayoutParams(android.view.ViewGroup.LayoutParams.WRAP_CONTENT, android.view.ViewGroup.LayoutParams.WRAP_CONTENT));
        
        
        
    }
}
