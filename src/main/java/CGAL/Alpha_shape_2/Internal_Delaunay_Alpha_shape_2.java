/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Alpha_shape_2;
import CGAL.Kernel.Point_2; import java.util.Iterator; import java.util.Collection;
public class Internal_Delaunay_Alpha_shape_2 extends Internal_Triangulation_2_Internal_Delaunay_Alpha_shape_2 {
  private transient long swigCPtr;

  public Internal_Delaunay_Alpha_shape_2(long cPtr, boolean cMemoryOwn) {
    super(CGAL_Alpha_shape_2JNI.Internal_Delaunay_Alpha_shape_2_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Internal_Delaunay_Alpha_shape_2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Alpha_shape_2JNI.delete_Internal_Delaunay_Alpha_shape_2(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Internal_Delaunay_Alpha_shape_2() {
    this(CGAL_Alpha_shape_2JNI.new_Internal_Delaunay_Alpha_shape_2(), true);
  }

  public Alpha_shape_2_Vertex_handle move_if_no_collision(Alpha_shape_2_Vertex_handle c1, Point_2 c2) {
    return new Alpha_shape_2_Vertex_handle(CGAL_Alpha_shape_2JNI.Internal_Delaunay_Alpha_shape_2_move_if_no_collision__SWIG_0(swigCPtr, this, Alpha_shape_2_Vertex_handle.getCPtr(c1), c1, Point_2.getCPtr(c2), c2), true);
  }

  public void move_if_no_collision(Alpha_shape_2_Vertex_handle c1, Point_2 c2, Alpha_shape_2_Vertex_handle ret) {
    CGAL_Alpha_shape_2JNI.Internal_Delaunay_Alpha_shape_2_move_if_no_collision__SWIG_1(swigCPtr, this, Alpha_shape_2_Vertex_handle.getCPtr(c1), c1, Point_2.getCPtr(c2), c2, Alpha_shape_2_Vertex_handle.getCPtr(ret), ret);
  }

  public Alpha_shape_2_Vertex_handle move(Alpha_shape_2_Vertex_handle c1, Point_2 c2) {
    return new Alpha_shape_2_Vertex_handle(CGAL_Alpha_shape_2JNI.Internal_Delaunay_Alpha_shape_2_move__SWIG_0(swigCPtr, this, Alpha_shape_2_Vertex_handle.getCPtr(c1), c1, Point_2.getCPtr(c2), c2), true);
  }

  public void move(Alpha_shape_2_Vertex_handle c1, Point_2 c2, Alpha_shape_2_Vertex_handle ret) {
    CGAL_Alpha_shape_2JNI.Internal_Delaunay_Alpha_shape_2_move__SWIG_1(swigCPtr, this, Alpha_shape_2_Vertex_handle.getCPtr(c1), c1, Point_2.getCPtr(c2), c2, Alpha_shape_2_Vertex_handle.getCPtr(ret), ret);
  }

  public Alpha_shape_2_Vertex_handle nearest_vertex(Point_2 c1, Alpha_shape_2_Face_handle c2) {
    return new Alpha_shape_2_Vertex_handle(CGAL_Alpha_shape_2JNI.Internal_Delaunay_Alpha_shape_2_nearest_vertex__SWIG_0(swigCPtr, this, Point_2.getCPtr(c1), c1, Alpha_shape_2_Face_handle.getCPtr(c2), c2), true);
  }

  public void nearest_vertex(Point_2 c1, Alpha_shape_2_Face_handle c2, Alpha_shape_2_Vertex_handle ret) {
    CGAL_Alpha_shape_2JNI.Internal_Delaunay_Alpha_shape_2_nearest_vertex__SWIG_1(swigCPtr, this, Point_2.getCPtr(c1), c1, Alpha_shape_2_Face_handle.getCPtr(c2), c2, Alpha_shape_2_Vertex_handle.getCPtr(ret), ret);
  }

  public Alpha_shape_2_Vertex_handle nearest_vertex(Point_2 c) {
    return new Alpha_shape_2_Vertex_handle(CGAL_Alpha_shape_2JNI.Internal_Delaunay_Alpha_shape_2_nearest_vertex__SWIG_2(swigCPtr, this, Point_2.getCPtr(c), c), true);
  }

  public void nearest_vertex(Point_2 c, Alpha_shape_2_Vertex_handle ret) {
    CGAL_Alpha_shape_2JNI.Internal_Delaunay_Alpha_shape_2_nearest_vertex__SWIG_3(swigCPtr, this, Point_2.getCPtr(c), c, Alpha_shape_2_Vertex_handle.getCPtr(ret), ret);
  }

  public void get_conflicts_and_boundary(Point_2 p, Collection<Alpha_shape_2_Face_handle> fout, Collection<Alpha_shape_2_Edge> eout, Alpha_shape_2_Face_handle start) {
    CGAL_Alpha_shape_2JNI.Internal_Delaunay_Alpha_shape_2_get_conflicts_and_boundary(swigCPtr, this, Point_2.getCPtr(p), p, fout, eout, Alpha_shape_2_Face_handle.getCPtr(start), start);
  }

  public void get_conflicts(Point_2 p, Collection<Alpha_shape_2_Face_handle> fout, Alpha_shape_2_Face_handle start) {
    CGAL_Alpha_shape_2JNI.Internal_Delaunay_Alpha_shape_2_get_conflicts(swigCPtr, this, Point_2.getCPtr(p), p, fout, Alpha_shape_2_Face_handle.getCPtr(start), start);
  }

  public void get_boundary_of_conflicts(Point_2 p, Collection<Alpha_shape_2_Edge> out, Alpha_shape_2_Face_handle start) {
    CGAL_Alpha_shape_2JNI.Internal_Delaunay_Alpha_shape_2_get_boundary_of_conflicts(swigCPtr, this, Point_2.getCPtr(p), p, out, Alpha_shape_2_Face_handle.getCPtr(start), start);
  }

  public Point_2 dual(Alpha_shape_2_Face_handle c) {
    return new Point_2(CGAL_Alpha_shape_2JNI.Internal_Delaunay_Alpha_shape_2_dual__SWIG_0(swigCPtr, this, Alpha_shape_2_Face_handle.getCPtr(c), c), true);
  }

  public void dual(Alpha_shape_2_Face_handle c, Point_2 ret) {
    CGAL_Alpha_shape_2JNI.Internal_Delaunay_Alpha_shape_2_dual__SWIG_1(swigCPtr, this, Alpha_shape_2_Face_handle.getCPtr(c), c, Point_2.getCPtr(ret), ret);
  }

  public Object dual(Alpha_shape_2_Edge c) {
    return new Object(CGAL_Alpha_shape_2JNI.Internal_Delaunay_Alpha_shape_2_dual__SWIG_2(swigCPtr, this, Alpha_shape_2_Edge.getCPtr(c), c), true);
  }

  public void dual(Alpha_shape_2_Edge c, Object ret) {
    CGAL_Alpha_shape_2JNI.Internal_Delaunay_Alpha_shape_2_dual__SWIG_3(swigCPtr, this, Alpha_shape_2_Edge.getCPtr(c), c, Object.getCPtr(ret), ret);
  }

}
