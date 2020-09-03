/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Box_intersection_d;
import CGAL.Kernel.Bbox_3;
public class Box_with_id_3 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Box_with_id_3(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Box_with_id_3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Box_intersection_dJNI.delete_Box_with_id_3(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Box_with_id_3(Bbox_3 bbox, int id) {
    this(CGAL_Box_intersection_dJNI.new_Box_with_id_3(Bbox_3.getCPtr(bbox), bbox, id), true);
  }

}