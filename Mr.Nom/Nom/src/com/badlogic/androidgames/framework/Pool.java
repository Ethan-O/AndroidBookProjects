package com.badlogic.androidgames.framework;

import java.util.ArrayList;
import java.util.List;

public class Pool<T> {

	public interface PoolObjectFactory<T> {
		public T createObject();
	}
}
