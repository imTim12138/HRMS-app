/*
 * Copyright 2014 Akexorcist
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package app.akexorcist.bluetoothspp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import app.akexorcist.bluetotohspp.library.BluetoothSPP;

public class SimpleActivity extends Activity {
	BluetoothSPP bt;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simple);
	}
	
	public void onDestroy() {
        super.onDestroy();
    }
	
	public void onStart() {
        super.onStart();
    }
	
	public void setup() {
		Button btnSend = (Button)findViewById(R.id.btnSend);
		btnSend.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){

        	}
        });
	}
}
