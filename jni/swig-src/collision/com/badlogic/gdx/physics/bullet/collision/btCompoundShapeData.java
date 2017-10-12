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

public class btCompoundShapeData extends BulletBase {
	private long swigCPtr;
	
	protected btCompoundShapeData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btCompoundShapeData, normally you should not need this constructor it's intended for low-level usage. */ 
	public btCompoundShapeData(long cPtr, boolean cMemoryOwn) {
		this("btCompoundShapeData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btCompoundShapeData obj) {
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
				CollisionJNI.delete_btCompoundShapeData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setCollisionShapeData(btCollisionShapeData value) {
    CollisionJNI.btCompoundShapeData_collisionShapeData_set(swigCPtr, this, btCollisionShapeData.getCPtr(value), value);
  }

  public btCollisionShapeData getCollisionShapeData() {
    long cPtr = CollisionJNI.btCompoundShapeData_collisionShapeData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btCollisionShapeData(cPtr, false);
  }

  public void setChildShapePtr(btCompoundShapeChildData value) {
    CollisionJNI.btCompoundShapeData_childShapePtr_set(swigCPtr, this, btCompoundShapeChildData.getCPtr(value), value);
  }

  public btCompoundShapeChildData getChildShapePtr() {
    long cPtr = CollisionJNI.btCompoundShapeData_childShapePtr_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btCompoundShapeChildData(cPtr, false);
  }

  public void setNumChildShapes(int value) {
    CollisionJNI.btCompoundShapeData_numChildShapes_set(swigCPtr, this, value);
  }

  public int getNumChildShapes() {
    return CollisionJNI.btCompoundShapeData_numChildShapes_get(swigCPtr, this);
  }

  public void setCollisionMargin(float value) {
    CollisionJNI.btCompoundShapeData_collisionMargin_set(swigCPtr, this, value);
  }

  public float getCollisionMargin() {
    return CollisionJNI.btCompoundShapeData_collisionMargin_get(swigCPtr, this);
  }

  public btCompoundShapeData() {
    this(CollisionJNI.new_btCompoundShapeData(), true);
  }

}