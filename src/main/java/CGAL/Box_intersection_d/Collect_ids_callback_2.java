/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Box_intersection_d;
import java.util.Iterator;
public class Collect_ids_callback_2 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Collect_ids_callback_2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Collect_ids_callback_2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Box_intersection_dJNI.delete_Collect_ids_callback_2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Ids_iterator ids() {
    return new Ids_iterator(CGAL_Box_intersection_dJNI.Collect_ids_callback_2_ids(swigCPtr, this), true);
  }

  public Collect_ids_callback_2() {
    this(CGAL_Box_intersection_dJNI.new_Collect_ids_callback_2(), true);
  }

}
