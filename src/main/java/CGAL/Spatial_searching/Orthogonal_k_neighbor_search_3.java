/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Spatial_searching;
import CGAL.Kernel.Point_3;
public class Orthogonal_k_neighbor_search_3 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Orthogonal_k_neighbor_search_3(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Orthogonal_k_neighbor_search_3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Spatial_searchingJNI.delete_Orthogonal_k_neighbor_search_3(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Orthogonal_k_neighbor_search_3(Orthogonal_k_neighbor_search_tree_3 tree, Point_3 query) {
    this(CGAL_Spatial_searchingJNI.new_Orthogonal_k_neighbor_search_3__SWIG_0(Orthogonal_k_neighbor_search_tree_3.getCPtr(tree), tree, Point_3.getCPtr(query), query), true);
  }

  public Orthogonal_k_neighbor_search_3(Orthogonal_k_neighbor_search_tree_3 tree, Point_3 query, int k) {
    this(CGAL_Spatial_searchingJNI.new_Orthogonal_k_neighbor_search_3__SWIG_1(Orthogonal_k_neighbor_search_tree_3.getCPtr(tree), tree, Point_3.getCPtr(query), query, k), true);
  }

  public Orthogonal_k_neighbor_search_3(Orthogonal_k_neighbor_search_tree_3 tree, Point_3 query, int k, double eps) {
    this(CGAL_Spatial_searchingJNI.new_Orthogonal_k_neighbor_search_3__SWIG_2(Orthogonal_k_neighbor_search_tree_3.getCPtr(tree), tree, Point_3.getCPtr(query), query, k, eps), true);
  }

  public Orthogonal_k_neighbor_search_3(Orthogonal_k_neighbor_search_tree_3 tree, Point_3 query, int k, double eps, boolean search_nearest) {
    this(CGAL_Spatial_searchingJNI.new_Orthogonal_k_neighbor_search_3__SWIG_3(Orthogonal_k_neighbor_search_tree_3.getCPtr(tree), tree, Point_3.getCPtr(query), query, k, eps, search_nearest), true);
  }

  public Orthogonal_k_neighbor_search_iterator_3 iterator() {
    return new Orthogonal_k_neighbor_search_iterator_3(CGAL_Spatial_searchingJNI.Orthogonal_k_neighbor_search_3_iterator(swigCPtr, this), true);
  }

}
