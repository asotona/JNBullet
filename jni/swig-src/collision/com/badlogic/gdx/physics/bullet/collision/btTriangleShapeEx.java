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

public class btTriangleShapeEx extends btTriangleShape {
	private long swigCPtr;
	
	protected btTriangleShapeEx(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btTriangleShapeEx_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btTriangleShapeEx, normally you should not need this constructor it's intended for low-level usage. */
	public btTriangleShapeEx(long cPtr, boolean cMemoryOwn) {
		this("btTriangleShapeEx", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btTriangleShapeEx_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btTriangleShapeEx obj) {
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
				CollisionJNI.delete_btTriangleShapeEx(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btTriangleShapeEx() {
    this(CollisionJNI.new_btTriangleShapeEx__SWIG_0(), true);
  }

  public btTriangleShapeEx(Vector3f p0, Vector3f p1, Vector3f p2) {
    this(CollisionJNI.new_btTriangleShapeEx__SWIG_1(p0, p1, p2), true);
  }

  public btTriangleShapeEx(btTriangleShapeEx other) {
    this(CollisionJNI.new_btTriangleShapeEx__SWIG_2(btTriangleShapeEx.getCPtr(other), other), true);
  }

  public void applyTransform(Matrix4f t) {
    CollisionJNI.btTriangleShapeEx_applyTransform(swigCPtr, this, t);
  }

  public void buildTriPlane(btVector4 plane) {
    CollisionJNI.btTriangleShapeEx_buildTriPlane(swigCPtr, this, btVector4.getCPtr(plane), plane);
  }

  public boolean overlap_test_conservative(btTriangleShapeEx other) {
    return CollisionJNI.btTriangleShapeEx_overlap_test_conservative(swigCPtr, this, btTriangleShapeEx.getCPtr(other), other);
  }

}