/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Point_set_processing_3;

import CGAL.Kernel.Point_3;
import CGAL.Kernel.Vector_3;
import CGAL.Point_set_3.Point_set_3;
import CGAL.Point_set_3.Point_set_3_Int_map;
import java.util.Iterator;
import java.util.Collection;

public class CGAL_Point_set_processing_3JNI {

    static {
      try {
          System.loadLibrary("CGAL_Point_set_processing_3");
      } catch (UnsatisfiedLinkError e) {
        System.err.println("Native code library CGAL_Point_set_processing_3 failed to load. \n" + e);
        throw e;
      }
    }
  

    static{
      try {
          System.loadLibrary("CGAL_Java");
      } catch (UnsatisfiedLinkError e) {
        System.err.println("Native code library CGAL_Java failed to load. \n" + e);
        throw e;
      }
    }
  
  public final static native void bilateral_smooth_point_set__SWIG_0(long jarg1, Point_set_3 jarg1_, int jarg2, double jarg3, double jarg4);
  public final static native void bilateral_smooth_point_set__SWIG_1(long jarg1, Point_set_3 jarg1_, int jarg2, double jarg3);
  public final static native void bilateral_smooth_point_set__SWIG_2(long jarg1, Point_set_3 jarg1_, int jarg2);
  public final static native double compute_average_spacing(long jarg1, Point_set_3 jarg1_, int jarg2);
  public final static native void edge_aware_upsample_point_set__SWIG_0(long jarg1, Point_set_3 jarg1_, double jarg2, double jarg3, double jarg4, int jarg5);
  public final static native void edge_aware_upsample_point_set__SWIG_1(long jarg1, Point_set_3 jarg1_, double jarg2, double jarg3, double jarg4);
  public final static native void edge_aware_upsample_point_set__SWIG_2(long jarg1, Point_set_3 jarg1_, double jarg2, double jarg3);
  public final static native void edge_aware_upsample_point_set__SWIG_3(long jarg1, Point_set_3 jarg1_, double jarg2);
  public final static native void edge_aware_upsample_point_set__SWIG_4(long jarg1, Point_set_3 jarg1_);
  public final static native int estimate_global_k_neighbor_scale(long jarg1, Point_set_3 jarg1_);
  public final static native double estimate_global_range_scale(long jarg1, Point_set_3 jarg1_);
  public final static native void grid_simplify_point_set(long jarg1, Point_set_3 jarg1_, double jarg2);
  public final static native void hierarchy_simplify_point_set__SWIG_0(long jarg1, Point_set_3 jarg1_, int jarg2, double jarg3);
  public final static native void hierarchy_simplify_point_set__SWIG_1(long jarg1, Point_set_3 jarg1_, int jarg2);
  public final static native void hierarchy_simplify_point_set__SWIG_2(long jarg1, Point_set_3 jarg1_);
  public final static native void jet_estimate_normals__SWIG_0(long jarg1, Point_set_3 jarg1_, int jarg2, double jarg3, int jarg4);
  public final static native void jet_estimate_normals__SWIG_1(long jarg1, Point_set_3 jarg1_, int jarg2, double jarg3);
  public final static native void jet_estimate_normals__SWIG_2(long jarg1, Point_set_3 jarg1_, int jarg2);
  public final static native void jet_smooth_point_set__SWIG_0(long jarg1, Point_set_3 jarg1_, int jarg2, double jarg3, int jarg4, int jarg5);
  public final static native void jet_smooth_point_set__SWIG_1(long jarg1, Point_set_3 jarg1_, int jarg2, double jarg3, int jarg4);
  public final static native void jet_smooth_point_set__SWIG_2(long jarg1, Point_set_3 jarg1_, int jarg2, double jarg3);
  public final static native void jet_smooth_point_set__SWIG_3(long jarg1, Point_set_3 jarg1_, int jarg2);
  public final static native void mst_orient_normals__SWIG_0(long jarg1, Point_set_3 jarg1_, int jarg2, double jarg3, long jarg4, Point_set_3_Int_map jarg4_);
  public final static native void mst_orient_normals__SWIG_1(long jarg1, Point_set_3 jarg1_, int jarg2, double jarg3);
  public final static native void mst_orient_normals__SWIG_2(long jarg1, Point_set_3 jarg1_, int jarg2);
  public final static native void pca_estimate_normals__SWIG_0(long jarg1, Point_set_3 jarg1_, int jarg2, double jarg3);
  public final static native void pca_estimate_normals__SWIG_1(long jarg1, Point_set_3 jarg1_, int jarg2);
  public final static native void random_simplify_point_set(long jarg1, Point_set_3 jarg1_, double jarg2);
  public final static native void remove_outliers__SWIG_0(long jarg1, Point_set_3 jarg1_, int jarg2, double jarg3, double jarg4, double jarg5);
  public final static native void remove_outliers__SWIG_1(long jarg1, Point_set_3 jarg1_, int jarg2, double jarg3, double jarg4);
  public final static native void remove_outliers__SWIG_2(long jarg1, Point_set_3 jarg1_, int jarg2, double jarg3);
  public final static native void remove_outliers__SWIG_3(long jarg1, Point_set_3 jarg1_, int jarg2);
  public final static native void vcm_estimate_normals__SWIG_0(long jarg1, Point_set_3 jarg1_, double jarg2, double jarg3, int jarg4);
  public final static native void vcm_estimate_normals__SWIG_1(long jarg1, Point_set_3 jarg1_, double jarg2, double jarg3);
  public final static native void wlop_simplify_and_regularize_point_set__SWIG_0(long jarg1, Point_set_3 jarg1_, long jarg2, Point_set_3 jarg2_, double jarg3, double jarg4, int jarg5, boolean jarg6);
  public final static native void wlop_simplify_and_regularize_point_set__SWIG_1(long jarg1, Point_set_3 jarg1_, long jarg2, Point_set_3 jarg2_, double jarg3, double jarg4, int jarg5);
  public final static native void wlop_simplify_and_regularize_point_set__SWIG_2(long jarg1, Point_set_3 jarg1_, long jarg2, Point_set_3 jarg2_, double jarg3, double jarg4);
  public final static native void wlop_simplify_and_regularize_point_set__SWIG_3(long jarg1, Point_set_3 jarg1_, long jarg2, Point_set_3 jarg2_, double jarg3);
  public final static native void wlop_simplify_and_regularize_point_set__SWIG_4(long jarg1, Point_set_3 jarg1_, long jarg2, Point_set_3 jarg2_);
}