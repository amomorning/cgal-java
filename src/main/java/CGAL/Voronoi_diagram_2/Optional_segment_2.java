/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Voronoi_diagram_2;
 import CGAL.Kernel.Segment_2; 
public class Optional_segment_2 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Optional_segment_2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Optional_segment_2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Voronoi_diagram_2JNI.delete_Optional_segment_2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Optional_segment_2() {
    this(CGAL_Voronoi_diagram_2JNI.new_Optional_segment_2(), true);
  }

  public boolean empty() {
    return CGAL_Voronoi_diagram_2JNI.Optional_segment_2_empty(swigCPtr, this);
  }

  public Segment_2 value() {
    return new Segment_2(CGAL_Voronoi_diagram_2JNI.Optional_segment_2_value(swigCPtr, this), false);
  }

  public Optional_segment_2 clone() {
    return new Optional_segment_2(CGAL_Voronoi_diagram_2JNI.Optional_segment_2_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Optional_segment_2 other) {
    CGAL_Voronoi_diagram_2JNI.Optional_segment_2_clone__SWIG_1(swigCPtr, this, Optional_segment_2.getCPtr(other), other);
  }

}
