/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.AABB_tree;
import CGAL.Kernel.Point_3; import CGAL.Polyhedron_3.Polyhedron_3_Halfedge_handle;
public class Point_and_Polyhedron_3_Halfedge_handle {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Point_and_Polyhedron_3_Halfedge_handle(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Point_and_Polyhedron_3_Halfedge_handle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_AABB_treeJNI.delete_Point_and_Polyhedron_3_Halfedge_handle(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Point_and_Polyhedron_3_Halfedge_handle() {
    this(CGAL_AABB_treeJNI.new_Point_and_Polyhedron_3_Halfedge_handle__SWIG_0(), true);
  }

  public Point_and_Polyhedron_3_Halfedge_handle(Point_3 first, Polyhedron_3_Halfedge_handle second) {
    this(CGAL_AABB_treeJNI.new_Point_and_Polyhedron_3_Halfedge_handle__SWIG_1(Point_3.getCPtr(first), first, Polyhedron_3_Halfedge_handle.getCPtr(second), second), true);
  }

  public Point_and_Polyhedron_3_Halfedge_handle(Point_and_Polyhedron_3_Halfedge_handle p) {
    this(CGAL_AABB_treeJNI.new_Point_and_Polyhedron_3_Halfedge_handle__SWIG_2(Point_and_Polyhedron_3_Halfedge_handle.getCPtr(p), p), true);
  }

  public void setFirst(Point_3 value) {
    CGAL_AABB_treeJNI.Point_and_Polyhedron_3_Halfedge_handle_first_set(swigCPtr, this, Point_3.getCPtr(value), value);
  }

  public Point_3 getFirst() {
    long cPtr = CGAL_AABB_treeJNI.Point_and_Polyhedron_3_Halfedge_handle_first_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Point_3(cPtr, false);
  }

  public void setSecond(Polyhedron_3_Halfedge_handle value) {
    CGAL_AABB_treeJNI.Point_and_Polyhedron_3_Halfedge_handle_second_set(swigCPtr, this, Polyhedron_3_Halfedge_handle.getCPtr(value), value);
  }

  public Polyhedron_3_Halfedge_handle getSecond() {
    long cPtr = CGAL_AABB_treeJNI.Point_and_Polyhedron_3_Halfedge_handle_second_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Polyhedron_3_Halfedge_handle(cPtr, false);
  }

}
