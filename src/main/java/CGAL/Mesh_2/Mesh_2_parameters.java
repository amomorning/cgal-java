/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Mesh_2;
import CGAL.Kernel.Point_2; import java.util.Iterator;
public class Mesh_2_parameters {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Mesh_2_parameters(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Mesh_2_parameters obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Mesh_2JNI.delete_Mesh_2_parameters(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Mesh_2_parameters() {
    this(CGAL_Mesh_2JNI.new_Mesh_2_parameters(), true);
  }

  public void set_time_limit(double limit) {
    CGAL_Mesh_2JNI.Mesh_2_parameters_set_time_limit(swigCPtr, this, limit);
  }

  public void set_max_iteration_number(int mi) {
    CGAL_Mesh_2JNI.Mesh_2_parameters_set_max_iteration_number(swigCPtr, this, mi);
  }

  public void set_convergence(double c) {
    CGAL_Mesh_2JNI.Mesh_2_parameters_set_convergence(swigCPtr, this, c);
  }

  public void set_freeze_bound(double b) {
    CGAL_Mesh_2JNI.Mesh_2_parameters_set_freeze_bound(swigCPtr, this, b);
  }

  public void set_seeds(Iterator<Point_2> r) {
    CGAL_Mesh_2JNI.Mesh_2_parameters_set_seeds(swigCPtr, this, r);
  }

  public void set_mark(boolean m) {
    CGAL_Mesh_2JNI.Mesh_2_parameters_set_mark(swigCPtr, this, m);
  }

  public Mesh_2_parameters clone() {
    return new Mesh_2_parameters(CGAL_Mesh_2JNI.Mesh_2_parameters_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Mesh_2_parameters other) {
    CGAL_Mesh_2JNI.Mesh_2_parameters_clone__SWIG_1(swigCPtr, this, Mesh_2_parameters.getCPtr(other), other);
  }

}
