/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Mesh_3;
import CGAL.Kernel.Weighted_point_3; import CGAL.Kernel.Ref_int;
public class Mesh_3_regular_triangulation_3_Cell_handle {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Mesh_3_regular_triangulation_3_Cell_handle(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Mesh_3_regular_triangulation_3_Cell_handle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Mesh_3JNI.delete_Mesh_3_regular_triangulation_3_Cell_handle(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Mesh_3_regular_triangulation_3_Cell_handle() {
    this(CGAL_Mesh_3JNI.new_Mesh_3_regular_triangulation_3_Cell_handle(), true);
  }

  public Mesh_3_regular_triangulation_3_Vertex_handle vertex(int c) {
    return new Mesh_3_regular_triangulation_3_Vertex_handle(CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Cell_handle_vertex__SWIG_0(swigCPtr, this, c), true);
  }

  public void vertex(int c, Mesh_3_regular_triangulation_3_Vertex_handle ret) {
    CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Cell_handle_vertex__SWIG_1(swigCPtr, this, c, Mesh_3_regular_triangulation_3_Vertex_handle.getCPtr(ret), ret);
  }

  public int index(Mesh_3_regular_triangulation_3_Vertex_handle c) {
    return CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Cell_handle_index__SWIG_0(swigCPtr, this, Mesh_3_regular_triangulation_3_Vertex_handle.getCPtr(c), c);
  }

  public boolean has_vertex(Mesh_3_regular_triangulation_3_Vertex_handle c) {
    return CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Cell_handle_has_vertex__SWIG_0(swigCPtr, this, Mesh_3_regular_triangulation_3_Vertex_handle.getCPtr(c), c);
  }

  public Mesh_3_regular_triangulation_3_Cell_handle neighbor(int c) {
    return new Mesh_3_regular_triangulation_3_Cell_handle(CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Cell_handle_neighbor__SWIG_0(swigCPtr, this, c), true);
  }

  public void neighbor(int c, Mesh_3_regular_triangulation_3_Cell_handle ret) {
    CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Cell_handle_neighbor__SWIG_1(swigCPtr, this, c, Mesh_3_regular_triangulation_3_Cell_handle.getCPtr(ret), ret);
  }

  public int index(Mesh_3_regular_triangulation_3_Cell_handle c) {
    return CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Cell_handle_index__SWIG_1(swigCPtr, this, Mesh_3_regular_triangulation_3_Cell_handle.getCPtr(c), c);
  }

  public boolean has_neighbor(Mesh_3_regular_triangulation_3_Cell_handle c) {
    return CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Cell_handle_has_neighbor__SWIG_0(swigCPtr, this, Mesh_3_regular_triangulation_3_Cell_handle.getCPtr(c), c);
  }

  public void set_vertex(int c1, Mesh_3_regular_triangulation_3_Vertex_handle c2) {
    CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Cell_handle_set_vertex(swigCPtr, this, c1, Mesh_3_regular_triangulation_3_Vertex_handle.getCPtr(c2), c2);
  }

  public void set_vertices(Mesh_3_regular_triangulation_3_Vertex_handle c1, Mesh_3_regular_triangulation_3_Vertex_handle c2, Mesh_3_regular_triangulation_3_Vertex_handle c3, Mesh_3_regular_triangulation_3_Vertex_handle c4) {
    CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Cell_handle_set_vertices(swigCPtr, this, Mesh_3_regular_triangulation_3_Vertex_handle.getCPtr(c1), c1, Mesh_3_regular_triangulation_3_Vertex_handle.getCPtr(c2), c2, Mesh_3_regular_triangulation_3_Vertex_handle.getCPtr(c3), c3, Mesh_3_regular_triangulation_3_Vertex_handle.getCPtr(c4), c4);
  }

  public void set_neighbor(int c1, Mesh_3_regular_triangulation_3_Cell_handle c2) {
    CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Cell_handle_set_neighbor(swigCPtr, this, c1, Mesh_3_regular_triangulation_3_Cell_handle.getCPtr(c2), c2);
  }

  public void set_neighbors(Mesh_3_regular_triangulation_3_Cell_handle c1, Mesh_3_regular_triangulation_3_Cell_handle c2, Mesh_3_regular_triangulation_3_Cell_handle c3, Mesh_3_regular_triangulation_3_Cell_handle c4) {
    CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Cell_handle_set_neighbors(swigCPtr, this, Mesh_3_regular_triangulation_3_Cell_handle.getCPtr(c1), c1, Mesh_3_regular_triangulation_3_Cell_handle.getCPtr(c2), c2, Mesh_3_regular_triangulation_3_Cell_handle.getCPtr(c3), c3, Mesh_3_regular_triangulation_3_Cell_handle.getCPtr(c4), c4);
  }

  public boolean is_valid() {
    return CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Cell_handle_is_valid__SWIG_0(swigCPtr, this);
  }

  public boolean is_valid(boolean c) {
    return CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Cell_handle_is_valid__SWIG_1(swigCPtr, this, c);
  }

  public boolean is_valid(boolean c1, int c2) {
    return CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Cell_handle_is_valid__SWIG_2(swigCPtr, this, c1, c2);
  }

  public boolean has_vertex(Mesh_3_regular_triangulation_3_Vertex_handle v, Ref_int i) {
    return CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Cell_handle_has_vertex__SWIG_1(swigCPtr, this, Mesh_3_regular_triangulation_3_Vertex_handle.getCPtr(v), v, Ref_int.getCPtr(i), i);
  }

  public boolean has_neighbor(Mesh_3_regular_triangulation_3_Cell_handle n, Ref_int i) {
    return CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Cell_handle_has_neighbor__SWIG_1(swigCPtr, this, Mesh_3_regular_triangulation_3_Cell_handle.getCPtr(n), n, Ref_int.getCPtr(i), i);
  }

  public boolean lt(Mesh_3_regular_triangulation_3_Cell_handle p) {
    return CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Cell_handle_lt(swigCPtr, this, Mesh_3_regular_triangulation_3_Cell_handle.getCPtr(p), p);
  }

  public boolean gt(Mesh_3_regular_triangulation_3_Cell_handle p) {
    return CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Cell_handle_gt(swigCPtr, this, Mesh_3_regular_triangulation_3_Cell_handle.getCPtr(p), p);
  }

  public boolean le(Mesh_3_regular_triangulation_3_Cell_handle p) {
    return CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Cell_handle_le(swigCPtr, this, Mesh_3_regular_triangulation_3_Cell_handle.getCPtr(p), p);
  }

  public boolean ge(Mesh_3_regular_triangulation_3_Cell_handle p) {
    return CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Cell_handle_ge(swigCPtr, this, Mesh_3_regular_triangulation_3_Cell_handle.getCPtr(p), p);
  }

  public boolean equals(Mesh_3_regular_triangulation_3_Cell_handle p) {
    return CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Cell_handle_equals(swigCPtr, this, Mesh_3_regular_triangulation_3_Cell_handle.getCPtr(p), p);
  }

  public boolean not_equals(Mesh_3_regular_triangulation_3_Cell_handle p) {
    return CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Cell_handle_not_equals(swigCPtr, this, Mesh_3_regular_triangulation_3_Cell_handle.getCPtr(p), p);
  }

  public int hashCode() {
    return CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Cell_handle_hashCode(swigCPtr, this);
  }

  public Mesh_3_regular_triangulation_3_Cell_handle clone() {
    return new Mesh_3_regular_triangulation_3_Cell_handle(CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Cell_handle_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Mesh_3_regular_triangulation_3_Cell_handle other) {
    CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Cell_handle_clone__SWIG_1(swigCPtr, this, Mesh_3_regular_triangulation_3_Cell_handle.getCPtr(other), other);
  }

  public int subdomain_index() {
    return CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Cell_handle_subdomain_index(swigCPtr, this);
  }

  public void set_subdomain_index(int i) {
    CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Cell_handle_set_subdomain_index(swigCPtr, this, i);
  }

  public boolean is_facet_on_surface(int i) {
    return CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Cell_handle_is_facet_on_surface(swigCPtr, this, i);
  }

  public void set_facet_on_surface(int i, Mesh_3_Surface_index p) {
    CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Cell_handle_set_facet_on_surface(swigCPtr, this, i, Mesh_3_Surface_index.getCPtr(p), p);
  }

  public boolean is_facet_visited(int i) {
    return CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Cell_handle_is_facet_visited(swigCPtr, this, i);
  }

  public void set_facet_visited(int i) {
    CGAL_Mesh_3JNI.Mesh_3_regular_triangulation_3_Cell_handle_set_facet_visited(swigCPtr, this, i);
  }

}
