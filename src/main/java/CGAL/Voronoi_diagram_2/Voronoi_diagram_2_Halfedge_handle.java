/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Voronoi_diagram_2;
 import CGAL.Triangulation_2.Delaunay_triangulation_2_Edge; import CGAL.Triangulation_2.Delaunay_triangulation_2_Vertex_handle; 
public class Voronoi_diagram_2_Halfedge_handle {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Voronoi_diagram_2_Halfedge_handle(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Voronoi_diagram_2_Halfedge_handle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Voronoi_diagram_2JNI.delete_Voronoi_diagram_2_Halfedge_handle(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Voronoi_diagram_2_Halfedge_handle() {
    this(CGAL_Voronoi_diagram_2JNI.new_Voronoi_diagram_2_Halfedge_handle(), true);
  }

  public Voronoi_diagram_2_Halfedge_handle twin() {
    return new Voronoi_diagram_2_Halfedge_handle(CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_twin__SWIG_0(swigCPtr, this), true);
  }

  public void twin(Voronoi_diagram_2_Halfedge_handle ref) {
    CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_twin__SWIG_1(swigCPtr, this, Voronoi_diagram_2_Halfedge_handle.getCPtr(ref), ref);
  }

  public Voronoi_diagram_2_Halfedge_handle opposite() {
    return new Voronoi_diagram_2_Halfedge_handle(CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_opposite__SWIG_0(swigCPtr, this), true);
  }

  public void opposite(Voronoi_diagram_2_Halfedge_handle ref) {
    CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_opposite__SWIG_1(swigCPtr, this, Voronoi_diagram_2_Halfedge_handle.getCPtr(ref), ref);
  }

  public Voronoi_diagram_2_Halfedge_handle next() {
    return new Voronoi_diagram_2_Halfedge_handle(CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_next__SWIG_0(swigCPtr, this), true);
  }

  public void next(Voronoi_diagram_2_Halfedge_handle ref) {
    CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_next__SWIG_1(swigCPtr, this, Voronoi_diagram_2_Halfedge_handle.getCPtr(ref), ref);
  }

  public Voronoi_diagram_2_Halfedge_handle previous() {
    return new Voronoi_diagram_2_Halfedge_handle(CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_previous__SWIG_0(swigCPtr, this), true);
  }

  public void previous(Voronoi_diagram_2_Halfedge_handle ref) {
    CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_previous__SWIG_1(swigCPtr, this, Voronoi_diagram_2_Halfedge_handle.getCPtr(ref), ref);
  }

  public Voronoi_diagram_2_Face_handle face() {
    return new Voronoi_diagram_2_Face_handle(CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_face__SWIG_0(swigCPtr, this), true);
  }

  public void face(Voronoi_diagram_2_Face_handle ref) {
    CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_face__SWIG_1(swigCPtr, this, Voronoi_diagram_2_Face_handle.getCPtr(ref), ref);
  }

  public Voronoi_diagram_2_Vertex_handle source() {
    return new Voronoi_diagram_2_Vertex_handle(CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_source__SWIG_0(swigCPtr, this), true);
  }

  public void source(Voronoi_diagram_2_Vertex_handle ref) {
    CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_source__SWIG_1(swigCPtr, this, Voronoi_diagram_2_Vertex_handle.getCPtr(ref), ref);
  }

  public Voronoi_diagram_2_Vertex_handle target() {
    return new Voronoi_diagram_2_Vertex_handle(CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_target__SWIG_0(swigCPtr, this), true);
  }

  public void target(Voronoi_diagram_2_Vertex_handle ref) {
    CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_target__SWIG_1(swigCPtr, this, Voronoi_diagram_2_Vertex_handle.getCPtr(ref), ref);
  }

  public Voronoi_diagram_2_Ccb_halfedge_circulator ccb() {
    return new Voronoi_diagram_2_Ccb_halfedge_circulator(CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_ccb__SWIG_0(swigCPtr, this), true);
  }

  public void ccb(Voronoi_diagram_2_Ccb_halfedge_circulator ref) {
    CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_ccb__SWIG_1(swigCPtr, this, Voronoi_diagram_2_Ccb_halfedge_circulator.getCPtr(ref), ref);
  }

  public Delaunay_triangulation_2_Edge dual() {
    return new Delaunay_triangulation_2_Edge(CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_dual__SWIG_0(swigCPtr, this), true);
  }

  public void dual(Delaunay_triangulation_2_Edge ref) {
    CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_dual__SWIG_1(swigCPtr, this, Delaunay_triangulation_2_Edge.getCPtr(ref), ref);
  }

  public Delaunay_triangulation_2_Vertex_handle up() {
    return new Delaunay_triangulation_2_Vertex_handle(CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_up__SWIG_0(swigCPtr, this), true);
  }

  public void up(Delaunay_triangulation_2_Vertex_handle ref) {
    CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_up__SWIG_1(swigCPtr, this, Delaunay_triangulation_2_Vertex_handle.getCPtr(ref), ref);
  }

  public Delaunay_triangulation_2_Vertex_handle down() {
    return new Delaunay_triangulation_2_Vertex_handle(CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_down__SWIG_0(swigCPtr, this), true);
  }

  public void down(Delaunay_triangulation_2_Vertex_handle ref) {
    CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_down__SWIG_1(swigCPtr, this, Delaunay_triangulation_2_Vertex_handle.getCPtr(ref), ref);
  }

  public Delaunay_triangulation_2_Vertex_handle left() {
    return new Delaunay_triangulation_2_Vertex_handle(CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_left__SWIG_0(swigCPtr, this), true);
  }

  public void left(Delaunay_triangulation_2_Vertex_handle ref) {
    CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_left__SWIG_1(swigCPtr, this, Delaunay_triangulation_2_Vertex_handle.getCPtr(ref), ref);
  }

  public Delaunay_triangulation_2_Vertex_handle right() {
    return new Delaunay_triangulation_2_Vertex_handle(CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_right__SWIG_0(swigCPtr, this), true);
  }

  public void right(Delaunay_triangulation_2_Vertex_handle ref) {
    CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_right__SWIG_1(swigCPtr, this, Delaunay_triangulation_2_Vertex_handle.getCPtr(ref), ref);
  }

  public boolean has_source() {
    return CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_has_source(swigCPtr, this);
  }

  public boolean has_target() {
    return CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_has_target(swigCPtr, this);
  }

  public boolean is_unbounded() {
    return CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_is_unbounded(swigCPtr, this);
  }

  public boolean is_bisector() {
    return CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_is_bisector(swigCPtr, this);
  }

  public boolean is_segment() {
    return CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_is_segment(swigCPtr, this);
  }

  public boolean is_ray() {
    return CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_is_ray(swigCPtr, this);
  }

  public boolean is_valid() {
    return CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_is_valid(swigCPtr, this);
  }

  public boolean equals(Voronoi_diagram_2_Halfedge_handle p) {
    return CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_equals(swigCPtr, this, Voronoi_diagram_2_Halfedge_handle.getCPtr(p), p);
  }

  public boolean not_equals(Voronoi_diagram_2_Halfedge_handle p) {
    return CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_not_equals(swigCPtr, this, Voronoi_diagram_2_Halfedge_handle.getCPtr(p), p);
  }

  public int hashCode() {
    return CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_hashCode(swigCPtr, this);
  }

  public Voronoi_diagram_2_Halfedge_handle clone() {
    return new Voronoi_diagram_2_Halfedge_handle(CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Voronoi_diagram_2_Halfedge_handle other) {
    CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_handle_clone__SWIG_1(swigCPtr, this, Voronoi_diagram_2_Halfedge_handle.getCPtr(other), other);
  }

}