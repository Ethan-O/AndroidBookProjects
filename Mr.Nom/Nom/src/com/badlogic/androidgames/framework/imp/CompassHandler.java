package com.badlogic.androidgames.framework.imp;

import android.content.Context;
/*
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

public class CompassHandler implements SensorEventListener {
	float accelX;
	float accelY;
	float accelZ;
	
	public CompassHandler(Context context){
		SensorManager manager = (SensorManager) context.
				getSystemService(Context.SENSOR_SERVICE);
		if( manager.getSensorList(Sensor.TYPE_ORIENTATION).size() != 0){
			Sensor accelerometer= manager.getSensorList(
					Sensor.TYPE_ORIENTATION).get(0);
			manager.registerListener(this, ,
					SensorManager.SENSOR_DELAY_GAME);
					
			}
		}
	
	public void onAccuracyChanged(Sensor sensor, int accuracy) {
		// nothing to do here
	}
	
	public void onSensorChanged(SensorEvent event) {
		accelX=event.values[0];
		accelY=event.values[1];
		accelZ=event.values[2];
	}
	
	public float getAccelX() {
		return accelX;
	}
	
	public float getAccelY() {
		return accelY;
	}
	
	public float getAccelZ() {
		return accelZ;
	}
}
*/