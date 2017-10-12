/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.softbody;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.physics.bullet.dynamics.*;
import org.terasology.math.geom.Vector3f;
import org.terasology.math.geom.Quat4f;
import org.terasology.math.geom.Matrix3f;
import org.terasology.math.geom.Matrix4f;

public class btSoftBodySolverOutput extends BulletBase {
	private long swigCPtr;
	
	protected btSoftBodySolverOutput(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btSoftBodySolverOutput, normally you should not need this constructor it's intended for low-level usage. */ 
	public btSoftBodySolverOutput(long cPtr, boolean cMemoryOwn) {
		this("btSoftBodySolverOutput", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btSoftBodySolverOutput obj) {
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
				SoftbodyJNI.delete_btSoftBodySolverOutput(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void copySoftBodyToVertexBuffer(btSoftBody softBody, btVertexBufferDescriptor vertexBuffer) {
    SoftbodyJNI.btSoftBodySolverOutput_copySoftBodyToVertexBuffer(swigCPtr, this, btSoftBody.getCPtr(softBody), softBody, btVertexBufferDescriptor.getCPtr(vertexBuffer), vertexBuffer);
  }

}