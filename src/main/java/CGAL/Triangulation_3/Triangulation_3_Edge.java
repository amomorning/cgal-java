/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Triangulation_3;

public class Triangulation_3_Edge {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Triangulation_3_Edge(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Triangulation_3_Edge obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Triangulation_3JNI.delete_Triangulation_3_Edge(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFirst(Triangulation_3_Cell_handle value) {
    CGAL_Triangulation_3JNI.Triangulation_3_Edge_first_set(swigCPtr, this, Triangulation_3_Cell_handle.getCPtr(value), value);
  }

  public Triangulation_3_Cell_handle getFirst() {
    long cPtr = CGAL_Triangulation_3JNI.Triangulation_3_Edge_first_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Triangulation_3_Cell_handle(cPtr, false);
  }

  public void setSecond(int value) {
    CGAL_Triangulation_3JNI.Triangulation_3_Edge_second_set(swigCPtr, this, value);
  }

  public int getSecond() {
    return CGAL_Triangulation_3JNI.Triangulation_3_Edge_second_get(swigCPtr, this);
  }

  public void setThird(int value) {
    CGAL_Triangulation_3JNI.Triangulation_3_Edge_third_set(swigCPtr, this, value);
  }

  public int getThird() {
    return CGAL_Triangulation_3JNI.Triangulation_3_Edge_third_get(swigCPtr, this);
  }

  public Triangulation_3_Edge() {
    this(CGAL_Triangulation_3JNI.new_Triangulation_3_Edge__SWIG_0(), true);
  }

  public Triangulation_3_Edge(Triangulation_3_Cell_handle a, int b, int c) {
    this(CGAL_Triangulation_3JNI.new_Triangulation_3_Edge__SWIG_1(Triangulation_3_Cell_handle.getCPtr(a), a, b, c), true);
  }

  public Triangulation_3_Edge clone() {
    return new Triangulation_3_Edge(CGAL_Triangulation_3JNI.Triangulation_3_Edge_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Triangulation_3_Edge other) {
    CGAL_Triangulation_3JNI.Triangulation_3_Edge_clone__SWIG_1(swigCPtr, this, Triangulation_3_Edge.getCPtr(other), other);
  }

}
