/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import org.terasology.math.geom.Vector3f;
import org.terasology.math.geom.Quat4f;
import org.terasology.math.geom.Matrix3f;
import org.terasology.math.geom.Matrix4f;

public class btOverlappingPairCache extends btOverlappingPairCallback {
	private long swigCPtr;
	
	protected btOverlappingPairCache(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btOverlappingPairCache_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btOverlappingPairCache, normally you should not need this constructor it's intended for low-level usage. */
	public btOverlappingPairCache(long cPtr, boolean cMemoryOwn) {
		this("btOverlappingPairCache", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btOverlappingPairCache_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btOverlappingPairCache obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_btOverlappingPairCache(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btBroadphasePair getOverlappingPairArrayPtr() {
	return btBroadphasePair.internalTemp(CollisionJNI.btOverlappingPairCache_getOverlappingPairArrayPtr__SWIG_0(swigCPtr, this), false);
}

  public btBroadphasePairArray getOverlappingPairArray() {
    return new btBroadphasePairArray(CollisionJNI.btOverlappingPairCache_getOverlappingPairArray(swigCPtr, this), false);
  }

  public void cleanOverlappingPair(btBroadphasePair pair, btDispatcher dispatcher) {
    CollisionJNI.btOverlappingPairCache_cleanOverlappingPair(swigCPtr, this, pair, btDispatcher.getCPtr(dispatcher), dispatcher);
  }

  public int getNumOverlappingPairs() {
    return CollisionJNI.btOverlappingPairCache_getNumOverlappingPairs(swigCPtr, this);
  }

  public void cleanProxyFromPairs(btBroadphaseProxy proxy, btDispatcher dispatcher) {
    CollisionJNI.btOverlappingPairCache_cleanProxyFromPairs(swigCPtr, this, btBroadphaseProxy.getCPtr(proxy), proxy, btDispatcher.getCPtr(dispatcher), dispatcher);
  }

  public void setOverlapFilterCallback(btOverlapFilterCallback callback) {
    CollisionJNI.btOverlappingPairCache_setOverlapFilterCallback(swigCPtr, this, btOverlapFilterCallback.getCPtr(callback), callback);
  }

  public void processAllOverlappingPairs(btOverlapCallback arg0, btDispatcher dispatcher) {
    CollisionJNI.btOverlappingPairCache_processAllOverlappingPairs(swigCPtr, this, btOverlapCallback.getCPtr(arg0), arg0, btDispatcher.getCPtr(dispatcher), dispatcher);
  }

  public btBroadphasePair findPair(btBroadphaseProxy proxy0, btBroadphaseProxy proxy1) {
	return btBroadphasePair.internalTemp(CollisionJNI.btOverlappingPairCache_findPair(swigCPtr, this, btBroadphaseProxy.getCPtr(proxy0), proxy0, btBroadphaseProxy.getCPtr(proxy1), proxy1), false);
}

  public boolean hasDeferredRemoval() {
    return CollisionJNI.btOverlappingPairCache_hasDeferredRemoval(swigCPtr, this);
  }

  public void setInternalGhostPairCallback(btOverlappingPairCallback ghostPairCallback) {
    CollisionJNI.btOverlappingPairCache_setInternalGhostPairCallback(swigCPtr, this, btOverlappingPairCallback.getCPtr(ghostPairCallback), ghostPairCallback);
  }

  public void sortOverlappingPairs(btDispatcher dispatcher) {
    CollisionJNI.btOverlappingPairCache_sortOverlappingPairs(swigCPtr, this, btDispatcher.getCPtr(dispatcher), dispatcher);
  }

}