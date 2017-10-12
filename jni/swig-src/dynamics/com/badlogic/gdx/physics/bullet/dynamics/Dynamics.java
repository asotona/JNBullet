/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import org.terasology.math.geom.Vector3f;
import org.terasology.math.geom.Quat4f;
import org.terasology.math.geom.Matrix3f;
import org.terasology.math.geom.Matrix4f;

public class Dynamics implements DynamicsConstants {

	/** Temporary Vector3f instance, used by native methods that return a Vector3f instance */
	public final static Vector3f staticVector3f = new Vector3f();
	/** Pool of Vector3f, used by native (callback) method for the arguments */
	public final static com.badlogic.gdx.utils.Pool<Vector3f> poolVector3f = new com.badlogic.gdx.utils.Pool<Vector3f>() {
		@Override
		protected Vector3f newObject() {
			return new Vector3f();
		}
	};


	/** Temporary Quat4f instance, used by native methods that return a Quat4f instance */
	public final static Quat4f staticQuat4f = new Quat4f();
	/** Pool of Quat4f, used by native (callback) method for the arguments */
	public final static com.badlogic.gdx.utils.Pool<Quat4f> poolQuat4f = new com.badlogic.gdx.utils.Pool<Quat4f>() {
		@Override
		protected Quat4f newObject() {
			return new Quat4f();
		}
	};


	/** Temporary Matrix3f instance, used by native methods that return a Matrix3f instance */
	public final static Matrix3f staticMatrix3f = new Matrix3f();
	/** Pool of Matrix3f, used by native (callback) method for the arguments */
	public final static com.badlogic.gdx.utils.Pool<Matrix3f> poolMatrix3f = new com.badlogic.gdx.utils.Pool<Matrix3f>() {
		@Override
		protected Matrix3f newObject() {
			return new Matrix3f();
		}
	};


	/** Temporary Matrix4f instance, used by native methods that return a Matrix4f instance */
	public final static Matrix4f staticMatrix4f = new Matrix4f();
	/** Pool of Matrix4f, used by native (callback) method for the arguments */
	public final static com.badlogic.gdx.utils.Pool<Matrix4f> poolMatrix4f = new com.badlogic.gdx.utils.Pool<Matrix4f>() {
		@Override
		protected Matrix4f newObject() {
			return new Matrix4f();
		}
	};

  public static void setGDeactivationTime(float value) {
    DynamicsJNI.gDeactivationTime_set(value);
  }

  public static float getGDeactivationTime() {
    return DynamicsJNI.gDeactivationTime_get();
  }

  public static void setGDisableDeactivation(boolean value) {
    DynamicsJNI.gDisableDeactivation_set(value);
  }

  public static boolean getGDisableDeactivation() {
    return DynamicsJNI.gDisableDeactivation_get();
  }

  public static float btAdjustAngleToLimits(float angleInRadians, float angleLowerLimitInRadians, float angleUpperLimitInRadians) {
    return DynamicsJNI.btAdjustAngleToLimits(angleInRadians, angleLowerLimitInRadians, angleUpperLimitInRadians);
  }

  public static void InternalTickCallback_CB(btDynamicsWorld world, float timeStep) {
    DynamicsJNI.InternalTickCallback_CB(btDynamicsWorld.getCPtr(world), world, timeStep);
  }

  public static float resolveSingleCollision(btRigidBody body1, btCollisionObject colObj2, Vector3f contactPositionWorld, Vector3f contactNormalOnB, btContactSolverInfo solverInfo, float distance) {
    return DynamicsJNI.resolveSingleCollision(btRigidBody.getCPtr(body1), body1, btCollisionObject.getCPtr(colObj2), colObj2, contactPositionWorld, contactNormalOnB, btContactSolverInfo.getCPtr(solverInfo), solverInfo, distance);
  }

  public static void resolveSingleBilateral(btRigidBody body1, Vector3f pos1, btRigidBody body2, Vector3f pos2, float distance, Vector3f normal, SWIGTYPE_p_float impulse, float timeStep) {
    DynamicsJNI.resolveSingleBilateral(btRigidBody.getCPtr(body1), body1, pos1, btRigidBody.getCPtr(body2), body2, pos2, distance, normal, SWIGTYPE_p_float.getCPtr(impulse), timeStep);
  }

}