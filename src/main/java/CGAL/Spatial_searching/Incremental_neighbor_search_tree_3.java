/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Spatial_searching;
import CGAL.Kernel.Point_3;import java.util.Iterator; import java.util.Collection;
public class Incremental_neighbor_search_tree_3 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Incremental_neighbor_search_tree_3(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Incremental_neighbor_search_tree_3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Spatial_searchingJNI.delete_Incremental_neighbor_search_tree_3(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Incremental_neighbor_search_tree_3() {
    this(CGAL_Spatial_searchingJNI.new_Incremental_neighbor_search_tree_3__SWIG_0(), true);
  }

  public Incremental_neighbor_search_tree_3(Iterator<Point_3> range) {
    this(CGAL_Spatial_searchingJNI.new_Incremental_neighbor_search_tree_3__SWIG_1(range), true);
  }

  public void insert(Point_3 c) {
    CGAL_Spatial_searchingJNI.Incremental_neighbor_search_tree_3_insert__SWIG_0(swigCPtr, this, Point_3.getCPtr(c), c);
  }

  public void insert(Iterator<Point_3> range) {
    CGAL_Spatial_searchingJNI.Incremental_neighbor_search_tree_3_insert__SWIG_1(swigCPtr, this, range);
  }

  public Incremental_neighbor_search_tree_iterator_3 iterator() {
    return new Incremental_neighbor_search_tree_iterator_3(CGAL_Spatial_searchingJNI.Incremental_neighbor_search_tree_3_iterator(swigCPtr, this), true);
  }

  public void clear() {
    CGAL_Spatial_searchingJNI.Incremental_neighbor_search_tree_3_clear(swigCPtr, this);
  }

  public int size() {
    return CGAL_Spatial_searchingJNI.Incremental_neighbor_search_tree_3_size(swigCPtr, this);
  }

  public void search(Collection<Point_3> out, Fuzzy_sphere_3 fsphere) {
    CGAL_Spatial_searchingJNI.Incremental_neighbor_search_tree_3_search__SWIG_0(swigCPtr, this, out, Fuzzy_sphere_3.getCPtr(fsphere), fsphere);
  }

  public void search(Collection<Point_3> out, Fuzzy_iso_box_3 fbox) {
    CGAL_Spatial_searchingJNI.Incremental_neighbor_search_tree_3_search__SWIG_1(swigCPtr, this, out, Fuzzy_iso_box_3.getCPtr(fbox), fbox);
  }

  public void build() {
    CGAL_Spatial_searchingJNI.Incremental_neighbor_search_tree_3_build(swigCPtr, this);
  }

  public boolean same_internal_object(Incremental_neighbor_search_tree_3 other) {
    return CGAL_Spatial_searchingJNI.Incremental_neighbor_search_tree_3_same_internal_object(swigCPtr, this, Incremental_neighbor_search_tree_3.getCPtr(other), other);
  }

}
