/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Triangulation_2;
import CGAL.Kernel.Point_2; import CGAL.Kernel.Weighted_point_2; import CGAL.Kernel.Ref_int; import CGAL.Kernel.Segment_2; import CGAL.Kernel.Triangle_2; import CGAL.Kernel.Oriented_side; import CGAL.Triangulation_2.Locate_type; import CGAL.Triangulation_2.Ref_Locate_type_2; import java.util.Iterator; import java.util.Collection;
public class Internal_Triangulation_2_Regular_triangulation_2 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Internal_Triangulation_2_Regular_triangulation_2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Internal_Triangulation_2_Regular_triangulation_2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Triangulation_2JNI.delete_Internal_Triangulation_2_Regular_triangulation_2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Internal_Triangulation_2_Regular_triangulation_2() {
    this(CGAL_Triangulation_2JNI.new_Internal_Triangulation_2_Regular_triangulation_2(), true);
  }

  public void clear() {
    CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_clear(swigCPtr, this);
  }

  public int dimension() {
    return CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_dimension(swigCPtr, this);
  }

  public int number_of_vertices() {
    return CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_number_of_vertices(swigCPtr, this);
  }

  public int number_of_faces() {
    return CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_number_of_faces(swigCPtr, this);
  }

  public Regular_triangulation_2_Face_handle infinite_face() {
    return new Regular_triangulation_2_Face_handle(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_infinite_face__SWIG_0(swigCPtr, this), true);
  }

  public void infinite_face(Regular_triangulation_2_Face_handle ref) {
    CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_infinite_face__SWIG_1(swigCPtr, this, Regular_triangulation_2_Face_handle.getCPtr(ref), ref);
  }

  public Regular_triangulation_2_Vertex_handle infinite_vertex() {
    return new Regular_triangulation_2_Vertex_handle(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_infinite_vertex__SWIG_0(swigCPtr, this), true);
  }

  public void infinite_vertex(Regular_triangulation_2_Vertex_handle ref) {
    CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_infinite_vertex__SWIG_1(swigCPtr, this, Regular_triangulation_2_Vertex_handle.getCPtr(ref), ref);
  }

  public Regular_triangulation_2_Vertex_handle finite_vertex() {
    return new Regular_triangulation_2_Vertex_handle(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_finite_vertex__SWIG_0(swigCPtr, this), true);
  }

  public void finite_vertex(Regular_triangulation_2_Vertex_handle ref) {
    CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_finite_vertex__SWIG_1(swigCPtr, this, Regular_triangulation_2_Vertex_handle.getCPtr(ref), ref);
  }

  public boolean is_infinite(Regular_triangulation_2_Vertex_handle c) {
    return CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_is_infinite__SWIG_0(swigCPtr, this, Regular_triangulation_2_Vertex_handle.getCPtr(c), c);
  }

  public boolean is_infinite(Regular_triangulation_2_Face_handle c) {
    return CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_is_infinite__SWIG_1(swigCPtr, this, Regular_triangulation_2_Face_handle.getCPtr(c), c);
  }

  public boolean is_infinite(Regular_triangulation_2_Face_handle c1, int c2) {
    return CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_is_infinite__SWIG_2(swigCPtr, this, Regular_triangulation_2_Face_handle.getCPtr(c1), c1, c2);
  }

  public boolean is_edge(Regular_triangulation_2_Vertex_handle c1, Regular_triangulation_2_Vertex_handle c2) {
    return CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_is_edge__SWIG_0(swigCPtr, this, Regular_triangulation_2_Vertex_handle.getCPtr(c1), c1, Regular_triangulation_2_Vertex_handle.getCPtr(c2), c2);
  }

  public boolean is_face(Regular_triangulation_2_Vertex_handle c1, Regular_triangulation_2_Vertex_handle c2, Regular_triangulation_2_Vertex_handle c3) {
    return CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_is_face__SWIG_0(swigCPtr, this, Regular_triangulation_2_Vertex_handle.getCPtr(c1), c1, Regular_triangulation_2_Vertex_handle.getCPtr(c2), c2, Regular_triangulation_2_Vertex_handle.getCPtr(c3), c3);
  }

  public boolean is_infinite(Regular_triangulation_2_Edge c) {
    return CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_is_infinite__SWIG_3(swigCPtr, this, Regular_triangulation_2_Edge.getCPtr(c), c);
  }

  public boolean is_edge(Regular_triangulation_2_Vertex_handle va, Regular_triangulation_2_Vertex_handle vb, Ref_Regular_triangulation_2_Face_handle fr, Ref_int i) {
    return CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_is_edge__SWIG_1(swigCPtr, this, Regular_triangulation_2_Vertex_handle.getCPtr(va), va, Regular_triangulation_2_Vertex_handle.getCPtr(vb), vb, Ref_Regular_triangulation_2_Face_handle.getCPtr(fr), fr, Ref_int.getCPtr(i), i);
  }

  public boolean includes_edge(Regular_triangulation_2_Vertex_handle va, Regular_triangulation_2_Vertex_handle vb, Ref_Regular_triangulation_2_Vertex_handle vbr, Ref_Regular_triangulation_2_Face_handle fr, Ref_int i) {
    return CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_includes_edge(swigCPtr, this, Regular_triangulation_2_Vertex_handle.getCPtr(va), va, Regular_triangulation_2_Vertex_handle.getCPtr(vb), vb, Ref_Regular_triangulation_2_Vertex_handle.getCPtr(vbr), vbr, Ref_Regular_triangulation_2_Face_handle.getCPtr(fr), fr, Ref_int.getCPtr(i), i);
  }

  public boolean is_face(Regular_triangulation_2_Vertex_handle v1, Regular_triangulation_2_Vertex_handle v2, Regular_triangulation_2_Vertex_handle v3, Ref_Regular_triangulation_2_Face_handle fr) {
    return CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_is_face__SWIG_1(swigCPtr, this, Regular_triangulation_2_Vertex_handle.getCPtr(v1), v1, Regular_triangulation_2_Vertex_handle.getCPtr(v2), v2, Regular_triangulation_2_Vertex_handle.getCPtr(v3), v3, Ref_Regular_triangulation_2_Face_handle.getCPtr(fr), fr);
  }

  public Regular_triangulation_2_Face_handle locate(Weighted_point_2 c) {
    return new Regular_triangulation_2_Face_handle(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_locate__SWIG_0(swigCPtr, this, Weighted_point_2.getCPtr(c), c), true);
  }

  public Regular_triangulation_2_Face_handle locate(Weighted_point_2 c1, Regular_triangulation_2_Face_handle c2) {
    return new Regular_triangulation_2_Face_handle(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_locate__SWIG_1(swigCPtr, this, Weighted_point_2.getCPtr(c1), c1, Regular_triangulation_2_Face_handle.getCPtr(c2), c2), true);
  }

  public void locate(Weighted_point_2 c1, Regular_triangulation_2_Face_handle c2, Regular_triangulation_2_Face_handle ret) {
    CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_locate__SWIG_2(swigCPtr, this, Weighted_point_2.getCPtr(c1), c1, Regular_triangulation_2_Face_handle.getCPtr(c2), c2, Regular_triangulation_2_Face_handle.getCPtr(ret), ret);
  }

  public Oriented_side oriented_side(Regular_triangulation_2_Face_handle c1, Weighted_point_2 c2) {
    return Oriented_side.swigToEnum(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_oriented_side(swigCPtr, this, Regular_triangulation_2_Face_handle.getCPtr(c1), c1, Weighted_point_2.getCPtr(c2), c2));
  }

  public Oriented_side side_of_oriented_circle(Regular_triangulation_2_Face_handle c1, Weighted_point_2 c2) {
    return Oriented_side.swigToEnum(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_side_of_oriented_circle(swigCPtr, this, Regular_triangulation_2_Face_handle.getCPtr(c1), c1, Weighted_point_2.getCPtr(c2), c2));
  }

  public Regular_triangulation_2_Face_handle locate(Weighted_point_2 query, Ref_Locate_type_2 lt, Ref_int li, Regular_triangulation_2_Face_handle hint) {
    return new Regular_triangulation_2_Face_handle(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_locate__SWIG_3(swigCPtr, this, Weighted_point_2.getCPtr(query), query, Ref_Locate_type_2.getCPtr(lt), lt, Ref_int.getCPtr(li), li, Regular_triangulation_2_Face_handle.getCPtr(hint), hint), true);
  }

  public Regular_triangulation_2_Face_handle locate(Weighted_point_2 query, Ref_Locate_type_2 lt, Ref_int li) {
    return new Regular_triangulation_2_Face_handle(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_locate__SWIG_4(swigCPtr, this, Weighted_point_2.getCPtr(query), query, Ref_Locate_type_2.getCPtr(lt), lt, Ref_int.getCPtr(li), li), true);
  }

  public Regular_triangulation_2_Vertex_handle insert(Weighted_point_2 c) {
    return new Regular_triangulation_2_Vertex_handle(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_insert__SWIG_0(swigCPtr, this, Weighted_point_2.getCPtr(c), c), true);
  }

  public void insert(Weighted_point_2 c, Regular_triangulation_2_Vertex_handle ret) {
    CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_insert__SWIG_1(swigCPtr, this, Weighted_point_2.getCPtr(c), c, Regular_triangulation_2_Vertex_handle.getCPtr(ret), ret);
  }

  public Regular_triangulation_2_Vertex_handle insert(Weighted_point_2 c1, Regular_triangulation_2_Face_handle c2) {
    return new Regular_triangulation_2_Vertex_handle(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_insert__SWIG_2(swigCPtr, this, Weighted_point_2.getCPtr(c1), c1, Regular_triangulation_2_Face_handle.getCPtr(c2), c2), true);
  }

  public void insert(Weighted_point_2 c1, Regular_triangulation_2_Face_handle c2, Regular_triangulation_2_Vertex_handle ret) {
    CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_insert__SWIG_3(swigCPtr, this, Weighted_point_2.getCPtr(c1), c1, Regular_triangulation_2_Face_handle.getCPtr(c2), c2, Regular_triangulation_2_Vertex_handle.getCPtr(ret), ret);
  }

  public Regular_triangulation_2_Vertex_handle push_back(Weighted_point_2 c) {
    return new Regular_triangulation_2_Vertex_handle(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_push_back__SWIG_0(swigCPtr, this, Weighted_point_2.getCPtr(c), c), true);
  }

  public void push_back(Weighted_point_2 c, Regular_triangulation_2_Vertex_handle ret) {
    CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_push_back__SWIG_1(swigCPtr, this, Weighted_point_2.getCPtr(c), c, Regular_triangulation_2_Vertex_handle.getCPtr(ret), ret);
  }

  public void remove(Regular_triangulation_2_Vertex_handle c) {
    CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_remove(swigCPtr, this, Regular_triangulation_2_Vertex_handle.getCPtr(c), c);
  }

  public Regular_triangulation_2_Vertex_handle insert_first(Weighted_point_2 c) {
    return new Regular_triangulation_2_Vertex_handle(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_insert_first__SWIG_0(swigCPtr, this, Weighted_point_2.getCPtr(c), c), true);
  }

  public void insert_first(Weighted_point_2 c, Regular_triangulation_2_Vertex_handle ret) {
    CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_insert_first__SWIG_1(swigCPtr, this, Weighted_point_2.getCPtr(c), c, Regular_triangulation_2_Vertex_handle.getCPtr(ret), ret);
  }

  public Regular_triangulation_2_Vertex_handle insert_second(Weighted_point_2 c) {
    return new Regular_triangulation_2_Vertex_handle(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_insert_second__SWIG_0(swigCPtr, this, Weighted_point_2.getCPtr(c), c), true);
  }

  public void insert_second(Weighted_point_2 c, Regular_triangulation_2_Vertex_handle ret) {
    CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_insert_second__SWIG_1(swigCPtr, this, Weighted_point_2.getCPtr(c), c, Regular_triangulation_2_Vertex_handle.getCPtr(ret), ret);
  }

  public Regular_triangulation_2_Vertex_handle insert_in_face(Weighted_point_2 c1, Regular_triangulation_2_Face_handle c2) {
    return new Regular_triangulation_2_Vertex_handle(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_insert_in_face__SWIG_0(swigCPtr, this, Weighted_point_2.getCPtr(c1), c1, Regular_triangulation_2_Face_handle.getCPtr(c2), c2), true);
  }

  public void insert_in_face(Weighted_point_2 c1, Regular_triangulation_2_Face_handle c2, Regular_triangulation_2_Vertex_handle ret) {
    CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_insert_in_face__SWIG_1(swigCPtr, this, Weighted_point_2.getCPtr(c1), c1, Regular_triangulation_2_Face_handle.getCPtr(c2), c2, Regular_triangulation_2_Vertex_handle.getCPtr(ret), ret);
  }

  public Regular_triangulation_2_Vertex_handle insert_in_edge(Weighted_point_2 c1, Regular_triangulation_2_Face_handle c2, int c3) {
    return new Regular_triangulation_2_Vertex_handle(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_insert_in_edge__SWIG_0(swigCPtr, this, Weighted_point_2.getCPtr(c1), c1, Regular_triangulation_2_Face_handle.getCPtr(c2), c2, c3), true);
  }

  public void insert_in_edge(Weighted_point_2 c1, Regular_triangulation_2_Face_handle c2, int c3, Regular_triangulation_2_Vertex_handle ret) {
    CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_insert_in_edge__SWIG_1(swigCPtr, this, Weighted_point_2.getCPtr(c1), c1, Regular_triangulation_2_Face_handle.getCPtr(c2), c2, c3, Regular_triangulation_2_Vertex_handle.getCPtr(ret), ret);
  }

  public Regular_triangulation_2_Vertex_handle insert_outside_convex_hull(Weighted_point_2 c1, Regular_triangulation_2_Face_handle c2) {
    return new Regular_triangulation_2_Vertex_handle(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_insert_outside_convex_hull__SWIG_0(swigCPtr, this, Weighted_point_2.getCPtr(c1), c1, Regular_triangulation_2_Face_handle.getCPtr(c2), c2), true);
  }

  public void insert_outside_convex_hull(Weighted_point_2 c1, Regular_triangulation_2_Face_handle c2, Regular_triangulation_2_Vertex_handle ret) {
    CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_insert_outside_convex_hull__SWIG_1(swigCPtr, this, Weighted_point_2.getCPtr(c1), c1, Regular_triangulation_2_Face_handle.getCPtr(c2), c2, Regular_triangulation_2_Vertex_handle.getCPtr(ret), ret);
  }

  public Regular_triangulation_2_Vertex_handle insert_outside_affine_hull(Weighted_point_2 c) {
    return new Regular_triangulation_2_Vertex_handle(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_insert_outside_affine_hull__SWIG_0(swigCPtr, this, Weighted_point_2.getCPtr(c), c), true);
  }

  public void insert_outside_affine_hull(Weighted_point_2 c, Regular_triangulation_2_Vertex_handle ret) {
    CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_insert_outside_affine_hull__SWIG_1(swigCPtr, this, Weighted_point_2.getCPtr(c), c, Regular_triangulation_2_Vertex_handle.getCPtr(ret), ret);
  }

  public void remove_degree_3(Regular_triangulation_2_Vertex_handle c) {
    CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_remove_degree_3(swigCPtr, this, Regular_triangulation_2_Vertex_handle.getCPtr(c), c);
  }

  public void remove_second(Regular_triangulation_2_Vertex_handle c) {
    CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_remove_second(swigCPtr, this, Regular_triangulation_2_Vertex_handle.getCPtr(c), c);
  }

  public void remove_first(Regular_triangulation_2_Vertex_handle c) {
    CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_remove_first(swigCPtr, this, Regular_triangulation_2_Vertex_handle.getCPtr(c), c);
  }

  public Regular_triangulation_2_Vertex_handle insert(Weighted_point_2 p, Locate_type l, Regular_triangulation_2_Face_handle f, int i) {
    return new Regular_triangulation_2_Vertex_handle(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_insert__SWIG_4(swigCPtr, this, Weighted_point_2.getCPtr(p), p, l.swigValue(), Regular_triangulation_2_Face_handle.getCPtr(f), f, i), true);
  }

  public int insert(Iterator<Weighted_point_2> range) {
    return CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_insert__SWIG_5(swigCPtr, this, range);
  }

  public Regular_triangulation_2_Finite_vertices_iterator finite_vertices() {
    return new Regular_triangulation_2_Finite_vertices_iterator(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_finite_vertices(swigCPtr, this), true);
  }

  public Regular_triangulation_2_Finite_edges_iterator finite_edges() {
    return new Regular_triangulation_2_Finite_edges_iterator(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_finite_edges(swigCPtr, this), true);
  }

  public Regular_triangulation_2_Finite_faces_iterator finite_faces() {
    return new Regular_triangulation_2_Finite_faces_iterator(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_finite_faces(swigCPtr, this), true);
  }

  public Regular_triangulation_2_All_vertices_iterator all_vertices() {
    return new Regular_triangulation_2_All_vertices_iterator(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_all_vertices(swigCPtr, this), true);
  }

  public Regular_triangulation_2_All_edges_iterator all_edges() {
    return new Regular_triangulation_2_All_edges_iterator(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_all_edges(swigCPtr, this), true);
  }

  public Regular_triangulation_2_All_faces_iterator all_faces() {
    return new Regular_triangulation_2_All_faces_iterator(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_all_faces(swigCPtr, this), true);
  }

  public Regular_triangulation_2_Point_iterator points() {
    return new Regular_triangulation_2_Point_iterator(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_points(swigCPtr, this), true);
  }

  public Regular_triangulation_2_Line_face_circulator line_walk(Weighted_point_2 p, Weighted_point_2 q) {
    return new Regular_triangulation_2_Line_face_circulator(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_line_walk__SWIG_0(swigCPtr, this, Weighted_point_2.getCPtr(p), p, Weighted_point_2.getCPtr(q), q), true);
  }

  public Regular_triangulation_2_Line_face_circulator line_walk(Weighted_point_2 p, Weighted_point_2 q, Regular_triangulation_2_Face_handle f) {
    return new Regular_triangulation_2_Line_face_circulator(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_line_walk__SWIG_1(swigCPtr, this, Weighted_point_2.getCPtr(p), p, Weighted_point_2.getCPtr(q), q, Regular_triangulation_2_Face_handle.getCPtr(f), f), true);
  }

  public Regular_triangulation_2_Face_circulator incident_faces(Regular_triangulation_2_Vertex_handle c) {
    return new Regular_triangulation_2_Face_circulator(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_incident_faces__SWIG_0(swigCPtr, this, Regular_triangulation_2_Vertex_handle.getCPtr(c), c), true);
  }

  public void incident_faces(Regular_triangulation_2_Vertex_handle c, Regular_triangulation_2_Face_circulator ret) {
    CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_incident_faces__SWIG_1(swigCPtr, this, Regular_triangulation_2_Vertex_handle.getCPtr(c), c, Regular_triangulation_2_Face_circulator.getCPtr(ret), ret);
  }

  public Regular_triangulation_2_Face_circulator incident_faces(Regular_triangulation_2_Vertex_handle c1, Regular_triangulation_2_Face_handle c2) {
    return new Regular_triangulation_2_Face_circulator(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_incident_faces__SWIG_2(swigCPtr, this, Regular_triangulation_2_Vertex_handle.getCPtr(c1), c1, Regular_triangulation_2_Face_handle.getCPtr(c2), c2), true);
  }

  public void incident_faces(Regular_triangulation_2_Vertex_handle c1, Regular_triangulation_2_Face_handle c2, Regular_triangulation_2_Face_circulator ret) {
    CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_incident_faces__SWIG_3(swigCPtr, this, Regular_triangulation_2_Vertex_handle.getCPtr(c1), c1, Regular_triangulation_2_Face_handle.getCPtr(c2), c2, Regular_triangulation_2_Face_circulator.getCPtr(ret), ret);
  }

  public Regular_triangulation_2_Edge_circulator incident_edges(Regular_triangulation_2_Vertex_handle c) {
    return new Regular_triangulation_2_Edge_circulator(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_incident_edges__SWIG_0(swigCPtr, this, Regular_triangulation_2_Vertex_handle.getCPtr(c), c), true);
  }

  public void incident_edges(Regular_triangulation_2_Vertex_handle c, Regular_triangulation_2_Edge_circulator ret) {
    CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_incident_edges__SWIG_1(swigCPtr, this, Regular_triangulation_2_Vertex_handle.getCPtr(c), c, Regular_triangulation_2_Edge_circulator.getCPtr(ret), ret);
  }

  public Regular_triangulation_2_Edge_circulator incident_edges(Regular_triangulation_2_Vertex_handle c1, Regular_triangulation_2_Face_handle c2) {
    return new Regular_triangulation_2_Edge_circulator(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_incident_edges__SWIG_2(swigCPtr, this, Regular_triangulation_2_Vertex_handle.getCPtr(c1), c1, Regular_triangulation_2_Face_handle.getCPtr(c2), c2), true);
  }

  public void incident_edges(Regular_triangulation_2_Vertex_handle c1, Regular_triangulation_2_Face_handle c2, Regular_triangulation_2_Edge_circulator ret) {
    CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_incident_edges__SWIG_3(swigCPtr, this, Regular_triangulation_2_Vertex_handle.getCPtr(c1), c1, Regular_triangulation_2_Face_handle.getCPtr(c2), c2, Regular_triangulation_2_Edge_circulator.getCPtr(ret), ret);
  }

  public Regular_triangulation_2_Vertex_circulator incident_vertices(Regular_triangulation_2_Vertex_handle c) {
    return new Regular_triangulation_2_Vertex_circulator(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_incident_vertices__SWIG_0(swigCPtr, this, Regular_triangulation_2_Vertex_handle.getCPtr(c), c), true);
  }

  public void incident_vertices(Regular_triangulation_2_Vertex_handle c, Regular_triangulation_2_Vertex_circulator ret) {
    CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_incident_vertices__SWIG_1(swigCPtr, this, Regular_triangulation_2_Vertex_handle.getCPtr(c), c, Regular_triangulation_2_Vertex_circulator.getCPtr(ret), ret);
  }

  public Regular_triangulation_2_Vertex_circulator incident_vertices(Regular_triangulation_2_Vertex_handle c1, Regular_triangulation_2_Face_handle c2) {
    return new Regular_triangulation_2_Vertex_circulator(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_incident_vertices__SWIG_2(swigCPtr, this, Regular_triangulation_2_Vertex_handle.getCPtr(c1), c1, Regular_triangulation_2_Face_handle.getCPtr(c2), c2), true);
  }

  public void incident_vertices(Regular_triangulation_2_Vertex_handle c1, Regular_triangulation_2_Face_handle c2, Regular_triangulation_2_Vertex_circulator ret) {
    CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_incident_vertices__SWIG_3(swigCPtr, this, Regular_triangulation_2_Vertex_handle.getCPtr(c1), c1, Regular_triangulation_2_Face_handle.getCPtr(c2), c2, Regular_triangulation_2_Vertex_circulator.getCPtr(ret), ret);
  }

  public Regular_triangulation_2_Vertex_handle mirror_vertex(Regular_triangulation_2_Face_handle c1, int c2) {
    return new Regular_triangulation_2_Vertex_handle(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_mirror_vertex__SWIG_0(swigCPtr, this, Regular_triangulation_2_Face_handle.getCPtr(c1), c1, c2), true);
  }

  public void mirror_vertex(Regular_triangulation_2_Face_handle c1, int c2, Regular_triangulation_2_Vertex_handle ret) {
    CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_mirror_vertex__SWIG_1(swigCPtr, this, Regular_triangulation_2_Face_handle.getCPtr(c1), c1, c2, Regular_triangulation_2_Vertex_handle.getCPtr(ret), ret);
  }

  public int mirror_index(Regular_triangulation_2_Face_handle c1, int c2) {
    return CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_mirror_index(swigCPtr, this, Regular_triangulation_2_Face_handle.getCPtr(c1), c1, c2);
  }

  public int ccw(int c) {
    return CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_ccw(swigCPtr, this, c);
  }

  public int cw(int c) {
    return CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_cw(swigCPtr, this, c);
  }

  public Point_2 circumcenter(Regular_triangulation_2_Face_handle c) {
    return new Point_2(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_circumcenter__SWIG_0(swigCPtr, this, Regular_triangulation_2_Face_handle.getCPtr(c), c), true);
  }

  public void circumcenter(Regular_triangulation_2_Face_handle c, Point_2 ret) {
    CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_circumcenter__SWIG_1(swigCPtr, this, Regular_triangulation_2_Face_handle.getCPtr(c), c, Point_2.getCPtr(ret), ret);
  }

  public void set_infinite_vertex(Regular_triangulation_2_Vertex_handle c) {
    CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_set_infinite_vertex(swigCPtr, this, Regular_triangulation_2_Vertex_handle.getCPtr(c), c);
  }

  public boolean is_valid() {
    return CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_is_valid__SWIG_0(swigCPtr, this);
  }

  public boolean is_valid(boolean c) {
    return CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_is_valid__SWIG_1(swigCPtr, this, c);
  }

  public boolean is_valid(boolean c1, int c2) {
    return CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_is_valid__SWIG_2(swigCPtr, this, c1, c2);
  }

  public Triangle_2 triangle(Regular_triangulation_2_Face_handle c) {
    return new Triangle_2(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_triangle__SWIG_0(swigCPtr, this, Regular_triangulation_2_Face_handle.getCPtr(c), c), true);
  }

  public void triangle(Regular_triangulation_2_Face_handle c, Triangle_2 ret) {
    CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_triangle__SWIG_1(swigCPtr, this, Regular_triangulation_2_Face_handle.getCPtr(c), c, Triangle_2.getCPtr(ret), ret);
  }

  public Segment_2 segment(Regular_triangulation_2_Face_handle c1, int c2) {
    return new Segment_2(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_segment__SWIG_0(swigCPtr, this, Regular_triangulation_2_Face_handle.getCPtr(c1), c1, c2), true);
  }

  public void segment(Regular_triangulation_2_Face_handle c1, int c2, Segment_2 ret) {
    CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_segment__SWIG_1(swigCPtr, this, Regular_triangulation_2_Face_handle.getCPtr(c1), c1, c2, Segment_2.getCPtr(ret), ret);
  }

  public Segment_2 segment(Regular_triangulation_2_Edge c) {
    return new Segment_2(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_segment__SWIG_2(swigCPtr, this, Regular_triangulation_2_Edge.getCPtr(c), c), true);
  }

  public void segment(Regular_triangulation_2_Edge c, Segment_2 ret) {
    CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_segment__SWIG_3(swigCPtr, this, Regular_triangulation_2_Edge.getCPtr(c), c, Segment_2.getCPtr(ret), ret);
  }

  public String toString() {
    return CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_toString(swigCPtr, this);
  }

  public void write_to_file(String fname, int prec) {
    CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_write_to_file__SWIG_0(swigCPtr, this, fname, prec);
  }

  public void write_to_file(String fname) {
    CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_write_to_file__SWIG_1(swigCPtr, this, fname);
  }

  public void read_from_file(String fname) {
    CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_read_from_file(swigCPtr, this, fname);
  }

  public Internal_Triangulation_2_Regular_triangulation_2 clone() {
    return new Internal_Triangulation_2_Regular_triangulation_2(CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Internal_Triangulation_2_Regular_triangulation_2 other) {
    CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_clone__SWIG_1(swigCPtr, this, Internal_Triangulation_2_Regular_triangulation_2.getCPtr(other), other);
  }

  public boolean same_internal_object(Internal_Triangulation_2_Regular_triangulation_2 other) {
    return CGAL_Triangulation_2JNI.Internal_Triangulation_2_Regular_triangulation_2_same_internal_object(swigCPtr, this, Internal_Triangulation_2_Regular_triangulation_2.getCPtr(other), other);
  }

}
