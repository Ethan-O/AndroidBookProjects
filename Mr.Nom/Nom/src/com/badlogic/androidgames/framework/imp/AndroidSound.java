package com.badlogic.androidgames.framework.imp;

import android.media.SoundPool;

import com.badlogic.androidgames.framework.Sound;

public class AndroidSound implements Sound{
	int soundId;
	SoundPool soundPool;
	
	public AndroidSound(SoundPool soundPool,int soundID){
		this.soundId=soundId;
		this.soundPool=soundPool;
	}
	
	
	public void play(float volume){
		soundPool.play(soundId, volume, volume, 0, 0, 1);
	}
	
	public void dispose() {
		soundPool.unload(soundId);
	}
}
