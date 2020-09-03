/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Voronoi_diagram_2;
 import CGAL.Kernel.Point_2; import CGAL.Triangulation_2.Regular_triangulation_2_Face_handle; import CGAL.Triangulation_2.Regular_triangulation_2_Vertex_handle; 
public class Power_diagram_2_Vertex_handle {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Power_diagram_2_Vertex_handle(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Power_diagram_2_Vertex_handle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Voronoi_diagram_2JNI.delete_Power_diagram_2_Vertex_handle(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Power_diagram_2_Vertex_handle() {
    this(CGAL_Voronoi_diagram_2JNI.new_Power_diagram_2_Vertex_handle(), true);
  }

  public Power_diagram_2_Halfedge_handle halfedge() {
    return new Power_diagram_2_Halfedge_handle(CGAL_Voronoi_diagram_2JNI.Power_diagram_2_Vertex_handle_halfedge__SWIG_0(swigCPtr, this), true);
  }

  public void halfedge(Power_diagram_2_Halfedge_handle ref) {
    CGAL_Voronoi_diagram_2JNI.Power_diagram_2_Vertex_handle_halfedge__SWIG_1(swigCPtr, this, Power_diagram_2_Halfedge_handle.getCPtr(ref), ref);
  }

  public int degree() {
    return CGAL_Voronoi_diagram_2JNI.Power_diagram_2_Vertex_handle_degree(swigCPtr, this);
  }

  public Point_2 point() {
    return new Point_2(CGAL_Voronoi_diagram_2JNI.Power_diagram_2_Vertex_handle_point__SWIG_0(swigCPtr, this), true);
  }

  public void point(Point_2 ref) {
    CGAL_Voronoi_diagram_2JNI.Power_diagram_2_Vertex_handle_point__SWIG_1(swigCPtr, this, Point_2.getCPtr(ref), ref);
  }

  public Regular_triangulation_2_Face_handle dual() {
    return new Regular_triangulation_2_Face_handle(CGAL_Voronoi_diagram_2JNI.Power_diagram_2_Vertex_handle_dual__SWIG_0(swigCPtr, this), true);
  }

  public void dual(Regular_triangulation_2_Face_handle ref) {
    CGAL_Voronoi_diagram_2JNI.Power_diagram_2_Vertex_handle_dual__SWIG_1(swigCPtr, this, Regular_triangulation_2_Face_handle.getCPtr(ref), ref);
  }

  public Regular_triangulation_2_Vertex_handle site(int c) {
    return new Regular_triangulation_2_Vertex_handle(CGAL_Voronoi_diagram_2JNI.Power_diagram_2_Vertex_handle_site__SWIG_0(swigCPtr, this, c), true);
  }

  public void site(int c, Regular_triangulation_2_Vertex_handle ret) {
    CGAL_Voronoi_diagram_2JNI.Power_diagram_2_Vertex_handle_site__SWIG_1(swigCPtr, this, c, Regular_triangulation_2_Vertex_handle.getCPtr(ret), ret);
  }

  public boolean is_incident_edge(Power_diagram_2_Halfedge_handle c) {
    return CGAL_Voronoi_diagram_2JNI.Power_diagram_2_Vertex_handle_is_incident_edge(swigCPtr, this, Power_diagram_2_Halfedge_handle.getCPtr(c), c);
  }

  public boolean is_incident_face(Power_diagram_2_Face_handle c) {
    return CGAL_Voronoi_diagram_2JNI.Power_diagram_2_Vertex_handle_is_incident_face(swigCPtr, this, Power_diagram_2_Face_handle.getCPtr(c), c);
  }

  public boolean is_valid() {
    return CGAL_Voronoi_diagram_2JNI.Power_diagram_2_Vertex_handle_is_valid(swigCPtr, this);
  }

  public boolean equals(Power_diagram_2_Vertex_handle p) {
    return CGAL_Voronoi_diagram_2JNI.Power_diagram_2_Vertex_handle_equals(swigCPtr, this, Power_diagram_2_Vertex_handle.getCPtr(p), p);
  }

  public boolean not_equals(Power_diagram_2_Vertex_handle p) {
    return CGAL_Voronoi_diagram_2JNI.Power_diagram_2_Vertex_handle_not_equals(swigCPtr, this, Power_diagram_2_Vertex_handle.getCPtr(p), p);
  }

  public int hashCode() {
    return CGAL_Voronoi_diagram_2JNI.Power_diagram_2_Vertex_handle_hashCode(swigCPtr, this);
  }

  public Power_diagram_2_Vertex_handle clone() {
    return new Power_diagram_2_Vertex_handle(CGAL_Voronoi_diagram_2JNI.Power_diagram_2_Vertex_handle_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Power_diagram_2_Vertex_handle other) {
    CGAL_Voronoi_diagram_2JNI.Power_diagram_2_Vertex_handle_clone__SWIG_1(swigCPtr, this, Power_diagram_2_Vertex_handle.getCPtr(other), other);
  }

}