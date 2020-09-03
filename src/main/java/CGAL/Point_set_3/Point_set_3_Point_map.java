/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Point_set_3;
import CGAL.Kernel.Point_3; import CGAL.Kernel.Vector_3; 
public class Point_set_3_Point_map {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Point_set_3_Point_map(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Point_set_3_Point_map obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Point_set_3JNI.delete_Point_set_3_Point_map(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Point_set_3_Point_map() {
    this(CGAL_Point_set_3JNI.new_Point_set_3_Point_map(), true);
  }

  public Point_3 get(int idx) {
    return new Point_3(CGAL_Point_set_3JNI.Point_set_3_Point_map_get(swigCPtr, this, idx), true);
  }

  public void set(int idx, Point_3 t) {
    CGAL_Point_set_3JNI.Point_set_3_Point_map_set(swigCPtr, this, idx, Point_3.getCPtr(t), t);
  }

  public boolean is_valid() {
    return CGAL_Point_set_3JNI.Point_set_3_Point_map_is_valid(swigCPtr, this);
  }

  public Point_set_3_Point_map clone() {
    return new Point_set_3_Point_map(CGAL_Point_set_3JNI.Point_set_3_Point_map_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Point_set_3_Point_map other) {
    CGAL_Point_set_3JNI.Point_set_3_Point_map_clone__SWIG_1(swigCPtr, this, Point_set_3_Point_map.getCPtr(other), other);
  }

}