/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Polyline_simplification_2;

  
  import java.lang.Iterable;
  import java.lang.UnsupportedOperationException;
  import java.util.Iterator;
  
public class PS2_Constrained_Delaunay_triangulation_plus_2_All_edges_iterator implements   Iterable<PS2_Constrained_Delaunay_triangulation_plus_2_Edge>, Iterator<PS2_Constrained_Delaunay_triangulation_plus_2_Edge>  {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public PS2_Constrained_Delaunay_triangulation_plus_2_All_edges_iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(PS2_Constrained_Delaunay_triangulation_plus_2_All_edges_iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Polyline_simplification_2JNI.delete_PS2_Constrained_Delaunay_triangulation_plus_2_All_edges_iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

    public void remove() {
      throw new UnsupportedOperationException();
    }
    
    public Iterator<PS2_Constrained_Delaunay_triangulation_plus_2_Edge> iterator() {
      return this;
    }
    
    //we store an object of type PS2_Constrained_Delaunay_triangulation_plus_2_Edge to avoid
    //creation and allocation of a java object at each iteration.
    private PS2_Constrained_Delaunay_triangulation_plus_2_Edge objectInstance = new PS2_Constrained_Delaunay_triangulation_plus_2_Edge();
    public PS2_Constrained_Delaunay_triangulation_plus_2_Edge next() {
      next(objectInstance);
      return objectInstance;
    }
  
  public PS2_Constrained_Delaunay_triangulation_plus_2_All_edges_iterator() {
    this(CGAL_Polyline_simplification_2JNI.new_PS2_Constrained_Delaunay_triangulation_plus_2_All_edges_iterator(), true);
  }

  public PS2_Constrained_Delaunay_triangulation_plus_2_Edge slow_next() {
    return new PS2_Constrained_Delaunay_triangulation_plus_2_Edge(CGAL_Polyline_simplification_2JNI.PS2_Constrained_Delaunay_triangulation_plus_2_All_edges_iterator_slow_next(swigCPtr, this), true);
  }

  public void next(PS2_Constrained_Delaunay_triangulation_plus_2_Edge r) {
    CGAL_Polyline_simplification_2JNI.PS2_Constrained_Delaunay_triangulation_plus_2_All_edges_iterator_next(swigCPtr, this, PS2_Constrained_Delaunay_triangulation_plus_2_Edge.getCPtr(r), r);
  }

  public PS2_Constrained_Delaunay_triangulation_plus_2_All_edges_iterator clone() {
    return new PS2_Constrained_Delaunay_triangulation_plus_2_All_edges_iterator(CGAL_Polyline_simplification_2JNI.PS2_Constrained_Delaunay_triangulation_plus_2_All_edges_iterator_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(PS2_Constrained_Delaunay_triangulation_plus_2_All_edges_iterator other) {
    CGAL_Polyline_simplification_2JNI.PS2_Constrained_Delaunay_triangulation_plus_2_All_edges_iterator_clone__SWIG_1(swigCPtr, this, PS2_Constrained_Delaunay_triangulation_plus_2_All_edges_iterator.getCPtr(other), other);
  }

  public boolean hasNext() {
    return CGAL_Polyline_simplification_2JNI.PS2_Constrained_Delaunay_triangulation_plus_2_All_edges_iterator_hasNext(swigCPtr, this);
  }

  public boolean equals(PS2_Constrained_Delaunay_triangulation_plus_2_All_edges_iterator p) {
    return CGAL_Polyline_simplification_2JNI.PS2_Constrained_Delaunay_triangulation_plus_2_All_edges_iterator_equals(swigCPtr, this, PS2_Constrained_Delaunay_triangulation_plus_2_All_edges_iterator.getCPtr(p), p);
  }

  public boolean not_equals(PS2_Constrained_Delaunay_triangulation_plus_2_All_edges_iterator p) {
    return CGAL_Polyline_simplification_2JNI.PS2_Constrained_Delaunay_triangulation_plus_2_All_edges_iterator_not_equals(swigCPtr, this, PS2_Constrained_Delaunay_triangulation_plus_2_All_edges_iterator.getCPtr(p), p);
  }

}
