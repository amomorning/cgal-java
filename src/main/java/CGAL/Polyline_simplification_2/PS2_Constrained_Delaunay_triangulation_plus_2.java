/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Polyline_simplification_2;
import CGAL.Kernel.Point_2; import java.util.Iterator; import java.util.Collection; import CGAL.Triangulation_2.Constraint; import CGAL.Kernel.Polygon_2; 
public class PS2_Constrained_Delaunay_triangulation_plus_2 extends Internal_Constrained_Delaunay_triangulation_2_PS2_Constrained_Delaunay_triangulation_plus_2 {
  private transient long swigCPtr;

  public PS2_Constrained_Delaunay_triangulation_plus_2(long cPtr, boolean cMemoryOwn) {
    super(CGAL_Polyline_simplification_2JNI.PS2_Constrained_Delaunay_triangulation_plus_2_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(PS2_Constrained_Delaunay_triangulation_plus_2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Polyline_simplification_2JNI.delete_PS2_Constrained_Delaunay_triangulation_plus_2(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public PS2_Constrained_Delaunay_triangulation_plus_2() {
    this(CGAL_Polyline_simplification_2JNI.new_PS2_Constrained_Delaunay_triangulation_plus_2__SWIG_0(), true);
  }

  public PS2_Constrained_Delaunay_triangulation_plus_2(Iterator<Constraint> range) {
    this(CGAL_Polyline_simplification_2JNI.new_PS2_Constrained_Delaunay_triangulation_plus_2__SWIG_1(range), true);
  }

  public void remove_constraint(PS2_Constrained_Delaunay_triangulation_plus_2_Constraint_id c) {
    CGAL_Polyline_simplification_2JNI.PS2_Constrained_Delaunay_triangulation_plus_2_remove_constraint(swigCPtr, this, PS2_Constrained_Delaunay_triangulation_plus_2_Constraint_id.getCPtr(c), c);
  }

  public int number_of_enclosing_constraints(PS2_Constrained_Delaunay_triangulation_plus_2_Vertex_handle c1, PS2_Constrained_Delaunay_triangulation_plus_2_Vertex_handle c2) {
    return CGAL_Polyline_simplification_2JNI.PS2_Constrained_Delaunay_triangulation_plus_2_number_of_enclosing_constraints(swigCPtr, this, PS2_Constrained_Delaunay_triangulation_plus_2_Vertex_handle.getCPtr(c1), c1, PS2_Constrained_Delaunay_triangulation_plus_2_Vertex_handle.getCPtr(c2), c2);
  }

  public PS2_Constrained_Delaunay_triangulation_plus_2_Constraint_iterator constraints() {
    return new PS2_Constrained_Delaunay_triangulation_plus_2_Constraint_iterator(CGAL_Polyline_simplification_2JNI.PS2_Constrained_Delaunay_triangulation_plus_2_constraints(swigCPtr, this), true);
  }

  public PS2_Constrained_Delaunay_triangulation_plus_2_Subconstraint_iterator subconstraints() {
    return new PS2_Constrained_Delaunay_triangulation_plus_2_Subconstraint_iterator(CGAL_Polyline_simplification_2JNI.PS2_Constrained_Delaunay_triangulation_plus_2_subconstraints(swigCPtr, this), true);
  }

  public PS2_Constrained_Delaunay_triangulation_plus_2_Context context(PS2_Constrained_Delaunay_triangulation_plus_2_Vertex_handle c1, PS2_Constrained_Delaunay_triangulation_plus_2_Vertex_handle c2) {
    return new PS2_Constrained_Delaunay_triangulation_plus_2_Context(CGAL_Polyline_simplification_2JNI.PS2_Constrained_Delaunay_triangulation_plus_2_context__SWIG_0(swigCPtr, this, PS2_Constrained_Delaunay_triangulation_plus_2_Vertex_handle.getCPtr(c1), c1, PS2_Constrained_Delaunay_triangulation_plus_2_Vertex_handle.getCPtr(c2), c2), true);
  }

  public void context(PS2_Constrained_Delaunay_triangulation_plus_2_Vertex_handle c1, PS2_Constrained_Delaunay_triangulation_plus_2_Vertex_handle c2, PS2_Constrained_Delaunay_triangulation_plus_2_Context ret) {
    CGAL_Polyline_simplification_2JNI.PS2_Constrained_Delaunay_triangulation_plus_2_context__SWIG_1(swigCPtr, this, PS2_Constrained_Delaunay_triangulation_plus_2_Vertex_handle.getCPtr(c1), c1, PS2_Constrained_Delaunay_triangulation_plus_2_Vertex_handle.getCPtr(c2), c2, PS2_Constrained_Delaunay_triangulation_plus_2_Context.getCPtr(ret), ret);
  }

  public PS2_Constrained_Delaunay_triangulation_plus_2_Context_iterator contexts(PS2_Constrained_Delaunay_triangulation_plus_2_Vertex_handle va, PS2_Constrained_Delaunay_triangulation_plus_2_Vertex_handle vb) {
    return new PS2_Constrained_Delaunay_triangulation_plus_2_Context_iterator(CGAL_Polyline_simplification_2JNI.PS2_Constrained_Delaunay_triangulation_plus_2_contexts(swigCPtr, this, PS2_Constrained_Delaunay_triangulation_plus_2_Vertex_handle.getCPtr(va), va, PS2_Constrained_Delaunay_triangulation_plus_2_Vertex_handle.getCPtr(vb), vb), true);
  }

  public PS2_Constrained_Delaunay_triangulation_plus_2 clone() {
    return new PS2_Constrained_Delaunay_triangulation_plus_2(CGAL_Polyline_simplification_2JNI.PS2_Constrained_Delaunay_triangulation_plus_2_clone(swigCPtr, this), true);
  }

  public PS2_Constrained_Delaunay_triangulation_plus_2_Constraint_id insert_constraint(Polygon_2 p) {
    return new PS2_Constrained_Delaunay_triangulation_plus_2_Constraint_id(CGAL_Polyline_simplification_2JNI.PS2_Constrained_Delaunay_triangulation_plus_2_insert_constraint__SWIG_0(swigCPtr, this, Polygon_2.getCPtr(p), p), true);
  }

  public PS2_Constrained_Delaunay_triangulation_plus_2_Constraint_id insert_constraint(Iterator<Point_2> input, boolean closed) {
    return new PS2_Constrained_Delaunay_triangulation_plus_2_Constraint_id(CGAL_Polyline_simplification_2JNI.PS2_Constrained_Delaunay_triangulation_plus_2_insert_constraint__SWIG_1(swigCPtr, this, input, closed), true);
  }

  public PS2_Constrained_Delaunay_triangulation_plus_2_Constraint_id insert_constraint(Iterator<Point_2> input) {
    return new PS2_Constrained_Delaunay_triangulation_plus_2_Constraint_id(CGAL_Polyline_simplification_2JNI.PS2_Constrained_Delaunay_triangulation_plus_2_insert_constraint__SWIG_2(swigCPtr, this, input), true);
  }

  public PS2_Constrained_Delaunay_triangulation_plus_2_Vertices_in_constraint_iterator vertices_in_constraint(PS2_Constrained_Delaunay_triangulation_plus_2_Constraint_id cid) {
    return new PS2_Constrained_Delaunay_triangulation_plus_2_Vertices_in_constraint_iterator(CGAL_Polyline_simplification_2JNI.PS2_Constrained_Delaunay_triangulation_plus_2_vertices_in_constraint(swigCPtr, this, PS2_Constrained_Delaunay_triangulation_plus_2_Constraint_id.getCPtr(cid), cid), true);
  }

  public int remove_points_without_corresponding_vertex(PS2_Constrained_Delaunay_triangulation_plus_2_Constraint_id cid) {
    return CGAL_Polyline_simplification_2JNI.PS2_Constrained_Delaunay_triangulation_plus_2_remove_points_without_corresponding_vertex(swigCPtr, this, PS2_Constrained_Delaunay_triangulation_plus_2_Constraint_id.getCPtr(cid), cid);
  }

}
