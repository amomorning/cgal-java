/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Alpha_shape_2;

public class Face_Interval_3 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Face_Interval_3(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Face_Interval_3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Alpha_shape_2JNI.delete_Face_Interval_3(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFirst(double value) {
    CGAL_Alpha_shape_2JNI.Face_Interval_3_first_set(swigCPtr, this, value);
  }

  public double getFirst() {
    return CGAL_Alpha_shape_2JNI.Face_Interval_3_first_get(swigCPtr, this);
  }

  public void setSecond(double value) {
    CGAL_Alpha_shape_2JNI.Face_Interval_3_second_set(swigCPtr, this, value);
  }

  public double getSecond() {
    return CGAL_Alpha_shape_2JNI.Face_Interval_3_second_get(swigCPtr, this);
  }

  public void setThird(double value) {
    CGAL_Alpha_shape_2JNI.Face_Interval_3_third_set(swigCPtr, this, value);
  }

  public double getThird() {
    return CGAL_Alpha_shape_2JNI.Face_Interval_3_third_get(swigCPtr, this);
  }

  public Face_Interval_3() {
    this(CGAL_Alpha_shape_2JNI.new_Face_Interval_3__SWIG_0(), true);
  }

  public Face_Interval_3(double a, double b, double c) {
    this(CGAL_Alpha_shape_2JNI.new_Face_Interval_3__SWIG_1(a, b, c), true);
  }

  public Face_Interval_3 clone() {
    return new Face_Interval_3(CGAL_Alpha_shape_2JNI.Face_Interval_3_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Face_Interval_3 other) {
    CGAL_Alpha_shape_2JNI.Face_Interval_3_clone__SWIG_1(swigCPtr, this, Face_Interval_3.getCPtr(other), other);
  }

}
